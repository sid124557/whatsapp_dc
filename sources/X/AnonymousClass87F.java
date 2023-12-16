package X;

/* renamed from: X.87F  reason: invalid class name */
public final class AnonymousClass87F implements C185608tx {
    public static final double[] A0G = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C185598tw A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C157517iR A0B;
    public final AnonymousClass7ZY A0C;
    public final C151507Vb A0D;
    public final C161467pi A0E;
    public final boolean[] A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c9, code lost:
        if (r8 >= 0) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AzY(X.C161467pi r29) {
        /*
            r28 = this;
            r6 = r28
            X.8tw r7 = r6.A05
            X.C161487pm.A01(r7)
            r13 = r29
            int r9 = r13.A01
            int r5 = r13.A00
            byte[] r12 = r13.A02
            long r2 = r6.A04
            int r4 = r5 - r9
            long r0 = (long) r4
            long r2 = r2 + r0
            r6.A04 = r2
            r7.Bkc(r13, r4)
        L_0x001a:
            boolean[] r0 = r6.A0F
            int r7 = X.C161627q8.A01(r12, r0, r9, r5)
            if (r7 != r5) goto L_0x0033
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x002b
            X.7iR r0 = r6.A0B
            r0.A00(r12, r9, r5)
        L_0x002b:
            X.7ZY r0 = r6.A0C
            if (r0 == 0) goto L_0x0032
            r0.A01(r12, r9, r5)
        L_0x0032:
            return
        L_0x0033:
            byte[] r0 = r13.A02
            int r20 = r7 + 3
            byte r0 = r0[r20]
            r4 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r7 - r9
            boolean r0 = r6.A07
            r11 = 0
            r10 = 1
            if (r0 != 0) goto L_0x0066
            if (r8 <= 0) goto L_0x01c8
            X.7iR r0 = r6.A0B
            r0.A00(r12, r9, r7)
        L_0x004a:
            r3 = 0
        L_0x004b:
            X.7iR r1 = r6.A0B
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x01c0
            int r2 = r1.A00
            int r2 = r2 - r3
            r1.A00 = r2
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0109
            r0 = 181(0xb5, float:2.54E-43)
            if (r4 != r0) goto L_0x0109
            r1.A01 = r2
        L_0x0060:
            byte[] r2 = X.C157517iR.A04
            int r0 = r2.length
            r1.A00(r2, r11, r0)
        L_0x0066:
            X.7ZY r2 = r6.A0C
            if (r2 == 0) goto L_0x00a1
            if (r8 <= 0) goto L_0x009f
            r2.A01(r12, r9, r7)
            r0 = 0
        L_0x0070:
            boolean r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x008c
            byte[] r1 = r2.A03
            int r0 = r2.A00
            int r1 = X.C161627q8.A00(r1, r0)
            X.7pi r8 = r6.A0E
            byte[] r0 = r2.A03
            r8.A0U(r0, r1)
            X.7Vb r3 = r6.A0D
            long r0 = r6.A03
            r3.A01(r8, r0)
        L_0x008c:
            r0 = 178(0xb2, float:2.5E-43)
            if (r4 != r0) goto L_0x00a1
            byte[] r1 = r13.A02
            int r0 = r7 + 2
            byte r0 = r1[r0]
            if (r0 != r10) goto L_0x009b
            r2.A00(r4)
        L_0x009b:
            r9 = r20
            goto L_0x001a
        L_0x009f:
            int r0 = -r8
            goto L_0x0070
        L_0x00a1:
            if (r4 == 0) goto L_0x00ae
            r0 = 179(0xb3, float:2.51E-43)
            if (r4 == r0) goto L_0x00ae
            r0 = 184(0xb8, float:2.58E-43)
            if (r4 != r0) goto L_0x009b
            r6.A09 = r10
            goto L_0x009b
        L_0x00ae:
            int r7 = r5 - r7
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x00d8
            boolean r8 = r6.A09
            long r2 = r6.A04
            long r0 = r6.A02
            long r2 = r2 - r0
            int r9 = (int) r2
            int r9 = r9 - r7
            X.8tw r2 = r6.A05
            long r0 = r6.A03
            r22 = 0
            r21 = r2
            r23 = r8
            r24 = r9
            r25 = r7
            r26 = r0
            r21.Bkh(r22, r23, r24, r25, r26)
        L_0x00d8:
            boolean r9 = r6.A0A
            if (r9 == 0) goto L_0x00e0
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0100
        L_0x00e0:
            long r2 = r6.A04
            long r0 = (long) r7
            long r2 = r2 - r0
            r6.A02 = r2
            long r2 = r6.A01
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            if (r9 == 0) goto L_0x0106
            long r2 = r6.A03
            long r0 = r6.A00
            long r2 = r2 + r0
        L_0x00f8:
            r6.A03 = r2
            r6.A09 = r11
            r6.A01 = r7
            r6.A0A = r10
        L_0x0100:
            if (r4 != 0) goto L_0x0103
            r11 = 1
        L_0x0103:
            r6.A08 = r11
            goto L_0x009b
        L_0x0106:
            r2 = 0
            goto L_0x00f8
        L_0x0109:
            r1.A02 = r11
            java.lang.String r0 = r6.A06
            r17 = r0
            r17.getClass()
            byte[] r2 = r1.A03
            int r0 = r1.A00
            byte[] r19 = java.util.Arrays.copyOf(r2, r0)
            r14 = 4
            byte r0 = r19[r14]
            r3 = r0 & 255(0xff, float:3.57E-43)
            r18 = 5
            byte r0 = r19[r18]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = 6
            byte r0 = r19[r0]
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r14
            int r0 = r2 >> 4
            r3 = r3 | r0
            r0 = r2 & 15
            int r2 = r0 << 8
            r2 = r2 | r15
            r16 = 7
            byte r0 = r19[r16]
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >> r14
            r15 = 2
            if (r0 == r15) goto L_0x01ba
            r15 = 3
            if (r0 == r15) goto L_0x01b4
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r0 != r14) goto L_0x014b
            int r0 = r2 * 121
            float r15 = (float) r0
            int r0 = r3 * 100
        L_0x0149:
            float r0 = (float) r0
            float r15 = r15 / r0
        L_0x014b:
            X.7he r14 = X.C157057he.A00()
            r0 = r17
            r14.A0O = r0
            java.lang.String r0 = "video/mpeg2"
            r14.A0R = r0
            r14.A0G = r3
            r14.A07 = r2
            r14.A01 = r15
            java.util.List r0 = java.util.Collections.singletonList(r19)
            r14.A0S = r0
            X.7yp r14 = X.C166527yp.A00(r14)
            byte r0 = r19[r16]
            r0 = r0 & 15
            int r3 = r0 + -1
            if (r3 < 0) goto L_0x01b1
            double[] r2 = A0G
            int r0 = r2.length
            if (r3 >= r0) goto L_0x01b1
            r16 = r2[r3]
            int r0 = r1.A01
            int r0 = r0 + 9
            byte r1 = r19[r0]
            r0 = r1 & 96
            int r0 = r0 >> r18
            r15 = r1 & 31
            if (r0 == r15) goto L_0x018e
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r0
            int r0 = r15 + 1
            double r0 = (double) r0
            double r2 = r2 / r0
            double r16 = r16 * r2
        L_0x018e:
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r16
            long r0 = (long) r2
        L_0x0196:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r2 = android.util.Pair.create(r14, r0)
            X.8tw r1 = r6.A05
            java.lang.Object r0 = r2.first
            X.7yp r0 = (X.C166527yp) r0
            r1.B3T(r0)
            long r0 = X.AnonymousClass6C8.A0R(r2)
            r6.A00 = r0
            r6.A07 = r10
            goto L_0x0066
        L_0x01b1:
            r0 = 0
            goto L_0x0196
        L_0x01b4:
            int r0 = r2 * 16
            float r15 = (float) r0
            int r0 = r3 * 9
            goto L_0x0149
        L_0x01ba:
            int r0 = r2 * 4
            float r15 = (float) r0
            int r0 = r3 * 3
            goto L_0x0149
        L_0x01c0:
            r0 = 179(0xb3, float:2.51E-43)
            if (r4 != r0) goto L_0x0060
            r1.A02 = r10
            goto L_0x0060
        L_0x01c8:
            int r3 = -r8
            if (r8 < 0) goto L_0x004b
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87F.AzY(X.7pi):void");
    }

    public void BgP() {
    }

    public void Bky() {
        boolean A1T = AnonymousClass6C9.A1T(this.A0F);
        C157517iR r0 = this.A0B;
        r0.A02 = A1T;
        r0.A00 = A1T ? 1 : 0;
        r0.A01 = A1T;
        AnonymousClass7ZY r02 = this.A0C;
        if (r02 != null) {
            r02.A02 = A1T;
            r02.A01 = A1T;
        }
        this.A04 = 0;
        this.A0A = A1T;
    }

    public AnonymousClass87F(C151507Vb r3) {
        C161467pi r0;
        this.A0D = r3;
        this.A0F = new boolean[4];
        this.A0B = new C157517iR();
        if (r3 != null) {
            this.A0C = new AnonymousClass7ZY(178);
            r0 = new C161467pi();
        } else {
            r0 = null;
            this.A0C = null;
        }
        this.A0E = r0;
    }

    public void B19(C187028wK r3, C151897Ws r4) {
        this.A06 = C151897Ws.A01(r4);
        r4.A03();
        this.A05 = r3.Br0(r4.A00, 2);
        C151507Vb r0 = this.A0D;
        if (r0 != null) {
            r0.A00(r3, r4);
        }
    }

    public void BgQ(long j, int i) {
        this.A01 = j;
    }

    public AnonymousClass87F() {
        this((C151507Vb) null);
    }
}
