package com.whatsapp.product.newsletterenforcements.enforcedmessages;

import X.AnonymousClass002;
import X.AnonymousClass0IV;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass3UV;
import X.AnonymousClass431;
import X.AnonymousClass4FW;
import X.AnonymousClass4SG;
import X.AnonymousClass543;
import X.AnonymousClass58H;
import X.AnonymousClass62E;
import X.AnonymousClass62F;
import X.AnonymousClass66R;
import X.AnonymousClass675;
import X.AnonymousClass679;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.AnonymousClass8PJ;
import X.C08240dc;
import X.C08310eF;
import X.C105165Tv;
import X.C105365Uq;
import X.C106625Zs;
import X.C107695bk;
import X.C120075y0;
import X.C120085y1;
import X.C120795zB;
import X.C124166Bf;
import X.C13750ng;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C22711Pu;
import X.C45382Zv;
import X.C53602nM;
import X.C55832qz;
import X.C56652sL;
import X.C56922sm;
import X.C56972sr;
import X.C616131n;
import X.C64333Db;
import X.C64773Ex;
import X.C71263bp;
import X.C79203wF;
import X.C79213wG;
import X.C81013zC;
import X.C84814Du;
import X.C85494Gl;
import X.C86614Ku;
import X.C88834as;
import X.C93544ok;
import X.C95804uY;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;

public final class EnforcedMessagesActivity extends C93544ok {
    public C53602nM A00;
    public C56652sL A01;
    public C45382Zv A02;
    public AnonymousClass3UV A03;
    public boolean A04;
    public final AnonymousClass4FW A05;
    public final AnonymousClass66R A06;
    public final AnonymousClass66R A07;
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;

    public /* bridge */ /* synthetic */ AnonymousClass675 A75() {
        AnonymousClass543 r11 = new AnonymousClass543(this, 48, this.A00);
        C56972sr r3 = this.A01;
        C162457s7.A0C(r3);
        C64773Ex r4 = this.A00.A0C;
        C162457s7.A0D(r4);
        C55832qz r10 = this.A00.A0y;
        C162457s7.A0D(r10);
        C105365Uq r5 = this.A07;
        C162457s7.A0C(r5);
        C105165Tv r6 = this.A00.A0M;
        C162457s7.A0D(r6);
        AnonymousClass1VX r8 = this.A0D;
        C162457s7.A0C(r8);
        return new C22711Pu(this, r3, r4, r5, r6, this, r8, (C95804uY) this.A08.getValue(), r10, r11, new AnonymousClass431(this));
    }

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r1 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r1, this, AnonymousClass4SG.A2t(r3, r1, this));
            AnonymousClass4SG.A3i(this);
            AnonymousClass4SG.A3G(A2X, r3, r1, this, r3.AUW);
            this.A01 = (C56652sL) r3.AOJ.get();
            this.A00 = C18280x3.A0L(r1);
            this.A02 = (C45382Zv) r3.AL2.get();
            this.A03 = new AnonymousClass3UV((C56922sm) r3.A58.get(), C86614Ku.A0a(r3));
        }
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A00.A0Q.A05;
    }

    public EnforcedMessagesActivity(int i) {
        this.A04 = false;
        AnonymousClass68W.A00(this, 72);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        ListView listView = getListView();
        C162457s7.A0D(listView);
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnScrollListener(this.A0J);
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, listView, false);
        listView.addHeaderView(inflate);
        AnonymousClass002.A09(inflate, R.id.header_title).setText(R.string.f11nameremoved);
        TextView A092 = AnonymousClass002.A09(inflate, R.id.header_description);
        A092.setText(C106625Zs.A01(this, new C71263bp((Object) this, 42), AnonymousClass002.A0F(this, "clickable-span", new Object[1], 0, R.string.f11nameremoved), "clickable-span", C18290x4.A00(this)));
        C18270x1.A0q(A092, this.A0D);
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A09((C08310eF) this.A07.getValue(), R.id.newsletter_guidelines_fragment);
        A0J.A01();
        A74(this.A05);
        this.A00.A0a.A06(this.A05);
        AnonymousClass66R r3 = this.A09;
        AnonymousClass6C6.A02(this, ((EnforcedMessagesViewModel) r3.getValue()).A00, new AnonymousClass62E(this), 272);
        AnonymousClass6C6.A02(this, ((EnforcedMessagesViewModel) r3.getValue()).A01, new AnonymousClass62F(this), 273);
        C45382Zv r2 = this.A02;
        if (r2 != null) {
            AnonymousClass66R r1 = this.A08;
            r2.A00((C95804uY) r1.getValue());
            EnforcedMessagesViewModel enforcedMessagesViewModel = (EnforcedMessagesViewModel) r3.getValue();
            C95804uY r0 = (C95804uY) r1.getValue();
            C162457s7.A0J(r0, 0);
            C616131n.A02((C85494Gl) null, new EnforcedMessagesViewModel$initializeViewModel$1(r0, enforcedMessagesViewModel, (C84814Du) null), AnonymousClass0IV.A00(enforcedMessagesViewModel), (AnonymousClass20D) null, 3);
            return;
        }
        throw C18270x1.A0S("messageDeliveryUpdatesFetcher");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A0a.A07(this.A05);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        EnforcedMessagesViewModel enforcedMessagesViewModel = (EnforcedMessagesViewModel) this.A09.getValue();
        C95804uY r4 = (C95804uY) this.A08.getValue();
        C162457s7.A0J(r4, 0);
        C616131n.A02((C85494Gl) null, new EnforcedMessagesViewModel$initializeViewModel$1(r4, enforcedMessagesViewModel, (C84814Du) null), AnonymousClass0IV.A00(enforcedMessagesViewModel), (AnonymousClass20D) null, 3);
    }

    public EnforcedMessagesActivity() {
        this(0);
        this.A09 = new C13750ng(new C120085y1(this), new C120075y0(this), new C120795zB(this), new AnonymousClass8PJ(EnforcedMessagesViewModel.class));
        this.A08 = C154517dI.A00(AnonymousClass58H.NONE, new C81013zC(this));
        this.A05 = new C124166Bf(this, 17);
        this.A07 = C154517dI.A01(new C79213wG(this));
        this.A06 = C154517dI.A01(new C79203wF(this));
    }
}
