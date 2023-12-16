package X;

/* renamed from: X.3YQ  reason: invalid class name */
public final class AnonymousClass3YQ implements C84984Em {
    public final /* synthetic */ C54262oR A00;
    public final /* synthetic */ C55932r9 A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3YQ(C54262oR r1, C55932r9 r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BQp() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/eligibility retry delivery failure for session: ");
        String str = this.A02;
        C18270x1.A1G(A0o, str);
        this.A00.A02((Integer) null, (Integer) null, str, true);
    }

    public void BRz(int i, Integer num) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/eligibility retry error for session: ");
        String str = this.A02;
        A0o.append(str);
        A0o.append(" with errorCode: ");
        A0o.append(i);
        C18260x0.A1N(A0o, " and errorSubCode: ", num);
        this.A00.A03(num, str, i, true);
    }

    public void BdB(C52732lx r3, C53872no r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/eligibility retry success for session: ");
        C18270x1.A1G(A0o, this.A02);
        this.A01.A03(this.A00, r3, r4);
    }
}
