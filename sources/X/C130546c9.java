package X;

/* renamed from: X.6c9  reason: invalid class name and case insensitive filesystem */
public abstract class C130546c9 extends C170208Ch {
    public C130786cX A00;
    public final C130786cX A01;

    /* renamed from: A05 */
    public C130546c9 clone() {
        C130546c9 r2 = (C130546c9) this.A01.A0J(C141056ux.NEW_BUILDER, (Object) null, (Object) null);
        C130786cX r1 = this.A00;
        if (r1.A0L()) {
            r1.A0K();
        }
        r2.A00 = this.A00;
        return r2;
    }

    public final C130786cX A06() {
        C130786cX r1 = this.A00;
        if (r1.A0L()) {
            r1.A0K();
        }
        C130786cX r12 = this.A00;
        if (C130786cX.A0C(r12)) {
            return r12;
        }
        throw new AnonymousClass8RT();
    }

    public final void A07() {
        if (!this.A00.A0L()) {
            C130786cX A0I = this.A01.A0I();
            AnonymousClass6C7.A0R(A0I).BL9(A0I, this.A00);
            this.A00 = A0I;
        }
    }

    public void A08(C130786cX r3) {
        if (!this.A01.equals(r3)) {
            C130786cX A0C = C18320x8.A0C(this);
            AnonymousClass6C7.A0R(A0C).BL9(A0C, r3);
        }
    }

    public /* bridge */ /* synthetic */ C187928y2 B6s() {
        return this.A01;
    }

    public C130546c9(C130786cX r2) {
        this.A01 = r2;
        if (!r2.A0L()) {
            this.A00 = r2.A0I();
            return;
        }
        throw AnonymousClass001.A0c("Default instance must be immutable.");
    }
}
