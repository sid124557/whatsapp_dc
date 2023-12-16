package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09S;
import X.AnonymousClass0IV;
import X.AnonymousClass0R8;
import X.AnonymousClass0RP;
import X.AnonymousClass113;
import X.AnonymousClass20D;
import X.AnonymousClass314;
import X.AnonymousClass483;
import X.AnonymousClass4SG;
import X.AnonymousClass543;
import X.AnonymousClass5D0;
import X.AnonymousClass5D1;
import X.AnonymousClass5M7;
import X.AnonymousClass5TZ;
import X.AnonymousClass5UY;
import X.AnonymousClass5Ul;
import X.AnonymousClass61G;
import X.AnonymousClass61H;
import X.AnonymousClass61I;
import X.AnonymousClass66R;
import X.AnonymousClass677;
import X.AnonymousClass679;
import X.AnonymousClass67W;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.AnonymousClass8PJ;
import X.C105165Tv;
import X.C105365Uq;
import X.C107695bk;
import X.C108845de;
import X.C109345eT;
import X.C116985rC;
import X.C118075sx;
import X.C119475x2;
import X.C120735z5;
import X.C135166kE;
import X.C13750ng;
import X.C154517dI;
import X.C15910sA;
import X.C162457s7;
import X.C18270x1;
import X.C18320x8;
import X.C29431io;
import X.C616131n;
import X.C621033m;
import X.C626936e;
import X.C627336j;
import X.C64333Db;
import X.C77703tp;
import X.C77713tq;
import X.C77723tr;
import X.C77733ts;
import X.C84814Du;
import X.C85494Gl;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C87944Ws;
import X.C88744aj;
import X.C88834as;
import X.C93354oN;
import X.C93484od;
import X.C93754pF;
import X.C95814uZ;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ReportToAdminMessagesActivity extends C93354oN implements AnonymousClass677 {
    public C116985rC A00;
    public AnonymousClass5D0 A01;
    public AnonymousClass5M7 A02;
    public AnonymousClass5Ul A03;
    public AnonymousClass483 A04;
    public C93484od A05;
    public C87944Ws A06;
    public C93754pF A07;
    public AnonymousClass5TZ A08;
    public boolean A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;
    public final AnonymousClass66R A0C;
    public final AnonymousClass66R A0D;

    public void onActivityResult(int i, int i2, Intent intent) {
        C108845de r6;
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            Collection A042 = this.A00.A04();
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C116985rC r1 = this.A00;
                if (r1 == null) {
                    throw C18270x1.A0S("advertiseForwardMediaHelper");
                } else if (r1.A07()) {
                    r1.A04();
                    throw AnonymousClass001.A0g("handleAdvertiseForwardClick");
                }
            } else {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
                if (A042.isEmpty() || stringArrayListExtra == null) {
                    this.A05.A0H(R.string.f11nameremoved, 0);
                } else {
                    List A0B2 = C627336j.A0B(C95814uZ.class, stringArrayListExtra);
                    boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                    String stringExtra = intent.getStringExtra("appended_message");
                    if (AnonymousClass000.A1W(C627336j.A03(A0B2))) {
                        Bundle extras = intent.getExtras();
                        C626936e.A06(extras);
                        AnonymousClass5TZ r0 = this.A08;
                        if (r0 != null) {
                            C162457s7.A0H(extras);
                            r6 = r0.A00(extras);
                        } else {
                            throw C18270x1.A0S("statusAudienceRepository");
                        }
                    } else {
                        r6 = null;
                    }
                    C621033m r4 = this.A00.A07;
                    AnonymousClass5Ul r5 = this.A03;
                    if (r5 != null) {
                        r4.A09(r5, r6, stringExtra, AnonymousClass314.A00(A042), A0B2, booleanExtra);
                        if (A0B2.size() != 1 || (A0B2.get(0) instanceof C135166kE)) {
                            Bqv(A0B2);
                        } else {
                            this.A00.A0B(this, C86604Kt.A08(this, this.A00.A0C, C86664Kz.A1B(), A0B2));
                        }
                    } else {
                        throw C18270x1.A0S("sendMedia");
                    }
                }
            }
            B3M();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A6N();
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new C109345eT(this, 44));
        }
        C29431io r1 = this.A00.A0a;
        AnonymousClass66R r3 = this.A0D;
        r1.A06(((AnonymousClass113) r3.getValue()).A05);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        RecyclerView recyclerView = (RecyclerView) findViewById(16908298);
        if (recyclerView != null) {
            C18320x8.A19(recyclerView, 1);
            AnonymousClass09S r12 = new AnonymousClass09S(this);
            Drawable A002 = AnonymousClass0RP.A00(this, R.drawable.divider_gray);
            if (A002 != null) {
                r12.A00 = A002;
                recyclerView.A0o(r12);
                AnonymousClass543 r10 = new AnonymousClass543(this, 48, this.A00);
                AnonymousClass5D0 r4 = this.A01;
                if (r4 != null) {
                    C105365Uq A062 = this.A00.A0H.A06(this, "report-to-admin");
                    C105165Tv r7 = this.A00.A0M;
                    C162457s7.A0D(r7);
                    C118075sx r13 = r4.A00;
                    C87944Ws r42 = new C87944Ws((AnonymousClass5D1) r13.A01.A0m.get(), A062, r7, this, C64333Db.A8F(r13.A03), r10);
                    this.A06 = r42;
                    recyclerView.setAdapter(r42);
                } else {
                    throw C18270x1.A0S("adapterFactory");
                }
            }
        }
        ((AnonymousClass5UY) this.A0B.getValue()).A06(0);
        AnonymousClass6C6.A02(this, ((AnonymousClass113) r3.getValue()).A02, new AnonymousClass61G(this), 190);
        AnonymousClass6C6.A02(this, ((AnonymousClass113) r3.getValue()).A01, new AnonymousClass61H(this), 191);
        AnonymousClass113 r43 = (AnonymousClass113) r3.getValue();
        r43.A04.A06(67, r43.A06.getRawString(), "ReportToAdminMessagesActivity");
        C616131n.A02((C85494Gl) null, new ReportToAdminMessagesViewModel$fetchReportedMessages$1(r43, (C84814Du) null), AnonymousClass0IV.A00(r43), (AnonymousClass20D) null, 3);
        this.A05.A01(new AnonymousClass67W(this, 0), this);
        AnonymousClass6C6.A02(this, ((MessageSelectionViewModel) this.A0C.getValue()).A01, new AnonymousClass61I(this), 192);
    }

    public static final /* synthetic */ void A0C(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        AnonymousClass5UY r2 = (AnonymousClass5UY) reportToAdminMessagesActivity.A0A.getValue();
        C87944Ws r0 = reportToAdminMessagesActivity.A06;
        if (r0 == null) {
            throw C18270x1.A0S("adapter");
        }
        int A0G = r0.A0G();
        int i = 8;
        if (A0G == 0) {
            i = 0;
        }
        r2.A06(i);
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r4 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r4, this, AnonymousClass4SG.A2t(r3, r4, this));
            this.A01 = (AnonymousClass5D0) A2X.A0n.get();
            this.A05 = new C93484od(C86614Ku.A0U(r3), C86604Kt.A0W(r3));
            this.A04 = (AnonymousClass483) A2X.A0p.get();
            this.A02 = (AnonymousClass5M7) A2X.A0T.get();
            this.A07 = new C93754pF(A2X.ABv());
            this.A00 = C88744aj.A00;
            this.A08 = C107695bk.A5D(r4);
            this.A03 = C86644Kx.A0L(r3);
        }
    }

    public boolean BbB() {
        return ((MessageSelectionViewModel) this.A0C.getValue()).A0E(1);
    }

    public /* bridge */ /* synthetic */ AnonymousClass679 getConversationRowCustomizer() {
        C93484od r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("rtaConversationRowCustomizer");
    }

    public /* bridge */ /* synthetic */ C15910sA getLifecycleOwner() {
        return this;
    }

    public void onDestroy() {
        this.A00.A0a.A07(((AnonymousClass113) this.A0D.getValue()).A05);
        super.onDestroy();
    }

    public ReportToAdminMessagesActivity(int i) {
        this.A09 = false;
        AnonymousClass68W.A00(this, 47);
    }

    public final void A74() {
        if (isTaskRoot()) {
            Intent A0D2 = C86634Kw.A0D(this, C86664Kz.A1B(), ((AnonymousClass113) this.A0D.getValue()).A06);
            C162457s7.A0D(A0D2);
            finishAndRemoveTask();
            startActivity(A0D2);
        }
        finish();
    }

    public ReportToAdminMessagesActivity() {
        this(0);
        this.A0D = new C13750ng(new C119475x2(this), new C77733ts(this), new C120735z5(this), new AnonymousClass8PJ(AnonymousClass113.class));
        this.A0C = C154517dI.A01(new C77723tr(this));
        this.A0A = C154517dI.A01(new C77703tp(this));
        this.A0B = C154517dI.A01(new C77713tq(this));
    }
}
