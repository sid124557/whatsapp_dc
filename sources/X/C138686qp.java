package X;

/* renamed from: X.6qp  reason: invalid class name and case insensitive filesystem */
public class C138686qp extends C41022Iq {
    public final int A00;

    public C138686qp(AnonymousClass36K r4, int i) {
        String str;
        this.A00 = i;
        AnonymousClass36K.A0N(r4, "picture");
        String[] strArr = {"status"};
        Class<String> cls = String.class;
        switch (i) {
            case 0:
                str = "405";
                break;
            case 1:
                str = "500";
                break;
            case 2:
                str = "304";
                break;
            default:
                str = "204";
                break;
        }
        C626836d.A0F(r4, cls, str, strArr);
        this.A00 = r4;
    }
}
