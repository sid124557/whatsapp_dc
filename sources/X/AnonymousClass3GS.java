package X;

import java.util.List;

/* renamed from: X.3GS  reason: invalid class name */
public final class AnonymousClass3GS implements AnonymousClass4EA {
    public final AnonymousClass3GT A00;
    public final AnonymousClass3GR A01;
    public final AnonymousClass1VX A02;

    public List B8q(C95814uZ r2) {
        C162457s7.A0J(r2, 0);
        if (A00()) {
            return this.A00.B8q(r2);
        }
        return this.A01.B8q(r2);
    }

    public List B8r(C95814uZ r2) {
        C162457s7.A0J(r2, 0);
        if (A00()) {
            return this.A00.B8r(r2);
        }
        return this.A01.B8q(r2);
    }

    public final boolean A00() {
        AnonymousClass1VX r2 = this.A02;
        C58422vE r1 = C58422vE.A02;
        if (!r2.A0Y(r1, 2939) || !r2.A0Y(r1, 2479)) {
            return false;
        }
        return true;
    }

    public AnonymousClass3GS(AnonymousClass3GT r1, AnonymousClass3GR r2, AnonymousClass1VX r3) {
        C18260x0.A0V(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public List B8t(C95814uZ r2) {
        if (A00()) {
            return this.A00.B8t(r2);
        }
        return C18290x4.A12(r2);
    }
}
