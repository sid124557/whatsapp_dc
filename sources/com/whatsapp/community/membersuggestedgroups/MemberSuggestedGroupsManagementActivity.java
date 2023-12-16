package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass043;
import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0UY;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass20D;
import X.AnonymousClass29F;
import X.AnonymousClass2CM;
import X.AnonymousClass4HY;
import X.AnonymousClass58H;
import X.AnonymousClass5UY;
import X.AnonymousClass66R;
import X.C106715a2;
import X.C107695bk;
import X.C13770ni;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C196311y;
import X.C616131n;
import X.C620733j;
import X.C64333Db;
import X.C64653Ej;
import X.C77383tJ;
import X.C77393tK;
import X.C77403tL;
import X.C77413tM;
import X.C77423tN;
import X.C77433tO;
import X.C77443tP;
import X.C77453tQ;
import X.C77463tR;
import X.C80263xx;
import X.C84814Du;
import X.C85494Gl;
import X.C88694ab;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class MemberSuggestedGroupsManagementActivity extends C89644eZ {
    public AnonymousClass043 A00;
    public C88694ab A01;
    public AnonymousClass2CM A02;
    public C64653Ej A03;
    public C106715a2 A04;
    public boolean A05 = false;
    public final C196311y A06;
    public final AnonymousClass66R A07;
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;
    public final AnonymousClass66R A0C;
    public final AnonymousClass66R A0D;
    public final AnonymousClass66R A0E;
    public final AnonymousClass66R A0F;
    public final AnonymousClass66R A0G;

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r0 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r0, this);
            C107695bk r1 = r0.A00;
            AnonymousClass1Ha.A23(r0, r1, r1, this);
            AnonymousClass1Ha.A24(r0, this);
            this.A03 = (C64653Ej) r0.A5c.get();
            this.A04 = C18280x3.A0Q(r1);
            this.A02 = (AnonymousClass2CM) A0I.A0d.get();
        }
    }

    public final MemberSuggestedGroupsManagementViewModel A74() {
        return (MemberSuggestedGroupsManagementViewModel) this.A0G.getValue();
    }

    public final void A75(int i) {
        ((AnonymousClass5UY) this.A0A.getValue()).A06(i);
        ((View) C18300x5.A0d(this.A08)).setVisibility(i);
    }

    public MemberSuggestedGroupsManagementActivity() {
        super(R.layout.f8nameremoved);
        AnonymousClass4HY.A00(this, 41);
        this.A0F = C154517dI.A01(new C77453tQ(this));
        this.A07 = C154517dI.A01(new C77383tJ(this));
        this.A06 = new C196311y();
        this.A0A = C154517dI.A01(new C77413tM(this));
        this.A09 = C154517dI.A01(new C77403tL(this));
        this.A08 = C154517dI.A01(new C77393tK(this));
        this.A0D = C154517dI.A01(new C77443tP(this));
        this.A0C = C154517dI.A01(new C77433tO(this));
        this.A0B = C154517dI.A01(new C77423tN(this));
        this.A0G = C154517dI.A01(new C77463tR(this));
        this.A0E = C154517dI.A00(AnonymousClass58H.NONE, new C80263xx(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C616131n.A02((C85494Gl) null, new MemberSuggestedGroupsManagementActivity$setupLoading$1$1((FrameLayout) this.A00.findViewById(R.id.overall_progress_spinner), this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        Toolbar toolbar = (Toolbar) this.A00.findViewById(R.id.member_suggested_groups_management_toolbar);
        C162457s7.A0H(toolbar);
        C620733j r1 = this.A00;
        C162457s7.A0C(r1);
        AnonymousClass29F.A00(this, toolbar, r1, "");
        C616131n.A02((C85494Gl) null, new MemberSuggestedGroupsManagementActivity$setupToolbar$1$1(toolbar, this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        C616131n.A02((C85494Gl) null, new MemberSuggestedGroupsManagementActivity$setupDisclaimer$1$1((WaTextView) this.A00.findViewById(R.id.member_suggested_groups_management_disclaimer), this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        RecyclerView recyclerView = (RecyclerView) this.A0F.getValue();
        recyclerView.setAdapter(this.A06);
        recyclerView.getContext();
        C18270x1.A0u(recyclerView);
        recyclerView.setItemAnimator((AnonymousClass0UY) null);
        C616131n.A02((C85494Gl) null, new MemberSuggestedGroupsManagementActivity$setupRecyclerView$1$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        C616131n.A02((C85494Gl) null, new MemberSuggestedGroupsManagementActivity$setupButtons$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        AnonymousClass0x2.A0z(this.A00.findViewById(R.id.member_suggested_groups_management_reject_all), this, 39);
        AnonymousClass0x2.A0z(this.A00.findViewById(R.id.member_suggested_groups_management_approve_all), this, 40);
        C616131n.A02((C85494Gl) null, new MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        C13770ni A002 = AnonymousClass0IT.A00(this);
        C616131n.A02((C85494Gl) null, new LifecycleCoroutineScope$launchWhenStarted$1(A002, (C84814Du) null, new MemberSuggestedGroupsManagementActivity$setupNotifications$1(this, (C84814Du) null)), A002, (AnonymousClass20D) null, 3);
        MemberSuggestedGroupsManagementViewModel A74 = A74();
        C616131n.A02(A74.A0E, new MemberSuggestedGroupsManagementViewModel$initialize$1(A74, (C84814Du) null), AnonymousClass0IV.A00(A74), (AnonymousClass20D) null, 2);
    }
}
