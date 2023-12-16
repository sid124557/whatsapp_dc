package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

/* renamed from: X.9pd  reason: invalid class name and case insensitive filesystem */
public class C204609pd implements C182908pB {
    public Object A00;
    public final int A01;

    public C204609pd(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bhc(AnonymousClass36K r5) {
        AnonymousClass36K A0l;
        C166587yw A0A;
        AnonymousClass9U4 r0;
        AnonymousClass36K A0l2;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                C195069Vt r3 = (C195069Vt) obj;
                AnonymousClass36K A0l3 = r5.A0l("pay");
                C626936e.A06(A0l3);
                AnonymousClass36K A0l4 = A0l3.A0l("merchant");
                C626936e.A06(A0l4);
                A0A = C1899593h.A0A(r3.A04, new AnonymousClass99J(), A0l4);
                r0 = r3.A06;
                break;
            case 1:
                BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) obj;
                AnonymousClass36K A0l5 = r5.A0l("pay");
                if (A0l5 != null && (A0l = A0l5.A0l("card")) != null) {
                    C166587yw A0A2 = C1899593h.A0A(brazilPaymentActivity.A07, new AnonymousClass99I(), A0l);
                    AnonymousClass9U4.A00(brazilPaymentActivity.A0P).A03((C202439m1) null, A0A2);
                    brazilPaymentActivity.A0M.A0I(C18300x5.A0s(A0A2));
                    brazilPaymentActivity.A0E.A0E();
                    return;
                }
                return;
            default:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) obj;
                AnonymousClass36K A0l6 = r5.A0l("pay");
                if (A0l6 != null && (A0l2 = A0l6.A0l("card")) != null) {
                    A0A = C1899593h.A0A(brazilPaymentCardDetailsActivity.A00, new AnonymousClass99I(), A0l2);
                    r0 = brazilPaymentCardDetailsActivity.A0D;
                    break;
                } else {
                    return;
                }
        }
        AnonymousClass9U4.A00(r0).A03((C202439m1) null, A0A);
    }
}
