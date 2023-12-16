package X;

/* renamed from: X.5Tr  reason: invalid class name and case insensitive filesystem */
public final class C105125Tr {
    public AnonymousClass66P A00;
    public AnonymousClass5S1 A01;
    public AnonymousClass5S1 A02;
    public boolean A03;
    public final AnonymousClass5O0 A04;
    public final AnonymousClass5H9 A05 = new AnonymousClass5H9(this);
    public final C113925mD A06;
    public final C29151iM A07;
    public final AnonymousClass57R A08;
    public final AnonymousClass57S A09;

    public final void A00() {
        AnonymousClass5S1 r0 = this.A01;
        if (r0 == null) {
            throw C18270x1.A0S("currentShareViewState");
        } else if (r0.A00) {
            AnonymousClass57R r1 = this.A08;
            r1.A05("SEE_F_ICON_DISAPPEAR");
            r1.A01();
            AnonymousClass5S1 r12 = this.A01;
            if (r12 == null) {
                throw C18270x1.A0S("currentShareViewState");
            }
            r12.A00 = false;
            r12.A01 = false;
            AnonymousClass66P r02 = this.A00;
            if (r02 != null) {
                r02.BbT(r12);
            }
        }
    }

    public final void A01() {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass5S1(false, false);
        }
        if (this.A02 == null) {
            this.A02 = new AnonymousClass5S1(false, false);
        }
        if (!this.A03) {
            this.A03 = true;
            this.A07.A06(this.A05);
        }
    }

    public final void A02(boolean z) {
        AnonymousClass5S1 r1 = this.A02;
        if (r1 == null) {
            throw C18270x1.A0S("currentUpsellViewState");
        } else if (r1.A00) {
            r1.A00 = false;
            r1.A01 = z;
            AnonymousClass66P r0 = this.A00;
            if (r0 != null) {
                r0.Bf2(r1);
            }
        }
    }

    public C105125Tr(AnonymousClass5O0 r2, C113925mD r3, C29151iM r4, AnonymousClass57R r5, AnonymousClass57S r6) {
        C18260x0.A0f(r3, r4, r2, r5, r6);
        this.A06 = r3;
        this.A07 = r4;
        this.A04 = r2;
        this.A08 = r5;
        this.A09 = r6;
    }
}
