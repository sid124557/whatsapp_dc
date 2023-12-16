package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass34R;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4VR;
import X.AnonymousClass5UX;
import X.AnonymousClass5Y0;
import X.AnonymousClass64B;
import X.AnonymousClass6C6;
import X.C06560Yg;
import X.C08310eF;
import X.C105365Uq;
import X.C106905aM;
import X.C111095hX;
import X.C113935mE;
import X.C114015mM;
import X.C179208im;
import X.C18300x5;
import X.C18320x8;
import X.C27991fJ;
import X.C29331ie;
import X.C39602Cp;
import X.C50382i5;
import X.C53602nM;
import X.C56612sH;
import X.C59862xc;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C63693Ag;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.List;

public class JoinGroupBottomSheetFragment extends Hilt_JoinGroupBottomSheetFragment implements AnonymousClass64B {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public FrameLayout A05;
    public ImageButton A06;
    public ImageView A07;
    public ImageView A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ProgressBar A0D;
    public ScrollView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public C111095hX A0K;
    public C39602Cp A0L;
    public TextEmojiLabel A0M;
    public C50382i5 A0N;
    public WaTextView A0O;
    public C179208im A0P;
    public AnonymousClass4VR A0Q;
    public C113935mE A0R;
    public AnonymousClass5UX A0S;
    public C105365Uq A0T;
    public C114015mM A0U;
    public C53602nM A0V;
    public C620633i A0W;
    public C56612sH A0X;
    public C620733j A0Y;
    public C59862xc A0Z;
    public AnonymousClass5Y0 A0a;
    public AnonymousClass1VX A0b;
    public C29331ie A0c;
    public C27991fJ A0d;
    public C60152y5 A0e;
    public ReadMoreTextView A0f;
    public AnonymousClass4FS A0g;
    public WDSButton A0h;
    public WDSButton A0i;
    public List A0j;

    public static JoinGroupBottomSheetFragment A01(C27991fJ r5, UserJid userJid, String str, long j) {
        JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = new JoinGroupBottomSheetFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("use_case", 7);
        A082.putInt("surface_type", 2);
        A082.putString("invite_link_code", str);
        AnonymousClass0x2.A0v(A082, r5, "arg_group_jid");
        AnonymousClass0x2.A0v(A082, userJid, "group_admin_jid");
        A082.putLong("personal_invite_code_expiration", j);
        A082.putBoolean("invite_from_referrer", true);
        joinGroupBottomSheetFragment.A0u(A082);
        return joinGroupBottomSheetFragment;
    }

    public static JoinGroupBottomSheetFragment A02(String str, int i, boolean z) {
        JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = new JoinGroupBottomSheetFragment();
        Bundle A082 = AnonymousClass002.A08();
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else if (i != 3) {
                i2 = 9;
                if (i != 6) {
                    i2 = 0;
                }
            } else {
                i2 = 5;
            }
        }
        A082.putInt("use_case", i2);
        A082.putInt("surface_type", 1);
        A082.putString("invite_link_code", str);
        A082.putBoolean("invite_from_referrer", z);
        joinGroupBottomSheetFragment.A0u(A082);
        return joinGroupBottomSheetFragment;
    }

    public static JoinGroupBottomSheetFragment A00(GroupJid groupJid, GroupJid groupJid2, int i, int i2) {
        JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = new JoinGroupBottomSheetFragment();
        Bundle A082 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A082, groupJid, "arg_parent_group_jid");
        AnonymousClass0x2.A0v(A082, groupJid2, "arg_group_jid");
        A082.putInt("surface_type", i);
        int i3 = 3;
        if (i2 != 3) {
            i3 = 4;
            if (i2 == 6) {
                i3 = 8;
            }
        }
        A082.putInt("use_case", i3);
        joinGroupBottomSheetFragment.A0u(A082);
        return joinGroupBottomSheetFragment;
    }

    public final void A1a(int i) {
        if (i > 0) {
            TextView textView = this.A0J;
            Context context = textView.getContext();
            Object[] A0L2 = AnonymousClass002.A0L();
            boolean A1Y = C18300x5.A1Y(A0L2, i);
            AnonymousClass001.A0y(context, textView, A0L2, R.string.f11nameremoved);
            this.A0J.setVisibility(A1Y ? 1 : 0);
            return;
        }
        this.A0J.setVisibility(8);
    }

    public final void A1b(boolean z) {
        this.A0M.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        FrameLayout frameLayout = this.A05;
        int paddingLeft = frameLayout.getPaddingLeft();
        int paddingTop = this.A05.getPaddingTop();
        int paddingRight = this.A05.getPaddingRight();
        Resources A092 = C08310eF.A09(this);
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, A092.getDimensionPixelOffset(i));
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0h2 = C86664Kz.A0h(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A0E = (ScrollView) C06560Yg.A02(A0h2, R.id.join_group_bottom_sheet_content_scrollview);
        this.A05 = C86654Ky.A0L(A0h2, R.id.join_group_bottom_sheet_content_body);
        this.A02 = C06560Yg.A02(A0h2, R.id.join_group_bottom_sheet_join_button_container);
        this.A04 = C06560Yg.A02(A0h2, R.id.subgroup_info_container_loading);
        this.A03 = C06560Yg.A02(A0h2, R.id.subgroup_info_container_loaded);
        this.A00 = C06560Yg.A02(A0h2, R.id.subgroup_info_container_error);
        this.A0G = C18300x5.A0G(A0h2, R.id.subgroup_info_container_error_message);
        this.A0H = C18300x5.A0G(A0h2, R.id.join_group_bottom_sheet_retry_button);
        WaTextView A0L2 = AnonymousClass0x7.A0L(A0h2, R.id.join_group_bottom_sheet_group_title);
        this.A0O = A0L2;
        C106905aM.A04(A0L2);
        this.A07 = AnonymousClass0x9.A0E(A0h2, R.id.join_group_bottom_sheet_group_icon);
        this.A0I = C18300x5.A0G(A0h2, R.id.join_group_bottom_sheet_group_subtitle);
        this.A0F = C18300x5.A0G(A0h2, R.id.join_group_bottom_sheet_group_participant_count);
        this.A0f = (ReadMoreTextView) C06560Yg.A02(A0h2, R.id.join_group_bottom_sheet_description_text);
        this.A0M = AnonymousClass0x7.A0K(A0h2, R.id.join_group_bottom_sheet_disclaimer);
        this.A0h = C86654Ky.A0f(A0h2, R.id.join_group_bottom_sheet_join_button);
        this.A0D = (ProgressBar) C06560Yg.A02(A0h2, R.id.join_group_bottom_sheet_join_button_spinner);
        this.A0i = C86654Ky.A0f(A0h2, R.id.join_group_bottom_sheet_view_group);
        this.A06 = C86664Kz.A0t(A0h2, R.id.join_group_bottom_sheet_close_button);
        this.A01 = C06560Yg.A02(A0h2, R.id.join_group_contact_preview);
        this.A08 = AnonymousClass0x9.A0E(A0h2, R.id.join_group_contact_preview_icon_1);
        this.A09 = AnonymousClass0x9.A0E(A0h2, R.id.join_group_contact_preview_icon_2);
        this.A0A = AnonymousClass0x9.A0E(A0h2, R.id.join_group_contact_preview_icon_3);
        this.A0B = AnonymousClass0x9.A0E(A0h2, R.id.join_group_contact_preview_icon_4);
        this.A0C = AnonymousClass0x9.A0E(A0h2, R.id.join_group_contact_preview_icon_5);
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0j = A0s;
        A0s.add(this.A08);
        A0s.add(this.A09);
        A0s.add(this.A0A);
        A0s.add(this.A0B);
        this.A0j.add(this.A0C);
        this.A0J = C18300x5.A0G(A0h2, R.id.join_group_contact_count_view);
        return A0h2;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        String string = A0H().getString("arg_parent_group_jid");
        AnonymousClass34R r2 = C27991fJ.A01;
        this.A0d = r2.A07(string);
        C39602Cp r4 = this.A0L;
        int i = A0H().getInt("use_case");
        int i2 = A0H().getInt("surface_type");
        AnonymousClass4VR r1 = (AnonymousClass4VR) AnonymousClass4L0.A0F(new C63693Ag(r4, this.A0d, r2.A07(A0H().getString("arg_group_jid")), C86634Kw.A0l(A0H(), "group_admin_jid"), A0H().getString("invite_link_code"), i, i2, A0H().getLong("personal_invite_code_expiration", 0), A0H().getBoolean("invite_from_referrer")), this).A01(AnonymousClass4VR.class);
        r1.A0H(false);
        this.A0Q = r1;
        AnonymousClass6C6.A01(this, r1.A0g, 122);
        AnonymousClass6C6.A01(this, this.A0Q.A0a, 123);
        AnonymousClass6C6.A01(this, this.A0Q.A0b, 124);
        AnonymousClass6C6.A01(this, this.A0Q.A0Z, 125);
        AnonymousClass6C6.A01(this, this.A0Q.A0h, 126);
        AnonymousClass6C6.A01(this, this.A0Q.A0c, 127);
        AnonymousClass6C6.A01(this, this.A0Q.A0Y, 128);
        this.A0T = this.A0U.A06(A0G(), "join-group-bottom-sheet");
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        AnonymousClass6C6.A01(this, this.A0f.A09, 121);
        C18320x8.A13(this.A06, this, 32);
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof C179208im) {
            this.A0P = (C179208im) context;
        }
    }
}
