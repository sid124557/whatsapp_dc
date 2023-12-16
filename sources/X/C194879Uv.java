package X;

import java.io.File;

/* renamed from: X.9Uv  reason: invalid class name and case insensitive filesystem */
public final class C194879Uv {
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0 = X.AnonymousClass002.A0C(X.AnonymousClass000.A0V("ZIP input flows into path traversal sink. The generated file doesn't start with ", r14, X.AnonymousClass001.A0o()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(java.io.InputStream r13, java.lang.String r14) {
        /*
            r12 = this;
            r1 = 0
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00e2 }
            r4.<init>(r13)     // Catch:{ all -> 0x00e2 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00e5 }
            r5.<init>(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = ""
            A00(r14, r0)     // Catch:{ all -> 0x00df }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r0]     // Catch:{ all -> 0x00df }
            r7 = 0
            r11 = 0
        L_0x0016:
            java.util.zip.ZipEntry r3 = r4.getNextEntry()     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x00d8
            java.lang.String r9 = r3.getName()     // Catch:{ all -> 0x00df }
            X.C162457s7.A0H(r9)     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = ".."
            r1.append(r0)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x00df }
            java.lang.String r0 = X.AnonymousClass000.A0X(r2, r1)     // Catch:{ all -> 0x00df }
            boolean r0 = X.C175728Zm.A0S(r9, r0, r7)     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00c7
            boolean r0 = r3.isDirectory()     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0042
            A00(r14, r9)     // Catch:{ all -> 0x00df }
            goto L_0x0016
        L_0x0042:
            X.C162457s7.A0F(r2)     // Catch:{ all -> 0x00df }
            r10 = 0
            X.C162457s7.A0J(r9, r7)     // Catch:{ all -> 0x00df }
            int r0 = r9.length()     // Catch:{ all -> 0x00df }
            int r0 = r0 + -1
            int r0 = X.C175728Zm.A0F(r9, r2, r0)     // Catch:{ all -> 0x00df }
            r6 = -1
            if (r0 == r6) goto L_0x0069
            java.lang.String r0 = r9.substring(r7, r0)     // Catch:{ all -> 0x00df }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = X.C18260x0.A06(r14, r2, r0)     // Catch:{ all -> 0x00df }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00df }
            r0.<init>(r1)     // Catch:{ all -> 0x00df }
            r0.mkdirs()     // Catch:{ all -> 0x00df }
        L_0x0069:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00df }
            r0.<init>(r14, r9)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ all -> 0x00df }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x00df }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00df }
            r0.<init>(r14)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ all -> 0x00df }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x00df }
            r3 = 0
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = X.C18260x0.A06(r14, r2, r9)     // Catch:{ all -> 0x00b5 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b5 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00b1 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b1 }
        L_0x0096:
            int r0 = r5.read(r8)     // Catch:{ all -> 0x00af }
            if (r0 == r6) goto L_0x00a1
            r1.write(r8, r7, r0)     // Catch:{ all -> 0x00af }
            int r11 = r11 + r0
            goto L_0x0096
        L_0x00a1:
            r1.flush()     // Catch:{ all -> 0x00af }
            r4.closeEntry()     // Catch:{ all -> 0x00df }
            X.AnonymousClass9UQ.A00(r1)     // Catch:{ all -> 0x00df }
            X.AnonymousClass9UQ.A00(r2)     // Catch:{ all -> 0x00df }
            goto L_0x0016
        L_0x00af:
            r0 = move-exception
            goto L_0x00b3
        L_0x00b1:
            r0 = move-exception
            r1 = r10
        L_0x00b3:
            r3 = r2
            goto L_0x00ce
        L_0x00b5:
            r0 = move-exception
            r1 = r10
            goto L_0x00ce
        L_0x00b8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "ZIP input flows into path traversal sink. The generated file doesn't start with "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r14, r1)     // Catch:{ all -> 0x00df }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00df }
            goto L_0x00d7
        L_0x00c7:
            java.lang.String r0 = "zipEntryName contains ../"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00df }
            goto L_0x00d7
        L_0x00ce:
            r4.closeEntry()     // Catch:{ all -> 0x00df }
            X.AnonymousClass9UQ.A00(r1)     // Catch:{ all -> 0x00df }
            X.AnonymousClass9UQ.A00(r3)     // Catch:{ all -> 0x00df }
        L_0x00d7:
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00d8:
            X.AnonymousClass9UQ.A00(r5)
            X.AnonymousClass9UQ.A00(r4)
            return r11
        L_0x00df:
            r0 = move-exception
            r1 = r5
            goto L_0x00e6
        L_0x00e2:
            r0 = move-exception
            r4 = r1
            goto L_0x00e6
        L_0x00e5:
            r0 = move-exception
        L_0x00e6:
            X.AnonymousClass9UQ.A00(r1)
            X.AnonymousClass9UQ.A00(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194879Uv.A01(java.io.InputStream, java.lang.String):int");
    }

    public static final void A00(String str, String str2) {
        File file = new File(AnonymousClass000.A0V(File.separator, str2, AnonymousClass000.A0l(str)));
        if (!file.isDirectory()) {
            file.mkdirs();
        }
    }
}
