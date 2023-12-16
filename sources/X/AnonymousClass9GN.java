package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.9GN  reason: invalid class name */
public class AnonymousClass9GN extends AnonymousClass5ZM {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0f.A04("Background VPA verification done.");
        indiaUpiSendPaymentActivity.A0A = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9GN(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        super(indiaUpiSendPaymentActivity, true);
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0f.A04("Verifying VPA in background...");
        indiaUpiSendPaymentActivity.A00 = 1;
        indiaUpiSendPaymentActivity.A0E.A01(indiaUpiSendPaymentActivity.A0I, (C166557yt) null, new C204799pw(new C199459gc(this), 1, indiaUpiSendPaymentActivity));
        return null;
    }
}
