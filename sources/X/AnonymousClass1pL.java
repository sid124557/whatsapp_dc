package X;

/* renamed from: X.1pL  reason: invalid class name */
public final class AnonymousClass1pL extends AnonymousClass315 {
    public final C59542x5 A00;

    public AnonymousClass1pL(C59542x5 r1, AnonymousClass39W r2, C41882Ly r3) {
        super(r2, r3);
        this.A00 = r1;
    }

    public String A07() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass315.A02(super.A07(), "\n", A0o);
        for (C108725dS r1 : this.A02.A0B) {
            String str = r1.A01;
            A0o.append(str);
            AnonymousClass315.A02(str, "\n", A0o);
            for (C108785dY r2 : r1.A02) {
                AnonymousClass315.A02(r2.A03, " ", A0o);
                AnonymousClass315.A02(r2.A00, "\n", A0o);
            }
        }
        return C18290x4.A0o(A0o);
    }

    public void A0C(C55032pg r2, C624134x r3) {
        C18260x0.A0O(r2, r3);
        AnonymousClass36V.A05(this.A00, r2, r3);
    }
}
