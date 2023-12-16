package X;

/* renamed from: X.2y9  reason: invalid class name and case insensitive filesystem */
public final class C60192y9 {
    public static final C50912iy A05 = AnonymousClass2BX.A00;
    public final AnonymousClass4FS A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;

    public final void A00(AnonymousClass4EJ r5, Exception exc) {
        C162457s7.A0J(r5, 0);
        C18320x8.A0M(this.A02).A06(new C85934Ie(exc, 3, r5), A05, (C54662p5) null, (String) null);
    }

    public final void A01(C54662p5 r3, AnonymousClass4EL r4, Exception exc) {
        C162457s7.A0J(r3, 2);
        if (!r3.A04() || r3.A03()) {
            r4.BSB(exc);
            return;
        }
        r3.A02();
        C50912iy r1 = A05;
        ((C53182mg) this.A01.get()).A01(r1);
        ((C59532x4) this.A03.get()).A01(r1, r4);
    }

    public C60192y9(AnonymousClass4FS r1, C183538qC r2, C183538qC r3, C183538qC r4, C183538qC r5) {
        C18260x0.A0f(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }
}
