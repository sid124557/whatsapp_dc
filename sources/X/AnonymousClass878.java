package X;

/* renamed from: X.878  reason: invalid class name */
public final class AnonymousClass878 implements C185608tx {
    public long A00;
    public long A01;
    public C185598tw A02;
    public AnonymousClass7Q8 A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass7ZY A06 = new AnonymousClass7ZY(34);
    public final AnonymousClass7ZY A07 = new AnonymousClass7ZY(39);
    public final AnonymousClass7ZY A08 = new AnonymousClass7ZY(33);
    public final AnonymousClass7ZY A09 = new AnonymousClass7ZY(40);
    public final AnonymousClass7ZY A0A = new AnonymousClass7ZY(32);
    public final AnonymousClass7S5 A0B;
    public final C161467pi A0C = new C161467pi();
    public final boolean[] A0D = new boolean[3];

    public final void A00(byte[] bArr, int i, int i2) {
        AnonymousClass7Q8 r2 = this.A03;
        if (r2.A07) {
            int i3 = r2.A00;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                r2.A06 = AnonymousClass000.A1S(bArr[i4] & 128);
                r2.A07 = false;
            } else {
                r2.A00 = i3 + (i2 - i);
            }
        }
        if (!this.A05) {
            this.A0A.A01(bArr, i, i2);
            this.A08.A01(bArr, i, i2);
            this.A06.A01(bArr, i, i2);
        }
        this.A07.A01(bArr, i, i2);
        this.A09.A01(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b8, code lost:
        if (r6 > 21) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0165, code lost:
        if (r15 == 2) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AzY(X.C161467pi r30) {
        /*
            r29 = this;
            r7 = r29
            X.8tw r0 = r7.A02
            X.C161487pm.A01(r0)
        L_0x0007:
            r6 = r30
            int r0 = r6.A00
            r23 = r0
            int r2 = r6.A01
            int r5 = r0 - r2
            if (r5 <= 0) goto L_0x0035
            byte[] r0 = r6.A02
            r22 = r0
            long r3 = r7.A01
            long r0 = (long) r5
            long r3 = r3 + r0
            r7.A01 = r3
            X.8tw r0 = r7.A02
            r0.Bkc(r6, r5)
        L_0x0022:
            r0 = r23
            if (r2 >= r0) goto L_0x0007
            boolean[] r3 = r7.A0D
            r1 = r22
            int r1 = X.C161627q8.A01(r1, r3, r2, r0)
            if (r1 != r0) goto L_0x0036
            r1 = r22
            r7.A00(r1, r2, r0)
        L_0x0035:
            return
        L_0x0036:
            int r21 = r1 + 3
            byte r0 = r22[r21]
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r6 = r0 >> 1
            int r4 = r1 - r2
            if (r4 <= 0) goto L_0x0047
            r0 = r22
            r7.A00(r0, r2, r1)
        L_0x0047:
            int r20 = r23 - r1
            long r0 = r7.A01
            r2 = r20
            long r2 = (long) r2
            long r0 = r0 - r2
            r19 = 0
            if (r4 >= 0) goto L_0x0056
            int r2 = -r4
            r19 = r2
        L_0x0056:
            long r2 = r7.A00
            r27 = r2
            X.7Q8 r8 = r7.A03
            boolean r3 = r7.A05
            boolean r2 = r8.A09
            if (r2 == 0) goto L_0x00f6
            boolean r2 = r8.A06
            if (r2 == 0) goto L_0x00f6
            boolean r2 = r8.A08
            r8.A0B = r2
            r2 = 0
            r8.A09 = r2
        L_0x006d:
            boolean r2 = r7.A05
            if (r2 != 0) goto L_0x02f2
            X.7ZY r5 = r7.A0A
            r2 = r19
            r5.A02(r2)
            X.7ZY r4 = r7.A08
            r4.A02(r2)
            X.7ZY r3 = r7.A06
            r3.A02(r2)
            boolean r2 = r5.A01
            if (r2 == 0) goto L_0x02f2
            boolean r2 = r4.A01
            if (r2 == 0) goto L_0x02f2
            boolean r2 = r3.A01
            if (r2 == 0) goto L_0x02f2
            X.8tw r2 = r7.A02
            r26 = r2
            java.lang.String r2 = r7.A04
            r25 = r2
            int r10 = r5.A00
            int r8 = r4.A00
            int r8 = r8 + r10
            int r2 = r3.A00
            int r8 = r8 + r2
            byte[] r2 = new byte[r8]
            r24 = r2
            byte[] r8 = r5.A03
            r9 = 0
            java.lang.System.arraycopy(r8, r9, r2, r9, r10)
            byte[] r11 = r4.A03
            int r10 = r5.A00
            int r8 = r4.A00
            java.lang.System.arraycopy(r11, r9, r2, r10, r8)
            byte[] r8 = r3.A03
            int r5 = r5.A00
            int r2 = r4.A00
            int r5 = r5 + r2
            int r3 = r3.A00
            r2 = r24
            java.lang.System.arraycopy(r8, r9, r2, r5, r3)
            byte[] r3 = r4.A03
            int r2 = r4.A00
            X.7bb r12 = new X.7bb
            r12.<init>(r3, r9, r2)
            r2 = 44
            r12.A04(r2)
            r8 = 3
            int r13 = r12.A01(r8)
            r12.A02()
            r2 = 88
            r12.A04(r2)
            r3 = 8
            r12.A04(r3)
            r10 = 0
            r5 = 0
        L_0x00e1:
            if (r10 >= r13) goto L_0x012a
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x00eb
            int r5 = r5 + 89
        L_0x00eb:
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x00f3
            int r5 = r5 + 8
        L_0x00f3:
            int r10 = r10 + 1
            goto L_0x00e1
        L_0x00f6:
            boolean r2 = r8.A05
            if (r2 != 0) goto L_0x00fe
            boolean r2 = r8.A06
            if (r2 == 0) goto L_0x006d
        L_0x00fe:
            if (r3 == 0) goto L_0x0119
            boolean r2 = r8.A0A
            if (r2 == 0) goto L_0x0119
            long r4 = r8.A01
            long r2 = r0 - r4
            int r9 = (int) r2
            int r13 = r20 + r9
            boolean r11 = r8.A0B
            long r2 = r8.A03
            long r4 = r4 - r2
            int r12 = (int) r4
            X.8tw r9 = r8.A0C
            long r14 = r8.A04
            r10 = 0
            r9.Bkh(r10, r11, r12, r13, r14)
        L_0x0119:
            long r2 = r8.A01
            r8.A03 = r2
            long r2 = r8.A02
            r8.A04 = r2
            boolean r2 = r8.A08
            r8.A0B = r2
            r2 = 1
            r8.A0A = r2
            goto L_0x006d
        L_0x012a:
            r12.A04(r5)
            r5 = 2
            if (r13 <= 0) goto L_0x0137
            int r2 = 8 - r13
            int r2 = r2 * 2
            r12.A04(r2)
        L_0x0137:
            r12.A00()
            int r15 = r12.A00()
            if (r15 != r8) goto L_0x0143
            r12.A02()
        L_0x0143:
            int r11 = r12.A00()
            int r10 = r12.A00()
            boolean r2 = r12.A05()
            r14 = 1
            if (r2 == 0) goto L_0x0175
            int r18 = r12.A00()
            int r17 = r12.A00()
            int r16 = r12.A00()
            int r8 = r12.A00()
            if (r15 == r14) goto L_0x0167
            r2 = 1
            if (r15 != r5) goto L_0x0168
        L_0x0167:
            r2 = 2
        L_0x0168:
            if (r15 != r14) goto L_0x016b
            r14 = 2
        L_0x016b:
            int r18 = r18 + r17
            int r2 = r2 * r18
            int r11 = r11 - r2
            int r16 = r16 + r8
            int r14 = r14 * r16
            int r10 = r10 - r14
        L_0x0175:
            r12.A00()
            r12.A00()
            int r18 = r12.A00()
            boolean r8 = r12.A05()
            r2 = r13
            if (r8 == 0) goto L_0x0187
            r2 = 0
        L_0x0187:
            r12.A00()
            r12.A00()
            if (r2 > r13) goto L_0x0195
            r12.A00()
            int r2 = r2 + 1
            goto L_0x0187
        L_0x0195:
            r12.A00()
            r12.A00()
            r12.A00()
            r12.A00()
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x01e1
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x01e1
            r15 = 0
        L_0x01ae:
            r14 = 0
        L_0x01af:
            boolean r2 = r12.A05()
            r13 = 1
            if (r2 != 0) goto L_0x01c7
            r12.A00()
        L_0x01b9:
            r2 = 3
            if (r15 != r2) goto L_0x01bd
            r13 = 3
        L_0x01bd:
            int r14 = r14 + r13
            r2 = 6
            if (r14 < r2) goto L_0x01af
            int r15 = r15 + 1
            r2 = 4
            if (r15 >= r2) goto L_0x01e1
            goto L_0x01ae
        L_0x01c7:
            int r2 = r15 << 1
            int r2 = r2 + 4
            int r8 = r13 << r2
            r2 = 64
            int r8 = java.lang.Math.min(r2, r8)
            if (r15 <= r13) goto L_0x01d8
            r12.A00()
        L_0x01d8:
            r2 = 0
        L_0x01d9:
            if (r2 >= r8) goto L_0x01b9
            r12.A00()
            int r2 = r2 + 1
            goto L_0x01d9
        L_0x01e1:
            r12.A04(r5)
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x01f6
            r12.A04(r3)
            r12.A00()
            r12.A00()
            r12.A02()
        L_0x01f6:
            int r17 = r12.A00()
            r13 = 0
            r16 = 0
            r8 = 0
        L_0x01fe:
            r2 = r17
            if (r13 >= r2) goto L_0x0244
            if (r13 == 0) goto L_0x0208
            boolean r16 = r12.A05()
        L_0x0208:
            if (r16 == 0) goto L_0x021f
            r12.A02()
            r12.A00()
            r14 = 0
        L_0x0211:
            if (r14 > r8) goto L_0x0241
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x021c
            r12.A02()
        L_0x021c:
            int r14 = r14 + 1
            goto L_0x0211
        L_0x021f:
            int r15 = r12.A00()
            int r14 = r12.A00()
            int r8 = r15 + r14
            r2 = 0
        L_0x022a:
            if (r2 >= r15) goto L_0x0235
            r12.A00()
            r12.A02()
            int r2 = r2 + 1
            goto L_0x022a
        L_0x0235:
            r2 = 0
        L_0x0236:
            if (r2 >= r14) goto L_0x0241
            r12.A00()
            r12.A02()
            int r2 = r2 + 1
            goto L_0x0236
        L_0x0241:
            int r13 = r13 + 1
            goto L_0x01fe
        L_0x0244:
            boolean r2 = r12.A05()
            r13 = 4
            if (r2 == 0) goto L_0x025c
            r8 = 0
        L_0x024c:
            int r2 = r12.A00()
            if (r8 >= r2) goto L_0x025c
            int r2 = r18 + 4
            int r2 = r2 + 1
            r12.A04(r2)
            int r8 = r8 + 1
            goto L_0x024c
        L_0x025c:
            r12.A04(r5)
            boolean r2 = r12.A05()
            r8 = 24
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x02ba
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x0288
            int r14 = r12.A01(r3)
            r2 = 255(0xff, float:3.57E-43)
            if (r14 != r2) goto L_0x03bb
            r2 = 16
            int r3 = r12.A01(r2)
            int r2 = r12.A01(r2)
            if (r3 == 0) goto L_0x0288
            if (r2 == 0) goto L_0x0288
            float r5 = (float) r3
            float r2 = (float) r2
            float r5 = r5 / r2
        L_0x0288:
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x0291
            r12.A02()
        L_0x0291:
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x02a3
            r12.A04(r13)
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x02a3
            r12.A04(r8)
        L_0x02a3:
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x02af
            r12.A00()
            r12.A00()
        L_0x02af:
            r12.A02()
            boolean r2 = r12.A05()
            if (r2 == 0) goto L_0x02ba
            int r10 = r10 * 2
        L_0x02ba:
            byte[] r3 = r4.A03
            int r2 = r4.A00
            r12.A03 = r3
            r12.A02 = r9
            r12.A01 = r2
            r12.A00 = r9
            r12.A03()
            r12.A04(r8)
            java.lang.String r4 = X.C155307ee.A00(r12)
            X.7he r3 = X.C157057he.A00()
            r2 = r25
            r3.A0O = r2
            java.lang.String r2 = "video/hevc"
            r3.A0R = r2
            r3.A0M = r4
            r3.A0G = r11
            r3.A07 = r10
            r3.A01 = r5
            java.util.List r2 = java.util.Collections.singletonList(r24)
            r3.A0S = r2
            r2 = r26
            X.C166527yp.A01(r3, r2)
            r2 = 1
            r7.A05 = r2
        L_0x02f2:
            X.7ZY r4 = r7.A07
            r2 = r19
            boolean r2 = r4.A02(r2)
            r8 = 5
            if (r2 == 0) goto L_0x0318
            byte[] r3 = r4.A03
            int r2 = r4.A00
            int r3 = X.C161627q8.A00(r3, r2)
            X.7pi r9 = r7.A0C
            byte[] r2 = r4.A03
            r9.A0U(r2, r3)
            r9.A0T(r8)
            X.7S5 r2 = r7.A0B
            X.8tw[] r5 = r2.A01
            r2 = r27
            X.C153987cO.A00(r9, r5, r2)
        L_0x0318:
            X.7ZY r5 = r7.A09
            r2 = r19
            boolean r2 = r5.A02(r2)
            if (r2 == 0) goto L_0x033d
            byte[] r3 = r5.A03
            int r2 = r5.A00
            int r3 = X.C161627q8.A00(r3, r2)
            X.7pi r9 = r7.A0C
            byte[] r2 = r5.A03
            r9.A0U(r2, r3)
            r9.A0T(r8)
            X.7S5 r2 = r7.A0B
            X.8tw[] r8 = r2.A01
            r2 = r27
            X.C153987cO.A00(r9, r8, r2)
        L_0x033d:
            long r2 = r7.A00
            X.7Q8 r9 = r7.A03
            boolean r11 = r7.A05
            r8 = 0
            r9.A06 = r8
            r9.A05 = r8
            r9.A02 = r2
            r9.A00 = r8
            r9.A01 = r0
            r2 = 32
            if (r6 < r2) goto L_0x03b1
            r2 = 40
            if (r6 == r2) goto L_0x0388
            r10 = 1
            boolean r2 = r9.A0A
            if (r2 == 0) goto L_0x0378
            boolean r2 = r9.A09
            if (r2 != 0) goto L_0x0378
            if (r11 == 0) goto L_0x0376
            boolean r11 = r9.A0B
            long r2 = r9.A03
            long r0 = r0 - r2
            int r3 = (int) r0
            X.8tw r2 = r9.A0C
            long r0 = r9.A04
            r13 = 0
            r12 = r2
            r14 = r11
            r15 = r3
            r16 = r20
            r17 = r0
            r12.Bkh(r13, r14, r15, r16, r17)
        L_0x0376:
            r9.A0A = r8
        L_0x0378:
            r0 = 35
            if (r6 <= r0) goto L_0x0380
            r0 = 39
            if (r6 != r0) goto L_0x0388
        L_0x0380:
            boolean r0 = r9.A09
            r0 = r0 ^ 1
            r9.A05 = r0
            r9.A09 = r10
        L_0x0388:
            r1 = 0
        L_0x0389:
            r9.A08 = r1
            if (r1 != 0) goto L_0x0391
            r0 = 9
            if (r6 > r0) goto L_0x0392
        L_0x0391:
            r8 = 1
        L_0x0392:
            r9.A07 = r8
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x03a7
            X.7ZY r0 = r7.A0A
            r0.A00(r6)
            X.7ZY r0 = r7.A08
            r0.A00(r6)
            X.7ZY r0 = r7.A06
            r0.A00(r6)
        L_0x03a7:
            r4.A00(r6)
            r5.A00(r6)
            r2 = r21
            goto L_0x0022
        L_0x03b1:
            r0 = 16
            if (r6 < r0) goto L_0x0388
            r0 = 21
            r1 = 1
            if (r6 <= r0) goto L_0x0389
            goto L_0x0388
        L_0x03bb:
            float[] r3 = X.C161627q8.A03
            int r2 = r3.length
            if (r14 >= r2) goto L_0x03c4
            r5 = r3[r14]
            goto L_0x0288
        L_0x03c4:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r3 = X.AnonymousClass000.A0Y(r2, r3, r14)
            java.lang.String r2 = "H265Reader"
            android.util.Log.w(r2, r3)
            goto L_0x0288
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass878.AzY(X.7pi):void");
    }

    public void BgP() {
    }

    public void Bky() {
        this.A01 = 0;
        boolean A1T = AnonymousClass6C9.A1T(this.A0D);
        AnonymousClass7ZY r0 = this.A0A;
        r0.A02 = A1T;
        r0.A01 = A1T;
        AnonymousClass7ZY r02 = this.A08;
        r02.A02 = A1T;
        r02.A01 = A1T;
        AnonymousClass7ZY r03 = this.A06;
        r03.A02 = A1T;
        r03.A01 = A1T;
        AnonymousClass7ZY r04 = this.A07;
        r04.A02 = A1T;
        r04.A01 = A1T;
        AnonymousClass7ZY r05 = this.A09;
        r05.A02 = A1T;
        r05.A01 = A1T;
        AnonymousClass7Q8 r06 = this.A03;
        if (r06 != null) {
            r06.A07 = A1T;
            r06.A06 = A1T;
            r06.A05 = A1T;
            r06.A0A = A1T;
            r06.A09 = A1T;
        }
    }

    public AnonymousClass878(AnonymousClass7S5 r3) {
        this.A0B = r3;
    }

    public void B19(C187028wK r3, C151897Ws r4) {
        this.A04 = C151897Ws.A01(r4);
        r4.A03();
        C185598tw Br0 = r3.Br0(r4.A00, 2);
        this.A02 = Br0;
        this.A03 = new AnonymousClass7Q8(Br0);
        this.A0B.A00(r3, r4);
    }

    public void BgQ(long j, int i) {
        this.A00 = j;
    }
}
