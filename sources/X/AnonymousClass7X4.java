package X;

/* renamed from: X.7X4  reason: invalid class name */
public final class AnonymousClass7X4 {
    public int A00;
    public int A01;
    public int A02;
    public C160747oF A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public void A00(int i) {
        this.A04 |= AnonymousClass001.A1W(i);
        this.A01 += i;
    }

    public void A01(int i) {
        boolean z = true;
        if (!this.A06 || this.A00 == 4) {
            this.A04 = true;
            this.A06 = true;
            this.A00 = i;
            return;
        }
        if (i != 4) {
            z = false;
        }
        C161487pm.A03(z);
    }

    public AnonymousClass7X4(C160747oF r1) {
        this.A03 = r1;
    }
}
