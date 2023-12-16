package X;

import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

/* renamed from: X.9if  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200649if implements Runnable {
    public final /* synthetic */ PaymentIncentiveViewModel A00;
    public final /* synthetic */ boolean A01;

    public final void run() {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A00;
        boolean z = this.A01;
        C194659Tz A05 = AnonymousClass9U4.A05(paymentIncentiveViewModel.A05);
        if (A05 != null && C1899693i.A0w(A05.A07)) {
            C194969Vi r3 = paymentIncentiveViewModel.A06;
            AnonymousClass9VG A002 = r3.A00();
            if (z) {
                paymentIncentiveViewModel.A01.A0G(AnonymousClass9WE.A00(A002));
            }
            r3.A06(new AnonymousClass9RJ(new C196759bh(paymentIncentiveViewModel, z), r3, A05.A02(A002.A01, A002.A02)), false);
        }
    }

    public /* synthetic */ C200649if(PaymentIncentiveViewModel paymentIncentiveViewModel, boolean z) {
        this.A00 = paymentIncentiveViewModel;
        this.A01 = z;
    }
}
