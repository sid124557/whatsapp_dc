package X;

/* renamed from: X.6qo  reason: invalid class name and case insensitive filesystem */
public class C138676qo extends C41022Iq {
    public final int A00;

    public C138676qo(AnonymousClass36K r4, int i) {
        String str;
        this.A00 = i;
        String[] A1b = AnonymousClass6C7.A1b(r4, "group");
        Class<String> cls = String.class;
        switch (i) {
            case 0:
                str = "400";
                break;
            case 1:
                str = "409";
                break;
            case 2:
                str = "401";
                break;
            case 3:
                str = "404";
                break;
            case 4:
                str = "419";
                break;
            default:
                str = "500";
                break;
        }
        C626836d.A0F(r4, cls, str, A1b);
        this.A00 = r4;
    }
}
