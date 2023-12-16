package X;

/* renamed from: X.86P  reason: invalid class name */
public final class AnonymousClass86P implements C185328tT {
    public boolean A00;
    public final AnonymousClass87B A01 = new AnonymousClass87B((String) null);
    public final C161467pi A02 = C161467pi.A05(16384);

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
        int read = r6.read(r4.A02, 0, 16384);
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if ((r6 - r2) >= 8192) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r12.Bjy();
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BpS(X.C187648xa r12) {
        /*
            r11 = this;
            r5 = 10
            X.7pi r4 = X.C161467pi.A05(r5)
            r3 = 0
            r2 = 0
        L_0x0008:
            X.C161467pi.A06(r12, r4, r5)
            r4.A0S(r3)
            int r1 = r4.A0D()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L_0x0085
            r12.Bjy()
            r12.Awu(r2)
            r6 = r2
        L_0x001e:
            r5 = 0
        L_0x001f:
            byte[] r1 = r4.A02
            r0 = 7
            r12.Bgd(r1, r3, r0)
            r4.A0S(r3)
            int r8 = r4.A0F()
            r0 = 44096(0xac40, float:6.1792E-41)
            if (r8 == r0) goto L_0x0045
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r8 == r0) goto L_0x0045
            r12.Bjy()
            int r6 = r6 + 1
            int r1 = r6 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L_0x0095
            r12.Awu(r6)
            goto L_0x001e
        L_0x0045:
            r1 = 1
            int r5 = r5 + 1
            r0 = 4
            if (r5 < r0) goto L_0x004c
            return r1
        L_0x004c:
            byte[] r9 = r4.A02
            int r0 = r9.length
            r7 = 7
            if (r0 < r7) goto L_0x0095
            r0 = 2
            int r1 = X.AnonymousClass6C9.A0F(r9, r0)
            r0 = 3
            int r10 = X.AnonymousClass6CA.A0C(r9, r0, r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = 4
            if (r10 != r1) goto L_0x0083
            byte r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 16
            r0 = 5
            int r1 = X.AnonymousClass6C8.A0G(r9, r0, r1)
            r0 = 6
            int r10 = X.AnonymousClass6CA.A0C(r9, r0, r1)
        L_0x0072:
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r8 != r0) goto L_0x0079
            int r7 = r7 + 2
        L_0x0079:
            int r10 = r10 + r7
            r0 = -1
            if (r10 == r0) goto L_0x0095
            int r0 = r10 + -7
            r12.Awu(r0)
            goto L_0x001f
        L_0x0083:
            r7 = 4
            goto L_0x0072
        L_0x0085:
            r0 = 3
            r4.A0T(r0)
            int r1 = r4.A0B()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r12.Awu(r1)
            goto L_0x0008
        L_0x0095:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86P.BpS(X.8xa):boolean");
    }
}
