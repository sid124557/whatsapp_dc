package com.whatsapp.catalogsearch.view.viewmodel;

import X.AnonymousClass2AB;
import X.AnonymousClass5IQ;
import X.AnonymousClass5MJ;
import X.AnonymousClass66R;
import X.AnonymousClass6h1;
import X.AnonymousClass6h2;
import X.AnonymousClass6h3;
import X.AnonymousClass8WE;
import X.AnonymousClass8XO;
import X.C05550Ty;
import X.C06270Wx;
import X.C103555Nl;
import X.C104975Tb;
import X.C108985dt;
import X.C133266gx;
import X.C133296h0;
import X.C141526vi;
import X.C149397Mh;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import com.whatsapp.jid.UserJid;

public final class CatalogSearchViewModel extends C05550Ty {
    public final C06270Wx A00;
    public final C06270Wx A01;
    public final AnonymousClass5MJ A02;
    public final C104975Tb A03;
    public final AnonymousClass5IQ A04;
    public final C103555Nl A05;
    public final AnonymousClass66R A06 = C154517dI.A01(AnonymousClass8XO.A00);
    public final AnonymousClass66R A07 = C154517dI.A01(new AnonymousClass8WE(this));

    public CatalogSearchViewModel(AnonymousClass5MJ r2, C104975Tb r3, AnonymousClass5IQ r4, C103555Nl r5) {
        C162457s7.A0J(r2, 3);
        this.A05 = r5;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r5.A00;
        this.A00 = r4.A00;
    }

    public final void A0F(C108985dt r4, String str) {
        C162457s7.A0J(str, 1);
        if (str.length() == 0) {
            C104975Tb r2 = this.A03;
            A0D(new C133296h0(r2.A03(r4, "categories", r2.A02.A0X(1514))));
            this.A04.A01.A0H("");
            return;
        }
        AnonymousClass5IQ r0 = this.A04;
        r0.A01.A0H(AnonymousClass2AB.A00(str));
        A0D(AnonymousClass6h3.A00);
    }

    public final void A0D(C149397Mh r2) {
        ((C06270Wx) this.A06.getValue()).A0H(r2);
    }

    public final void A0E(C108985dt r3, UserJid userJid, String str) {
        C18260x0.A0O(str, userJid);
        if (!this.A03.A00(r3)) {
            A0D(new AnonymousClass6h1(C133266gx.A00));
            return;
        }
        A0D(AnonymousClass6h2.A00);
        this.A05.A00(C141526vi.START, userJid, str);
    }
}
