package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;

/* renamed from: X.9ic  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200619ic implements Runnable {
    public final /* synthetic */ C624034w A00;
    public final /* synthetic */ IndiaUpiPauseMandateViewModel A01;

    public final void run() {
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = this.A01;
        C166587yw A08 = indiaUpiPauseMandateViewModel.A07.A08(this.A00.A0H);
        indiaUpiPauseMandateViewModel.A00 = A08;
        if (A08 == null) {
            indiaUpiPauseMandateViewModel.A02.A0G(new AnonymousClass9QA(1));
        }
    }

    public /* synthetic */ C200619ic(C624034w r1, IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel) {
        this.A01 = indiaUpiPauseMandateViewModel;
        this.A00 = r1;
    }
}
