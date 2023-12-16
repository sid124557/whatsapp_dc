package X;

/* renamed from: X.2wP  reason: invalid class name and case insensitive filesystem */
public final class C59132wP {
    public final C55852r1 A00;

    public C59132wP(C55852r1 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A00(java.io.File r2, int r3) {
        /*
            long r0 = (long) r3
            r3 = 0
            java.io.InputStream r2 = X.AnonymousClass75L.A00(r2, r0)     // Catch:{ IOException -> 0x0015 }
            byte[] r0 = X.AnonymousClass72M.A00(r2)     // Catch:{ all -> 0x000e }
            r2.close()     // Catch:{ IOException -> 0x0015 }
            return r0
        L_0x000e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ IOException -> 0x0015 }
            throw r0     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            r1 = move-exception
            java.lang.String r0 = "ProgressiveJpegUtils/generateThumbnailFromFirstScan/errorGeneratingThumbnail"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59132wP.A00(java.io.File, int):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(java.io.File r6, int r7, boolean r8) {
        /*
            r5 = this;
            long r0 = (long) r7
            java.io.InputStream r4 = X.AnonymousClass75L.A00(r6, r0)
            X.2r1 r1 = r5.A00     // Catch:{ all -> 0x0032 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0032 }
            r3.<init>()     // Catch:{ all -> 0x0032 }
            r2 = 1
            r3.inJustDecodeBounds = r2     // Catch:{ all -> 0x0032 }
            r0 = 0
            android.graphics.BitmapFactory.decodeStream(r4, r0, r3)     // Catch:{ all -> 0x0032 }
            X.1VX r1 = r1.A02     // Catch:{ all -> 0x0032 }
            if (r8 == 0) goto L_0x0027
            X.6kw r0 = new X.6kw     // Catch:{ all -> 0x0032 }
            r0.<init>(r1)     // Catch:{ all -> 0x0032 }
        L_0x001c:
            int r1 = r0.A00     // Catch:{ all -> 0x0032 }
            int r0 = r3.outHeight     // Catch:{ all -> 0x0032 }
            if (r0 > r1) goto L_0x002e
            int r0 = r3.outWidth     // Catch:{ all -> 0x0032 }
            if (r0 > r1) goto L_0x002e
            goto L_0x002d
        L_0x0027:
            X.6ky r0 = new X.6ky     // Catch:{ all -> 0x0032 }
            r0.<init>(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x001c
        L_0x002d:
            r2 = 0
        L_0x002e:
            r4.close()
            return r2
        L_0x0032:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59132wP.A01(java.io.File, int, boolean):boolean");
    }
}
