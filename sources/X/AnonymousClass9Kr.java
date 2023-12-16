package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;

/* renamed from: X.9Kr  reason: invalid class name */
public class AnonymousClass9Kr implements C202609mI {
    public Object A00;
    public final int A01;

    public AnonymousClass9Kr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BXl(AnonymousClass34V r4) {
        if (this.A01 != 0) {
            IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = (IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel) this.A00;
            if (r4 == null) {
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A08.BkM(new C199729h3(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel));
            } else {
                C06270Wx.A03(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0F.A00, 3);
            }
        } else {
            ((AnonymousClass9Bs) this.A00).A86(r4, false);
        }
    }
}
