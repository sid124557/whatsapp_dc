package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

/* renamed from: X.9ih  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200669ih implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentIncentiveViewModel A01;

    public final void run() {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        UserJid userJid = this.A00;
        C194659Tz A05 = AnonymousClass9U4.A05(paymentIncentiveViewModel.A05);
        if (A05 != null && C1899693i.A0w(A05.A07)) {
            C194969Vi r3 = paymentIncentiveViewModel.A06;
            AnonymousClass9VG A002 = r3.A00();
            paymentIncentiveViewModel.A00.A0G(AnonymousClass9WE.A00(A002));
            r3.A06(new AnonymousClass9RJ(new C196749bg(userJid, paymentIncentiveViewModel), r3, A05.A02(A002.A01, A002.A02)), false);
        }
    }

    public /* synthetic */ C200669ih(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        this.A01 = paymentIncentiveViewModel;
        this.A00 = userJid;
    }
}
