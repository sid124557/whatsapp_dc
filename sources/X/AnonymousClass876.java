package X;

/* renamed from: X.876  reason: invalid class name */
public final class AnonymousClass876 implements C185608tx {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public long A04;
    public long A05;
    public C166527yp A06;
    public C185598tw A07;
    public String A08;
    public final C161467pi A09 = new C161467pi(new byte[18]);
    public final String A0A;

    public void Bky() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0007 A[EDGE_INSN: B:84:0x0007->B:78:0x0007 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AzY(X.C161467pi r23) {
        /*
            r22 = this;
            r12 = r22
            X.8tw r0 = r12.A07
            X.C161487pm.A01(r0)
        L_0x0007:
            r1 = r23
            int r2 = r1.A00
            int r0 = r1.A01
            int r4 = r2 - r0
            if (r4 <= 0) goto L_0x0273
            int r0 = r12.A02
            r3 = 1
            if (r0 == 0) goto L_0x0226
            r11 = 0
            r15 = 2
            if (r0 == r3) goto L_0x0046
            int r2 = r12.A01
            int r0 = r12.A00
            int r2 = X.AnonymousClass6C9.A0A(r2, r0, r4)
            X.8tw r0 = r12.A07
            r0.Bkc(r1, r2)
            int r0 = r12.A00
            int r0 = r0 + r2
            r12.A00 = r0
            int r2 = r12.A01
            if (r0 != r2) goto L_0x0007
            X.8tw r3 = r12.A07
            long r0 = r12.A05
            r5 = 1
            r4 = 0
            r6 = r2
            r7 = r11
            r8 = r0
            r3.Bkh(r4, r5, r6, r7, r8)
            long r2 = r12.A05
            long r0 = r12.A04
            long r2 = r2 + r0
            r12.A05 = r2
            r12.A02 = r11
            goto L_0x0007
        L_0x0046:
            X.7pi r14 = r12.A09
            byte[] r3 = r14.A02
            int r2 = r12.A00
            r0 = 18
            int r0 = X.AnonymousClass6C9.A0A(r0, r2, r4)
            r1.A0V(r3, r2, r0)
            int r1 = r12.A00
            int r1 = r1 + r0
            r12.A00 = r1
            r0 = 18
            if (r1 != r0) goto L_0x0007
            byte[] r13 = r14.A02
            X.7yp r0 = r12.A06
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = r12.A08
            r21 = r0
            java.lang.String r0 = r12.A0A
            r20 = r0
            r19 = 0
            byte r2 = r13[r11]
            r1 = 127(0x7f, float:1.78E-43)
            int r0 = r13.length
            if (r2 != r1) goto L_0x017d
            X.7oL r10 = new X.7oL
            r10.<init>(r13, r0)
        L_0x007a:
            r0 = 60
            r10.A09(r0)
            r0 = 6
            int r1 = r10.A04(r0)
            int[] r0 = X.AnonymousClass791.A00
            r4 = r0[r1]
            r0 = 4
            int r1 = r10.A04(r0)
            int[] r0 = X.AnonymousClass791.A01
            r3 = r0[r1]
            r0 = 5
            int r2 = r10.A04(r0)
            int[] r1 = X.AnonymousClass791.A02
            int r0 = r1.length
            if (r2 < r0) goto L_0x0176
            r1 = -1
        L_0x009c:
            r0 = 10
            int r0 = X.C160807oL.A01(r10, r0, r15)
            boolean r0 = X.AnonymousClass001.A1W(r0)
            int r4 = r4 + r0
            X.7he r2 = X.C157057he.A00()
            r0 = r21
            r2.A0O = r0
            java.lang.String r0 = "audio/vnd.dts"
            r2.A0R = r0
            r2.A03 = r1
            r1 = r19
            r0 = r20
            X.7yp r1 = X.C157057he.A01(r2, r1, r0, r4, r3)
            r12.A06 = r1
            X.8tw r0 = r12.A07
            r0.B3T(r1)
        L_0x00c4:
            byte r1 = r13[r11]
            r0 = -2
            r3 = 6
            r2 = 7
            r6 = 4
            if (r1 == r0) goto L_0x0165
            r0 = -1
            if (r1 == r0) goto L_0x0149
            r0 = 31
            if (r1 == r0) goto L_0x013a
            r0 = 5
            byte r0 = r13[r0]
            r0 = r0 & 3
            int r4 = r0 << 12
            byte r3 = r13[r3]
            r0 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r4 = r4 | r0
            byte r0 = r13[r2]
            r2 = r0
        L_0x00e3:
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >> r6
            r0 = r0 | r4
            int r0 = r0 + 1
        L_0x00e9:
            r12.A01 = r0
            r0 = -2
            r5 = 6
            r4 = 5
            if (r1 == r0) goto L_0x0132
            r0 = -1
            if (r1 == r0) goto L_0x0129
            r0 = 31
            if (r1 == r0) goto L_0x0123
            byte r0 = r13[r6]
            r1 = r0 & 1
            int r1 = r1 << r5
            byte r0 = r13[r4]
        L_0x00fe:
            r0 = r0 & 252(0xfc, float:3.53E-43)
        L_0x0100:
            int r0 = r0 >> 2
            r0 = r0 | r1
            int r0 = r0 + 1
            int r0 = r0 * 32
            long r1 = X.AnonymousClass6CA.A0G(r0)
            X.7yp r0 = r12.A06
            int r0 = r0.A0F
            long r3 = (long) r0
            long r1 = r1 / r3
            int r0 = (int) r1
            long r0 = (long) r0
            r12.A04 = r0
            r14.A0S(r11)
            X.8tw r1 = r12.A07
            r0 = 18
            r1.Bkc(r14, r0)
            r12.A02 = r15
            goto L_0x0007
        L_0x0123:
            byte r0 = r13[r4]
            r1 = r0 & 7
            int r1 = r1 << r6
            goto L_0x012f
        L_0x0129:
            byte r0 = r13[r6]
            r1 = r0 & 7
            int r1 = r1 << r6
            r3 = r2
        L_0x012f:
            r0 = r3 & 60
            goto L_0x0100
        L_0x0132:
            byte r0 = r13[r4]
            r1 = r0 & 1
            int r1 = r1 << r5
            byte r0 = r13[r6]
            goto L_0x00fe
        L_0x013a:
            byte r3 = r13[r3]
            r0 = r3 & 3
            int r4 = r0 << 12
            byte r2 = r13[r2]
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r4 = r4 | r0
            r0 = 8
            goto L_0x0157
        L_0x0149:
            byte r2 = r13[r2]
            r0 = r2 & 3
            int r4 = r0 << 12
            byte r3 = r13[r3]
            r0 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r4 = r4 | r0
            r0 = 9
        L_0x0157:
            byte r0 = r13[r0]
            r0 = r0 & 60
            int r0 = r0 >> 2
            r0 = r0 | r4
            int r0 = r0 + 1
            int r0 = r0 * 16
            int r0 = r0 / 14
            goto L_0x00e9
        L_0x0165:
            byte r0 = r13[r6]
            r0 = r0 & 3
            int r4 = r0 << 12
            byte r2 = r13[r2]
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r4 = r4 | r0
            byte r0 = r13[r3]
            r3 = r0
            goto L_0x00e3
        L_0x0176:
            r0 = r1[r2]
            int r1 = r0 * 1000
            int r1 = r1 / r15
            goto L_0x009c
        L_0x017d:
            byte[] r9 = java.util.Arrays.copyOf(r13, r0)
            byte r1 = r9[r11]
            r0 = -2
            if (r1 == r0) goto L_0x0189
            r0 = -1
            if (r1 != r0) goto L_0x019c
        L_0x0189:
            r3 = 0
        L_0x018a:
            int r0 = r9.length
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x019c
            byte r2 = r9[r3]
            int r1 = r3 + 1
            byte r0 = r9[r1]
            r9[r3] = r0
            r9[r1] = r2
            int r3 = r3 + 2
            goto L_0x018a
        L_0x019c:
            int r8 = r9.length
            X.7oL r10 = new X.7oL
            r10.<init>(r9, r8)
            byte r1 = r9[r11]
            r0 = 31
            if (r1 != r0) goto L_0x021c
            X.7oL r7 = new X.7oL
            r7.<init>(r9, r8)
        L_0x01ad:
            int r1 = X.C160807oL.A00(r7)
            r0 = 16
            if (r1 < r0) goto L_0x021c
            r7.A09(r15)
            r6 = 14
            int r5 = r7.A04(r6)
            r18 = 1
            int r0 = r18 << r6
            int r0 = r0 - r18
            r5 = r5 & r0
            int r1 = r10.A00
            int r0 = 8 - r1
            int r17 = java.lang.Math.min(r0, r6)
            int r0 = r0 - r17
            r2 = 65280(0xff00, float:9.1477E-41)
            int r2 = r2 >> r1
            int r1 = r18 << r0
            int r1 = r1 - r18
            r2 = r2 | r1
            byte[] r4 = r10.A03
            int r3 = r10.A02
            byte r1 = r4[r3]
            r2 = r2 & r1
            byte r1 = (byte) r2
            r16 = r1
            r4[r3] = r1
            int r2 = r6 - r17
            int r1 = r5 >>> r2
            int r1 = r1 << r0
            r0 = r16
            X.AnonymousClass6C8.A0u(r0, r4, r1, r3)
            int r3 = r3 + 1
        L_0x01f0:
            r0 = 8
            if (r2 <= r0) goto L_0x01ff
            int r1 = r3 + 1
            int r2 = r2 + -8
            int r0 = r5 >>> r2
            byte r0 = (byte) r0
            r4[r3] = r0
            r3 = r1
            goto L_0x01f0
        L_0x01ff:
            int r16 = 8 - r2
            byte r1 = r4[r3]
            int r0 = r18 << r16
            int r0 = r0 - r18
            r1 = r1 & r0
            byte r1 = (byte) r1
            r4[r3] = r1
            int r0 = r18 << r2
            int r0 = r0 - r18
            r5 = r5 & r0
            int r5 = r5 << r16
            X.AnonymousClass6C8.A0u(r5, r4, r1, r3)
            r10.A09(r6)
            r10.A07()
            goto L_0x01ad
        L_0x021c:
            r10.A03 = r9
            r10.A02 = r11
            r10.A00 = r11
            r10.A01 = r8
            goto L_0x007a
        L_0x0226:
            int r0 = r1.A01
            int r0 = r2 - r0
            r4 = 0
            if (r0 <= 0) goto L_0x0007
            int r0 = r12.A03
            int r5 = r0 << 8
            r12.A03 = r5
            int r0 = r1.A0C()
            r5 = r5 | r0
            r12.A03 = r5
            r0 = 2147385345(0x7ffe8001, float:NaN)
            if (r5 == r0) goto L_0x024e
            r0 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r5 == r0) goto L_0x024e
            r0 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r5 == r0) goto L_0x024e
            r0 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r5 != r0) goto L_0x0226
        L_0x024e:
            X.7pi r0 = r12.A09
            byte[] r2 = r0.A02
            int r0 = r5 >> 24
            X.AnonymousClass6C9.A1G(r2, r0, r4)
            int r0 = r5 >> 16
            X.AnonymousClass6C9.A1G(r2, r0, r3)
            int r0 = r5 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0
            r0 = 2
            r2[r0] = r1
            r0 = r5 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0
            r0 = 3
            r2[r0] = r1
            r0 = 4
            r12.A00 = r0
            r12.A03 = r4
            r12.A02 = r3
            goto L_0x0007
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass876.AzY(X.7pi):void");
    }

    public void BgP() {
    }

    public AnonymousClass876(String str) {
        this.A0A = str;
    }

    public void B19(C187028wK r2, C151897Ws r3) {
        this.A08 = C151897Ws.A01(r3);
        this.A07 = C151897Ws.A00(r2, r3);
    }

    public void BgQ(long j, int i) {
        this.A05 = j;
    }
}
