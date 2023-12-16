package X;

/* renamed from: X.9Po  reason: invalid class name and case insensitive filesystem */
public class C193679Po {
    public int A00;
    public int A01;
    public int A02;
    public C151837Wm A03;
    public boolean A04;
    public int[] A05;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x008d, code lost:
        if (r17 == 0) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C193679Po(int r16, int r17, boolean r18) {
        /*
            r15 = this;
            java.lang.String r0 = "FrameBufferTexture"
            X.7Ov r3 = new X.7Ov
            r3.<init>(r0)
            r5 = r18
            r3.A05 = r5
            r0 = 3553(0xde1, float:4.979E-42)
            r3.A01 = r0
            r9 = r16
            r3.A02 = r9
            r10 = r17
            r3.A00 = r10
            r0 = 10241(0x2801, float:1.435E-41)
            r1 = 9729(0x2601, float:1.3633E-41)
            android.util.SparseIntArray r2 = r3.A06
            r2.put(r0, r1)
            r0 = 10240(0x2800, float:1.4349E-41)
            r2.put(r0, r1)
            r0 = 10242(0x2802, float:1.4352E-41)
            r1 = 33071(0x812f, float:4.6342E-41)
            r2.put(r0, r1)
            r0 = 10243(0x2803, float:1.4354E-41)
            r2.put(r0, r1)
            X.7Wm r4 = new X.7Wm
            r4.<init>(r3)
            r15.<init>()
            r15.A02 = r9
            r15.A01 = r10
            r15.A03 = r4
            r15.A04 = r5
            r1 = 1
            int[] r0 = new int[r1]
            r7 = 0
            android.opengl.GLES20.glGenFramebuffers(r1, r0, r7)
            r0 = r0[r7]
            r15.A00 = r0
            r2 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r2, r0)
            int r3 = r4.A00
            r6 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r6, r3)
            r8 = 6408(0x1908, float:8.98E-42)
            r13 = 5121(0x1401, float:7.176E-42)
            r14 = 0
            r12 = 6408(0x1908, float:8.98E-42)
            if (r18 == 0) goto L_0x0069
            r8 = 32857(0x8059, float:4.6042E-41)
            r13 = 33640(0x8368, float:4.714E-41)
        L_0x0069:
            r11 = r7
            android.opengl.GLES20.glTexImage2D(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = "FrameBufferTexture glTexImage2D"
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.C159217lP.A02(r1, r0)
            r0 = 36064(0x8ce0, float:5.0536E-41)
            android.opengl.GLES20.glFramebufferTexture2D(r2, r0, r6, r3, r7)
            java.lang.String r1 = "FrameBufferTexture glFramebufferTexture2D"
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.C159217lP.A02(r1, r0)
            int r3 = android.opengl.GLES20.glCheckFramebufferStatus(r2)
            r0 = 36053(0x8cd5, float:5.0521E-41)
            if (r3 == r0) goto L_0x00b0
            if (r16 == 0) goto L_0x008f
            r2 = 0
            if (r17 != 0) goto L_0x0090
        L_0x008f:
            r2 = 1
        L_0x0090:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Frame buffer creation failed with "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " isWidthOrHeightZero="
            r1.append(r0)
            if (r2 == 0) goto L_0x00ad
            java.lang.String r0 = "true"
        L_0x00a5:
            r1.append(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass6C7.A0e(r1)
            throw r0
        L_0x00ad:
            java.lang.String r0 = "false"
            goto L_0x00a5
        L_0x00b0:
            android.opengl.GLES20.glBindTexture(r6, r7)
            android.opengl.GLES20.glBindFramebuffer(r2, r7)
            r4.A01(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193679Po.<init>(int, int, boolean):void");
    }
}
