package X;

/* renamed from: X.2m4  reason: invalid class name and case insensitive filesystem */
public final class C52802m4 {
    public final C54862pP A00;
    public final C55382qG A01;
    public final C620733j A02;
    public final AnonymousClass1VX A03;

    public final boolean A00() {
        if (!this.A00.A02()) {
            AnonymousClass1VX r2 = this.A03;
            C58422vE r1 = C58422vE.A02;
            if (!r2.A0Y(r1, 5459)) {
                return r2.A0Y(r1, 4010);
            }
            if (this.A01.A01().value >= C372121j.AI_AVAILABLE.value) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A01() {
        AnonymousClass1VX r3 = this.A03;
        C58422vE r1 = C58422vE.A02;
        if (!r3.A0Y(r1, 5362)) {
            return false;
        }
        if (this.A00.A02() || !r3.A0Y(r1, 5637) || C162457s7.A0P(this.A02.A07(), "en")) {
            return true;
        }
        return false;
    }

    public C52802m4(C54862pP r1, C55382qG r2, C620733j r3, AnonymousClass1VX r4) {
        C18260x0.A0c(r4, r3, r1, r2);
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean A02() {
        if (!A00() || !A01() || !this.A03.A0Y(C58422vE.A02, 6251)) {
            return false;
        }
        return true;
    }
}
