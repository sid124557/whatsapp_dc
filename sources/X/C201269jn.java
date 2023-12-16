package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9jn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201269jn implements Runnable {
    public final /* synthetic */ C133696hn A00;
    public final /* synthetic */ AnonymousClass39L A01;
    public final /* synthetic */ AnonymousClass9Ct A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public final void run() {
        AnonymousClass9Ct r4 = this.A02;
        PaymentBottomSheet paymentBottomSheet = this.A03;
        C133696hn r2 = this.A00;
        AnonymousClass39L r1 = this.A01;
        if (paymentBottomSheet == null) {
            r4.A8R(false);
        }
        r4.A8M(r2, r1, paymentBottomSheet);
    }

    public /* synthetic */ C201269jn(C133696hn r1, AnonymousClass39L r2, AnonymousClass9Ct r3, PaymentBottomSheet paymentBottomSheet) {
        this.A02 = r3;
        this.A03 = paymentBottomSheet;
        this.A00 = r1;
        this.A01 = r2;
    }
}
