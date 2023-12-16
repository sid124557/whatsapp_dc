package X;

/* renamed from: X.9Pr  reason: invalid class name and case insensitive filesystem */
public class C193709Pr {
    public final AnonymousClass34V A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C193709Pr(AnonymousClass36K r5) {
        String A0r = r5.A0r("owner-name", (String) null);
        C626936e.A06(A0r);
        this.A04 = A0r;
        String A0r2 = r5.A0r("business-name", (String) null);
        C626936e.A06(A0r2);
        this.A02 = A0r2;
        String A0r3 = r5.A0r("verify-type", (String) null);
        C626936e.A06(A0r3);
        this.A05 = A0r3;
        this.A01 = r5.A0r("bank-name", (String) null);
        AnonymousClass36K A0l = r5.A0l("merchant");
        C626936e.A06(A0l);
        String A0r4 = A0l.A0r("credential-id", (String) null);
        C626936e.A06(A0r4);
        this.A03 = A0r4;
        if (r5.A0r("error-code", (String) null) != null) {
            AnonymousClass34V A0M = C1899693i.A0M();
            this.A00 = A0M;
            int A012 = C615531h.A01(r5.A0r("error-code", (String) null), 0);
            String A0r5 = r5.A0r("error-text", (String) null);
            A0M.A00 = A012;
            A0M.A08 = A0r5;
        }
    }
}
