package X;

/* renamed from: X.7UT  reason: invalid class name */
public final class AnonymousClass7UT {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final int A05;
    public final C161457ph A06;
    public final C161457ph A07;
    public final boolean A08;

    public boolean A00() {
        long A09;
        int i;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            return false;
        }
        boolean z = this.A08;
        C161457ph r0 = this.A06;
        if (z) {
            A09 = r0.A0A();
        } else {
            A09 = r0.A09();
        }
        this.A04 = A09;
        if (i2 == this.A01) {
            C161457ph r1 = this.A07;
            this.A02 = r1.A05();
            r1.A0I(4);
            int i3 = this.A03 - 1;
            this.A03 = i3;
            if (i3 > 0) {
                i = r1.A05() - 1;
            } else {
                i = -1;
            }
            this.A01 = i;
        }
        return true;
    }

    public AnonymousClass7UT(C161457ph r3, C161457ph r4, boolean z) {
        this.A07 = r3;
        this.A06 = r4;
        this.A08 = z;
        r4.A0H(12);
        this.A05 = r4.A05();
        r3.A0H(12);
        this.A03 = r3.A05();
        AnonymousClass70y.A00(AnonymousClass001.A1T(r3.A03()), "first_chunk must be 1");
    }
}
