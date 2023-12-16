package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9hy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200219hy implements Runnable {
    public final /* synthetic */ AnonymousClass4FU A00;
    public final /* synthetic */ C133736hr A01;

    public final void run() {
        C133736hr r5 = this.A01;
        AnonymousClass4FU r4 = this.A00;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = new BrazilConfirmReceivePaymentFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("args_payment_method", r5);
        brazilConfirmReceivePaymentFragment.A0u(A08);
        paymentBottomSheet.A02 = brazilConfirmReceivePaymentFragment;
        r4.Boo(paymentBottomSheet);
    }

    public /* synthetic */ C200219hy(AnonymousClass4FU r1, C133736hr r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
