package X;

/* renamed from: X.2hB  reason: invalid class name and case insensitive filesystem */
public final class C49842hB {
    public final C56972sr A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass5TX A02;
    public final AnonymousClass1VW A03;
    public final AnonymousClass1VX A04;

    public final boolean A00() {
        if (this.A00.A0Y() || !this.A04.A0Y(C58422vE.A02, 4882)) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (!this.A03.A0Y(C58422vE.A02, 6114) || this.A00.A0Y()) {
            return false;
        }
        String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A01), "settings_verification_email_address");
        if (A0Z == null || A0Z.length() == 0) {
            return true;
        }
        return false;
    }

    public C49842hB(C56972sr r1, AnonymousClass33p r2, AnonymousClass5TX r3, AnonymousClass1VW r4, AnonymousClass1VX r5) {
        C18260x0.A0c(r5, r1, r4, r2);
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
