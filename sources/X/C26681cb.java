package X;

import android.net.Uri;

/* renamed from: X.1cb  reason: invalid class name and case insensitive filesystem */
public final class C26681cb extends AnonymousClass3OX {
    public final int A00;

    public C26681cb(Uri uri, AnonymousClass5UR r14, String str, String str2, int i, long j, long j2, long j3) {
        super(uri, r14, str, str2, j, j2, j3);
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r1 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap Bqg(int r15) {
        /*
            r14 = this;
            r0 = 144(0x90, float:2.02E-43)
            r13 = 1
            r11 = r15
            if (r15 >= r0) goto L_0x002d
            r1 = 0
            r0 = 3
            android.graphics.Bitmap r1 = r14.A01(r1, r0)
        L_0x000c:
            if (r1 != 0) goto L_0x0017
            long r2 = (long) r15
            long r2 = r2 * r2
            r0 = 2
            long r0 = (long) r0
            long r2 = r2 * r0
            android.graphics.Bitmap r1 = r14.A00(r2, r15)
        L_0x0017:
            boolean r0 = X.C107385bE.A07()
            if (r0 != 0) goto L_0x0027
            if (r1 == 0) goto L_0x002c
            int r0 = r14.A00
            if (r0 == 0) goto L_0x0029
            android.graphics.Bitmap r1 = X.AnonymousClass31W.A00(r1, r0)
        L_0x0027:
            if (r1 == 0) goto L_0x002c
        L_0x0029:
            X.AnonymousClass34L.A01()
        L_0x002c:
            return r1
        L_0x002d:
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r0 = 0
            r7.inDither = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r7.inPreferredConfig = r0
            X.5UR r0 = r14.A04
            android.content.ContentResolver r3 = r0.A00
            long r0 = r14.A02
            java.lang.String[] r2 = X.AnonymousClass2B6.A00
            android.database.Cursor r5 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r3, r0, r13, r2)
            if (r5 == 0) goto L_0x0078
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "width"
            int r6 = X.AnonymousClass0x2.A04(r5, r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "height"
            int r4 = X.AnonymousClass0x2.A04(r5, r0)     // Catch:{ all -> 0x0082 }
            long r2 = (long) r15     // Catch:{ all -> 0x0082 }
            long r2 = r2 * r2
            r0 = 2
            long r0 = (long) r0     // Catch:{ all -> 0x0082 }
            long r2 = r2 * r0
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            r10 = 0
            goto L_0x006b
        L_0x0067:
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0082 }
        L_0x006b:
            r9 = 0
            X.5WB r8 = new X.5WB     // Catch:{ all -> 0x0082 }
            r12 = r15
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0082 }
            int r0 = X.C107245ax.A02(r8, r6, r4)     // Catch:{ all -> 0x0082 }
            r7.inSampleSize = r0     // Catch:{ all -> 0x0082 }
        L_0x0078:
            if (r5 == 0) goto L_0x007d
            r5.close()
        L_0x007d:
            android.graphics.Bitmap r1 = r14.A01(r7, r13)
            goto L_0x000c
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26681cb.Bqg(int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 != 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A01(android.graphics.BitmapFactory.Options r13, int r14) {
        /*
            r12 = this;
            X.2xh r5 = X.C59912xh.A00()     // Catch:{ all -> 0x0065 }
            X.5UR r4 = r12.A04     // Catch:{ all -> 0x0065 }
            long r6 = r12.A02     // Catch:{ all -> 0x0065 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0065 }
            X.2Zf r2 = r5.A02(r3)     // Catch:{ all -> 0x0065 }
            monitor-enter(r5)     // Catch:{ all -> 0x0065 }
            java.util.WeakHashMap r0 = r5.A00     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0062 }
            X.2Zf r0 = (X.C45232Zf) r0     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0020
            int r1 = r0.A00     // Catch:{ all -> 0x0062 }
            r0 = 0
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            monitor-exit(r5)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0037
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "BitmapManager/Thread "
            r1.append(r0)     // Catch:{ all -> 0x0065 }
            r1.append(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = " is not allowed to decode."
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x0065 }
            r0 = 0
            return r0
        L_0x0037:
            r1 = 0
            monitor-enter(r2)     // Catch:{ all -> 0x0057 }
            r0 = 1
            r2.A02 = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            android.content.ContentResolver r5 = r4.A00     // Catch:{ all -> 0x0057 }
            long r8 = r3.getId()     // Catch:{ all -> 0x0057 }
            r11 = r13
            r10 = r14
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r5, r6, r8, r10, r11)     // Catch:{ all -> 0x0057 }
            monitor-enter(r2)     // Catch:{ all -> 0x0065 }
            r2.A02 = r1     // Catch:{ all -> 0x0051 }
            r2.notifyAll()     // Catch:{ all -> 0x0051 }
            monitor-exit(r2)     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0051:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x0064
        L_0x0054:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            monitor-enter(r2)     // Catch:{ all -> 0x0065 }
            r2.A02 = r1     // Catch:{ all -> 0x0060 }
            r2.notifyAll()     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r2)     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r0 = move-exception
            goto L_0x005e
        L_0x0062:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0065 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "Image/getBitmapThumbnail/got exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26681cb.A01(android.graphics.BitmapFactory$Options, int):android.graphics.Bitmap");
    }

    public int getType() {
        return 0;
    }
}
