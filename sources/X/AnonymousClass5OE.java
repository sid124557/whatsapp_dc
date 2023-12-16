package X;

/* renamed from: X.5OE  reason: invalid class name */
public final class AnonymousClass5OE {
    public final int A00;
    public final long A01;
    public final C127866Tp A02;
    public final AnonymousClass4FV A03;
    public final Boolean A04;

    public AnonymousClass5OE(AnonymousClass4FV r4, C105265Uf r5, int i) {
        C162457s7.A0J(r4, 1);
        this.A03 = r4;
        this.A00 = i;
        this.A01 = r5.A00();
        C127866Tp r2 = new C127866Tp(C159787mS.A00(r5.A00));
        C18260x0.A1R(AnonymousClass001.A0o(), "PasskeyEligibility / googlePlayServicesStatus : ", r2);
        this.A02 = r2;
        this.A04 = r5.A03();
    }

    public final void A00(Throwable th, int i) {
        C94864sC r2 = new C94864sC();
        r2.A02 = Integer.valueOf(this.A00);
        r2.A01 = Integer.valueOf(i);
        C104665Rw A002 = C100565Bk.A00(th);
        r2.A05 = A002.A00;
        r2.A06 = A002.A01;
        r2.A03 = Long.valueOf(this.A01);
        r2.A04 = this.A02.toString();
        r2.A00 = this.A04;
        this.A03.BhD(r2);
    }
}
