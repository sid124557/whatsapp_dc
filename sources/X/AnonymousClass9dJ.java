package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9dJ  reason: invalid class name */
public class AnonymousClass9dJ implements C203759oG {
    public final /* synthetic */ C195319Xg A00;
    public final /* synthetic */ C133676hl A01;
    public final /* synthetic */ C166587yw A02;
    public final /* synthetic */ C197339cx A03;
    public final /* synthetic */ PaymentBottomSheet A04;

    public AnonymousClass9dJ(C195319Xg r1, C133676hl r2, C166587yw r3, C197339cx r4, PaymentBottomSheet paymentBottomSheet) {
        this.A03 = r4;
        this.A04 = paymentBottomSheet;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void B1p() {
        this.A03.A05.A1K();
    }

    public void BWM(AnonymousClass3QO r7) {
        C197339cx r0 = this.A03;
        PaymentBottomSheet paymentBottomSheet = this.A04;
        C166587yw r3 = this.A02;
        r0.A00(this.A00, this.A01, r3, r7, paymentBottomSheet);
    }

    public void Bj8() {
        PaymentView paymentView = this.A03.A03.A0W;
        if (paymentView != null) {
            paymentView.A05();
        }
    }

    public void BjL() {
        this.A03.A03.BjL();
    }

    public void BjQ() {
        PaymentView paymentView = this.A03.A03.A0W;
        if (paymentView != null) {
            paymentView.A06();
        }
    }
}
