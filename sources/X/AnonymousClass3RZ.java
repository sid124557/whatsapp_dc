package X;

import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.3RZ  reason: invalid class name */
public final class AnonymousClass3RZ implements AnonymousClass4EY {
    public final /* synthetic */ PaymentMerchantAccountViewModel A00;

    public AnonymousClass3RZ(PaymentMerchantAccountViewModel paymentMerchantAccountViewModel) {
        this.A00 = paymentMerchantAccountViewModel;
    }

    public void BaC(AnonymousClass2Oi r3) {
        Log.i("PAY: BusinessHubViewModel unlinkMerchantAccount/onResponseSuccess");
        ((C06270Wx) this.A00.A0B.getValue()).A0G(AnonymousClass9WE.A01((Object) null));
    }

    public void Ba4(AnonymousClass34V r4) {
        StringBuilder A0X = C18270x1.A0X(r4);
        A0X.append("PAY: BusinessHubViewModel unlinkMerchantAccount/onRequestError paymentNetworkError: [");
        A0X.append(r4.A00);
        A0X.append("] ");
        C18260x0.A1K(A0X, r4.A07);
        ((C06270Wx) this.A00.A0B.getValue()).A0G(AnonymousClass9WE.A02((Object) null, AnonymousClass002.A0E(r4.A07)));
    }

    public void BaB(AnonymousClass34V r4) {
        StringBuilder A0X = C18270x1.A0X(r4);
        A0X.append("PAY: BusinessHubViewModel unlinkMerchantAccount/onRequestError paymentNetworkError: [");
        A0X.append(r4.A00);
        A0X.append("] ");
        C18260x0.A1K(A0X, r4.A07);
        ((C06270Wx) this.A00.A0B.getValue()).A0G(AnonymousClass9WE.A02((Object) null, AnonymousClass002.A0E(r4.A07)));
    }
}
