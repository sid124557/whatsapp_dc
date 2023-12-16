package X;

import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

/* renamed from: X.906  reason: invalid class name */
public class AnonymousClass906 extends C43942Ub {
    public Object A00;
    public final int A01;

    public AnonymousClass906(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        if (this.A01 != 0) {
            PaymentMerchantAccountViewModel paymentMerchantAccountViewModel = (PaymentMerchantAccountViewModel) this.A00;
            paymentMerchantAccountViewModel.A08.BkP(new C71363bz(1, paymentMerchantAccountViewModel, false));
            return;
        }
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = (HybridPaymentMethodPickerFragment) this.A00;
        AnonymousClass9U4 r0 = hybridPaymentMethodPickerFragment.A09;
        if (r0 != null) {
            AnonymousClass3XA A02 = r0.A09().A02();
            AnonymousClass92Y r1 = new AnonymousClass92Y(hybridPaymentMethodPickerFragment, 1, this);
            C69263Wi r02 = hybridPaymentMethodPickerFragment.A00;
            if (r02 != null) {
                A02.A04(r1, r02.A08);
                return;
            }
            throw C18270x1.A0S("globalUI");
        }
        throw C18270x1.A0S("paymentsManager");
    }
}
