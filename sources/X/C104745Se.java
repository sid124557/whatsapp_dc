package X;

/* renamed from: X.5Se  reason: invalid class name and case insensitive filesystem */
public final class C104745Se {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass5UP A02;
    public final C183538qC A03;

    public final boolean A00() {
        if (this.A00.A0Y()) {
            return false;
        }
        AnonymousClass1VX r2 = this.A01;
        if (!r2.A0X(2722)) {
            return false;
        }
        if (C86654Ky.A0g(this.A03).A05(AnonymousClass21S.A0X) || !r2.A0Y(C58422vE.A01, 6457)) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (!C18300x5.A1S(this.A02) || A00()) {
            return false;
        }
        AnonymousClass1VX r3 = this.A01;
        C58422vE r2 = C58422vE.A01;
        if (r3.A0O(r2, 3964) == AnonymousClass597.APP_SWITCH_STATUS_AND_CHANNELS_ENABLED.value || r3.A0O(r2, 3964) == AnonymousClass597.XFAMILY_CROSSPOST_ENABLED.value) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        if (!C18300x5.A1S(this.A02) || !A00() || this.A01.A0O(C58422vE.A01, 3964) != AnonymousClass597.XFAMILY_CROSSPOST_ENABLED.value) {
            return false;
        }
        return true;
    }

    public C104745Se(C56972sr r1, AnonymousClass1VX r2, AnonymousClass5UP r3, C183538qC r4) {
        C18260x0.A0c(r2, r1, r3, r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
