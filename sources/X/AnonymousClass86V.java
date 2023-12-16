package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.86V  reason: invalid class name */
public final class AnonymousClass86V implements C185328tT {
    public long A00;
    public long A01;
    public C187028wK A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass87D A05;
    public final C160807oL A06;
    public final C161467pi A07;
    public final C161467pi A08;

    public void Bkz(long j, long j2) {
        this.A04 = false;
        this.A05.Bky();
        this.A01 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        r10.Bjy();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if ((r3 - r2) >= 8192) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BpS(X.C187648xa r10) {
        /*
            r9 = this;
            r3 = 0
            r2 = 0
        L_0x0002:
            X.7pi r4 = r9.A08
            byte[] r1 = r4.A02
            r0 = 10
            r10.Bgd(r1, r3, r0)
            r4.A0S(r3)
            int r1 = r4.A0D()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L_0x0076
            r10.Bjy()
            r10.Awu(r2)
            long r5 = r9.A00
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            long r0 = (long) r2
            r9.A00 = r0
        L_0x0028:
            r5 = 0
            r3 = r2
        L_0x002a:
            r7 = 0
            r6 = 0
        L_0x002c:
            byte[] r1 = r4.A02
            r0 = 2
            r10.Bgd(r1, r5, r0)
            r4.A0S(r5)
            int r1 = r4.A0F()
            r0 = 65526(0xfff6, float:9.1821E-41)
            r1 = r1 & r0
            r0 = 65520(0xfff0, float:9.1813E-41)
            if (r1 != r0) goto L_0x0067
            r8 = 1
            int r7 = r7 + 1
            r1 = 4
            if (r7 < r1) goto L_0x004d
            r0 = 188(0xbc, float:2.63E-43)
            if (r6 <= r0) goto L_0x004d
            return r8
        L_0x004d:
            X.C161467pi.A06(r10, r4, r1)
            X.7oL r1 = r9.A06
            r0 = 14
            r1.A08(r0)
            r0 = 13
            int r1 = r1.A04(r0)
            r0 = 6
            if (r1 <= r0) goto L_0x0086
            int r0 = r1 + -6
            r10.Awu(r0)
            int r6 = r6 + r1
            goto L_0x002c
        L_0x0067:
            r10.Bjy()
            int r3 = r3 + 1
            int r1 = r3 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L_0x0086
            r10.Awu(r3)
            goto L_0x002a
        L_0x0076:
            r0 = 3
            r4.A0T(r0)
            int r1 = r4.A0B()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r10.Awu(r1)
            goto L_0x0002
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86V.BpS(X.8xa):boolean");
    }

    public void BFs(C187028wK r6) {
        this.A02 = r6;
        this.A05.B19(r6, new C151897Ws(Integer.MIN_VALUE, 0, 1));
        r6.B2W();
    }

    public int BiD(C187648xa r10, AnonymousClass7BG r11) {
        C161487pm.A01(this.A02);
        C161467pi r6 = this.A07;
        int read = r10.read(r6.A02, 0, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        boolean A1U = AnonymousClass000.A1U(read, -1);
        if (!this.A03) {
            C1686986k.A01(this.A02, -9223372036854775807L);
            this.A03 = true;
        }
        if (A1U) {
            return -1;
        }
        r6.A0S(0);
        r6.A0R(read);
        if (!this.A04) {
            this.A05.A09 = this.A01;
            this.A04 = true;
        }
        this.A05.AzY(r6);
        return 0;
    }

    public AnonymousClass86V(int i) {
        this.A05 = new AnonymousClass87D(true, (String) null);
        this.A07 = C161467pi.A05(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        this.A00 = -1;
        C161467pi A052 = C161467pi.A05(10);
        this.A08 = A052;
        byte[] bArr = A052.A02;
        this.A06 = new C160807oL(bArr, bArr.length);
    }

    public AnonymousClass86V() {
        this(0);
    }
}
