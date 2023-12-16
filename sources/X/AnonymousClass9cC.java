package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;

/* renamed from: X.9cC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9cC implements C202589mG {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ IndiaUpiPauseMandateViewModel A02;

    public final void BaJ(AnonymousClass34V r8) {
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        if (r8 == null) {
            indiaUpiPauseMandateViewModel.A0B.BkM(new C201079jU(indiaUpiPauseMandateViewModel, j, j2));
            return;
        }
        AnonymousClass9QA r1 = new AnonymousClass9QA(3);
        r1.A04 = r8;
        indiaUpiPauseMandateViewModel.A02.A0G(r1);
    }

    public /* synthetic */ AnonymousClass9cC(IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel, long j, long j2) {
        this.A02 = indiaUpiPauseMandateViewModel;
        this.A00 = j;
        this.A01 = j2;
    }
}
