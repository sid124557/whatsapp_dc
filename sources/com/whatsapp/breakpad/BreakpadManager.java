package com.whatsapp.breakpad;

import java.io.File;

public class BreakpadManager {
    public static File A00;

    public static native boolean setUpBreakpad(String str, String str2, String str3, String str4, boolean z, int i, String str5);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r1.startsWith("0.") != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(android.content.Context r10) {
        /*
            java.lang.Class<com.whatsapp.breakpad.BreakpadManager> r3 = com.whatsapp.breakpad.BreakpadManager.class
            monitor-enter(r3)
            java.io.File r0 = A00     // Catch:{ all -> 0x0050 }
            boolean r1 = X.AnonymousClass000.A1X(r0)
            java.lang.String r0 = "breakpad/initialized more than once"
            X.C626936e.A0D(r1, r0)     // Catch:{ all -> 0x0050 }
            java.io.File r2 = X.AnonymousClass5A5.A00(r10)     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = r2.getAbsolutePath()     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = r10.getPackageCodePath()     // Catch:{ all -> 0x0050 }
            java.io.File r1 = r10.getFilesDir()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "decompressed/libs.spo"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ all -> 0x0050 }
            java.lang.String r7 = X.C106965aS.A08     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0043
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "0."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0050 }
            r8 = 1
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            r9 = 1536000(0x177000, float:2.152394E-39)
            java.lang.String r10 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0050 }
            setUpBreakpad(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0050 }
            A00 = r2     // Catch:{ all -> 0x0050 }
            monitor-exit(r3)
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.breakpad.BreakpadManager.A00(android.content.Context):void");
    }
}
