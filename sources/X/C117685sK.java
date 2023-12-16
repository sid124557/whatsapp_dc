package X;

/* renamed from: X.5sK  reason: invalid class name and case insensitive filesystem */
public class C117685sK implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C117685sK(C95814uZ r2, C56452s0 r3, C46112b6 r4, int i, int i2) {
        this.A05 = 2;
        this.A02 = r3;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r2;
        this.A04 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(int r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r6 = -1
            r5 = 2
            r4 = 0
            if (r10 == r0) goto L_0x0037
            r7 = 0
            java.lang.Object r5 = r8.A04     // Catch:{ RuntimeException -> 0x0021 }
            X.7NW r5 = (X.AnonymousClass7NW) r5     // Catch:{ RuntimeException -> 0x0021 }
            X.7iw r3 = r5.A03     // Catch:{ RuntimeException -> 0x0021 }
            java.lang.Object r0 = r8.A02     // Catch:{ RuntimeException -> 0x0021 }
            X.8xL r0 = (X.C187518xL) r0     // Catch:{ RuntimeException -> 0x0021 }
            int r2 = r0.B8S()     // Catch:{ RuntimeException -> 0x0021 }
            int r1 = r0.B8R()     // Catch:{ RuntimeException -> 0x0021 }
            android.graphics.Bitmap$Config r0 = r5.A00     // Catch:{ RuntimeException -> 0x0021 }
            X.8Kh r4 = r3.A01(r0, r2, r1)     // Catch:{ RuntimeException -> 0x0021 }
            r5 = -1
            goto L_0x004b
        L_0x0021:
            r5 = move-exception
            java.lang.Class<X.7NW> r3 = X.AnonymousClass7NW.class
            java.lang.String r2 = "Failed to create frame bitmap"
            X.8vJ r1 = X.C161577py.A00     // Catch:{ all -> 0x0090 }
            r0 = 5
            boolean r0 = r1.BI0(r0)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r3.getSimpleName()     // Catch:{ all -> 0x0090 }
            r1.BsK(r0, r2, r5)     // Catch:{ all -> 0x0090 }
        L_0x0036:
            return r7
        L_0x0037:
            java.lang.Object r2 = r8.A03     // Catch:{ all -> 0x0090 }
            X.8ut r2 = (X.C186188ut) r2     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r8.A02     // Catch:{ all -> 0x0090 }
            X.8xL r0 = (X.C187518xL) r0     // Catch:{ all -> 0x0090 }
            int r1 = r0.B8S()     // Catch:{ all -> 0x0090 }
            int r0 = r0.B8R()     // Catch:{ all -> 0x0090 }
            X.8Kh r4 = r2.B4f(r9, r1, r0)     // Catch:{ all -> 0x0090 }
        L_0x004b:
            boolean r0 = X.C172258Kh.A01(r4)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x007f
            if (r4 == 0) goto L_0x007f
            java.lang.Object r3 = r8.A04     // Catch:{ all -> 0x0090 }
            X.7NW r3 = (X.AnonymousClass7NW) r3     // Catch:{ all -> 0x0090 }
            X.7Ti r1 = r3.A02     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r4.A03()     // Catch:{ all -> 0x0090 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0090 }
            boolean r0 = r1.A00(r0, r9)     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x007f
            java.lang.Class<X.7NW> r2 = X.AnonymousClass7NW.class
            java.lang.String r1 = "Frame %d ready."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0090 }
            X.C161577py.A02(r2, r0, r1)     // Catch:{ all -> 0x0090 }
            android.util.SparseArray r1 = r3.A01     // Catch:{ all -> 0x0090 }
            monitor-enter(r1)     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r8.A03     // Catch:{ all -> 0x007c }
            X.8ut r0 = (X.C186188ut) r0     // Catch:{ all -> 0x007c }
            r0.BTq(r4, r9, r10)     // Catch:{ all -> 0x007c }
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            goto L_0x0083
        L_0x007c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x007f:
            r0 = 0
            if (r4 == 0) goto L_0x0089
            goto L_0x0084
        L_0x0083:
            r0 = 1
        L_0x0084:
            r4.close()
            if (r0 != 0) goto L_0x008f
        L_0x0089:
            if (r5 == r6) goto L_0x008f
            boolean r0 = r8.A00(r9, r5)
        L_0x008f:
            return r0
        L_0x0090:
            r0 = move-exception
            if (r4 == 0) goto L_0x0096
            r4.close()
        L_0x0096:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117685sK.A00(int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0172, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0176, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r5 = r22
            int r0 = r5.A05
            switch(r0) {
                case 0: goto L_0x01ac;
                case 1: goto L_0x00a5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r5.A02
            X.2s0 r2 = (X.C56452s0) r2
            int r6 = r5.A00
            int r4 = r5.A01
            java.lang.Object r11 = r5.A03
            X.4uZ r11 = (X.C95814uZ) r11
            java.lang.Object r3 = r5.A04
            X.2b6 r3 = (X.C46112b6) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfilePhotoManager/sendGetProfilePhoto photoId:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " type:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " jid:"
            X.C18260x0.A1R(r1, r0, r11)
            X.2sH r8 = r2.A07
            X.1VX r9 = r2.A09
            X.31C r12 = r2.A0C
            r0 = 1
            java.lang.String r14 = "image"
            if (r4 == r0) goto L_0x003d
            java.lang.String r14 = "preview"
        L_0x003d:
            if (r6 <= 0) goto L_0x00a3
            java.lang.String r15 = java.lang.Integer.toString(r6)
        L_0x0043:
            X.8JP r13 = r2.A0F
            X.2aH r1 = r2.A0H
            X.5Mf r0 = r2.A0E
            X.3P7 r10 = new X.3P7
            r18 = r2
            r16 = r10
            r17 = r2
            r19 = r0
            r20 = r3
            r21 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            X.3TX r7 = new X.3TX
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.31C r8 = r7.A05
            java.lang.String r1 = r8.A03()
            X.1VX r6 = r7.A02
            r0 = 3845(0xf05, float:5.388E-42)
            boolean r0 = r6.A0X(r0)
            if (r0 == 0) goto L_0x0082
            X.8JP r5 = r7.A06
            int r4 = r1.hashCode()
            r3 = 154475307(0x9351b2b, float:2.1799857E-33)
            r5.markerStart(r3, r4)
            java.lang.String r2 = "iq_type"
            r0 = 26
            r5.markerAnnotate((int) r3, (int) r4, (java.lang.String) r2, (int) r0)
        L_0x0082:
            X.2vE r2 = X.C58422vE.A01
            r0 = 3843(0xf03, float:5.385E-42)
            boolean r0 = r6.A0Y(r2, r0)
            if (r0 == 0) goto L_0x019c
            X.2sH r9 = r7.A01
            X.4uZ r0 = r7.A04
            X.36K r11 = r7.A00(r0, r1)
            r13 = 26
            r15 = 32000(0x7d00, double:1.581E-319)
            r0 = 1
            X.C162457s7.A0J(r9, r0)
            r14 = 0
            r10 = r7
            r12 = r1
            r8.A0C(r9, r10, r11, r12, r13, r14, r15)
        L_0x00a2:
            return
        L_0x00a3:
            r15 = 0
            goto L_0x0043
        L_0x00a5:
            java.lang.Object r8 = r5.A02
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r8 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r8
            int r7 = r5.A00
            int r6 = r5.A01
            java.lang.Object r1 = r5.A03
            X.6ed r1 = (X.C132066ed) r1
            java.lang.Object r2 = r5.A04
            X.6eg r2 = (X.C132096eg) r2
            r3 = 0
            X.2qu r4 = r8.A0A
            int r11 = r4.A00()
            java.lang.String r0 = "save_profile_photo"
            r4.A01(r11, r0)
            X.6oi r0 = X.C137456oi.A00
            r4.A03(r0, r11, r7)
            X.6on r0 = X.C137506on.A00
            r4.A03(r0, r11, r6)
            android.graphics.Bitmap r7 = r1.A01     // Catch:{ all -> 0x0177 }
            int r1 = r7.getWidth()     // Catch:{ all -> 0x0177 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x0177 }
            if (r1 == r0) goto L_0x00f0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap not squared (w="
            X.C86614Ku.A17(r7, r0, r1)     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = ", h="
            r1.append(r0)     // Catch:{ all -> 0x0177 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = X.C18260x0.A09(r1, r0)     // Catch:{ all -> 0x0177 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0177 }
        L_0x00f0:
            int r6 = r2.A00     // Catch:{ all -> 0x0177 }
            int r2 = r7.getWidth()     // Catch:{ all -> 0x0177 }
            int r1 = r7.getHeight()     // Catch:{ all -> 0x0177 }
            android.graphics.Bitmap$Config r0 = r7.getConfig()     // Catch:{ all -> 0x0177 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ all -> 0x0177 }
            X.C162457s7.A0D(r5)     // Catch:{ all -> 0x0177 }
            android.graphics.Canvas r2 = X.AnonymousClass4L0.A06(r5)     // Catch:{ all -> 0x0177 }
            r2.drawColor(r6)     // Catch:{ all -> 0x0177 }
            r1 = 0
            r0 = 0
            r2.drawBitmap(r7, r1, r1, r0)     // Catch:{ all -> 0x0177 }
            int r0 = r5.getWidth()     // Catch:{ all -> 0x0177 }
            r2 = 196(0xc4, float:2.75E-43)
            if (r0 >= r2) goto L_0x0159
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap width too low ("
            X.C86614Ku.A17(r5, r0, r1)     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "), will be scaled up."
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0177 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0177 }
        L_0x012b:
            int r0 = r5.getWidth()     // Catch:{ all -> 0x0177 }
            r2 = 640(0x280, float:8.97E-43)
            if (r0 <= r2) goto L_0x0156
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap width too high ("
            X.C86614Ku.A17(r5, r0, r1)     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "), will be scaled down."
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0177 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0177 }
        L_0x0145:
            int r0 = r1.intValue()     // Catch:{ all -> 0x0177 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r5, r0, r0, r3)     // Catch:{ all -> 0x0177 }
            X.C162457s7.A0D(r5)     // Catch:{ all -> 0x0177 }
        L_0x0150:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0177 }
            r2.<init>()     // Catch:{ all -> 0x0177 }
            goto L_0x015b
        L_0x0156:
            if (r1 == 0) goto L_0x0150
            goto L_0x0145
        L_0x0159:
            r1 = 0
            goto L_0x012b
        L_0x015b:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0170 }
            r0 = 100
            r5.compress(r1, r0, r2)     // Catch:{ all -> 0x0170 }
            r2.close()     // Catch:{ all -> 0x0177 }
            r5.recycle()     // Catch:{ all -> 0x0177 }
            byte[] r10 = r2.toByteArray()     // Catch:{ all -> 0x0177 }
            X.C162457s7.A0D(r10)     // Catch:{ all -> 0x0177 }
            goto L_0x017d
        L_0x0170:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            X.3Z0 r10 = new X.3Z0
            r10.<init>(r0)
        L_0x017d:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r10)
            if (r1 != 0) goto L_0x0225
            java.lang.String r0 = "generated_bitmap"
            r4.A01(r11, r0)
            X.2sr r0 = r8.A03
            X.1RR r9 = X.C56972sr.A01(r0)
            if (r9 == 0) goto L_0x00a2
            X.3Wi r0 = r8.A02
            r12 = 2
            X.3c6 r7 = new X.3c6
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0S(r7)
            return
        L_0x019c:
            X.4uZ r0 = r7.A04
            X.36K r10 = r7.A00(r0, r1)
            r13 = 0
            r12 = 26
            r9 = r7
            r11 = r1
            r8.A0E(r9, r10, r11, r12, r13)
            return
        L_0x01ac:
            java.lang.Object r0 = r5.A03     // Catch:{ all -> 0x0213 }
            X.8ut r0 = (X.C186188ut) r0     // Catch:{ all -> 0x0213 }
            int r7 = r5.A01     // Catch:{ all -> 0x0213 }
            boolean r0 = r0.Aza(r7)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r3 = r5.A04     // Catch:{ all -> 0x0213 }
            X.7NW r3 = (X.AnonymousClass7NW) r3     // Catch:{ all -> 0x0213 }
            java.lang.Class<X.7NW> r2 = X.AnonymousClass7NW.class
            java.lang.String r1 = "Frame %d is cached already."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0213 }
            X.C161577py.A02(r2, r0, r1)     // Catch:{ all -> 0x0213 }
            android.util.SparseArray r2 = r3.A01
            monitor-enter(r2)
            int r0 = r5.A00     // Catch:{ all -> 0x0222 }
            r2.remove(r0)     // Catch:{ all -> 0x0222 }
            goto L_0x0211
        L_0x01d0:
            r2 = 1
            boolean r0 = r5.A00(r7, r2)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x01e7
            java.lang.Object r6 = r5.A04     // Catch:{ all -> 0x0213 }
            X.7NW r6 = (X.AnonymousClass7NW) r6     // Catch:{ all -> 0x0213 }
            java.lang.Class<X.7NW> r2 = X.AnonymousClass7NW.class
            java.lang.String r1 = "Prepared frame %d."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0213 }
            X.C161577py.A02(r2, r0, r1)     // Catch:{ all -> 0x0213 }
            goto L_0x0209
        L_0x01e7:
            java.lang.Object r6 = r5.A04     // Catch:{ all -> 0x0213 }
            X.7NW r6 = (X.AnonymousClass7NW) r6     // Catch:{ all -> 0x0213 }
            java.lang.Class<X.7NW> r1 = X.AnonymousClass7NW.class
            java.lang.String r4 = "Could not prepare frame %d."
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0213 }
            X.AnonymousClass000.A1L(r3, r7)     // Catch:{ all -> 0x0213 }
            X.8vJ r2 = X.C161577py.A00     // Catch:{ all -> 0x0213 }
            r0 = 6
            boolean r0 = r2.BI0(r0)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x0209
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x0213 }
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r4, r3)     // Catch:{ all -> 0x0213 }
            r2.B2F(r1, r0)     // Catch:{ all -> 0x0213 }
        L_0x0209:
            android.util.SparseArray r2 = r6.A01
            monitor-enter(r2)
            int r0 = r5.A00     // Catch:{ all -> 0x0222 }
            r2.remove(r0)     // Catch:{ all -> 0x0222 }
        L_0x0211:
            monitor-exit(r2)
            return
        L_0x0213:
            r1 = move-exception
            java.lang.Object r0 = r5.A04
            X.7NW r0 = (X.AnonymousClass7NW) r0
            android.util.SparseArray r2 = r0.A01
            monitor-enter(r2)
            int r0 = r5.A00     // Catch:{ all -> 0x0222 }
            r2.remove(r0)     // Catch:{ all -> 0x0222 }
            monitor-exit(r2)
            throw r1
        L_0x0222:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0225:
            java.lang.String r0 = "AvatarProfilePhotoViewModel/unable to compose profile photo"
            com.whatsapp.util.Log.e(r0, r1)
            r8.A0F(r3)
            X.3Wi r1 = r8.A02
            r0 = 2131889090(0x7f120bc2, float:1.9412834E38)
            r1.A0I(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117685sK.run():void");
    }

    public C117685sK(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.A05 = i3;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = i;
        this.A00 = i2;
    }
}
