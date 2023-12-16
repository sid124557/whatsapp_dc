package X;

import android.content.Context;

/* renamed from: X.9RU  reason: invalid class name */
public class AnonymousClass9RU {
    public C69263Wi A00;
    public C40602Ha A01;
    public C620933l A02;
    public AnonymousClass9U5 A03;

    public void A00(Context context) {
        String A032 = this.A03.A07.A03();
        AnonymousClass9IL r4 = new AnonymousClass9IL(A032);
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0E(A012, "xmlns", "w:pay");
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "get-is-account-recoverable");
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A012, r4);
        AnonymousClass9U5 r7 = this.A03;
        C69263Wi r42 = this.A00;
        Context context2 = context;
        r7.A0F(new C203889oT(context2, this.A01, r42, this, 4), A033, A032, 0);
    }
}
