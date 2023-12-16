package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

/* renamed from: X.9cV  reason: invalid class name */
public class AnonymousClass9cV implements C203099n7 {
    public final /* synthetic */ IndiaUpiPaymentTransactionDetailsActivity A00;

    public AnonymousClass9cV(IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity) {
        this.A00 = indiaUpiPaymentTransactionDetailsActivity;
    }

    public void BRQ(boolean z) {
        IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = this.A00;
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = indiaUpiPaymentTransactionDetailsActivity.A06;
        if (indiaUpiDobPickerBottomSheet != null) {
            indiaUpiDobPickerBottomSheet.A1L();
        }
        indiaUpiPaymentTransactionDetailsActivity.finish();
    }

    public void BS6(AnonymousClass34V r4) {
        IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = this.A00;
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = indiaUpiPaymentTransactionDetailsActivity.A06;
        if (indiaUpiDobPickerBottomSheet != null) {
            indiaUpiDobPickerBottomSheet.A1L();
        }
        if (!indiaUpiPaymentTransactionDetailsActivity.A04.A00(indiaUpiPaymentTransactionDetailsActivity, r4) && r4.A00 == 10755) {
            indiaUpiPaymentTransactionDetailsActivity.Boo(PaymentsUnavailableDialogFragment.A00());
        }
    }
}
