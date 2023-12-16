package com.facebook.breakpad;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass702;
import X.C162477s9;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.soloader.SoLoader;
import com.facebook.storage.StartupPathsRegistry;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.TreeMap;

public class BreakpadManager {
    public static String A00;
    public static volatile File A01;

    public static native void addMappingInfo(String str, byte[] bArr, int i, long j, long j2, long j3);

    public static native void crashProcessByAssert(String str);

    public static native void crashThisProcess();

    public static native void crashThisProcessAsan();

    public static native void crashThisProcessGWPAsan();

    public static native boolean disableCoreDumpingImpl();

    public static native boolean enableCoreDumpingImpl(String str);

    public static native long getMinidumpFlags();

    public static native void install(String str, String str2, int i, int i2);

    public static native boolean isCoreResourceHardUnlimited();

    public static native boolean isPrivacyModeEnabled();

    public static native boolean nativeContainsKey(String str);

    public static native String nativeGetCustomData(String str);

    public static native void nativeGetCustomDataSnapshot(TreeMap treeMap);

    public static native void nativeRemoveCustomData(String str);

    public static native void nativeSetCustomData(String str, String str2);

    public static native boolean nativeSetJvmStreamEnabled(boolean z, boolean z2);

    public static native void setMinidumpFlags(long j);

    public static native void setVersionInfo(int i, String str, String str2);

    public static native boolean simulateSignalDelivery(int i, String str);

    public static native void uninstall();

    public static boolean containsKey(String str) {
        boolean nativeContainsKey;
        if (!AnonymousClass000.A1W(A01)) {
            C162477s9.A08("BreakpadManager", "Breakpad is not active (containsKey).");
            return false;
        } else if ((getMinidumpFlags() & 32768) != 32768) {
            synchronized (BreakpadManager.class) {
                nativeContainsKey = nativeContainsKey(str);
            }
            return nativeContainsKey;
        } else {
            C162477s9.A06("BreakpadManager", "Breakpad customData disabled.");
            return false;
        }
    }

    public static boolean enableCoreDumping(Context context) {
        if (A00 == null) {
            SoLoader.A06("breakpad");
            A00 = "breakpad";
        }
        if (Build.VERSION.SDK_INT < 24) {
            File file = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(AnonymousClass002.A0B("/proc/sys/kernel/core_pattern")));
                try {
                    file = AnonymousClass002.A0B(bufferedReader.readLine());
                } catch (IOException e) {
                    Log.e("BreakpadManager", "There was a problem reading core pattern file", e);
                }
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    Log.e("BreakpadManager", "There was a problem closing core pattern file", e2);
                }
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (file.isAbsolute() && parentFile != null && !parentFile.canWrite()) {
                        Log.d("BreakpadManager", "Not write permissions into /proc/sys/kernel/core_pattern");
                        return false;
                    }
                }
            } catch (FileNotFoundException e3) {
                Log.w("BreakpadManager", AnonymousClass000.A0a("Core pattern file not found or blocked by SELinux", AnonymousClass001.A0o(), e3));
            }
        }
        if (isCoreResourceHardUnlimited()) {
            return enableCoreDumpingImpl(context.getApplicationInfo().dataDir);
        }
        return false;
    }

    public static File getCrashDirectory() {
        if (A01 != null) {
            return A01;
        }
        throw AnonymousClass002.A0E("Breakpad not installed");
    }

    public static String getCustomData(String str) {
        String nativeGetCustomData;
        if (!AnonymousClass000.A1W(A01)) {
            C162477s9.A08("BreakpadManager", "Breakpad is not active (getCustomData).");
            return "";
        } else if (!AnonymousClass000.A1S(((getMinidumpFlags() & 32768) > 32768 ? 1 : ((getMinidumpFlags() & 32768) == 32768 ? 0 : -1)))) {
            C162477s9.A06("BreakpadManager", "Breakpad customData disabled.");
            return "";
        } else {
            synchronized (BreakpadManager.class) {
                nativeGetCustomData = nativeGetCustomData(str);
            }
            return nativeGetCustomData;
        }
    }

    public static boolean isActive() {
        return AnonymousClass000.A1W(A01);
    }

    public static void removeCustomData(String str) {
        if (!AnonymousClass000.A1W(A01)) {
            C162477s9.A08("BreakpadManager", "Breakpad is not active (removeCustomData).");
        } else if ((getMinidumpFlags() & 32768) != 32768) {
            synchronized (BreakpadManager.class) {
                nativeRemoveCustomData(str);
            }
        } else {
            C162477s9.A06("BreakpadManager", "Breakpad customData disabled.");
        }
    }

    public static void setCustomData(String str, String str2, Object... objArr) {
        if (!AnonymousClass000.A1W(A01)) {
            C162477s9.A08("BreakpadManager", "Breakpad is not active (setCustomData).");
        } else if ((getMinidumpFlags() & 32768) != 32768) {
            synchronized (BreakpadManager.class) {
                if (objArr.length > 0 && str2 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    Formatter formatter = new Formatter(A0o);
                    formatter.format(str2, objArr);
                    formatter.close();
                    str2 = A0o.toString();
                }
                nativeSetCustomData(str, str2);
            }
        } else {
            C162477s9.A06("BreakpadManager", "Breakpad customData disabled.");
        }
    }

    public static synchronized void setJvmStreamEnabled(boolean z) {
        boolean z2;
        synchronized (BreakpadManager.class) {
            String property = System.getProperty("java.vm.version");
            if (property == null || property.startsWith("1.") || property.startsWith("0.")) {
                z2 = false;
            } else {
                z2 = true;
                if (z) {
                    SoLoader.A06("breakpad_cpp_helper");
                }
            }
            nativeSetJvmStreamEnabled(z2, z);
        }
    }

    public static void start(Context context) {
        synchronized (BreakpadManager.class) {
            if (A00 == null) {
                SoLoader.A06("breakpad");
                A00 = "breakpad";
            }
            if (A01 == null) {
                String basePathForId = StartupPathsRegistry.getBasePathForId(1874789883);
                if (basePathForId != null) {
                    File A0e = AnonymousClass0x7.A0e(AnonymousClass002.A0B(context.getApplicationInfo().dataDir), basePathForId);
                    install(A0e.getAbsolutePath(), "", 1536000, Build.VERSION.SDK_INT);
                    A01 = A0e;
                    setMinidumpFlags(getMinidumpFlags() | 0 | 2 | 4);
                    int buildID = AnonymousClass702.getBuildID();
                    String versionName = AnonymousClass702.getVersionName();
                    String str = Build.FINGERPRINT;
                    setVersionInfo(buildID, versionName, str);
                    setCustomData("Fingerprint", str, new Object[0]);
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Storage config ");
                    A0o.append(1874789883);
                    throw AnonymousClass000.A0F(" not in startup registry.", A0o);
                }
            }
        }
    }
}
