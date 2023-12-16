package X;

/* renamed from: X.6K1  reason: invalid class name */
public final class AnonymousClass6K1 extends AnonymousClass6K4 {
    public int A00;
    public final int A01;
    public final C185778uE A02;

    public C187418xB B0v(AnonymousClass7Z2 r4, AnonymousClass7ZV r5, long j) {
        int i = this.A01;
        C185778uE r2 = this.A02;
        if (i != Integer.MAX_VALUE) {
            r4 = r4.A00(r4.A02 % this.A00);
        }
        return r2.B0v(r4, r5, j);
    }

    public void Biu(C187418xB r2) {
        this.A02.Biu(r2);
    }

    public AnonymousClass6K1(C185778uE r2, int i) {
        C159197lM.A01(AnonymousClass001.A1W(i));
        this.A02 = r2;
        this.A01 = i;
    }

    public void A00() {
        super.A00();
        this.A00 = 0;
    }

    public void A01(C153737br r3, boolean z) {
        super.A01(r3, z);
        A03(this.A02, (Object) null);
    }
}
