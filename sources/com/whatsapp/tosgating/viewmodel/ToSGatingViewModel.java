package com.whatsapp.tosgating.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.C05550Ty;
import X.C102465Iy;
import X.C105575Vn;
import X.C162457s7;
import X.C18260x0;
import X.C29101iH;
import X.C56152rV;
import X.C56972sr;
import X.C615431g;
import X.C69183Wa;
import com.whatsapp.jid.UserJid;

public final class ToSGatingViewModel extends C05550Ty {
    public boolean A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final C102465Iy A02;
    public final C56972sr A03;
    public final C56152rV A04;
    public final AnonymousClass1VX A05;
    public final C29101iH A06;
    public final C69183Wa A07;
    public final C105575Vn A08;

    public void A0C() {
        this.A06.A07(this.A08);
    }

    public final boolean A0D(UserJid userJid) {
        C102465Iy r0 = this.A02;
        return C615431g.A00(r0.A00, r0.A01, r0.A02, userJid, r0.A03);
    }

    public ToSGatingViewModel(C102465Iy r2, C56972sr r3, C56152rV r4, AnonymousClass1VX r5, C29101iH r6, C69183Wa r7) {
        C18260x0.A0d(r5, r3, r4, r6);
        C162457s7.A0J(r7, 6);
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r7;
        C105575Vn r0 = new C105575Vn(this);
        this.A08 = r0;
        r6.A06(r0);
    }
}
