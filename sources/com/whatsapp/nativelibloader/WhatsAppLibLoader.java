package com.whatsapp.nativelibloader;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass25i;
import X.AnonymousClass321;
import X.AnonymousClass33p;
import X.AnonymousClass34Z;
import X.AnonymousClass3LG;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C55682qk;
import X.C61072zf;
import android.content.Context;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class WhatsAppLibLoader {
    public static Map A07;
    public static final String[] A08 = new String[0];
    public static final String[] A09 = {"vlc", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, "curve25519"};
    public Boolean A00 = null;
    public final C55682qk A01;
    public final AnonymousClass25i A02;
    public final AnonymousClass33p A03;
    public final C61072zf A04;
    public final AnonymousClass3LG A05;
    public final AnonymousClass34Z A06;

    public static final boolean A02() {
        String str;
        byte[] bArr = new byte[3];
        try {
            testLibraryUsable(bArr);
            if (!Arrays.equals(new byte[]{31, 41, 59}, bArr)) {
                Log.w("whatsapplibloader/usable test array does not match");
                return false;
            }
            try {
                String jNICodeVersion = getJNICodeVersion();
                C18260x0.A0s("whatsapplibloader/usable jniVersion: ", jNICodeVersion, AnonymousClass001.A0o());
                if (!"2.23.26.14".equals(jNICodeVersion)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("whatsapplibloader/usable version does not match. JAVA version: ");
                    A0o.append("2.23.26.14");
                    C18260x0.A0t(", JNI version: ", jNICodeVersion, A0o);
                    return false;
                }
                Log.i("whatsapplibloader/usable isLibraryUsable: True");
                return true;
            } catch (UnsatisfiedLinkError e) {
                e = e;
                str = "whatsapplibloader/usable error while testing library usability getJNICodeVersion";
                Log.w(str, e);
                return false;
            }
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            str = "whatsapplibloader/usable error while testing library usability testLibraryUsable";
            Log.w(str, e);
            return false;
        }
    }

    public static native String getJNICodeVersion();

    public static native void testLibraryUsable(byte[] bArr);

    public synchronized boolean A03() {
        if (this.A00 == null) {
            Log.e("whatsapplibloader/is-loaded: isLoaded() was called before load was attempted");
        }
        return AnonymousClass000.A1Y(this.A00, Boolean.TRUE);
    }

    public static synchronized void A01(Context context, List list) {
        UnsatisfiedLinkError unsatisfiedLinkError;
        String str;
        FileOutputStream A0h;
        synchronized (WhatsAppLibLoader.class) {
            C18260x0.A1C("whatsapplibloader/try-install start, loading: ", AnonymousClass001.A0o(), list);
            String A022 = AnonymousClass321.A02();
            if (A022.startsWith("armeabi-v7")) {
                str = "armeabi-v7a";
            } else {
                str = "arm64-v8a";
                if (!A022.startsWith(str)) {
                    str = "x86_64";
                    if (!A022.startsWith(str)) {
                        str = "x86";
                        if (!A022.startsWith(str)) {
                            unsatisfiedLinkError = new UnsatisfiedLinkError(AnonymousClass000.A0V("can not find lib folder for ABI ", A022, AnonymousClass001.A0o()));
                            throw unsatisfiedLinkError;
                        }
                    }
                }
            }
            C18260x0.A0s("whatsapplibloader/arch resolved to ", str, AnonymousClass001.A0o());
            try {
                ZipFile zipFile = new ZipFile(context.getPackageCodePath());
                try {
                    if (A07 == null) {
                        HashMap hashMap = new HashMap(8);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("lib/");
                        A0o.append(str);
                        String A0X = AnonymousClass000.A0X("/lib", A0o);
                        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                            String name = zipEntry.getName();
                            if (name.endsWith(".so")) {
                                C18260x0.A0s("whatsapplibloader/extractLibs found ", name, AnonymousClass001.A0o());
                                if (name.startsWith(A0X)) {
                                    String[] split = name.split("/");
                                    String str2 = split[split.length - 1];
                                    File A0A = AnonymousClass002.A0A(context.getFilesDir(), str2);
                                    if ("libunwindstack.so".equals(str2)) {
                                        A0A.delete();
                                    } else {
                                        InputStream inputStream = zipFile.getInputStream(zipEntry);
                                        try {
                                            A0h = AnonymousClass0x9.A0h(A0A);
                                            while (true) {
                                                int read = inputStream.read(bArr);
                                                if (read <= 0) {
                                                    break;
                                                }
                                                A0h.write(bArr, 0, read);
                                            }
                                            A0h.close();
                                            inputStream.close();
                                            StringBuilder A0o2 = AnonymousClass001.A0o();
                                            AnonymousClass000.A10(A0A, "whatsapplibloader/extractLibs copied ", A0o2);
                                            C18260x0.A1L(A0o2, " from apk");
                                            hashMap.put(str2.substring(3, str2.length() - 3), A0A);
                                        } catch (Throwable th) {
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                        A07 = hashMap;
                    } else {
                        Log.i("whatsapplibloader/try-install No need to extract libs again");
                    }
                    Map map = A07;
                    ArrayList A0J = AnonymousClass002.A0J(list);
                    Iterator A0i = C18280x3.A0i(map);
                    while (A0i.hasNext()) {
                        A0J.remove(AnonymousClass001.A0m(A0i));
                    }
                    if (A0J.isEmpty()) {
                        Map map2 = A07;
                        LinkedList A18 = AnonymousClass0x9.A18();
                        for (Object obj : list) {
                            A18.add(map2.get(obj));
                        }
                        C18260x0.A1P(AnonymousClass001.A0o(), "whatsapplibloader/get-ordered-file-paths libs will be loaded as: ", A18);
                        Iterator it = A18.iterator();
                        while (it.hasNext()) {
                            String absolutePath = AnonymousClass0x9.A0f(it).getAbsolutePath();
                            System.load(absolutePath);
                            C18260x0.A0s("whatsapplibloader/try-install loaded: ", absolutePath, AnonymousClass001.A0o());
                        }
                        zipFile.close();
                    } else {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        C18270x1.A1H(A0o3, "Libraries not found: ", A0J);
                        throw new UnsatisfiedLinkError(A0o3.toString());
                    }
                } catch (Throwable th2) {
                    zipFile.close();
                    throw th2;
                }
            } catch (IOException e) {
                Log.e("whatsapplibloader/try-install ioerror", e);
                unsatisfiedLinkError = new UnsatisfiedLinkError("IOException when install native library");
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        }
        return;
        throw th;
    }

    public WhatsAppLibLoader(C55682qk r2, AnonymousClass25i r3, AnonymousClass33p r4, C61072zf r5, AnonymousClass3LG r6, AnonymousClass34Z r7) {
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A02 = r3;
    }

    public static void A00(Context context, String str) {
        C18260x0.A0s("whatsapplibloader/system-load-library-with-install start, loading: ", str, AnonymousClass001.A0o());
        try {
            System.loadLibrary(str);
            C18260x0.A0q("whatsapplibloader/system-load-library-with-install loaded: ", str, AnonymousClass001.A0o());
        } catch (UnsatisfiedLinkError e) {
            Log.w("whatsapplibloader/system-load-library-with-install error", e);
            A01(context, Arrays.asList(C18270x1.A1b(str)));
        }
        Log.i("whatsapplibloader/system-load-library-with-install end");
    }
}
