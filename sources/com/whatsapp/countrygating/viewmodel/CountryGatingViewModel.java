package com.whatsapp.countrygating.viewmodel;

import X.AnonymousClass1VX;
import X.C05550Ty;
import X.C102465Iy;
import X.C162457s7;
import X.C57172tD;
import com.whatsapp.jid.UserJid;

public final class CountryGatingViewModel extends C05550Ty {
    public boolean A00;
    public final C102465Iy A01;
    public final AnonymousClass1VX A02;

    public CountryGatingViewModel(C102465Iy r2, AnonymousClass1VX r3) {
        C162457s7.A0J(r3, 1);
        this.A02 = r3;
        this.A01 = r2;
    }

    public final boolean A0D(UserJid userJid) {
        C102465Iy r0 = this.A01;
        return C57172tD.A00(r0.A00, r0.A01, r0.A02, userJid);
    }
}
