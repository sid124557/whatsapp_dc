package X;

/* renamed from: X.2ZA  reason: invalid class name */
public final class AnonymousClass2ZA {
    public final /* synthetic */ C54262oR A00;
    public final /* synthetic */ String A01;

    public AnonymousClass2ZA(C54262oR r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void A00(int i, Integer num) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestSessionManager/Crosspost failed for session: ");
        String str = this.A01;
        A0o.append(str);
        A0o.append(" with error: ");
        A0o.append(i);
        C18260x0.A1N(A0o, " and errorSubCode: ", num);
        this.A00.A03(num, str, i, false);
    }
}
