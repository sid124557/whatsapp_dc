package com.facebook.soloader;

import X.AnonymousClass002;
import X.C140916uj;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class SysUtil$MarshmallowSysdeps {
    public static boolean A02(Context context, int i) {
        if (i == 2) {
            return A00(context);
        }
        return A01(context);
    }

    public static boolean A01(Context context) {
        if (context == null || (context.getApplicationInfo().flags & 268435456) != 0) {
            return false;
        }
        return true;
    }

    public static String[] getSupportedAbis() {
        C140916uj r0;
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        if (is64Bit()) {
            treeSet.add(C140916uj.AARCH64.toString());
            r0 = C140916uj.X86_64;
        } else {
            treeSet.add(C140916uj.ARM.toString());
            r0 = C140916uj.X86;
        }
        treeSet.add(r0.toString());
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (treeSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean A00(Context context) {
        boolean z;
        ZipFile zipFile = new ZipFile(AnonymousClass002.A0B(context.getApplicationInfo().sourceDir));
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (true) {
                z = false;
                if (!entries.hasMoreElements()) {
                    break;
                }
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                if (zipEntry != null && zipEntry.getName().endsWith(".so") && zipEntry.getName().contains("/lib")) {
                    if (zipEntry.getMethod() == 0) {
                        z = true;
                    }
                }
            }
            zipFile.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static boolean is64Bit() {
        return Process.is64Bit();
    }
}
