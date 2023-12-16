package com.whatsapp.biz.catalog.viewmodel;

import X.AnonymousClass000;
import X.C05550Ty;
import X.C105405Uu;
import X.C109015dw;
import X.C162457s7;
import com.whatsapp.jid.UserJid;

public final class ShareProductViewModel extends C05550Ty {
    public final C105405Uu A00;

    public ShareProductViewModel(C105405Uu r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final Boolean A0D(String str) {
        C109015dw A08 = this.A00.A08((UserJid) null, str);
        if (A08 != null) {
            return Boolean.valueOf(AnonymousClass000.A1W(A08.A0B));
        }
        return null;
    }
}
