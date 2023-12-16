package X;

/* renamed from: X.3YP  reason: invalid class name */
public final class AnonymousClass3YP implements C84984Em {
    public final /* synthetic */ C54262oR A00;
    public final /* synthetic */ String A01;

    public AnonymousClass3YP(C54262oR r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void BQp() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility delivery failure for session: ");
        String str = this.A01;
        C18270x1.A1G(A0o, str);
        this.A00.A02((Integer) null, (Integer) null, str, true);
    }

    public void BRz(int i, Integer num) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility failed for session: ");
        String str = this.A01;
        A0o.append(str);
        A0o.append(" with errorCode: ");
        A0o.append(i);
        C18260x0.A1N(A0o, " and errorSubCode: ", num);
        this.A00.A03(num, str, i, true);
    }

    public void BdB(C52732lx r3, C53872no r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/[New Status]Eligibility success for session: ");
        C18270x1.A1G(A0o, this.A01);
        this.A00.A01(r3, r4);
    }
}
