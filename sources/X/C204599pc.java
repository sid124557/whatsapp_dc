package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.9pc  reason: invalid class name and case insensitive filesystem */
public class C204599pc implements C182908pB {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204599pc(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A02 = i;
        this.A00 = brazilPayBloksActivity;
        this.A01 = r1;
    }

    public final void Bhc(AnonymousClass36K r7) {
        AnonymousClass36K A0l;
        AnonymousClass36K A0l2;
        if (this.A02 != 0) {
            BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
            Object obj = this.A01;
            AnonymousClass36K A0l3 = r7.A0l("pay");
            if (A0l3 != null && (A0l2 = A0l3.A0l("card")) != null) {
                C166587yw A0A = C1899593h.A0A(brazilPayBloksActivity.A03, new AnonymousClass99I(), A0l2);
                AnonymousClass9U4.A00(brazilPayBloksActivity.A0F).A04(new C195189Wm(obj, 4), A0A, "p2m_context");
                brazilPayBloksActivity.A0C.A0I(C18300x5.A0s(A0A));
                brazilPayBloksActivity.A0A.A0E();
                return;
            }
            return;
        }
        BrazilPayBloksActivity brazilPayBloksActivity2 = (BrazilPayBloksActivity) this.A00;
        Object obj2 = this.A01;
        AnonymousClass36K A0l4 = r7.A0l("pay");
        if (A0l4 != null && (A0l = A0l4.A0l("card")) != null) {
            AnonymousClass9U4.A00(brazilPayBloksActivity2.A0F).A03(new C195189Wm(obj2, 3), C1899593h.A0A(brazilPayBloksActivity2.A03, new AnonymousClass99I(), A0l));
        }
    }
}
