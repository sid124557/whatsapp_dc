package X;

import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.9bh  reason: invalid class name and case insensitive filesystem */
public class C196759bh implements C202969mu {
    public final /* synthetic */ PaymentIncentiveViewModel A00;
    public final /* synthetic */ boolean A01;

    public C196759bh(PaymentIncentiveViewModel paymentIncentiveViewModel, boolean z) {
        this.A00 = paymentIncentiveViewModel;
        this.A01 = z;
    }

    public void BRy() {
        Log.e("PAY: PaymentIncentiveViewModel/syncIncentiveData/on-error");
        if (this.A01) {
            PaymentIncentiveViewModel paymentIncentiveViewModel = this.A00;
            paymentIncentiveViewModel.A01.A0G(AnonymousClass9WE.A02(paymentIncentiveViewModel.A06.A00(), AnonymousClass002.A0E("Failed syncing incentive")));
        }
    }

    public void Bd5(AnonymousClass9VG r3) {
        if (this.A01) {
            this.A00.A01.A0G(AnonymousClass9WE.A01(r3));
        }
    }
}
