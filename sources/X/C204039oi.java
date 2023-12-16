package X;

import android.media.ImageReader;

/* renamed from: X.9oi  reason: invalid class name and case insensitive filesystem */
public class C204039oi implements ImageReader.OnImageAvailableListener {
    public Object A00;
    public final int A01;

    public C204039oi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageAvailable(android.media.ImageReader r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x003f;
                case 1: goto L_0x00d5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A00
            X.9Zf r1 = (X.C195709Zf) r1
            X.9Qe r3 = r1.A01
            android.media.ImageReader r0 = r1.A00
            r7 = 0
            if (r0 == 0) goto L_0x0015
            r0.setOnImageAvailableListener(r7, r7)
            r1.A01 = r7
        L_0x0015:
            android.media.Image r6 = r15.acquireLatestImage()     // Catch:{ Exception -> 0x003d }
            if (r6 == 0) goto L_0x00ca
            X.9S8 r5 = new X.9S8     // Catch:{ all -> 0x0032 }
            r5.<init>()     // Catch:{ all -> 0x0032 }
            r12 = 1
            r9 = r7
            r10 = r7
            r11 = r7
            r8 = r7
            r13 = r12
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r1 = move-exception
            goto L_0x0034
        L_0x002c:
            r7 = r5
            r6.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x00ca
        L_0x0032:
            r1 = move-exception
            r5 = r7
        L_0x0034:
            r6.close()     // Catch:{ all -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00b9 }
        L_0x003c:
            throw r1     // Catch:{ Exception -> 0x00b9 }
        L_0x003d:
            r4 = move-exception
            goto L_0x00bb
        L_0x003f:
            java.lang.Object r6 = r14.A00
            X.9Zg r6 = (X.C195719Zg) r6
            android.media.ImageReader r0 = r6.A00
            r5 = 0
            if (r0 == 0) goto L_0x004b
            r0.setOnImageAvailableListener(r5, r5)
        L_0x004b:
            X.9Qe r3 = r6.A03
            r6.A03 = r5
            if (r3 == 0) goto L_0x00d4
            android.media.Image r2 = r15.acquireNextImage()     // Catch:{ Exception -> 0x0081 }
            if (r2 == 0) goto L_0x0091
            android.media.Image$Plane[] r1 = r2.getPlanes()     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0073
            int r0 = r1.length     // Catch:{ all -> 0x0077 }
            if (r0 <= 0) goto L_0x0073
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x0077 }
            java.nio.ByteBuffer r1 = r0.getBuffer()     // Catch:{ all -> 0x0077 }
            r1.rewind()     // Catch:{ all -> 0x0077 }
            int r0 = r1.remaining()     // Catch:{ all -> 0x0077 }
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x0077 }
            r1.get(r5)     // Catch:{ all -> 0x0077 }
        L_0x0073:
            r2.close()     // Catch:{ Exception -> 0x0081 }
            goto L_0x0091
        L_0x0077:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0081 }
        L_0x0080:
            throw r1     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            r4 = move-exception
            java.lang.String r2 = "DefaultPhotoProcessor"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "Failed to acquire image: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r4)     // Catch:{ all -> 0x00a3 }
            android.util.Log.e(r2, r0, r4)     // Catch:{ all -> 0x00a3 }
        L_0x0091:
            boolean r0 = X.C195029Vp.A00()
            if (r0 == 0) goto L_0x009b
            byte[] r5 = X.C195029Vp.A01()
        L_0x009b:
            int r1 = r6.A01
            X.9Uq r0 = new X.9Uq
            r0.<init>(r5, r1)
            goto L_0x00d1
        L_0x00a3:
            r2 = move-exception
            boolean r0 = X.C195029Vp.A00()
            if (r0 == 0) goto L_0x00ae
            byte[] r5 = X.C195029Vp.A01()
        L_0x00ae:
            int r1 = r6.A01
            X.9Uq r0 = new X.9Uq
            r0.<init>(r5, r1)
            r3.A00(r0)
            throw r2
        L_0x00b9:
            r4 = move-exception
            r7 = r5
        L_0x00bb:
            java.lang.String r2 = "YuvPhotoProcessor"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to acquire image: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r4)
            X.AnonymousClass9WT.A01(r2, r0)
        L_0x00ca:
            if (r3 == 0) goto L_0x00d4
            X.9Uq r0 = new X.9Uq
            r0.<init>(r7)
        L_0x00d1:
            r3.A00(r0)
        L_0x00d4:
            return
        L_0x00d5:
            java.lang.Object r1 = r14.A00
            X.9S3 r1 = (X.AnonymousClass9S3) r1
            android.media.Image r0 = r1.A00
            if (r0 == 0) goto L_0x00e0
            r0.close()
        L_0x00e0:
            android.media.Image r0 = r15.acquireNextImage()
            r1.A00 = r0
            r1.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204039oi.onImageAvailable(android.media.ImageReader):void");
    }
}
