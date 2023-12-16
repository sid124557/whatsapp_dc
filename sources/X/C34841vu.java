package X;

/* renamed from: X.1vu  reason: invalid class name and case insensitive filesystem */
public class C34841vu extends C41022Iq {
    public String A00;
    public String A01;
    public String A02;

    public C34841vu(AnonymousClass36K r9, int i) {
        String str;
        Object A05;
        AnonymousClass36K r1 = r9;
        switch (i) {
            case 0:
                str = "primary_action";
                break;
            case 1:
                str = "secondary_action";
                break;
            default:
                AnonymousClass36K.A0N(r9, "hpp_payment_link");
                Class<String> cls = String.class;
                Long A0U = AnonymousClass0x2.A0U();
                Long A0S = AnonymousClass0x2.A0S();
                this.A02 = (String) C626836d.A06(r1, cls, A0U, A0S, (Object) null, new String[]{"value"}, false);
                this.A01 = (String) C626836d.A06(r1, cls, A0U, A0S, (Object) null, new String[]{"success_url"}, false);
                A05 = C626836d.A06(r1, cls, A0U, A0S, (Object) null, new String[]{"cancel_url"}, false);
                break;
        }
        AnonymousClass36K.A0N(r9, str);
        Class<String> cls2 = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S2 = AnonymousClass0x2.A0S();
        this.A01 = (String) C626836d.A06(r1, cls2, A0R, A0S2, (Object) null, new String[]{"text"}, false);
        this.A02 = (String) C626836d.A05(r1, cls2, A0R, A0S2, (Object) null, new String[]{"universal_link"}, false);
        A05 = C626836d.A05(r1, cls2, A0R, A0S2, (Object) null, new String[]{"deep_link"}, false);
        this.A00 = (String) A05;
        this.A00 = r9;
    }
}
