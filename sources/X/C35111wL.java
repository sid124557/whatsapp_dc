package X;

/* renamed from: X.1wL  reason: invalid class name and case insensitive filesystem */
public class C35111wL extends C41022Iq implements C84304Bv {
    public void AwE(C58892vz r1) {
    }

    public C35111wL(AnonymousClass36K r10, int i) {
        String str;
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "config");
        String[] strArr = {"platform"};
        Class<String> cls = String.class;
        if (i != 0) {
            str = "web";
        } else {
            str = "kaios";
        }
        C626836d.A0F(r10, cls, str, strArr);
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A06(r2, cls, A0U, 1024L, (Object) null, new String[]{"endpoint"}, false);
        C626836d.A06(r2, cls, A0U, 1024L, (Object) null, new String[]{"auth"}, false);
        C626836d.A06(r2, cls, A0U, 1024L, (Object) null, new String[]{"p256dh"}, false);
        this.A00 = r10;
    }
}
