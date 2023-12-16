package X;

/* renamed from: X.68g  reason: invalid class name and case insensitive filesystem */
public class C1233968g implements C182428oO {
    public Object A00;
    public final int A01;

    public C1233968g(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BNF() {
        if (this.A01 != 0) {
            C106765a8 r1 = (C106765a8) this.A00;
            C114085mT r4 = (C114085mT) r1.A00;
            if (r4.A03.getVisibility() == 0) {
                r4.A03.A00();
                r4.A03.postDelayed(new C70003Zm(r1, 12), 150);
                r4.A00.A0d(false);
                return;
            }
            return;
        }
        C113245l7 r42 = (C113245l7) this.A00;
        if (r42.A3v.getVisibility() == 0) {
            r42.A1a.A07 = true;
            r42.A3v.A00();
            r42.A3v.postDelayed(C117615sD.A00(r42, 10), (long) ((int) (r42.A0R() * 150.0f)));
        }
    }
}
