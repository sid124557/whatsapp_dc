package X;

/* renamed from: X.7Tt  reason: invalid class name and case insensitive filesystem */
public class C151187Tt {
    public int A00 = -1;
    public long A01;
    public C186058ug A02;
    public final int A03;
    public final C186308v5 A04;

    public boolean A00() {
        int i = this.A00;
        C186308v5 r1 = this.A04;
        if (i >= r1.getCount() - 1) {
            return false;
        }
        int i2 = this.A00 + 1;
        this.A00 = i2;
        C186058ug B9S = r1.B9S(i2);
        this.A02 = B9S;
        if (B9S != null) {
            this.A01 = B9S.B6l();
        }
        return true;
    }

    public C151187Tt(C186308v5 r2, int i) {
        this.A04 = r2;
        this.A03 = i;
    }
}
