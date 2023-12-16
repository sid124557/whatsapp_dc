package X;

/* renamed from: X.5Tk  reason: invalid class name and case insensitive filesystem */
public final class C105055Tk {
    public Integer A00;
    public String A01;
    public final C56972sr A02;
    public final C620633i A03;
    public final AnonymousClass5ZR A04;
    public final AnonymousClass4FV A05;

    public final void A00() {
        if (!this.A02.A0Y() && this.A01 != null) {
            C94604rc r1 = new C94604rc();
            A01(r1);
            r1.A01 = C18290x4.A0a();
            this.A05.BhD(r1);
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A01(C94604rc r3) {
        r3.A04 = this.A01;
        r3.A02 = this.A00;
        Integer A002 = AnonymousClass25V.A00(this.A03, this.A04);
        if (A002 != null) {
            r3.A03 = C18280x3.A0U(A002);
        }
    }

    public final void A02(Boolean bool, int i) {
        if (!this.A02.A0Y() && this.A01 != null) {
            C94604rc r1 = new C94604rc();
            A01(r1);
            r1.A01 = Integer.valueOf(i);
            r1.A00 = bool;
            this.A05.BhD(r1);
        }
    }

    public final void A03(boolean z, int i) {
        if (!this.A02.A0Y()) {
            this.A01 = C18280x3.A0Y();
            this.A00 = Integer.valueOf(i);
            C94604rc r1 = new C94604rc();
            A01(r1);
            r1.A01 = Integer.valueOf(C18280x3.A01(z ? 1 : 0));
            this.A05.BhD(r1);
        }
    }

    public C105055Tk(C56972sr r1, C620633i r2, AnonymousClass5ZR r3, AnonymousClass4FV r4) {
        C18260x0.A0c(r1, r4, r2, r3);
        this.A02 = r1;
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
    }
}
