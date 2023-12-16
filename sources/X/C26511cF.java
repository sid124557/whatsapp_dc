package X;

/* renamed from: X.1cF  reason: invalid class name and case insensitive filesystem */
public final class C26511cF extends C50922iz {
    public int A00 = -1;
    public C371020y A01;
    public C60362yR A02 = C60362yR.A00;
    public C26531cH A03;
    public C26411c5 A04;
    public C26441c8 A05;
    public C26421c6 A06;
    public C85424Ge A07;
    public final AnonymousClass2TY A08;

    public final C26441c8 A06() {
        if (this.A05 == null) {
            C26441c8 A002 = C50922iz.A00(this.A08.A04);
            this.A05 = A002;
            return A002;
        }
        throw C50922iz.A01(this, "Only one integrations{} is allowed. Multiple detected.");
    }

    public final C26421c6 A07() {
        if (this.A06 == null) {
            Object obj = this.A08.A07.get();
            C162457s7.A0D(obj);
            C26421c6 r1 = (C26421c6) obj;
            C162457s7.A0J(r1, 0);
            this.A06 = r1;
            return r1;
        }
        throw C50922iz.A01(this, "Only one systemActionsBuilder{} is allowed. Multiple detected.");
    }

    public C26511cF(AnonymousClass2TY r2) {
        this.A08 = r2;
    }
}
