package X;

/* renamed from: X.2eV  reason: invalid class name and case insensitive filesystem */
public final class C48192eV {
    public final AnonymousClass1VX A00;

    public C48192eV(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final int A00() {
        AnonymousClass1VX r3 = this.A00;
        C58422vE r1 = C58422vE.A02;
        if (!r3.A0Y(r1, 3141)) {
            return 1;
        }
        int A0O = r3.A0O(r1, 3732);
        if (A0O > 5) {
            return 5;
        }
        if (A0O < 1) {
            return 1;
        }
        return A0O;
    }

    public final boolean A01() {
        AnonymousClass1VX r2 = this.A00;
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 3139) || r2.A0Y(r1, 3140)) {
            return true;
        }
        return false;
    }
}
