package X;

/* renamed from: X.7ag  reason: invalid class name and case insensitive filesystem */
public final class C153107ag {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass7M4 A04;
    public AnonymousClass7UO A05;
    public boolean A06;
    public final C185598tw A07;
    public final AnonymousClass7QL A08 = new AnonymousClass7QL();
    public final C161467pi A09 = new C161467pi();
    public final C161467pi A0A = C161467pi.A05(1);
    public final C161467pi A0B = new C161467pi();

    public C149607Nc A01() {
        if (this.A06) {
            AnonymousClass7QL r1 = this.A08;
            int i = r1.A05.A02;
            C149607Nc r12 = r1.A06;
            if (!(r12 == null && (r12 = this.A05.A03.A0A[i]) == null) && r12.A03) {
                return r12;
            }
        }
        return null;
    }

    public void A02() {
        AnonymousClass7QL r3 = this.A08;
        r3.A01 = 0;
        r3.A04 = 0;
        r3.A08 = false;
        r3.A07 = false;
        r3.A09 = false;
        r3.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public boolean A03() {
        this.A01++;
        if (this.A06) {
            int i = this.A00 + 1;
            this.A00 = i;
            int[] iArr = this.A08.A0C;
            int i2 = this.A02;
            if (i != iArr[i2]) {
                return true;
            }
            this.A02 = i2 + 1;
            this.A00 = 0;
        }
        return false;
    }

    public C153107ag(C185598tw r2, AnonymousClass7M4 r3, AnonymousClass7UO r4) {
        this.A07 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A05 = r4;
        this.A04 = r3;
        r2.B3T(r4.A03.A07);
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r15 != 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r4.A0F[r1] == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r14, int r15) {
        /*
            r13 = this;
            X.7Nc r0 = r13.A01()
            r10 = 0
            if (r0 != 0) goto L_0x0008
            return r10
        L_0x0008:
            int r8 = r0.A00
            if (r8 == 0) goto L_0x0043
            X.7QL r0 = r13.A08
            X.7pi r5 = r0.A0H
        L_0x0010:
            X.7QL r4 = r13.A08
            int r1 = r13.A01
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x001f
            boolean[] r0 = r4.A0F
            boolean r0 = r0[r1]
            r12 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r12 = 0
        L_0x0020:
            r9 = 1
            if (r12 != 0) goto L_0x0026
            r3 = 0
            if (r15 == 0) goto L_0x0027
        L_0x0026:
            r3 = 1
        L_0x0027:
            X.7pi r2 = r13.A0A
            byte[] r1 = r2.A02
            r0 = 0
            if (r3 == 0) goto L_0x0030
            r0 = 128(0x80, float:1.794E-43)
        L_0x0030:
            X.AnonymousClass6C8.A0u(r0, r1, r8, r10)
            r2.A0S(r10)
            X.8tw r7 = r13.A07
            r7.Bkd(r2, r9, r9)
            r7.Bkd(r5, r8, r9)
            if (r3 != 0) goto L_0x004c
            int r0 = r8 + 1
            return r0
        L_0x0043:
            byte[] r0 = r0.A04
            X.7pi r5 = r13.A09
            int r8 = r0.length
            r5.A0U(r0, r8)
            goto L_0x0010
        L_0x004c:
            r11 = 6
            r6 = 3
            r5 = 2
            r1 = 8
            if (r12 != 0) goto L_0x0089
            X.7pi r4 = r13.A0B
            r4.A0Q(r1)
            byte[] r3 = r4.A02
            r3[r10] = r10
            r3[r9] = r9
            int r0 = r15 >> 8
            X.AnonymousClass6C9.A1G(r3, r0, r5)
            X.AnonymousClass6C9.A1G(r3, r15, r6)
            int r0 = r14 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r0
            r0 = 4
            r3[r0] = r2
            int r0 = r14 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r0
            r0 = 5
            r3[r0] = r2
            int r0 = r14 >> 8
            X.AnonymousClass6C9.A1G(r3, r0, r11)
            r0 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r0
            r0 = 7
            r3[r0] = r2
            r7.Bkd(r4, r1, r9)
            int r0 = r8 + 1
            int r0 = r0 + 8
            return r0
        L_0x0089:
            X.7pi r11 = r4.A0H
            int r2 = r11.A0F()
            r0 = -2
            r11.A0T(r0)
            int r0 = r2 * 6
            int r4 = r0 + 2
            if (r15 == 0) goto L_0x00b6
            X.7pi r3 = r13.A0B
            r3.A0Q(r4)
            byte[] r2 = r3.A02
            r11.A0V(r2, r10, r4)
            byte r0 = r2[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r1
            int r1 = X.AnonymousClass6CA.A0C(r2, r6, r0)
            int r1 = r1 + r15
            int r0 = r1 >> 8
            X.AnonymousClass6C9.A1G(r2, r0, r5)
            X.AnonymousClass6C9.A1G(r2, r1, r6)
            r11 = r3
        L_0x00b6:
            r7.Bkd(r11, r4, r9)
            int r0 = r8 + 1
            int r0 = r0 + r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153107ag.A00(int, int):int");
    }
}
