package X;

/* renamed from: X.1cD  reason: invalid class name and case insensitive filesystem */
public final class C26491cD extends C50922iz {
    public C371020y A00;
    public C60362yR A01 = C60362yR.A00;
    public C26521cG A02;
    public C26451c9 A03;
    public C85424Ge A04;
    public final C43812To A05;

    public C26491cD(C43812To r2) {
        C162457s7.A0J(r2, 1);
        this.A05 = r2;
    }

    public final void A06(AnonymousClass4GQ r2) {
        if (this.A03 == null) {
            Object obj = this.A05.A03.get();
            C162457s7.A0D(obj);
            C26451c9 A0Q = AnonymousClass0x7.A0Q(obj);
            this.A03 = A0Q;
            A0Q.A04();
            r2.invoke(A0Q);
            C50922iz.A02(A0Q);
            return;
        }
        throw C50922iz.A01(this, "Only one integrationPoint{} is allowed. Multiple detected.");
    }
}
