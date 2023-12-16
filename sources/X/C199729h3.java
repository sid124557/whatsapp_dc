package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;

/* renamed from: X.9h3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199729h3 implements Runnable {
    public final /* synthetic */ IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel A00;

    public final void run() {
        String A0m;
        IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = this.A00;
        C85204Fi r4 = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0B;
        String str = ((AnonymousClass3H6) r4).A04;
        C624034w A01 = AnonymousClass36S.A01(r4, indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A03, (UserJid) C86634Kw.A0V(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A00).A0H, (UserJid) null, str, (String) null, "IN", 1, 401, C57232tJ.A00("IN"), 1, 0, -1);
        if (!TextUtils.isEmpty(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A09)) {
            indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A06.A0X(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A09);
        }
        A01.A05 = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A01.A0H();
        A01.A0F = "UNSET";
        AnonymousClass99L r42 = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A06;
        A01.A0A = r42;
        A01.A0P = true;
        r42.A0O = (String) indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A05.A00;
        r42.A0h((String) indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A04.A00);
        String str2 = r42.A0K;
        C626936e.A05(str2);
        AnonymousClass36F r43 = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0A;
        C624034w A0H = r43.A0H(str2, (String) null, -1);
        C160757oG r2 = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A07;
        if (A0H == null) {
            A0m = "IN- HANDLE_SEND_AGAIN Old txn is null";
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("IN- HANDLE_SEND_AGAIN Old txn is not null, interop is ");
            A0m = C18300x5.A0m(A0o, A0H.A0P);
        }
        r2.A06(A0m);
        r43.A0f(A01, A0H, str2);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("getPayNonWaVpaCallback added new transaction with trans id: ");
        C1899593h.A1J(r2, A01.A0K, A0o2);
    }

    public /* synthetic */ C199729h3(IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel) {
        this.A00 = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
    }
}
