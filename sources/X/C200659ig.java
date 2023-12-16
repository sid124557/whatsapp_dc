package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

/* renamed from: X.9ig  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200659ig implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentIncentiveViewModel A01;

    public final void run() {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        int A0D = paymentIncentiveViewModel.A0D(this.A00);
        AnonymousClass08M r3 = paymentIncentiveViewModel.A02;
        C194969Vi r0 = paymentIncentiveViewModel.A06;
        r3.A0G(AnonymousClass9WE.A01(new AnonymousClass9VG(r0.A02(), r0.A03(), A0D)));
    }

    public /* synthetic */ C200659ig(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        this.A01 = paymentIncentiveViewModel;
        this.A00 = userJid;
    }
}
