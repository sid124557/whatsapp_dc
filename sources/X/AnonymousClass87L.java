package X;

/* renamed from: X.87L  reason: invalid class name */
public final class AnonymousClass87L implements C184898sj {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public C153267ax A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C185608tx A09;
    public final C160807oL A0A = new C160807oL(new byte[10], 10);

    public final void Bky() {
        this.A03 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A09.Bky();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014b A[SYNTHETIC] */
    public final void AzZ(X.C161467pi r13, int r14) {
        /*
            r12 = this;
            X.7ax r0 = r12.A04
            X.C161487pm.A01(r0)
            r0 = r14 & 1
            r5 = -1
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0035
            int r0 = r12.A03
            if (r0 == 0) goto L_0x0030
            if (r0 == r3) goto L_0x0030
            java.lang.String r6 = "PesReader"
            if (r0 == r4) goto L_0x0144
            int r2 = r12.A02
            if (r2 == r5) goto L_0x002b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected start indicator: expected "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " more bytes"
            X.AnonymousClass000.A1F(r0, r6, r1)
        L_0x002b:
            X.8tx r0 = r12.A09
            r0.BgP()
        L_0x0030:
            r12.A03 = r3
        L_0x0032:
            r0 = 0
            r12.A00 = r0
        L_0x0035:
            int r6 = r13.A00
            int r1 = r13.A01
            int r6 = r6 - r1
            if (r6 <= 0) goto L_0x014b
            int r0 = r12.A03
            if (r0 == 0) goto L_0x013f
            r2 = 0
            if (r0 == r3) goto L_0x00d1
            if (r0 == r4) goto L_0x0064
            int r0 = r12.A02
            if (r0 == r5) goto L_0x0052
            int r0 = r6 - r0
            if (r0 <= 0) goto L_0x0052
            int r6 = r6 - r0
            int r1 = r1 + r6
            r13.A0R(r1)
        L_0x0052:
            X.8tx r1 = r12.A09
            r1.AzY(r13)
            int r0 = r12.A02
            if (r0 == r5) goto L_0x0035
            int r0 = r0 - r6
            r12.A02 = r0
            if (r0 != 0) goto L_0x0035
            r1.BgP()
            goto L_0x0030
        L_0x0064:
            r1 = 10
            int r0 = r12.A01
            int r1 = java.lang.Math.min(r1, r0)
            X.7oL r8 = r12.A0A
            byte[] r0 = r8.A03
            boolean r0 = r12.A00(r13, r0, r1)
            if (r0 == 0) goto L_0x0035
            r1 = 0
            int r0 = r12.A01
            boolean r0 = r12.A00(r13, r1, r0)
            if (r0 == 0) goto L_0x0035
            r8.A08(r2)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r6 = r12.A07
            if (r6 == 0) goto L_0x00c1
            r10 = 4
            r8.A09(r10)
            r9 = 3
            int r0 = r8.A04(r9)
            long r0 = (long) r0
            r11 = 30
            long r0 = r0 << r11
            r8.A09(r3)
            long r6 = X.C160807oL.A02(r8, r0)
            boolean r0 = r12.A08
            if (r0 != 0) goto L_0x00bb
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00bb
            int r0 = X.C160807oL.A01(r8, r10, r9)
            long r0 = (long) r0
            long r0 = r0 << r11
            r8.A09(r3)
            long r0 = X.C160807oL.A02(r8, r0)
            X.7ax r8 = r12.A04
            r8.A02(r0)
            r12.A08 = r3
        L_0x00bb:
            X.7ax r0 = r12.A04
            long r0 = r0.A02(r6)
        L_0x00c1:
            boolean r6 = r12.A05
            if (r6 == 0) goto L_0x00c6
            r2 = 4
        L_0x00c6:
            r14 = r14 | r2
            X.8tx r2 = r12.A09
            r2.BgQ(r0, r14)
            r0 = 3
            r12.A03 = r0
            goto L_0x0032
        L_0x00d1:
            X.7oL r1 = r12.A0A
            byte[] r6 = r1.A03
            r0 = 9
            boolean r0 = r12.A00(r13, r6, r0)
            if (r0 == 0) goto L_0x0035
            r7 = 0
            r1.A08(r2)
            r0 = 24
            int r8 = r1.A04(r0)
            java.lang.String r6 = "PesReader"
            if (r8 == r3) goto L_0x00fc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected start code prefix: "
            X.AnonymousClass6C7.A1I(r0, r6, r1, r8)
            r12.A02 = r5
        L_0x00f6:
            r12.A03 = r2
            r12.A00 = r7
            goto L_0x0035
        L_0x00fc:
            r8 = 8
            r1.A09(r8)
            r0 = 16
            int r2 = r1.A04(r0)
            r0 = 5
            r1.A09(r0)
            boolean r0 = r1.A0D()
            r12.A05 = r0
            r1.A09(r4)
            boolean r0 = r1.A0D()
            r12.A07 = r0
            boolean r0 = r1.A0D()
            r12.A06 = r0
            r0 = 6
            int r1 = X.C160807oL.A01(r1, r0, r8)
            r12.A01 = r1
            if (r2 == 0) goto L_0x013b
            int r0 = r2 + 6
            int r2 = r0 + -9
            int r2 = r2 - r1
            r12.A02 = r2
            if (r2 >= 0) goto L_0x013d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Found negative packet payload size: "
            X.AnonymousClass6C7.A1I(r0, r6, r1, r2)
        L_0x013b:
            r12.A02 = r5
        L_0x013d:
            r2 = 2
            goto L_0x00f6
        L_0x013f:
            r13.A0T(r6)
            goto L_0x0035
        L_0x0144:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            android.util.Log.w(r6, r0)
            goto L_0x0030
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87L.AzZ(X.7pi, int):void");
    }

    public void BFv(C187028wK r2, C151897Ws r3, C153267ax r4) {
        this.A04 = r4;
        this.A09.B19(r2, r3);
    }

    public AnonymousClass87L(C185608tx r4) {
        this.A09 = r4;
    }

    public final boolean A00(C161467pi r4, byte[] bArr, int i) {
        int A002 = C161467pi.A00(r4);
        int i2 = this.A00;
        int A0A2 = AnonymousClass6C9.A0A(i, i2, A002);
        if (A0A2 <= 0) {
            return true;
        }
        if (bArr == null) {
            r4.A0T(A0A2);
        } else {
            r4.A0V(bArr, i2, A0A2);
        }
        int i3 = this.A00 + A0A2;
        this.A00 = i3;
        if (i3 != i) {
            return false;
        }
        return true;
    }
}
