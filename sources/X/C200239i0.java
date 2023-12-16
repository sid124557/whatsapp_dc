package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9i0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200239i0 implements Runnable {
    public final /* synthetic */ C133736hr A00;
    public final /* synthetic */ BrazilPaymentActivity A01;

    public final void run() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        C133736hr r4 = this.A00;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = new BrazilConfirmReceivePaymentFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("args_payment_method", r4);
        brazilConfirmReceivePaymentFragment.A0u(A08);
        paymentBottomSheet.A02 = brazilConfirmReceivePaymentFragment;
        brazilPaymentActivity.Boo(paymentBottomSheet);
    }

    public /* synthetic */ C200239i0(C133736hr r1, BrazilPaymentActivity brazilPaymentActivity) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
    }
}
