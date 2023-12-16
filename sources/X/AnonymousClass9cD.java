package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9cD  reason: invalid class name */
public class AnonymousClass9cD implements AnonymousClass4DJ {
    public final /* synthetic */ BrazilPaymentActivity A00;

    public AnonymousClass9cD(BrazilPaymentActivity brazilPaymentActivity) {
        this.A00 = brazilPaymentActivity;
    }

    public void BS6(AnonymousClass34V r3) {
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        brazilPaymentActivity.BjL();
        brazilPaymentActivity.A7R(false);
    }

    public void Bd7(C632738p r5) {
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        brazilPaymentActivity.BjL();
        C631338b r2 = r5.A00;
        if (r5.A01 == AnonymousClass213.ACTIVE && r2 != null) {
            brazilPaymentActivity.A0g = r2.A00;
        }
        brazilPaymentActivity.A01 ^= 2;
        brazilPaymentActivity.A7R(brazilPaymentActivity.A0g);
    }
}
