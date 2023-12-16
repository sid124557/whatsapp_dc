package X;

/* renamed from: X.3LZ  reason: invalid class name */
public final class AnonymousClass3LZ implements AnonymousClass485 {
    public final C64393Dh A00;
    public final C54292oU A01;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A00(X.C30481mW r7, X.AnonymousClass4QG r8) {
        /*
            r6 = this;
            r5 = 0
            X.C626936e.A00()
            X.2oU r0 = r6.A01
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)
            int r3 = r0.widthPixels
            float r1 = (float) r3
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r2 = X.C1222663s.A01(r1)
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r8.measure(r1, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r2, r0)
            X.C162457s7.A0D(r4)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r4)
            r8.layout(r5, r5, r3, r2)
            r8.draw(r0)
            r5 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            java.lang.String r0 = "share-"
            java.lang.String r0 = X.AnonymousClass2z0.A07(r7, r0, r1)     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            java.lang.String r0 = X.C627236i.A05(r0)     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            java.lang.String r0 = ".png"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            X.3Dh r0 = r6.A00     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            java.io.File r3 = X.C64393Dh.A00(r0, r1)     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r3)     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x006b }
            r0 = 75
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x006b }
            r2.flush()     // Catch:{ all -> 0x006b }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            r4.recycle()
            return r3
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
            throw r0     // Catch:{ FileNotFoundException -> 0x0072, IOException -> 0x007c }
        L_0x0072:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "File not found: "
            X.C18260x0.A16(r0, r1, r2)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return r5
        L_0x0080:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LZ.A00(X.1mW, X.4QG):java.io.File");
    }

    public AnonymousClass3LZ(C64393Dh r1, C54292oU r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
