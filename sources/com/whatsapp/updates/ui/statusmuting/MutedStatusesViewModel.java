package com.whatsapp.updates.ui.statusmuting;

import X.AnonymousClass08J;
import X.AnonymousClass0GH;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4q6;
import X.AnonymousClass5E4;
import X.AnonymousClass62Z;
import X.AnonymousClass66R;
import X.AnonymousClass6C6;
import X.C05550Ty;
import X.C103445Mz;
import X.C105765Wh;
import X.C120465yd;
import X.C1226665g;
import X.C154517dI;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C18260x0;
import X.C86604Kt;
import com.whatsapp.status.viewmodels.StatusesViewModel;

public final class MutedStatusesViewModel extends C05550Ty implements C17280vG, C1226665g {
    public AnonymousClass08J A00 = AnonymousClass4L0.A0E();
    public AnonymousClass4q6 A01;
    public final AnonymousClass5E4 A02;
    public final AnonymousClass66R A03;
    public final /* synthetic */ StatusesViewModel A04;

    public void BcK(AnonymousClass0GH r2, C15910sA r3) {
        C105765Wh r0;
        C162457s7.A0J(r2, 1);
        if (r2 == AnonymousClass0GH.ON_PAUSE) {
            C86604Kt.A1R(this.A01);
        } else if (r2 == AnonymousClass0GH.ON_RESUME && (r0 = (C105765Wh) this.A04.A06.A07()) != null) {
            A0D(r0);
        }
    }

    public final void A0D(C105765Wh r5) {
        C86604Kt.A1R(this.A01);
        AnonymousClass4q6 r3 = new AnonymousClass4q6(r5, this.A02.A00.A03.A00.APz());
        C103445Mz.A01(r3, (C103445Mz) this.A03.getValue(), this.A00, 4);
        this.A01 = r3;
    }

    public void BcY(C105765Wh r2) {
        this.A04.BcY(r2);
    }

    public MutedStatusesViewModel(AnonymousClass5E4 r5, StatusesViewModel statusesViewModel, AnonymousClass4FS r7) {
        C18260x0.A0Q(r7, r5);
        this.A02 = r5;
        this.A04 = statusesViewModel;
        this.A03 = C154517dI.A01(new C120465yd(r7));
        AnonymousClass6C6.A03(statusesViewModel.A06, this.A00, new AnonymousClass62Z(this), 362);
    }
}
