package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9R6  reason: invalid class name */
public class AnonymousClass9R6 {
    public final /* synthetic */ IndiaUpiPaymentSettingsActivity A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public AnonymousClass9R6(IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = indiaUpiPaymentSettingsActivity;
        this.A01 = paymentBottomSheet;
    }

    public void A00(String str) {
        IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = this.A00;
        indiaUpiPaymentSettingsActivity.A6c("IndiaUpiPaymentTransactionConfirmationFragment");
        Intent A08 = AnonymousClass0x9.A08(indiaUpiPaymentSettingsActivity, IndiaUpiPaymentTransactionDetailsActivity.class);
        A08.putExtra("extra_transaction_id", str);
        A08.putExtra("referral_screen", "payments_transaction_confirmation");
        A08.putExtra("extra_payment_flow_entry_point", "qr_code_scan_prompt");
        A08.putExtra("extra_open_transaction_confirmation_fragment", false);
        A08.setFlags(67108864);
        indiaUpiPaymentSettingsActivity.startActivity(A08);
    }
}
