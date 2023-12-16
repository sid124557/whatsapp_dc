package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;

/* renamed from: X.9i1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200249i1 implements Runnable {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public final void run() {
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        C166587yw A02 = AnonymousClass9U4.A02(brazilPaymentActivity.A0P, this.A01);
        brazilPaymentActivity.BjL();
        ConfirmPaymentFragment confirmPaymentFragment = brazilPaymentActivity.A0T;
        if (confirmPaymentFragment != null && A02 != null) {
            confirmPaymentFragment.BXr(A02);
        }
    }

    public /* synthetic */ C200249i1(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }
}
