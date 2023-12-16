package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9dY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197589dY implements C182908pB {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public final void Bhc(AnonymousClass36K r6) {
        AnonymousClass36K A0l;
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        String str = this.A01;
        AnonymousClass36K A0l2 = r6.A0l("pay");
        if (A0l2 != null && (A0l = A0l2.A0l("card")) != null) {
            AnonymousClass9U4.A00(brazilPaymentActivity.A0P).A04(new C196469at(), C1899593h.A0A(brazilPaymentActivity.A07, new AnonymousClass99I(), A0l), str);
        }
    }

    public /* synthetic */ C197589dY(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }
}
