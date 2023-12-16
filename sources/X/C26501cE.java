package X;

/* renamed from: X.1cE  reason: invalid class name and case insensitive filesystem */
public final class C26501cE extends C50922iz {
    public C371020y A00;
    public C60362yR A01 = C60362yR.A00;
    public C26531cH A02;
    public C26411c5 A03;
    public C26441c8 A04;
    public Integer A05;
    public C85424Ge A06;
    public final C43812To A07;

    public C26501cE(C43812To r2) {
        C162457s7.A0J(r2, 1);
        this.A07 = r2;
    }

    public final C26441c8 A06() {
        if (this.A04 == null) {
            C26441c8 A002 = C50922iz.A00(this.A07.A05);
            this.A04 = A002;
            return A002;
        }
        throw C50922iz.A01(this, "Only one integrations{} is allowed. Multiple detected.");
    }
}
