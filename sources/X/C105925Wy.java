package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.5Wy  reason: invalid class name and case insensitive filesystem */
public final class C105925Wy {
    public final C54292oU A00;
    public final Map A01 = C18320x8.A0r();

    public C105925Wy(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.io.InputStream r9, java.lang.String r10) {
        /*
            r8 = 0
            r7 = 1
            X.C162457s7.A0J(r10, r7)
            boolean r0 = r9 instanceof java.io.BufferedInputStream
            if (r0 != 0) goto L_0x0011
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r9, r1)
            r9 = r0
        L_0x0011:
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x0059 }
        L_0x0017:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0059 }
            int r0 = r9.read(r1)     // Catch:{ all -> 0x0059 }
            if (r0 < 0) goto L_0x0025
            r2.update(r1, r8, r0)     // Catch:{ all -> 0x0059 }
            goto L_0x0017
        L_0x0025:
            byte[] r6 = r2.digest()     // Catch:{ all -> 0x0059 }
            X.C162457s7.A0D(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = ""
            int r5 = r6.length     // Catch:{ all -> 0x0059 }
            r4 = 0
        L_0x0030:
            if (r4 >= r5) goto L_0x0051
            byte r3 = r6[r4]     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "%02x"
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x0059 }
            X.C18310x6.A1T(r0, r3, r8)     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0059 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ all -> 0x0059 }
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0051:
            r9.close()
            boolean r0 = r10.equalsIgnoreCase(r0)
            return r0
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105925Wy.A00(java.io.InputStream, java.lang.String):boolean");
    }

    public final File A01(String str, int i) {
        C162457s7.A0J(str, 0);
        File file = new File(AnonymousClass000.A0X("/ML_MODEL", AnonymousClass000.A0l(this.A00.A00.getFilesDir().getCanonicalPath())), str);
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append('_');
        return AnonymousClass002.A0A(file, AnonymousClass000.A0h(A0l, i));
    }
}
