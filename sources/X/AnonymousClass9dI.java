package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9dI  reason: invalid class name */
public class AnonymousClass9dI implements C203759oG {
    public final /* synthetic */ C197329cw A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public AnonymousClass9dI(C197329cw r1, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = r1;
        this.A01 = paymentBottomSheet;
    }

    public void B1p() {
        PaymentBottomSheet paymentBottomSheet = this.A01;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1K();
        }
    }

    public void BWM(AnonymousClass3QO r4) {
        String str;
        C197329cw r2 = this.A00;
        AnonymousClass9Bs r1 = r2.A04;
        r1.A08 = r4;
        if (r4 == null) {
            str = null;
        } else {
            str = r4.A0L.A0D;
        }
        r1.A0U = str;
        r1.A7y(this.A01);
        B1p();
        r1.A80(r2.A01);
    }

    public void Bj8() {
        PaymentView paymentView = this.A00.A04.A0N;
        if (paymentView != null) {
            paymentView.A05();
        }
    }

    public void BjL() {
        this.A00.A04.BjL();
    }

    public void BjQ() {
        PaymentView paymentView = this.A00.A04.A0N;
        if (paymentView != null) {
            paymentView.A06();
        }
    }
}
