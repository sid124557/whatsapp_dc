package X;

/* renamed from: X.87E  reason: invalid class name */
public final class AnonymousClass87E implements C185608tx {
    public static final float[] A0B = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public long A00;
    public long A01;
    public C185598tw A02;
    public AnonymousClass7UP A03;
    public String A04;
    public boolean A05;
    public final C157557iV A06;
    public final AnonymousClass7ZY A07;
    public final C151507Vb A08;
    public final C161467pi A09;
    public final boolean[] A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d6, code lost:
        if (r4 == 179) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0210, code lost:
        if (r4 != 181) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023c, code lost:
        if (r12 >= 0) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AzY(X.C161467pi r23) {
        /*
            r22 = this;
            r7 = r22
            X.7UP r0 = r7.A03
            X.C161487pm.A01(r0)
            X.8tw r9 = r7.A02
            X.C161487pm.A01(r9)
            r21 = r23
            r0 = r21
            int r8 = r0.A01
            int r6 = r0.A00
            byte[] r5 = r0.A02
            long r2 = r7.A01
            int r4 = r6 - r8
            long r0 = (long) r4
            long r2 = r2 + r0
            r7.A01 = r2
            r0 = r21
            r9.Bkc(r0, r4)
        L_0x0023:
            boolean[] r0 = r7.A0A
            int r3 = X.C161627q8.A01(r5, r0, r8, r6)
            if (r3 != r6) goto L_0x0041
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x0034
            X.7iV r0 = r7.A06
            r0.A00(r5, r8, r6)
        L_0x0034:
            X.7UP r0 = r7.A03
            r0.A00(r5, r8, r6)
            X.7ZY r0 = r7.A07
            if (r0 == 0) goto L_0x0040
            r0.A01(r5, r8, r6)
        L_0x0040:
            return
        L_0x0041:
            r0 = r21
            byte[] r0 = r0.A02
            int r18 = r3 + 3
            byte r0 = r0[r18]
            r4 = r0 & 255(0xff, float:3.57E-43)
            int r12 = r3 - r8
            boolean r0 = r7.A05
            r9 = 1
            r11 = 0
            if (r0 != 0) goto L_0x015f
            if (r12 <= 0) goto L_0x023b
            X.7iV r0 = r7.A06
            r0.A00(r5, r8, r3)
        L_0x005a:
            r14 = 0
        L_0x005b:
            X.7iV r2 = r7.A06
            int r0 = r2.A01
            if (r0 == 0) goto L_0x022b
            r15 = 181(0xb5, float:2.54E-43)
            r13 = 2
            java.lang.String r16 = "Unexpected start code value"
            java.lang.String r10 = "H263Reader"
            if (r0 == r9) goto L_0x0210
            r1 = 3
            if (r0 == r13) goto L_0x0209
            r13 = 4
            if (r0 == r1) goto L_0x021e
            r0 = 179(0xb3, float:2.51E-43)
            if (r4 == r0) goto L_0x0076
            if (r4 != r15) goto L_0x0233
        L_0x0076:
            int r0 = r2.A00
            int r0 = r0 - r14
            r2.A00 = r0
            r2.A03 = r11
            X.8tw r0 = r7.A02
            r20 = r0
            int r1 = r2.A02
            java.lang.String r0 = r7.A04
            r19 = r0
            r19.getClass()
            byte[] r13 = r2.A04
            int r0 = r2.A00
            byte[] r17 = java.util.Arrays.copyOf(r13, r0)
            r0 = r17
            int r2 = r0.length
            X.7oL r14 = new X.7oL
            r14.<init>(r0, r2)
            r14.A0A(r1)
            r2 = 4
            r14.A0A(r2)
            r14.A06()
            r0 = 8
            r14.A09(r0)
            boolean r1 = r14.A0D()
            if (r1 == 0) goto L_0x00b6
            r14.A09(r2)
            r1 = 3
            r14.A09(r1)
        L_0x00b6:
            int r15 = r14.A04(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r16 = "Invalid aspect ratio"
            r13 = 15
            if (r15 != r13) goto L_0x01f9
            int r1 = r14.A04(r0)
            int r0 = r14.A04(r0)
            if (r0 == 0) goto L_0x0202
            float r2 = (float) r1
            float r0 = (float) r0
            float r2 = r2 / r0
        L_0x00cf:
            boolean r0 = r14.A0D()
            r1 = 2
            if (r0 == 0) goto L_0x0106
            r14.A09(r1)
            r14.A09(r9)
            boolean r0 = r14.A0D()
            if (r0 == 0) goto L_0x0106
            r14.A09(r13)
            r14.A06()
            r14.A09(r13)
            r14.A06()
            r14.A09(r13)
            r14.A06()
            r0 = 3
            r14.A09(r0)
            r0 = 11
            r14.A09(r0)
            r14.A06()
            r14.A09(r13)
            r14.A06()
        L_0x0106:
            int r0 = r14.A04(r1)
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = "Unhandled video object layer shape"
            android.util.Log.w(r10, r0)
        L_0x0111:
            r14.A06()
            r0 = 16
            int r1 = r14.A04(r0)
            r14.A06()
            boolean r0 = r14.A0D()
            if (r0 == 0) goto L_0x012a
            if (r1 != 0) goto L_0x01ea
            java.lang.String r0 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r10, r0)
        L_0x012a:
            r14.A06()
            r0 = 13
            int r13 = r14.A04(r0)
            r14.A06()
            int r10 = r14.A04(r0)
            r14.A06()
            r14.A06()
            X.7he r1 = X.C157057he.A00()
            r0 = r19
            r1.A0O = r0
            java.lang.String r0 = "video/mp4v-es"
            r1.A0R = r0
            r1.A0G = r13
            r1.A07 = r10
            r1.A01 = r2
            java.util.List r0 = java.util.Collections.singletonList(r17)
            r1.A0S = r0
            r0 = r20
            X.C166527yp.A01(r1, r0)
            r7.A05 = r9
        L_0x015f:
            X.7UP r0 = r7.A03
            r0.A00(r5, r8, r3)
            X.7ZY r2 = r7.A07
            if (r2 == 0) goto L_0x019a
            if (r12 <= 0) goto L_0x01e8
            r2.A01(r5, r8, r3)
        L_0x016d:
            boolean r0 = r2.A02(r11)
            if (r0 == 0) goto L_0x0189
            byte[] r1 = r2.A03
            int r0 = r2.A00
            int r1 = X.C161627q8.A00(r1, r0)
            X.7pi r10 = r7.A09
            byte[] r0 = r2.A03
            r10.A0U(r0, r1)
            X.7Vb r8 = r7.A08
            long r0 = r7.A00
            r8.A01(r10, r0)
        L_0x0189:
            r0 = 178(0xb2, float:2.5E-43)
            if (r4 != r0) goto L_0x019a
            r0 = r21
            byte[] r1 = r0.A02
            int r0 = r3 + 2
            byte r0 = r1[r0]
            if (r0 != r9) goto L_0x019a
            r2.A00(r4)
        L_0x019a:
            int r13 = r6 - r3
            long r0 = r7.A01
            long r2 = (long) r13
            long r0 = r0 - r2
            X.7UP r8 = r7.A03
            boolean r9 = r7.A05
            int r3 = r8.A00
            r2 = 182(0xb6, float:2.55E-43)
            if (r3 != r2) goto L_0x01bf
            if (r9 == 0) goto L_0x01bf
            boolean r2 = r8.A05
            if (r2 == 0) goto L_0x01bf
            long r2 = r8.A02
            long r9 = r0 - r2
            int r12 = (int) r9
            boolean r11 = r8.A06
            X.8tw r9 = r8.A07
            long r14 = r8.A03
            r10 = 0
            r9.Bkh(r10, r11, r12, r13, r14)
        L_0x01bf:
            int r2 = r8.A00
            r11 = 179(0xb3, float:2.51E-43)
            if (r2 == r11) goto L_0x01c7
            r8.A02 = r0
        L_0x01c7:
            X.7UP r10 = r7.A03
            long r1 = r7.A00
            r10.A00 = r4
            r9 = 0
            r10.A06 = r9
            r8 = 1
            r3 = 182(0xb6, float:2.55E-43)
            if (r4 == r3) goto L_0x01d8
            r0 = 0
            if (r4 != r11) goto L_0x01d9
        L_0x01d8:
            r0 = 1
        L_0x01d9:
            r10.A05 = r0
            if (r4 == r3) goto L_0x01de
            r8 = 0
        L_0x01de:
            r10.A04 = r8
            r10.A01 = r9
            r10.A03 = r1
            r8 = r18
            goto L_0x0023
        L_0x01e8:
            int r11 = -r12
            goto L_0x016d
        L_0x01ea:
            int r1 = r1 + -1
            r0 = 0
        L_0x01ed:
            if (r1 <= 0) goto L_0x01f4
            int r0 = r0 + 1
            int r1 = r1 >> 1
            goto L_0x01ed
        L_0x01f4:
            r14.A09(r0)
            goto L_0x012a
        L_0x01f9:
            float[] r1 = A0B
            int r0 = r1.length
            if (r15 >= r0) goto L_0x0202
            r2 = r1[r15]
            goto L_0x00cf
        L_0x0202:
            r0 = r16
            android.util.Log.w(r10, r0)
            goto L_0x00cf
        L_0x0209:
            r0 = 31
            if (r4 > r0) goto L_0x0212
            r2.A01 = r1
            goto L_0x0233
        L_0x0210:
            if (r4 == r15) goto L_0x0228
        L_0x0212:
            r0 = r16
            android.util.Log.w(r10, r0)
            r2.A03 = r11
            r2.A00 = r11
            r2.A01 = r11
            goto L_0x0233
        L_0x021e:
            r1 = r4 & 240(0xf0, float:3.36E-43)
            r0 = 32
            if (r1 != r0) goto L_0x0212
            int r0 = r2.A00
            r2.A02 = r0
        L_0x0228:
            r2.A01 = r13
            goto L_0x0233
        L_0x022b:
            r0 = 176(0xb0, float:2.47E-43)
            if (r4 != r0) goto L_0x0233
            r2.A01 = r9
            r2.A03 = r9
        L_0x0233:
            byte[] r1 = X.C157557iV.A05
            int r0 = r1.length
            r2.A00(r1, r11, r0)
            goto L_0x015f
        L_0x023b:
            int r14 = -r12
            if (r12 < 0) goto L_0x005b
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87E.AzY(X.7pi):void");
    }

    public void BgP() {
    }

    public void Bky() {
        boolean A1T = AnonymousClass6C9.A1T(this.A0A);
        C157557iV r0 = this.A06;
        r0.A03 = A1T;
        r0.A00 = A1T ? 1 : 0;
        r0.A01 = A1T;
        AnonymousClass7UP r1 = this.A03;
        if (r1 != null) {
            r1.A05 = A1T;
            r1.A04 = A1T;
            r1.A06 = A1T;
            r1.A00 = -1;
        }
        AnonymousClass7ZY r12 = this.A07;
        if (r12 != null) {
            r12.A02 = false;
            r12.A01 = false;
        }
        this.A01 = 0;
    }

    public AnonymousClass87E(C151507Vb r3) {
        C161467pi r0;
        this.A08 = r3;
        this.A0A = new boolean[4];
        this.A06 = new C157557iV();
        if (r3 != null) {
            this.A07 = new AnonymousClass7ZY(178);
            r0 = new C161467pi();
        } else {
            r0 = null;
            this.A07 = null;
        }
        this.A09 = r0;
    }

    public void B19(C187028wK r3, C151897Ws r4) {
        this.A04 = C151897Ws.A01(r4);
        r4.A03();
        C185598tw Br0 = r3.Br0(r4.A00, 2);
        this.A02 = Br0;
        this.A03 = new AnonymousClass7UP(Br0);
        C151507Vb r0 = this.A08;
        if (r0 != null) {
            r0.A00(r3, r4);
        }
    }

    public void BgQ(long j, int i) {
        this.A00 = j;
    }

    public AnonymousClass87E() {
        this((C151507Vb) null);
    }
}
