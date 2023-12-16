package X;

/* renamed from: X.5lM  reason: invalid class name and case insensitive filesystem */
public class C113395lM implements C836349e {
    public final C56982ss A00;
    public final AnonymousClass2R8 A01;
    public final AnonymousClass1VX A02;

    public boolean B3H(C95814uZ r4) {
        if (this.A02.A0X(1608)) {
            if (r4 == null) {
                return false;
            }
            C56982ss r1 = this.A00;
            if (r1.A03(r4) == 0 || r1.A0M(r4) || r1.A0P(r4)) {
                return false;
            }
        } else if (this.A00.A03(r4) == 0) {
            return false;
        }
        return true;
    }

    public C113395lM(C56982ss r1, AnonymousClass2R8 r2, AnonymousClass1VX r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
