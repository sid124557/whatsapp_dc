package X;

import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;

/* renamed from: X.5qr  reason: invalid class name and case insensitive filesystem */
public final class C116785qr implements AnonymousClass66P {
    public final /* synthetic */ CrossPostingUpdatesViewModel A00;

    public C116785qr(CrossPostingUpdatesViewModel crossPostingUpdatesViewModel) {
        this.A00 = crossPostingUpdatesViewModel;
    }

    public void BbT(AnonymousClass5S1 r4) {
        this.A00.A0E(r4.A00, r4.A01);
    }

    public void Bf2(AnonymousClass5S1 r6) {
        CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = this.A00;
        boolean z = r6.A00;
        boolean z2 = r6.A01;
        C104715Sb r1 = crossPostingUpdatesViewModel.A00;
        if (r1 == null) {
            throw C18270x1.A0S("crossPostingViewModelState");
        } else if (r1.A03 != z || r1.A02 != z2) {
            r1.A03 = z;
            r1.A02 = z2;
            C103305Mj r0 = crossPostingUpdatesViewModel.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }
}
