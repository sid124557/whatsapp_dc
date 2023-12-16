package com.whatsapp.community.subgroup.views;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass11H;
import X.AnonymousClass4GJ;
import X.AnonymousClass4GQ;
import X.AnonymousClass6C6;
import X.C009707r;
import X.C08270df;
import X.C111095hX;
import X.C111685iW;
import X.C116855qy;
import X.C117885se;
import X.C1220162t;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C27991fJ;
import X.C378924l;
import X.C64653Ej;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet;

public final class CommunityViewGroupsView extends FrameLayout implements AnonymousClass4GJ {
    public C111095hX A00;
    public C64653Ej A01;
    public C27991fJ A02;
    public C116855qy A03;
    public boolean A04;
    public final View A05;
    public final ListItemWithLeftIcon A06;
    public final AnonymousClass11H A07;

    public final void setActivityUtils$community_consumerBeta(C111095hX r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setCommunityNavigator$community_consumerBeta(C64653Ej r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    private final void setViewClickListener(C009707r r3) {
        C18290x4.A1I(this.A06, this, r3, 27);
    }

    private final void setViewGroupsCount(C009707r r4) {
        AnonymousClass6C6.A02(r4, this.A07.A0x, new C1220162t(r4, this), 149);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C111095hX getActivityUtils$community_consumerBeta() {
        C111095hX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("activityUtils");
    }

    public final C64653Ej getCommunityNavigator$community_consumerBeta() {
        C64653Ej r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityNavigator");
    }

    public CommunityViewGroupsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4U(this);
        }
    }

    public static final void setViewClickListener$lambda$0(CommunityViewGroupsView communityViewGroupsView, C009707r r7, View view) {
        C18260x0.A0O(communityViewGroupsView, r7);
        C64653Ej communityNavigator$community_consumerBeta = communityViewGroupsView.getCommunityNavigator$community_consumerBeta();
        C27991fJ r4 = communityViewGroupsView.A02;
        if (r4 == null) {
            throw C18270x1.A0S("parentJid");
        }
        C08270df supportFragmentManager = r7.getSupportFragmentManager();
        CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = new CommunityNewSubgroupSwitcherBottomSheet();
        C86604Kt.A18(AnonymousClass002.A08(), communityNewSubgroupSwitcherBottomSheet, r4, "community_jid");
        communityNavigator$community_consumerBeta.BpH(supportFragmentManager, r4, new C117885se(communityNewSubgroupSwitcherBottomSheet));
    }

    public static final void setViewGroupsCount$lambda$1(AnonymousClass4GQ r0, Object obj) {
        C86634Kw.A1W(r0, obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityViewGroupsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A04) {
            this.A04 = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4U(this);
        }
        C009707r r2 = (C009707r) C111095hX.A00(context);
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        C162457s7.A0D(inflate);
        this.A05 = inflate;
        this.A06 = (ListItemWithLeftIcon) C18280x3.A0E(inflate, R.id.community_view_groups_button);
        this.A07 = (AnonymousClass11H) AnonymousClass0x9.A0H(r2).A01(AnonymousClass11H.class);
        setViewGroupsCount(r2);
        setViewClickListener(r2);
    }

    public /* synthetic */ CommunityViewGroupsView(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityViewGroupsView(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
