package X;

import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.List;

/* renamed from: X.9eG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198029eG implements C84134Bd {
    public final /* synthetic */ C197339cx A00;
    public final /* synthetic */ ConfirmPaymentFragment A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ String A03;

    public final void AwB(Object obj) {
        C197339cx r5 = this.A00;
        ConfirmPaymentFragment confirmPaymentFragment = this.A01;
        String str = this.A03;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        List list = (List) obj;
        C626936e.A06(list);
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(list);
        A002.A10(confirmPaymentFragment, 0);
        A002.A07 = new C197429d9(r5, str);
        paymentBottomSheet.A1b(A002);
    }

    public /* synthetic */ C198029eG(C197339cx r1, ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet, String str) {
        this.A00 = r1;
        this.A01 = confirmPaymentFragment;
        this.A03 = str;
        this.A02 = paymentBottomSheet;
    }
}
