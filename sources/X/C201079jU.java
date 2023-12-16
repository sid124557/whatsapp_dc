package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;

/* renamed from: X.9jU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201079jU implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IndiaUpiPauseMandateViewModel A02;

    public final void run() {
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        AnonymousClass9W2 r6 = C1899693i.A0K(indiaUpiPauseMandateViewModel.A01).A0G;
        C626936e.A06(r6);
        C195059Vs r1 = new C195059Vs();
        r1.A02 = "PAUSE";
        r1.A03 = "PENDING";
        r1.A01 = j;
        r1.A00 = j2;
        r6.A0B = r1;
        AnonymousClass9U4.A01(indiaUpiPauseMandateViewModel.A09).A0d(indiaUpiPauseMandateViewModel.A01);
        indiaUpiPauseMandateViewModel.A03.A0S(new C199719h2(indiaUpiPauseMandateViewModel));
    }

    public /* synthetic */ C201079jU(IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel, long j, long j2) {
        this.A02 = indiaUpiPauseMandateViewModel;
        this.A00 = j;
        this.A01 = j2;
    }
}
