package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9dE  reason: invalid class name and case insensitive filesystem */
public class C197479dE implements AnonymousClass4DN {
    public final /* synthetic */ C202749mW A00;
    public final /* synthetic */ AnonymousClass9Ct A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public C197479dE(C202749mW r1, AnonymousClass9Ct r2, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = paymentBottomSheet;
        this.A03 = paymentBottomSheet2;
    }

    public void BOO() {
        PaymentBottomSheet paymentBottomSheet = this.A02;
        C08270df A0T = paymentBottomSheet.A0T();
        int A07 = A0T.A07();
        for (int i = 0; i < A07; i++) {
            A0T.A0M();
        }
        paymentBottomSheet.A1Y();
    }

    public void BQ2(PaymentBottomSheet paymentBottomSheet, String str) {
        AnonymousClass9Ct r4 = this.A01;
        r4.A03.A01(new C197089cX(this), str, "p2m-in-buyer-check");
        r4.BKD((AnonymousClass303) null, AnonymousClass001.A0f(), C18290x4.A0c(), "enter_name");
    }
}
