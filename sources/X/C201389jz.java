package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9jz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201389jz implements Runnable {
    public final /* synthetic */ C166587yw A00;
    public final /* synthetic */ AnonymousClass39L A01;
    public final /* synthetic */ HybridPaymentMethodPickerFragment A02;
    public final /* synthetic */ AnonymousClass9Ct A03;
    public final /* synthetic */ PaymentBottomSheet A04;

    public final void run() {
        AnonymousClass9Ct r4 = this.A03;
        AnonymousClass39L r3 = this.A01;
        PaymentBottomSheet paymentBottomSheet = this.A04;
        C166587yw r1 = this.A00;
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A02;
        r4.A8O(r1, r3, paymentBottomSheet);
        WaButtonWithLoader waButtonWithLoader = hybridPaymentMethodPickerFragment.A01;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A06 = false;
            waButtonWithLoader.A00();
        }
    }

    public /* synthetic */ C201389jz(C166587yw r1, AnonymousClass39L r2, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, AnonymousClass9Ct r4, PaymentBottomSheet paymentBottomSheet) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = paymentBottomSheet;
        this.A00 = r1;
        this.A02 = hybridPaymentMethodPickerFragment;
    }
}
