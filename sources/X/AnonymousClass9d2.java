package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9d2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9d2 implements C182858p6 {
    public final /* synthetic */ IndiaUpiPaymentSettingsFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;
    public final /* synthetic */ boolean A02;

    public final void BQ6(boolean z) {
        String str;
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A01;
        boolean z2 = this.A02;
        paymentBottomSheet.A1K();
        if (z2 || indiaUpiPaymentSettingsFragment.A0C.A0Q()) {
            if (z) {
                str = "CREDIT";
            } else {
                str = null;
            }
            indiaUpiPaymentSettingsFragment.A1q("settingsAddPayment", str, 2, 5, z2, true);
            return;
        }
        indiaUpiPaymentSettingsFragment.A1s(z);
    }

    public /* synthetic */ AnonymousClass9d2(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, PaymentBottomSheet paymentBottomSheet, boolean z) {
        this.A00 = indiaUpiPaymentSettingsFragment;
        this.A01 = paymentBottomSheet;
        this.A02 = z;
    }
}
