package com.whatsapp.catalogcategory.view.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass4FS;
import X.AnonymousClass4UC;
import X.AnonymousClass5AN;
import X.AnonymousClass5QB;
import X.AnonymousClass5QD;
import X.AnonymousClass66R;
import X.AnonymousClass6CA;
import X.AnonymousClass8P7;
import X.AnonymousClass8XL;
import X.C05550Ty;
import X.C06270Wx;
import X.C133046gb;
import X.C133056gc;
import X.C141516vh;
import X.C162457s7;
import X.C18260x0;
import X.C43072Qq;
import X.C70323aJ;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class CatalogCategoryGroupsViewModel extends C05550Ty {
    public final C06270Wx A00;
    public final C06270Wx A01;
    public final C06270Wx A02;
    public final AnonymousClass08M A03;
    public final AnonymousClass5QB A04;
    public final AnonymousClass5QD A05;
    public final AnonymousClass5AN A06;
    public final AnonymousClass4UC A07;
    public final AnonymousClass4FS A08;
    public final AnonymousClass66R A09;

    public final void A0E(UserJid userJid, List list) {
        C162457s7.A0J(list, 0);
        this.A03.A0H(Boolean.FALSE);
        this.A08.BkM(new C70323aJ(this, list, userJid, 20));
    }

    public final void A0D(C43072Qq r5, UserJid userJid, int i) {
        Object r1;
        C141516vh r2 = C141516vh.CATALOG_CATEGORY_FLOW;
        AnonymousClass4UC r3 = this.A07;
        if (r5.A04) {
            String str = r5.A01;
            C162457s7.A0C(str);
            String str2 = r5.A02;
            C162457s7.A0C(str2);
            r1 = new C133056gc(userJid, str, str2, i);
        } else {
            String str3 = r5.A01;
            C162457s7.A0C(str3);
            r1 = new C133046gb(r2, userJid, str3);
        }
        r3.A0H(r1);
    }

    public CatalogCategoryGroupsViewModel(AnonymousClass5QB r2, AnonymousClass5QD r3, AnonymousClass5AN r4, AnonymousClass4FS r5) {
        C18260x0.A0R(r5, r2);
        this.A08 = r5;
        this.A05 = r3;
        this.A04 = r2;
        this.A06 = r4;
        AnonymousClass8P7 A002 = AnonymousClass8P7.A00(AnonymousClass8XL.A00);
        this.A09 = A002;
        this.A00 = AnonymousClass6CA.A0J(A002);
        AnonymousClass4UC r0 = new AnonymousClass4UC();
        this.A07 = r0;
        this.A01 = r0;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A03 = A012;
        this.A02 = A012;
    }
}
