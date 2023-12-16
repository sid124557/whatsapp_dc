package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9c7  reason: invalid class name */
public class AnonymousClass9c7 implements C184518rx {
    public final /* synthetic */ C202749mW A00;
    public final /* synthetic */ AnonymousClass9Ct A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    public AnonymousClass9c7(C202749mW r1, AnonymousClass9Ct r2, PaymentBottomSheet paymentBottomSheet, Runnable runnable, Runnable runnable2) {
        this.A01 = r2;
        this.A02 = paymentBottomSheet;
        this.A04 = runnable;
        this.A00 = r1;
        this.A03 = runnable2;
    }

    public void BS6(AnonymousClass34V r4) {
        AnonymousClass9Ct r2 = this.A01;
        int i = r4.A00;
        if (i == 10752 || i == 10756 || i == 10755) {
            AnonymousClass9Ct.A0C(r4, this.A00, r2, this.A02);
        } else {
            r2.Bou(r2.A8T(r4));
        }
        this.A03.run();
    }

    public void BaO(C139766sa r7) {
        C34841vu r0 = r7.A01;
        if (r0 != null) {
            AnonymousClass9Ct r4 = this.A01;
            r4.startActivityForResult(C627736r.A15(r4, r0.A02, r0.A01, r0.A00, -1), EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            PaymentBottomSheet paymentBottomSheet = this.A02;
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A1K();
            }
            r4.BKD((AnonymousClass303) null, C18290x4.A0Z(), (Integer) null, "in_app_browser_checkout");
        }
        this.A04.run();
    }
}
