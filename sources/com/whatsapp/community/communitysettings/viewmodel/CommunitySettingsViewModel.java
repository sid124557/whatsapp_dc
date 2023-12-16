package com.whatsapp.community.communitysettings.viewmodel;

import X.AnonymousClass08J;
import X.AnonymousClass0IV;
import X.AnonymousClass107;
import X.AnonymousClass11N;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass20R;
import X.AnonymousClass21C;
import X.AnonymousClass31C;
import X.AnonymousClass33U;
import X.AnonymousClass4AQ;
import X.AnonymousClass4FS;
import X.C05550Ty;
import X.C162457s7;
import X.C18260x0;
import X.C27991fJ;
import X.C50932j0;
import X.C51362jh;
import X.C52252lB;
import X.C56942so;
import X.C616131n;
import X.C64773Ex;
import X.C73853gB;
import X.C84384Cd;
import X.C84814Du;
import X.C85494Gl;
import X.C85864Hx;
import com.whatsapp.community.AllowNonAdminSubGroupCreationProtocolHelper;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;

public final class CommunitySettingsViewModel extends C05550Ty {
    public int A00;
    public AnonymousClass11N A01;
    public C27991fJ A02;
    public C27991fJ A03;
    public final AnonymousClass08J A04 = new AnonymousClass08J();
    public final AllowNonAdminSubGroupCreationProtocolHelper A05;
    public final C56942so A06;
    public final C84384Cd A07;
    public final MemberSuggestedGroupsManager A08;
    public final AnonymousClass33U A09;
    public final C64773Ex A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4AQ A0C = new C85864Hx(this, 2);
    public final C50932j0 A0D;
    public final AnonymousClass31C A0E;
    public final AnonymousClass107 A0F = new AnonymousClass107(new C51362jh(AnonymousClass20R.ADMINS, AnonymousClass21C.IDLE));
    public final AnonymousClass107 A0G = new AnonymousClass107(new C52252lB(-1, 0, 0));
    public final AnonymousClass4FS A0H;
    public final C73853gB A0I;

    public void A0C() {
        this.A0D.A01(this.A0C);
    }

    public CommunitySettingsViewModel(AllowNonAdminSubGroupCreationProtocolHelper allowNonAdminSubGroupCreationProtocolHelper, C56942so r5, C84384Cd r6, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass33U r8, C64773Ex r9, AnonymousClass1VX r10, C50932j0 r11, AnonymousClass31C r12, AnonymousClass4FS r13, C73853gB r14) {
        C18260x0.A0f(r10, r13, r12, r9, r5);
        C162457s7.A0J(r6, 7);
        C18260x0.A0X(r8, r11, memberSuggestedGroupsManager);
        this.A0B = r10;
        this.A0H = r13;
        this.A0E = r12;
        this.A0A = r9;
        this.A06 = r5;
        this.A0I = r14;
        this.A07 = r6;
        this.A09 = r8;
        this.A0D = r11;
        this.A08 = memberSuggestedGroupsManager;
        this.A05 = allowNonAdminSubGroupCreationProtocolHelper;
    }

    public final void A0D(boolean z) {
        C616131n.A02((C85494Gl) null, new CommunitySettingsViewModel$onAllowNonAdminSubgroupCreationClick$1(this, (C84814Du) null, z), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }
}
