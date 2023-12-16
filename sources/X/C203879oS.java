package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;

/* renamed from: X.9oS  reason: invalid class name and case insensitive filesystem */
public class C203879oS extends C43942Ub {
    public Object A00;
    public final int A01;

    public C203879oS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        switch (this.A01) {
            case 0:
                BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
                brazilPaymentActivity.A04.A02();
                brazilPaymentActivity.A04 = AnonymousClass9U4.A00(brazilPaymentActivity.A0P).A02();
                return;
            case 1:
                ConfirmReceivePaymentFragment confirmReceivePaymentFragment = (ConfirmReceivePaymentFragment) this.A00;
                AnonymousClass3XA r0 = confirmReceivePaymentFragment.A01;
                if (r0 != null) {
                    r0.A02();
                }
                confirmReceivePaymentFragment.A01 = AnonymousClass9U4.A00(confirmReceivePaymentFragment.A04).A02();
                return;
            case 2:
                AnonymousClass9D7 r4 = (AnonymousClass9D7) this.A00;
                r4.A7p(r4.A09, "ConfirmPaymentFragment");
                C199139g5 r3 = new C199139g5(this);
                r4.Bp9(R.string.f11nameremoved);
                r4.A04.BkM(new C200979jK(r4, r3, true));
                return;
            case 3:
                AnonymousClass9Bs r2 = (AnonymousClass9Bs) this.A00;
                AnonymousClass9GM r1 = r2.A0J;
                if (r1 != null) {
                    r1.A0D(true);
                    r2.A0J = null;
                }
                if (AnonymousClass97T.A12(r2)) {
                    AnonymousClass9GM r12 = new AnonymousClass9GM(r2);
                    r2.A0J = r12;
                    C18270x1.A0w(r12, r2.A04);
                    return;
                }
                return;
            default:
                PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = (PaymentMethodsListPickerFragment) this.A00;
                AnonymousClass9U4.A00(paymentMethodsListPickerFragment.A03).A02().A04(new C204989qF(this, 9), paymentMethodsListPickerFragment.A00.A08);
                return;
        }
    }
}
