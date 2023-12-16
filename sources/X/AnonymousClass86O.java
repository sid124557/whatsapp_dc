package X;

/* renamed from: X.86O  reason: invalid class name */
public final class AnonymousClass86O implements C185328tT {
    public boolean A00;
    public final AnonymousClass87A A01 = new AnonymousClass87A((String) null);
    public final C161467pi A02 = C161467pi.A05(2786);

    public void Bkz(long j, long j2) {
        this.A00 = false;
        this.A01.Bky();
    }

    public void BFs(C187028wK r6) {
        this.A01.B19(r6, new C151897Ws(Integer.MIN_VALUE, 0, 1));
        r6.B2W();
        C1686986k.A01(r6, -9223372036854775807L);
    }

    public int BiD(C187648xa r6, AnonymousClass7BG r7) {
        C161467pi r4 = this.A02;
        int read = r6.read(r4.A02, 0, 2786);
        if (read == -1) {
            return -1;
        }
        r4.A0S(0);
        r4.A0R(read);
        if (!this.A00) {
            this.A01.A04 = 0;
            this.A00 = true;
        }
        this.A01.AzY(r4);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r11.Bjy();
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if ((r6 - r2) >= 8192) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BpS(X.C187648xa r11) {
        /*
            r10 = this;
            r5 = 10
            X.7pi r4 = X.C161467pi.A05(r5)
            r3 = 0
            r2 = 0
        L_0x0008:
            X.C161467pi.A06(r11, r4, r5)
            r4.A0S(r3)
            int r1 = r4.A0D()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L_0x007c
            r11.Bjy()
            r11.Awu(r2)
            r6 = r2
        L_0x001e:
            r5 = 0
        L_0x001f:
            byte[] r1 = r4.A02
            r0 = 6
            r11.Bgd(r1, r3, r0)
            r4.A0S(r3)
            int r1 = r4.A0F()
            r0 = 2935(0xb77, float:4.113E-42)
            if (r1 == r0) goto L_0x003f
            r11.Bjy()
            int r6 = r6 + 1
            int r1 = r6 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L_0x008c
            r11.Awu(r6)
            goto L_0x001e
        L_0x003f:
            r1 = 1
            int r5 = r5 + 1
            r0 = 4
            if (r5 < r0) goto L_0x0046
            return r1
        L_0x0046:
            byte[] r8 = r4.A02
            int r0 = r8.length
            r9 = 6
            if (r0 < r9) goto L_0x008c
            r0 = 5
            byte r0 = r8[r0]
            r7 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 3
            int r7 = r7 >> r1
            r0 = 10
            if (r7 <= r0) goto L_0x006f
            r0 = 2
            byte r0 = r8[r0]
            r0 = r0 & 7
            int r0 = r0 << 8
            int r0 = X.AnonymousClass6CA.A0B(r8, r1, r0)
            int r0 = r0 + 1
            int r1 = r0 * 2
        L_0x0066:
            r0 = -1
            if (r1 == r0) goto L_0x008c
            int r0 = r1 + -6
            r11.Awu(r0)
            goto L_0x001f
        L_0x006f:
            r0 = 4
            byte r0 = r8[r0]
            r1 = r0 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> r9
            r0 = r0 & 63
            int r1 = X.C155627fD.A00(r1, r0)
            goto L_0x0066
        L_0x007c:
            r0 = 3
            r4.A0T(r0)
            int r1 = r4.A0B()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r11.Awu(r1)
            goto L_0x0008
        L_0x008c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86O.BpS(X.8xa):boolean");
    }
}
