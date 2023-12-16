package X;

/* renamed from: X.3Os  reason: invalid class name and case insensitive filesystem */
public final class C67293Os implements C84594Cy {
    public final AnonymousClass4AM A00;
    public final C43222Rg A01;
    public final AnonymousClass4B2 A02;
    public final C55862r2 A03;

    public void Bh4(AnonymousClass4EN r6) {
        if (((C54612p0) this.A01.A04.get()).A00() != null) {
            AnonymousClass4AM r3 = this.A00;
            C50912iy r2 = AnonymousClass2BB.A00;
            C86534Km r1 = new C86534Km(this, 0);
            C162457s7.A0J(r2, 1);
            r3.B0i(r2, (AnonymousClass27A) null, r1).Bh4(r6);
            return;
        }
        Exception exc = new Exception("Trying to send Avatar GQL request without existing user.");
        this.A03.A02(0, "GQL request without user acount", (String) null);
        r6.BSB(exc);
    }

    public C67293Os(AnonymousClass4AM r1, C43222Rg r2, AnonymousClass4B2 r3, C55862r2 r4) {
        C18260x0.A0c(r4, r2, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
