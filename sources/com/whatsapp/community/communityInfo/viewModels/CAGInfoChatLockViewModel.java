package com.whatsapp.community.communityInfo.viewModels;

import X.AnonymousClass08J;
import X.AnonymousClass10x;
import X.AnonymousClass4L0;
import X.AnonymousClass66R;
import X.C05550Ty;
import X.C119295wk;
import X.C154517dI;
import X.C162457s7;
import X.C27991fJ;
import X.C28891hw;

public final class CAGInfoChatLockViewModel extends C05550Ty {
    public AnonymousClass10x A00;
    public C27991fJ A01;
    public final AnonymousClass08J A02 = AnonymousClass4L0.A0E();
    public final C28891hw A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C119295wk(this));

    public CAGInfoChatLockViewModel(C28891hw r2) {
        C162457s7.A0J(r2, 1);
        this.A03 = r2;
    }

    public void A0C() {
        AnonymousClass10x r0 = this.A00;
        if (r0 != null) {
            this.A02.A0I(r0.A0H);
        }
        this.A03.A07(this.A04.getValue());
    }
}
