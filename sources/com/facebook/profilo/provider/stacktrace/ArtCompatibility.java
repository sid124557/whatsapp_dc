package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;
import java.util.concurrent.atomic.AtomicReference;

public class ArtCompatibility {
    public static final AtomicReference sIsCompatible = new AtomicReference((Object) null);

    public static native boolean nativeCheck(int i);

    static {
        SoLoader.A06("profilo_stacktrace");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        if (r1.equals("5.0.2") != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        r6 = nativeCheck(androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        if (r1.equals("5.1.1") != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b2, code lost:
        r6 = nativeCheck(androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        if (r1.equals("6.0.1") != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        r6 = nativeCheck(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cc, code lost:
        if (r1.equals("7.0.0") != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        r6 = nativeCheck(32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00db, code lost:
        if (r1.equals("7.1.0") != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00dd, code lost:
        r6 = nativeCheck(64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0126, code lost:
        if (r1.equals("9.0.0") != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0128, code lost:
        r6 = nativeCheck(16384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012e, code lost:
        r2 = X.AnonymousClass0x9.A0h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0133, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0135, code lost:
        r0 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0137, code lost:
        if (r6 == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0139, code lost:
        r0 = 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r2.write(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0163, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCompatible(android.content.Context r6) {
        /*
            java.util.concurrent.atomic.AtomicReference r3 = sIsCompatible
            java.lang.Object r0 = r3.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x000f
            boolean r6 = r0.booleanValue()
        L_0x000e:
            return r6
        L_0x000f:
            r5 = 0
            java.io.File r4 = r6.getFilesDir()     // Catch:{ IOException -> 0x0164 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0164 }
            java.lang.String r0 = "ProfiloArtUnwindcCompat_"
            r2.append(r0)     // Catch:{ IOException -> 0x0164 }
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException -> 0x0164 }
            java.io.File r4 = X.C18270x1.A0A(r4, r1, r2)     // Catch:{ IOException -> 0x0164 }
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x003c
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r4)     // Catch:{ IOException -> 0x0164 }
            int r1 = r2.read()     // Catch:{ all -> 0x0155 }
            r0 = 49
            boolean r6 = X.AnonymousClass000.A1U(r1, r0)
            r2.close()     // Catch:{ IOException -> 0x0164 }
            goto L_0x0141
        L_0x003c:
            int r0 = r1.hashCode()     // Catch:{ IOException -> 0x0164 }
            r2 = 16
            switch(r0) {
                case 57: goto L_0x0047;
                case 52407: goto L_0x0051;
                case 52408: goto L_0x005a;
                case 53368: goto L_0x0063;
                case 54329: goto L_0x006c;
                case 54330: goto L_0x0075;
                case 56251: goto L_0x007e;
                case 50364602: goto L_0x0088;
                case 50364603: goto L_0x0091;
                case 50365562: goto L_0x00a1;
                case 50365563: goto L_0x00aa;
                case 51288123: goto L_0x00b9;
                case 52211643: goto L_0x00c6;
                case 52212604: goto L_0x00d5;
                case 52212605: goto L_0x00e4;
                case 52212606: goto L_0x00f3;
                case 53135164: goto L_0x0102;
                case 53136125: goto L_0x0111;
                case 54058685: goto L_0x0120;
                default: goto L_0x0045;
            }     // Catch:{ IOException -> 0x0164 }
        L_0x0045:
            goto L_0x0133
        L_0x0047:
            java.lang.String r0 = "9"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x0128
        L_0x0051:
            java.lang.String r0 = "5.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x0099
        L_0x005a:
            java.lang.String r0 = "5.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x00b2
        L_0x0063:
            java.lang.String r0 = "6.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x00c1
        L_0x006c:
            java.lang.String r0 = "7.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x00ce
        L_0x0075:
            java.lang.String r0 = "7.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x00dd
        L_0x007e:
            java.lang.String r0 = "9.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x0128
        L_0x0088:
            java.lang.String r0 = "5.0.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x0099
        L_0x0091:
            java.lang.String r0 = "5.0.2"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
        L_0x0099:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x00a1:
            java.lang.String r0 = "5.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            goto L_0x00b2
        L_0x00aa:
            java.lang.String r0 = "5.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
        L_0x00b2:
            r0 = 2048(0x800, float:2.87E-42)
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x00b9:
            java.lang.String r0 = "6.0.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
        L_0x00c1:
            boolean r6 = nativeCheck(r2)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x00c6:
            java.lang.String r0 = "7.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
        L_0x00ce:
            r0 = 32
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x00d5:
            java.lang.String r0 = "7.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
        L_0x00dd:
            r0 = 64
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x00e4:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            r0 = 128(0x80, float:1.794E-43)
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x00f3:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            r0 = 256(0x100, float:3.59E-43)
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x0102:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x0111:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
            goto L_0x012e
        L_0x0120:
            java.lang.String r0 = "9.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0164 }
            if (r0 == 0) goto L_0x0133
        L_0x0128:
            r0 = 16384(0x4000, float:2.2959E-41)
            boolean r6 = nativeCheck(r0)     // Catch:{ IOException -> 0x0164 }
        L_0x012e:
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r4)     // Catch:{ IOException -> 0x0164 }
            goto L_0x0135
        L_0x0133:
            r6 = 0
            goto L_0x012e
        L_0x0135:
            r0 = 48
            if (r6 == 0) goto L_0x013b
            r0 = 49
        L_0x013b:
            r2.write(r0)     // Catch:{ all -> 0x015a }
            r2.close()     // Catch:{ IOException -> 0x0164 }
        L_0x0141:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x0164 }
            r0 = 0
            boolean r0 = X.AnonymousClass0IR.A00(r0, r1, r3)     // Catch:{ IOException -> 0x0164 }
            if (r0 != 0) goto L_0x000e
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x0164 }
            boolean r6 = X.AnonymousClass001.A1Z(r0)     // Catch:{ IOException -> 0x0164 }
            return r6
        L_0x0155:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x015f }
            goto L_0x0163
        L_0x015a:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x015f }
            goto L_0x0163
        L_0x015f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0164 }
        L_0x0163:
            throw r1     // Catch:{ IOException -> 0x0164 }
        L_0x0164:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }
}
