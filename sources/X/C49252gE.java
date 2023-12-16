package X;

/* renamed from: X.2gE  reason: invalid class name and case insensitive filesystem */
public final class C49252gE {
    public final AnonymousClass33p A00;
    public final AnonymousClass1VX A01;
    public final C49652gs A02;

    public final void A00(int i) {
        AnonymousClass33p r0;
        boolean z;
        C49652gs r1 = this.A02;
        if ((!r1.A01() || i < 4) && (r1.A01() || i < 3)) {
            r0 = this.A00;
            z = false;
        } else {
            r0 = this.A00;
            z = true;
        }
        C18270x1.A0l(C18270x1.A03(r0), "sticker_contextual_suggestion_eligibility", z);
    }

    public final boolean A01() {
        if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A00), "sticker_contextual_suggestion_eligibility")) {
            return true;
        }
        if (!this.A01.A0Y(C58422vE.A02, 3403) || !this.A02.A01()) {
            return false;
        }
        return true;
    }

    public C49252gE(AnonymousClass33p r1, AnonymousClass1VX r2, C49652gs r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
