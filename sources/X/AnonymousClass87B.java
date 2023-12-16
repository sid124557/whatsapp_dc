package X;

/* renamed from: X.87B  reason: invalid class name */
public final class AnonymousClass87B implements C185608tx {
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

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0129, code lost:
        if (r9 == 11) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0130, code lost:
        if (r9 != 11) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0135, code lost:
        if (r9 != 8) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0160, code lost:
        r2.A02 = 1;
        r1 = r2.A0A.A02;
        r1[0] = -84;
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016c, code lost:
        if (r4 == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016e, code lost:
        r0 = 65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0170, code lost:
        r1[1] = (byte) r0;
        r2.A00 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AzY(X.C161467pi r18) {
        /*
            r17 = this;
            r2 = r17
            X.8tw r0 = r2.A06
            X.C161487pm.A01(r0)
        L_0x0007:
            r8 = r18
            int r6 = r8.A00
            int r0 = r8.A01
            int r4 = r6 - r0
            if (r4 <= 0) goto L_0x0177
            int r0 = r2.A02
            r14 = 0
            r5 = 2
            r12 = 1
            if (r0 == 0) goto L_0x013a
            if (r0 == r12) goto L_0x0042
            int r1 = r2.A01
            int r0 = r2.A00
            int r1 = X.AnonymousClass6C9.A0A(r1, r0, r4)
            X.8tw r0 = r2.A06
            r0.Bkc(r8, r1)
            int r0 = r2.A00
            int r0 = r0 + r1
            r2.A00 = r0
            int r13 = r2.A01
            if (r0 != r13) goto L_0x0007
            X.8tw r10 = r2.A06
            long r15 = r2.A04
            r11 = 0
            r10.Bkh(r11, r12, r13, r14, r15)
            long r3 = r2.A04
            long r0 = r2.A03
            long r3 = r3 + r0
            r2.A04 = r3
            r2.A02 = r14
            goto L_0x0007
        L_0x0042:
            X.7pi r7 = r2.A0A
            byte[] r3 = r7.A02
            r6 = 16
            int r0 = r2.A00
            int r1 = X.AnonymousClass6C9.A0A(r6, r0, r4)
            r8.A0V(r3, r0, r1)
            int r0 = r2.A00
            int r0 = r0 + r1
            r2.A00 = r0
            if (r0 != r6) goto L_0x0007
            X.7oL r9 = r2.A09
            r9.A08(r14)
            int r3 = r9.A04(r6)
            int r4 = r9.A04(r6)
            r11 = 4
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = 4
            if (r4 != r1) goto L_0x0073
            r0 = 24
            int r4 = r9.A04(r0)
            r0 = 7
        L_0x0073:
            int r4 = r4 + r0
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r3 != r0) goto L_0x007b
            int r4 = r4 + 2
        L_0x007b:
            int r0 = r9.A04(r5)
            r10 = 3
            if (r0 != r10) goto L_0x008b
        L_0x0082:
            r9.A04(r5)
            boolean r0 = r9.A0D()
            if (r0 != 0) goto L_0x0082
        L_0x008b:
            r0 = 10
            int r13 = r9.A04(r0)
            boolean r0 = r9.A0D()
            if (r0 == 0) goto L_0x00a0
            int r0 = r9.A04(r10)
            if (r0 <= 0) goto L_0x00a0
            r9.A09(r5)
        L_0x00a0:
            boolean r3 = r9.A0D()
            r1 = 48000(0xbb80, float:6.7262E-41)
            r0 = 44100(0xac44, float:6.1797E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r3 == 0) goto L_0x00b2
            r8 = 48000(0xbb80, float:6.7262E-41)
        L_0x00b2:
            int r9 = r9.A04(r11)
            if (r8 != r0) goto L_0x010d
            r0 = 13
            if (r9 != r0) goto L_0x0138
            int[] r0 = X.C159607mA.A00
            r12 = r0[r9]
        L_0x00c0:
            X.7yp r1 = r2.A05
            java.lang.String r3 = "audio/ac4"
            if (r1 == 0) goto L_0x00d6
            int r0 = r1.A06
            if (r5 != r0) goto L_0x00d6
            int r0 = r1.A0F
            if (r8 != r0) goto L_0x00d6
            java.lang.String r0 = r1.A0T
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00f3
        L_0x00d6:
            X.7he r1 = X.C157057he.A00()
            java.lang.String r0 = r2.A07
            r1.A0O = r0
            r1.A0R = r3
            r1.A04 = r5
            r1.A0D = r8
            java.lang.String r0 = r2.A0B
            r1.A0Q = r0
            X.7yp r1 = X.C166527yp.A00(r1)
            r2.A05 = r1
            X.8tw r0 = r2.A06
            r0.B3T(r1)
        L_0x00f3:
            r2.A01 = r4
            long r3 = X.AnonymousClass6CA.A0G(r12)
            X.7yp r0 = r2.A05
            int r0 = r0.A0F
            long r0 = (long) r0
            long r3 = r3 / r0
            r2.A03 = r3
            r7.A0S(r14)
            X.8tw r0 = r2.A06
            r0.Bkc(r7, r6)
            r2.A02 = r5
            goto L_0x0007
        L_0x010d:
            if (r8 != r1) goto L_0x0138
            int[] r1 = X.C159607mA.A00
            int r0 = r1.length
            if (r9 >= r0) goto L_0x0138
            r12 = r1[r9]
            int r3 = r13 % 5
            r1 = 8
            r0 = 1
            if (r3 == r0) goto L_0x0133
            r0 = 11
            if (r3 == r5) goto L_0x012e
            if (r3 == r10) goto L_0x0133
            if (r3 != r11) goto L_0x00c0
            if (r9 == r10) goto L_0x012b
            if (r9 == r1) goto L_0x012b
            if (r9 != r0) goto L_0x00c0
        L_0x012b:
            int r12 = r12 + 1
            goto L_0x00c0
        L_0x012e:
            if (r9 == r1) goto L_0x012b
            if (r9 != r0) goto L_0x00c0
            goto L_0x012b
        L_0x0133:
            if (r9 == r10) goto L_0x012b
            if (r9 != r1) goto L_0x00c0
            goto L_0x012b
        L_0x0138:
            r12 = 0
            goto L_0x00c0
        L_0x013a:
            int r0 = r8.A01
            int r0 = r6 - r0
            r4 = 0
            if (r0 <= 0) goto L_0x0007
            boolean r1 = r2.A08
            r0 = 172(0xac, float:2.41E-43)
            int r3 = r8.A0C()
            if (r1 != 0) goto L_0x0151
            if (r3 != r0) goto L_0x014e
            r4 = 1
        L_0x014e:
            r2.A08 = r4
            goto L_0x013a
        L_0x0151:
            boolean r0 = X.AnonymousClass000.A1U(r3, r0)
            r2.A08 = r0
            r1 = 64
            r0 = 65
            if (r3 == r1) goto L_0x0160
            if (r3 != r0) goto L_0x013a
            r4 = 1
        L_0x0160:
            r2.A02 = r12
            X.7pi r0 = r2.A0A
            byte[] r1 = r0.A02
            r0 = -84
            r1[r14] = r0
            r0 = 64
            if (r4 == 0) goto L_0x0170
            r0 = 65
        L_0x0170:
            byte r0 = (byte) r0
            r1[r12] = r0
            r2.A00 = r5
            goto L_0x0007
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87B.AzY(X.7pi):void");
    }

    public void BgP() {
    }

    public AnonymousClass87B(String str) {
        C160807oL r0 = new C160807oL(new byte[16], 16);
        this.A09 = r0;
        this.A0A = new C161467pi(r0.A03);
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A0B = str;
    }

    public void B19(C187028wK r2, C151897Ws r3) {
        this.A07 = C151897Ws.A01(r3);
        this.A06 = C151897Ws.A00(r2, r3);
    }

    public void BgQ(long j, int i) {
        this.A04 = j;
    }

    public AnonymousClass87B() {
        this((String) null);
    }
}
