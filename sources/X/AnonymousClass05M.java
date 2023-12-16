package X;

/* renamed from: X.05M  reason: invalid class name */
public abstract class AnonymousClass05M extends AnonymousClass05O {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public C03990Mi A08 = new C03990Mi();
    public C15700rn A09 = null;
    public boolean A0A = false;

    public void A0N(C02310Fr r3, C02310Fr r4, AnonymousClass0R7 r5, int i, int i2) {
        C15700rn r1;
        AnonymousClass0R7 r0;
        while (true) {
            r1 = this.A09;
            if (r1 != null || (r0 = this.A0Z) == null) {
                C03990Mi r02 = this.A08;
                r02.A05 = r3;
                r02.A06 = r4;
                r02.A00 = i;
                r02.A04 = i2;
                r5.A0h = C03990Mi.A00(r5, r02, r1);
            } else {
                this.A09 = ((AnonymousClass05P) r0).A06;
            }
        }
        C03990Mi r022 = this.A08;
        r022.A05 = r3;
        r022.A06 = r4;
        r022.A00 = i;
        r022.A04 = i2;
        r5.A0h = C03990Mi.A00(r5, r022, r1);
    }
}
