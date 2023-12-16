package X;

/* renamed from: X.2mu  reason: invalid class name and case insensitive filesystem */
public final class C53322mu {
    public final C56972sr A00;
    public final C56612sH A01;
    public final AnonymousClass2ZY A02;
    public final AnonymousClass1VX A03;
    public final C45622aJ A04;

    public C624134x A00(C50882iv r8, C95814uZ r9, C624134x r10) {
        boolean z = true;
        C162457s7.A0J(r9, 1);
        if (r8.A00 != 1) {
            z = false;
        }
        C624134x r5 = null;
        if (z && this.A03.A0Y(C58422vE.A02, 4873)) {
            if (this.A02.A00(r9) < 0) {
                r5 = A01(r9, false);
            }
            r10.A1B(8388608);
        }
        return r5;
    }

    public C624134x A01(C95814uZ r6, boolean z) {
        C162457s7.A0J(r6, 0);
        C56612sH r2 = this.A01;
        AnonymousClass2z0 A05 = AnonymousClass2z0.A05(r6, AnonymousClass35J.A02(this.A00, r2), true);
        long A0H = r2.A0H();
        int i = 147;
        if (z) {
            i = 155;
        }
        return new C31151np(A05, i, A0H);
    }

    public boolean A02() {
        AnonymousClass1VX r1 = this.A03;
        C58422vE r3 = C58422vE.A02;
        if (!r1.A0Y(r3, 4873)) {
            return false;
        }
        C45622aJ r2 = this.A04;
        if (!r2.A01.A0Y(r3, 5747) || C162457s7.A0P(r2.A00(), "yes")) {
            return true;
        }
        return false;
    }

    public C53322mu(C56972sr r1, C56612sH r2, AnonymousClass2ZY r3, AnonymousClass1VX r4, C45622aJ r5) {
        C18260x0.A0f(r2, r4, r1, r5, r3);
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }
}
