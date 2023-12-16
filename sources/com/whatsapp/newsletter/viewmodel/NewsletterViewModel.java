package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass21F;
import X.C05110Rz;
import X.C06270Wx;
import X.C104595Rp;
import X.C113835m4;
import X.C124106Az;
import X.C162457s7;
import X.C18260x0;
import X.C29311ic;
import X.C56842se;
import X.C95804uY;

public final class NewsletterViewModel extends NewsletterListViewModel {
    public final C95804uY A00;

    public final C06270Wx A0G() {
        return C05110Rz.A00(new C124106Az(this, 8), this.A03.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterViewModel(C95804uY r1, C29311ic r2, C113835m4 r3, C56842se r4) {
        super(r2, r3, r4);
        C18260x0.A0V(r3, r4, r2);
        this.A00 = r1;
    }

    public void BLy(C95804uY r2, AnonymousClass21F r3, Throwable th) {
        if (C162457s7.A0P(r2, C104595Rp.A00(this).A05())) {
            super.BLy(r2, r3, th);
        }
    }

    public void BM1(C95804uY r2, AnonymousClass21F r3) {
        if (C162457s7.A0P(r2, C104595Rp.A00(this).A05())) {
            super.BM1(r2, r3);
        }
    }
}
