package X;

/* renamed from: X.2bT  reason: invalid class name and case insensitive filesystem */
public class C46342bT {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public final AnonymousClass4FV A04;

    public void A00(C95814uZ r4, int i) {
        this.A00 = i;
        this.A02 = C18280x3.A00(C627336j.A0K(r4) ? 1 : 0);
        C24801Yu r2 = new C24801Yu();
        int i2 = this.A01;
        if (i2 > 0) {
            r2.A01 = Integer.valueOf(i2);
        }
        int i3 = this.A00;
        r2.A02 = Integer.valueOf(i3);
        r2.A00 = Integer.valueOf(this.A02);
        if (i3 == 1) {
            r2.A03 = Long.valueOf(this.A03);
        }
        this.A04.BhD(r2);
    }

    public C46342bT(AnonymousClass4FV r1) {
        this.A04 = r1;
    }
}
