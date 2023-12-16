package com.whatsapp.groupenforcements.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass34R;
import X.AnonymousClass4AU;
import X.AnonymousClass4TJ;
import X.AnonymousClass7ZR;
import X.C003203q;
import X.C06560Yg;
import X.C106715a2;
import X.C139936st;
import X.C140006t0;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C27991fJ;
import X.C45242Zg;
import X.C620633i;
import X.C634239e;
import X.C635439q;
import X.C70103Zx;
import X.C70343aL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class GroupSuspendBottomSheet extends Hilt_GroupSuspendBottomSheet {
    public C620633i A00;
    public AnonymousClass1VX A01;
    public AnonymousClass4AU A02;
    public C45242Zg A03;
    public C106715a2 A04;

    public static GroupSuspendBottomSheet A00(AnonymousClass4AU r2, C27991fJ r3, boolean z, boolean z2) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("hasMe", z);
        A08.putBoolean("isMeAdmin", z2);
        AnonymousClass0x2.A0v(A08, r3, "suspendedEntityId");
        GroupSuspendBottomSheet groupSuspendBottomSheet = new GroupSuspendBottomSheet();
        groupSuspendBottomSheet.A0u(A08);
        groupSuspendBottomSheet.A02 = r2;
        return groupSuspendBottomSheet;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        C003203q A0R2 = A0R();
        Bundle A0H = A0H();
        C27991fJ A042 = AnonymousClass34R.A04(A0H.getString("suspendedEntityId"));
        boolean z = A0H.getBoolean("hasMe");
        boolean z2 = A0H.getBoolean("isMeAdmin");
        ((WDSProfilePhoto) C06560Yg.A02(A0R, R.id.group_suspend_bottomsheet_profile_photo)).setProfileBadge(new C140006t0(new AnonymousClass7ZR(R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved, R.dimen.f6nameremoved), new C139936st(R.color.f5nameremoved, R.color.f5nameremoved), R.drawable.ic_spam_block));
        TextView A0G = C18300x5.A0G(A0R, R.id.group_suspend_bottomsheet_learn_more);
        A0G.setText(this.A04.A05(A0G.getContext(), new C70103Zx(this, 40, A0R2), AnonymousClass0x7.A0n(this, "learn-more", AnonymousClass002.A0L(), 0, R.string.f11nameremoved), "learn-more"));
        C18270x1.A0q(A0G, this.A01);
        C06560Yg.A0O(A0G, new AnonymousClass4TJ(A0G, this.A00));
        if (z2 && z) {
            TextView A0G2 = C18300x5.A0G(A0R, R.id.group_suspend_bottomsheet_support);
            A0G2.setVisibility(0);
            A0G2.setText(this.A04.A05(A0G2.getContext(), new C70343aL(this, A0R2, A042, 34), C18310x6.A0m(this, "learn-more", R.string.f11nameremoved), "learn-more"));
            C18270x1.A0q(A0G2, this.A01);
            C06560Yg.A0O(A0G2, new AnonymousClass4TJ(A0G2, this.A00));
        }
        C18300x5.A0G(A0R, R.id.group_suspend_bottomsheet_messaging_info).setText(R.string.f11nameremoved);
        C06560Yg.A02(A0R, R.id.group_suspend_bottomsheet_delete_group_button).setOnClickListener(new C634239e(7, this, z));
        C635439q.A00(C06560Yg.A02(A0R, R.id.group_suspend_bottomsheet_see_group_button), this, 19);
        return A0R;
    }
}
