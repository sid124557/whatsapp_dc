package X;

/* renamed from: X.1vw  reason: invalid class name and case insensitive filesystem */
public class C34861vw extends C41022Iq {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;

    public C34861vw(AnonymousClass36K r10, int i) {
        int i2;
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        Long A0i = AnonymousClass0x7.A0i();
        AnonymousClass36K r2 = r10;
        this.A03 = (String) C626836d.A06(r2, cls, A0U, A0i, (Object) null, new String[]{"money", "value"}, false);
        this.A02 = (String) C626836d.A06(r2, cls, A0U, A0i, (Object) null, new String[]{"money", "offset"}, false);
        this.A01 = (String) C626836d.A06(r2, cls, A0U, A0i, (Object) null, new String[]{"money", "currency"}, false);
        this.A00 = r10;
        String[] strArr = {"money"};
        if (i != 0) {
            i2 = 116;
        } else {
            i2 = 27;
        }
        this.A00 = C626836d.A0C(r10, strArr, i2).get(0);
    }
}
