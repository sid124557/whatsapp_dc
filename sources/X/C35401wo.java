package X;

/* renamed from: X.1wo  reason: invalid class name and case insensitive filesystem */
public class C35401wo extends C35561x4 implements C833548b {
    public C35401wo(Long l, int i) {
        String str;
        C56052rL A04 = C56052rL.A04("messages");
        boolean A01 = C35561x4.A01(l);
        if (i != 0) {
            str = A01 ? "before" : str;
            C41032Ir.A0A(A04, this);
        }
        if (A01) {
            str = "after";
        }
        C41032Ir.A0A(A04, this);
        C56052rL.A0A(A04, l, str);
        C41032Ir.A0A(A04, this);
    }
}
