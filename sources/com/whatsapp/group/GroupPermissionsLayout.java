package com.whatsapp.group;

import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5X8;
import X.C106715a2;
import X.C111095hX;
import X.C116855qy;
import X.C162457s7;
import X.C167127zo;
import X.C179378j3;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C48192eV;
import X.C620733j;
import X.C64333Db;
import X.C70003Zm;
import X.C86624Kv;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class GroupPermissionsLayout extends LinearLayout implements AnonymousClass4GJ {
    public SwitchCompat A00;
    public SwitchCompat A01;
    public SwitchCompat A02;
    public SwitchCompat A03;
    public SwitchCompat A04;
    public C111095hX A05;
    public ListItemWithLeftIcon A06;
    public ListItemWithLeftIcon A07;
    public ListItemWithLeftIcon A08;
    public ListItemWithLeftIcon A09;
    public ListItemWithLeftIcon A0A;
    public ListItemWithLeftIcon A0B;
    public ListItemWithLeftIcon A0C;
    public AnonymousClass5X8 A0D;
    public WaTextView A0E;
    public C620733j A0F;
    public AnonymousClass1VX A0G;
    public C48192eV A0H;
    public C106715a2 A0I;
    public C116855qy A0J;
    public boolean A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A00();
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A0G = r2;
    }

    public final void setActivityUtils(C111095hX r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setClickEventListener(C179378j3 r4) {
        C162457s7.A0J(r4, 0);
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            throw C18270x1.A0S("editGroupInfoSwitch");
        }
        switchCompat.setOnCheckedChangeListener(new C167127zo(r4, 1));
        SwitchCompat switchCompat2 = this.A04;
        if (switchCompat2 == null) {
            throw C18270x1.A0S("sendMessagesSwitch");
        }
        switchCompat2.setOnCheckedChangeListener(new C167127zo(r4, 2));
        SwitchCompat switchCompat3 = this.A01;
        if (switchCompat3 == null) {
            throw C18270x1.A0S("memberAddModeSwitch");
        }
        switchCompat3.setOnCheckedChangeListener(new C167127zo(r4, 4));
        SwitchCompat switchCompat4 = this.A02;
        if (switchCompat4 == null) {
            throw C18270x1.A0S("membershipApprovalRequiredSwitch");
        }
        switchCompat4.setOnCheckedChangeListener(new C167127zo(r4, 3));
        SwitchCompat switchCompat5 = this.A03;
        if (switchCompat5 == null) {
            throw C18270x1.A0S("reportToAdminSwitch");
        }
        switchCompat5.setOnCheckedChangeListener(new C167127zo(r4, 5));
        ListItemWithLeftIcon listItemWithLeftIcon = this.A08;
        if (listItemWithLeftIcon == null) {
            throw C18270x1.A0S("manageHistoryView");
        }
        C18310x6.A18(listItemWithLeftIcon, r4, 41);
    }

    public final void setLinkifier(C106715a2 r2) {
        C162457s7.A0J(r2, 0);
        this.A0I = r2;
    }

    public final void setPinInChatExperimentUtils(C48192eV r2) {
        C162457s7.A0J(r2, 0);
        this.A0H = r2;
    }

    public final void setWaLinkFactory(AnonymousClass5X8 r2) {
        C162457s7.A0J(r2, 0);
        this.A0D = r2;
    }

    public final void setWaLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A0F = r2;
    }

    public void A00() {
        if (!this.A0K) {
            this.A0K = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            setAbProps(C64333Db.A4B(A002));
            setLinkifier(C18280x3.A0Q(A002.A00));
            setWaLocale(C64333Db.A2t(A002));
            setActivityUtils(C64333Db.A00(A002));
            setWaLinkFactory((AnonymousClass5X8) A002.Aac.get());
            setPinInChatExperimentUtils(A002.ApS());
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0J;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0J = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C111095hX getActivityUtils() {
        C111095hX r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("activityUtils");
    }

    public final C106715a2 getLinkifier() {
        C106715a2 r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifier");
    }

    public final C48192eV getPinInChatExperimentUtils() {
        C48192eV r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("pinInChatExperimentUtils");
    }

    public final AnonymousClass5X8 getWaLinkFactory() {
        AnonymousClass5X8 r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waLinkFactory");
    }

    public final C620733j getWaLocale() {
        C620733j r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waLocale");
    }

    public void onFinishInflate() {
        int i;
        super.onFinishInflate();
        this.A0C = (ListItemWithLeftIcon) C18290x4.A0M(this, R.id.restricted_mode_layout);
        WDSSwitch wDSSwitch = new WDSSwitch(C18290x4.A0F(this), (AttributeSet) null, R.attr.f3nameremoved);
        this.A00 = wDSSwitch;
        wDSSwitch.setId(R.id.edit_group_settings_switch);
        ListItemWithLeftIcon listItemWithLeftIcon = this.A0C;
        if (listItemWithLeftIcon == null) {
            throw C18270x1.A0S("restrictGroupPermissions");
        }
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            throw C18270x1.A0S("editGroupInfoSwitch");
        }
        listItemWithLeftIcon.A07(switchCompat);
        this.A06 = (ListItemWithLeftIcon) C18290x4.A0M(this, R.id.announcement_group_layout);
        WDSSwitch wDSSwitch2 = new WDSSwitch(C18290x4.A0F(this), (AttributeSet) null, R.attr.f3nameremoved);
        this.A04 = wDSSwitch2;
        wDSSwitch2.setId(R.id.send_messages_switch);
        ListItemWithLeftIcon listItemWithLeftIcon2 = this.A06;
        if (listItemWithLeftIcon2 == null) {
            throw C18270x1.A0S("announcementGroupSetting");
        }
        SwitchCompat switchCompat2 = this.A04;
        if (switchCompat2 == null) {
            throw C18270x1.A0S("sendMessagesSwitch");
        }
        listItemWithLeftIcon2.A07(switchCompat2);
        this.A09 = (ListItemWithLeftIcon) C18290x4.A0M(this, R.id.member_add_mode_layout);
        WDSSwitch wDSSwitch3 = new WDSSwitch(C18290x4.A0F(this), (AttributeSet) null, R.attr.f3nameremoved);
        this.A01 = wDSSwitch3;
        wDSSwitch3.setId(R.id.member_add_mode_switch);
        ListItemWithLeftIcon listItemWithLeftIcon3 = this.A09;
        if (listItemWithLeftIcon3 == null) {
            throw C18270x1.A0S("memberAddModeSetting");
        }
        SwitchCompat switchCompat3 = this.A01;
        if (switchCompat3 == null) {
            throw C18270x1.A0S("memberAddModeSwitch");
        }
        listItemWithLeftIcon3.A07(switchCompat3);
        this.A0A = (ListItemWithLeftIcon) C18290x4.A0M(this, R.id.require_membership_approval);
        WDSSwitch wDSSwitch4 = new WDSSwitch(C18290x4.A0F(this), (AttributeSet) null, R.attr.f3nameremoved);
        this.A02 = wDSSwitch4;
        wDSSwitch4.setId(R.id.group_require_membership_approval_switch);
        ListItemWithLeftIcon listItemWithLeftIcon4 = this.A0A;
        if (listItemWithLeftIcon4 == null) {
            throw C18270x1.A0S("membershipApprovalRequiredSetting");
        }
        SwitchCompat switchCompat4 = this.A02;
        if (switchCompat4 == null) {
            throw C18270x1.A0S("membershipApprovalRequiredSwitch");
        }
        listItemWithLeftIcon4.A07(switchCompat4);
        ListItemWithLeftIcon listItemWithLeftIcon5 = this.A0A;
        if (listItemWithLeftIcon5 == null) {
            throw C18270x1.A0S("membershipApprovalRequiredSetting");
        }
        C106715a2 linkifier = getLinkifier();
        ListItemWithLeftIcon listItemWithLeftIcon6 = this.A0A;
        if (listItemWithLeftIcon6 == null) {
            throw C18270x1.A0S("membershipApprovalRequiredSetting");
        }
        Context context = listItemWithLeftIcon6.getContext();
        String string = getContext().getString(R.string.f11nameremoved);
        ListItemWithLeftIcon listItemWithLeftIcon7 = this.A0A;
        if (listItemWithLeftIcon7 == null) {
            throw C18270x1.A0S("membershipApprovalRequiredSetting");
        }
        listItemWithLeftIcon5.A06(linkifier.A06(context, new C70003Zm(this, 11), string, "", C18290x4.A00(listItemWithLeftIcon7.getContext())), true);
        this.A0B = (ListItemWithLeftIcon) C18290x4.A0M(this, R.id.report_to_admin_row);
        WDSSwitch wDSSwitch5 = new WDSSwitch(C18290x4.A0F(this), (AttributeSet) null, R.attr.f3nameremoved);
        this.A03 = wDSSwitch5;
        wDSSwitch5.setId(R.id.group_report_to_admin_switch);
        ListItemWithLeftIcon listItemWithLeftIcon8 = this.A0B;
        if (listItemWithLeftIcon8 == null) {
            throw C18270x1.A0S("reportToAdminSetting");
        }
        SwitchCompat switchCompat5 = this.A03;
        if (switchCompat5 == null) {
            throw C18270x1.A0S("reportToAdminSwitch");
        }
        listItemWithLeftIcon8.A07(switchCompat5);
        View findViewById = findViewById(R.id.admins_can_section_title);
        C162457s7.A0K(findViewById, "null cannot be cast to non-null type android.view.View");
        findViewById.setVisibility(0);
        this.A07 = (ListItemWithLeftIcon) C18290x4.A0M(this, R.id.manage_admins);
        this.A0E = (WaTextView) C18290x4.A0M(this, R.id.general_section_title);
        this.A08 = (ListItemWithLeftIcon) C18290x4.A0M(this, R.id.manage_history);
        boolean A0X = getAbProps().A0X(3088);
        if (getPinInChatExperimentUtils().A00.A0X(3140)) {
            i = R.string.f11nameremoved;
            if (A0X) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
            if (A0X) {
                i = R.string.f11nameremoved;
            }
        }
        ListItemWithLeftIcon listItemWithLeftIcon9 = this.A0C;
        if (listItemWithLeftIcon9 == null) {
            throw C18270x1.A0S("restrictGroupPermissions");
        }
        listItemWithLeftIcon9.setDescription((CharSequence) C86624Kv.A0b(this, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A00();
    }

    public GroupPermissionsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPermissionsLayout(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A00();
    }
}
