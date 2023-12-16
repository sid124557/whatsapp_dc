package X;

/* renamed from: X.87A  reason: invalid class name */
public final class AnonymousClass87A implements C185608tx {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C166527yp A05;
    public C185598tw A06;
    public String A07;
    public boolean A08;
    public final C160807oL A09;
    public final C161467pi A0A;
    public final String A0B;

    public void Bky() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AzY(X.C161467pi r23) {
        /*
            r22 = this;
            r1 = r22
            X.8tw r0 = r1.A06
            X.C161487pm.A01(r0)
        L_0x0007:
            r8 = r23
            int r9 = r8.A00
            int r0 = r8.A01
            int r6 = r9 - r0
            if (r6 <= 0) goto L_0x02c9
            int r0 = r1.A02
            r2 = 0
            r3 = 2
            r7 = 1
            if (r0 == 0) goto L_0x029e
            if (r0 == r7) goto L_0x0045
            int r3 = r1.A01
            int r0 = r1.A00
            int r4 = X.AnonymousClass6C9.A0A(r3, r0, r6)
            X.8tw r0 = r1.A06
            r0.Bkc(r8, r4)
            int r3 = r1.A00
            int r3 = r3 + r4
            r1.A00 = r3
            int r0 = r1.A01
            if (r3 != r0) goto L_0x0007
            X.8tw r5 = r1.A06
            long r3 = r1.A04
            r6 = 0
            r8 = r0
            r9 = r2
            r10 = r3
            r5.Bkh(r6, r7, r8, r9, r10)
            long r5 = r1.A04
            long r3 = r1.A03
            long r5 = r5 + r3
            r1.A04 = r5
            r1.A02 = r2
            goto L_0x0007
        L_0x0045:
            X.7pi r0 = r1.A0A
            r21 = r0
            byte[] r5 = r0.A02
            int r4 = r1.A00
            r0 = 128(0x80, float:1.794E-43)
            int r0 = X.AnonymousClass6C9.A0A(r0, r4, r6)
            r8.A0V(r5, r4, r0)
            int r4 = r1.A00
            int r4 = r4 + r0
            r1.A00 = r4
            r0 = 128(0x80, float:1.794E-43)
            if (r4 != r0) goto L_0x0007
            X.7oL r6 = r1.A09
            r6.A08(r2)
            int r0 = r6.A02
            int r5 = r0 * 8
            int r0 = r6.A00
            int r5 = r5 + r0
            r0 = 40
            r6.A09(r0)
            r11 = 5
            int r4 = r6.A04(r11)
            r20 = 1
            r0 = 10
            boolean r0 = X.C86624Kv.A1W(r4, r0)
            r6.A08(r5)
            r10 = -1
            r5 = 8
            r4 = 3
            if (r0 == 0) goto L_0x0258
            r12 = 16
            int r0 = X.C160807oL.A01(r6, r12, r3)
            if (r0 == 0) goto L_0x0255
            if (r0 == r7) goto L_0x0252
            if (r0 != r3) goto L_0x0093
            r10 = 2
        L_0x0093:
            r6.A09(r4)
            r0 = 11
            int r0 = r6.A04(r0)
            int r0 = r0 + 1
            int r19 = r0 * 2
            int r18 = r6.A04(r3)
            r0 = r18
            if (r0 != r4) goto L_0x0244
            int[] r7 = X.C155627fD.A04
            int r0 = r6.A04(r3)
            r9 = r7[r0]
            r8 = 3
            r13 = 6
        L_0x00b2:
            int r0 = r13 * 256
            r17 = r0
            int r14 = r6.A04(r4)
            boolean r16 = r6.A0D()
            int[] r0 = X.C155627fD.A02
            r7 = r0[r14]
            int r7 = r7 + r16
            r0 = 10
            r6.A09(r0)
            X.C160807oL.A03(r6, r5)
            if (r14 != 0) goto L_0x00d4
            r6.A09(r11)
            X.C160807oL.A03(r6, r5)
        L_0x00d4:
            r0 = r20
            if (r10 != r0) goto L_0x00db
            X.C160807oL.A03(r6, r12)
        L_0x00db:
            boolean r0 = r6.A0D()
            r12 = 4
            if (r0 == 0) goto L_0x0138
            if (r14 <= r3) goto L_0x00e7
            r6.A09(r3)
        L_0x00e7:
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0241
            if (r14 <= r3) goto L_0x0241
            r15 = 6
            r6.A09(r15)
        L_0x00f1:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x00f8
            r6.A09(r15)
        L_0x00f8:
            if (r16 == 0) goto L_0x00fd
            X.C160807oL.A03(r6, r11)
        L_0x00fd:
            if (r10 != 0) goto L_0x0138
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x0108
            r6.A09(r15)
        L_0x0108:
            if (r14 != 0) goto L_0x010d
            X.C160807oL.A03(r6, r15)
        L_0x010d:
            X.C160807oL.A03(r6, r15)
            int r15 = r6.A04(r3)
            r0 = r20
            if (r15 != r0) goto L_0x01e6
            r6.A09(r11)
        L_0x011b:
            if (r14 >= r3) goto L_0x012d
            boolean r15 = r6.A0D()
            r0 = 14
            if (r15 == 0) goto L_0x0128
            r6.A09(r0)
        L_0x0128:
            if (r14 != 0) goto L_0x012d
            X.C160807oL.A03(r6, r0)
        L_0x012d:
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x0138
            if (r8 != 0) goto L_0x01dd
            r6.A09(r11)
        L_0x0138:
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x0155
            r6.A09(r11)
            if (r14 != r3) goto L_0x01d5
            r6.A09(r12)
        L_0x0146:
            X.C160807oL.A03(r6, r5)
            if (r14 != 0) goto L_0x014e
            X.C160807oL.A03(r6, r5)
        L_0x014e:
            r0 = r18
            if (r0 >= r4) goto L_0x0155
            r6.A06()
        L_0x0155:
            if (r10 != 0) goto L_0x01c6
            if (r8 == r4) goto L_0x015c
            r6.A06()
        L_0x015c:
            r4 = 6
        L_0x015d:
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x01c3
            int r0 = r6.A04(r4)
            r4 = 1
            if (r0 != r4) goto L_0x01c3
            int r0 = r6.A04(r5)
            if (r0 != r4) goto L_0x01c3
            java.lang.String r8 = "audio/eac3-joc"
        L_0x0172:
            X.7yp r4 = r1.A05
            if (r4 == 0) goto L_0x0186
            int r0 = r4.A06
            if (r7 != r0) goto L_0x0186
            int r0 = r4.A0F
            if (r9 != r0) goto L_0x0186
            java.lang.String r0 = r4.A0T
            boolean r0 = X.C162387ry.A0D(r8, r0)
            if (r0 != 0) goto L_0x01a3
        L_0x0186:
            X.7he r4 = X.C157057he.A00()
            java.lang.String r0 = r1.A07
            r4.A0O = r0
            r4.A0R = r8
            r4.A04 = r7
            r4.A0D = r9
            java.lang.String r0 = r1.A0B
            r4.A0Q = r0
            X.7yp r4 = X.C166527yp.A00(r4)
            r1.A05 = r4
            X.8tw r0 = r1.A06
            r0.B3T(r4)
        L_0x01a3:
            r0 = r19
            r1.A01 = r0
            long r6 = X.AnonymousClass6CA.A0G(r17)
            X.7yp r0 = r1.A05
            int r0 = r0.A0F
            long r4 = (long) r0
            long r6 = r6 / r4
            r1.A03 = r6
            r0 = r21
            r0.A0S(r2)
            X.8tw r4 = r1.A06
            r2 = 128(0x80, float:1.794E-43)
            r4.Bkc(r0, r2)
            r1.A02 = r3
            goto L_0x0007
        L_0x01c3:
            java.lang.String r8 = "audio/eac3"
            goto L_0x0172
        L_0x01c6:
            if (r10 != r3) goto L_0x015c
            if (r8 == r4) goto L_0x01d0
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x015c
        L_0x01d0:
            r4 = 6
            r6.A09(r4)
            goto L_0x015d
        L_0x01d5:
            r0 = 6
            if (r14 < r0) goto L_0x0146
            r6.A09(r3)
            goto L_0x0146
        L_0x01dd:
            r0 = 0
        L_0x01de:
            if (r0 >= r13) goto L_0x0138
            X.C160807oL.A03(r6, r11)
            int r0 = r0 + 1
            goto L_0x01de
        L_0x01e6:
            if (r15 != r3) goto L_0x01ef
            r0 = 12
            r6.A09(r0)
            goto L_0x011b
        L_0x01ef:
            if (r15 != r4) goto L_0x011b
            int r15 = r6.A04(r11)
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x021f
            r6.A09(r11)
            X.C160807oL.A03(r6, r12)
            X.C160807oL.A03(r6, r12)
            X.C160807oL.A03(r6, r12)
            X.C160807oL.A03(r6, r12)
            X.C160807oL.A03(r6, r12)
            X.C160807oL.A03(r6, r12)
            X.C160807oL.A03(r6, r12)
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x021f
            X.C160807oL.A03(r6, r12)
            X.C160807oL.A03(r6, r12)
        L_0x021f:
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x0235
            r6.A09(r11)
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x0235
            r0 = 7
            r6.A09(r0)
            X.C160807oL.A03(r6, r5)
        L_0x0235:
            int r0 = r15 + 2
            int r0 = r0 * 8
            r6.A09(r0)
            r6.A05()
            goto L_0x011b
        L_0x0241:
            r15 = 6
            goto L_0x00f1
        L_0x0244:
            int r8 = r6.A04(r3)
            int[] r0 = X.C155627fD.A01
            r13 = r0[r8]
            int[] r0 = X.C155627fD.A03
            r9 = r0[r18]
            goto L_0x00b2
        L_0x0252:
            r10 = 1
            goto L_0x0093
        L_0x0255:
            r10 = 0
            goto L_0x0093
        L_0x0258:
            r0 = 32
            int r7 = X.C160807oL.A01(r6, r0, r3)
            if (r7 != r4) goto L_0x029b
            r8 = 0
        L_0x0261:
            r0 = 6
            int r0 = r6.A04(r0)
            int r19 = X.C155627fD.A00(r7, r0)
            int r5 = X.C160807oL.A01(r6, r5, r4)
            r0 = r5 & 1
            if (r0 == 0) goto L_0x0279
            r0 = r20
            if (r5 == r0) goto L_0x0285
            r6.A09(r3)
        L_0x0279:
            r0 = r5 & 4
            if (r0 == 0) goto L_0x0280
            r6.A09(r3)
        L_0x0280:
            if (r5 != r3) goto L_0x0285
            r6.A09(r3)
        L_0x0285:
            int[] r4 = X.C155627fD.A03
            int r0 = r4.length
            if (r7 >= r0) goto L_0x0299
            r9 = r4[r7]
        L_0x028c:
            boolean r4 = r6.A0D()
            int[] r0 = X.C155627fD.A02
            r7 = r0[r5]
            int r7 = r7 + r4
            r17 = 1536(0x600, float:2.152E-42)
            goto L_0x0172
        L_0x0299:
            r9 = -1
            goto L_0x028c
        L_0x029b:
            java.lang.String r8 = "audio/ac3"
            goto L_0x0261
        L_0x029e:
            int r0 = r8.A01
            int r0 = r9 - r0
            r6 = 0
            if (r0 <= 0) goto L_0x0007
            boolean r4 = r1.A08
            r5 = 11
            int r0 = r8.A0C()
            if (r4 == 0) goto L_0x02c3
            r4 = 119(0x77, float:1.67E-43)
            if (r0 != r4) goto L_0x02c3
            r1.A08 = r2
            r1.A02 = r7
            X.7pi r0 = r1.A0A
            byte[] r0 = r0.A02
            r0[r2] = r5
            r0[r7] = r4
            r1.A00 = r3
            goto L_0x0007
        L_0x02c3:
            if (r0 != r5) goto L_0x02c6
            r6 = 1
        L_0x02c6:
            r1.A08 = r6
            goto L_0x029e
        L_0x02c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87A.AzY(X.7pi):void");
    }

    public void BgP() {
    }

    public AnonymousClass87A(String str) {
        C160807oL r0 = new C160807oL(new byte[128], 128);
        this.A09 = r0;
        this.A0A = new C161467pi(r0.A03);
        this.A02 = 0;
        this.A0B = str;
    }

    public void B19(C187028wK r2, C151897Ws r3) {
        this.A07 = C151897Ws.A01(r3);
        this.A06 = C151897Ws.A00(r2, r3);
    }

    public void BgQ(long j, int i) {
        this.A04 = j;
    }

    public AnonymousClass87A() {
        this((String) null);
    }
}
