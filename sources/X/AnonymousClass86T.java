package X;

/* renamed from: X.86T  reason: invalid class name */
public final class AnonymousClass86T implements C185328tT {
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C187028wK A06;
    public C126586On A07;
    public C126576Om A08;
    public boolean A09;
    public boolean A0A;
    public final C126596Oo A0B = new C126596Oo();
    public final C161467pi A0C = C161467pi.A05(9);
    public final C161467pi A0D = C161467pi.A05(4);
    public final C161467pi A0E = new C161467pi();
    public final C161467pi A0F = C161467pi.A05(11);

    public final C161467pi A00(C187648xa r5) {
        int i = this.A02;
        C161467pi r3 = this.A0E;
        int length = r3.A02.length;
        if (i > length) {
            r3.A0U(new byte[Math.max(length * 2, i)], 0);
        } else {
            r3.A0S(0);
        }
        r3.A0R(this.A02);
        r5.readFully(r3.A02, 0, this.A02);
        return r3;
    }

    public void BFs(C187028wK r1) {
        this.A06 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (X.AnonymousClass001.A1X(r9, 5) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r7.A03(r6, r3) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        r9 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x007e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0005 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiD(X.C187648xa r12, X.AnonymousClass7BG r13) {
        /*
            r11 = this;
            X.8wK r0 = r11.A06
            X.C161487pm.A01(r0)
        L_0x0005:
            int r1 = r11.A01
            r6 = 1
            r8 = -1
            if (r1 == r6) goto L_0x0190
            r0 = 2
            if (r1 == r0) goto L_0x014d
            r7 = 3
            if (r1 == r7) goto L_0x0157
            boolean r0 = r11.A09
            if (r0 == 0) goto L_0x0138
            long r3 = r11.A04
            long r0 = r11.A05
            long r3 = r3 + r0
        L_0x001a:
            int r5 = r11.A03
            r0 = 8
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r5 != r0) goto L_0x00ee
            X.6On r0 = r11.A07
            if (r0 == 0) goto L_0x012f
            boolean r0 = r11.A0A
            if (r0 != 0) goto L_0x0035
            X.8wK r0 = r11.A06
            X.C1686986k.A01(r0, r1)
            r11.A0A = r6
        L_0x0035:
            X.6On r7 = r11.A07
        L_0x0037:
            X.7pi r6 = r11.A00(r12)
            boolean r0 = r7 instanceof X.C126576Om
            if (r0 == 0) goto L_0x0083
            r10 = r7
            X.6Om r10 = (X.C126576Om) r10
            int r5 = r6.A0C()
            int r0 = r5 >> 4
            r9 = r0 & 15
            r5 = r5 & 15
            r0 = 7
            if (r5 != r0) goto L_0x01eb
            r10.A00 = r9
            r0 = 5
            boolean r0 = X.AnonymousClass001.A1X(r9, r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            boolean r0 = r7.A03(r6, r3)
            r9 = 1
            if (r0 != 0) goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            r5 = 1
        L_0x0061:
            boolean r0 = r11.A09
            if (r0 != 0) goto L_0x0076
            if (r9 == 0) goto L_0x0076
            r11.A09 = r8
            X.6Oo r0 = r11.A0B
            long r3 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            long r2 = r11.A05
            long r0 = -r2
        L_0x0074:
            r11.A04 = r0
        L_0x0076:
            r0 = 4
            r11.A00 = r0
            r0 = 2
            r11.A01 = r0
            if (r5 == 0) goto L_0x0005
            r0 = 0
            return r0
        L_0x0080:
            r0 = 0
            goto L_0x0074
        L_0x0083:
            boolean r0 = r7 instanceof X.C126596Oo
            if (r0 != 0) goto L_0x0058
            r5 = r7
            X.6On r5 = (X.C126586On) r5
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x00e9
            int r10 = r6.A0C()
            int r0 = r10 >> 4
            r9 = r0 & 15
            r5.A00 = r9
            r0 = 2
            if (r9 != r0) goto L_0x00bc
            int r10 = r10 >> r0
            r9 = r10 & 3
            int[] r0 = X.C126586On.A03
            r10 = r0[r9]
            X.7he r9 = X.C157057he.A00()
            java.lang.String r0 = "audio/mpeg"
            r9.A0R = r0
            r9.A04 = r8
            r9.A0D = r10
        L_0x00ae:
            X.7yp r9 = X.C166527yp.A00(r9)
            X.8tw r0 = r5.A00
            r0.B3T(r9)
            r5.A01 = r8
        L_0x00b9:
            r5.A02 = r8
            goto L_0x0058
        L_0x00bc:
            r0 = 7
            if (r9 == r0) goto L_0x00d2
            r0 = 8
            if (r9 != r0) goto L_0x00d5
            java.lang.String r0 = "audio/g711-mlaw"
        L_0x00c5:
            X.7he r9 = X.C157057he.A00()
            r9.A0R = r0
            r9.A04 = r8
            r0 = 8000(0x1f40, float:1.121E-41)
            r9.A0D = r0
            goto L_0x00ae
        L_0x00d2:
            java.lang.String r0 = "audio/g711-alaw"
            goto L_0x00c5
        L_0x00d5:
            r0 = 10
            if (r9 == r0) goto L_0x00b9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Audio format not supported: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r9)
            X.6OJ r0 = new X.6OJ
            r0.<init>(r1)
            throw r0
        L_0x00e9:
            r6.A0T(r8)
            goto L_0x0058
        L_0x00ee:
            r0 = 9
            if (r5 != r0) goto L_0x0105
            X.6Om r0 = r11.A08
            if (r0 == 0) goto L_0x012f
            boolean r0 = r11.A0A
            if (r0 != 0) goto L_0x0101
            X.8wK r0 = r11.A06
            X.C1686986k.A01(r0, r1)
            r11.A0A = r6
        L_0x0101:
            X.6Om r7 = r11.A08
            goto L_0x0037
        L_0x0105:
            r0 = 18
            if (r5 != r0) goto L_0x012f
            boolean r0 = r11.A0A
            if (r0 != 0) goto L_0x012f
            X.6Oo r5 = r11.A0B
            X.7pi r0 = r11.A00(r12)
            r5.A03(r0, r3)
            r9 = 0
            long r3 = r5.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0060
            X.8wK r7 = r11.A06
            long[] r6 = r5.A01
            long[] r5 = r5.A02
            X.86m r0 = new X.86m
            r0.<init>(r6, r5, r3)
            r7.Bl0(r0)
            r11.A0A = r8
            goto L_0x0060
        L_0x012f:
            int r0 = r11.A02
            r12.BpP(r0)
            r9 = 0
            r5 = 0
            goto L_0x0061
        L_0x0138:
            X.6Oo r0 = r11.A0B
            long r3 = r0.A00
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0149
            r3 = 0
            goto L_0x001a
        L_0x0149:
            long r3 = r11.A05
            goto L_0x001a
        L_0x014d:
            int r0 = r11.A00
            r12.BpP(r0)
            r0 = 0
            r11.A00 = r0
            r0 = 3
            goto L_0x018c
        L_0x0157:
            X.7pi r6 = r11.A0F
            byte[] r3 = r6.A02
            r2 = 0
            r1 = 11
            r0 = 1
            boolean r0 = r12.BiM(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x01fb
            r6.A0S(r2)
            int r0 = r6.A0C()
            r11.A03 = r0
            int r0 = r6.A0D()
            r11.A02 = r0
            int r0 = r6.A0D()
            long r4 = (long) r0
            r11.A05 = r4
            int r0 = r6.A0C()
            int r0 = r0 << 24
            long r2 = (long) r0
            long r2 = r2 | r4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r11.A05 = r2
            r6.A0T(r7)
            r0 = 4
        L_0x018c:
            r11.A01 = r0
            goto L_0x0005
        L_0x0190:
            X.7pi r4 = r11.A0C
            byte[] r0 = r4.A02
            r5 = 0
            r3 = 9
            boolean r0 = r12.BiM(r0, r5, r3, r6)
            if (r0 == 0) goto L_0x01fb
            r4.A0S(r5)
            r0 = 4
            int r2 = X.C161467pi.A02(r4, r0)
            r0 = r2 & 4
            boolean r1 = X.AnonymousClass000.A1S(r0)
            r0 = r2 & 1
            if (r0 == 0) goto L_0x01b0
            r5 = 1
        L_0x01b0:
            if (r1 == 0) goto L_0x01c5
            X.6On r0 = r11.A07
            if (r0 != 0) goto L_0x01c5
            X.8wK r1 = r11.A06
            r0 = 8
            X.8tw r1 = r1.Br0(r0, r6)
            X.6On r0 = new X.6On
            r0.<init>(r1)
            r11.A07 = r0
        L_0x01c5:
            r2 = 2
            if (r5 == 0) goto L_0x01d9
            X.6Om r0 = r11.A08
            if (r0 != 0) goto L_0x01d9
            X.8wK r0 = r11.A06
            X.8tw r1 = r0.Br0(r3, r2)
            X.6Om r0 = new X.6Om
            r0.<init>(r1)
            r11.A08 = r0
        L_0x01d9:
            X.8wK r0 = r11.A06
            r0.B2W()
            int r0 = r4.A07()
            int r0 = r0 - r3
            int r0 = r0 + 4
            r11.A00 = r0
            r11.A01 = r2
            goto L_0x0005
        L_0x01eb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Video format not supported: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r5)
            X.6OJ r0 = new X.6OJ
            r0.<init>(r1)
            throw r0
        L_0x01fb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86T.BiD(X.8xa, X.7BG):int");
    }

    public void Bkz(long j, long j2) {
        if (j == 0) {
            this.A01 = 1;
            this.A09 = false;
        } else {
            this.A01 = 3;
        }
        this.A00 = 0;
    }

    public boolean BpS(C187648xa r5) {
        C161467pi r3 = this.A0D;
        r5.Bgd(r3.A02, 0, 3);
        r3.A0S(0);
        if (r3.A0D() != 4607062) {
            return false;
        }
        r5.Bgd(r3.A02, 0, 2);
        r3.A0S(0);
        if ((r3.A0F() & 250) != 0) {
            return false;
        }
        r5.Bgd(r3.A02, 0, 4);
        int A042 = C161467pi.A04(r3, 0);
        r5.Bjy();
        r5.Awu(A042);
        C161467pi.A06(r5, r3, 4);
        if (C161467pi.A04(r3, 0) == 0) {
            return true;
        }
        return false;
    }
}
