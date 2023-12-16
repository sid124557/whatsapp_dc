package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass001;
import X.C106715a2;
import X.C620633i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealUnbannedDecisionFragment extends Hilt_BanAppealUnbannedDecisionFragment {
    public C620633i A00;
    public BanAppealViewModel A01;
    public C106715a2 A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A0K(bundle, layoutInflater, viewGroup);
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            super.A0w(r14, r15)
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r0 = X.C18280x3.A0P(r13)
            r13.A01 = r0
            X.03q r0 = r13.A0R()
            r4 = 0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel.A00(r0, r4)
            r0 = 2131427884(0x7f0b022c, float:1.8477397E38)
            android.widget.ImageView r2 = X.AnonymousClass0x9.A0E(r15, r0)
            android.content.res.Resources r1 = X.C08310eF.A09(r13)
            r0 = 2131232912(0x7f080890, float:1.8081947E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setImageDrawable(r0)
            r0 = 2131430563(0x7f0b0ca3, float:1.848283E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r15, r0)
            r0 = 2131894559(0x7f12211f, float:1.9423926E38)
            r1.setText(r0)
            r0 = 2131434055(0x7f0b1a47, float:1.8489913E38)
            com.whatsapp.TextEmojiLabel r3 = X.AnonymousClass0x7.A0K(r15, r0)
            r0 = 2131434056(0x7f0b1a48, float:1.8489915E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r15, r0)
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r5 = r13.A01
            X.2na r0 = r5.A09
            X.33p r0 = r0.A04
            X.8qC r8 = r0.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r8)
            java.lang.String r0 = "support_ban_appeal_unban_reason"
            java.lang.String r6 = X.C18280x3.A0Z(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BanAppealRepository/getUnbanReason "
            X.C18260x0.A0s(r0, r6, r1)
            java.lang.String r7 = "OOPS"
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L_0x007e
            r6 = r7
        L_0x0066:
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r8)
            java.lang.String r0 = "support_ban_appeal_unban_reason_url"
            r8 = 0
            java.lang.String r9 = r1.getString(r0, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BanAppealRepository/getUnbanReasonUrl "
            X.C18260x0.A0s(r0, r9, r1)
            if (r9 == 0) goto L_0x0095
            goto L_0x0081
        L_0x007e:
            java.lang.String r6 = "OTHER"
            goto L_0x0066
        L_0x0081:
            X.5X8 r0 = r5.A04     // Catch:{ Exception -> 0x008c }
            android.net.Uri r0 = r0.A00(r9)     // Catch:{ Exception -> 0x008c }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r6, r0)     // Catch:{ Exception -> 0x008c }
            goto L_0x00a7
        L_0x008c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BanAppealViewModel/getUnbanReasonData Exception when creating uri from unban reason url: "
            X.C18260x0.A0r(r0, r9, r1)
        L_0x0095:
            boolean r0 = r7.equals(r6)
            X.3Lk r5 = r5.A08
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = "android"
            android.net.Uri r0 = r5.A02(r8, r0, r8, r8)
        L_0x00a3:
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r6, r0)
        L_0x00a7:
            java.lang.Object r0 = r1.first
            java.lang.Object r6 = r1.second
            boolean r0 = r7.equals(r0)
            r5 = 8
            if (r0 == 0) goto L_0x00e7
            r0 = 2131894560(0x7f122120, float:1.9423928E38)
            r3.setText(r0)
            r2.setVisibility(r4)
            r0 = 2131894562(0x7f122122, float:1.9423932E38)
            r2.setText(r0)
        L_0x00c2:
            r0 = 2131427477(0x7f0b0095, float:1.8476571E38)
            android.view.View r0 = X.C06560Yg.A02(r15, r0)
            r0.setVisibility(r5)
            r0 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r15, r0)
            r2.setVisibility(r4)
            r0 = 2131894563(0x7f122123, float:1.9423934E38)
            r2.setText(r0)
            r1 = 26
            X.5eY r0 = new X.5eY
            r0.<init>(r13, r1)
            r2.setOnClickListener(r0)
            return
        L_0x00e7:
            X.5a2 r7 = r13.A02
            android.content.Context r8 = r3.getContext()
            r1 = 2131894561(0x7f122121, float:1.942393E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r13)
            java.lang.String r9 = r0.getString(r1)
            java.lang.String r0 = "using-whatsapp-responsibly-link"
            java.lang.String[] r11 = new java.lang.String[]{r0}
            r0 = 1
            java.lang.String[] r12 = new java.lang.String[r0]
            X.AnonymousClass0x7.A1E(r6, r12, r4)
            java.lang.Runnable[] r10 = new java.lang.Runnable[r0]
            r1 = 27
            X.8Lw r0 = new X.8Lw
            r0.<init>(r1)
            r10[r4] = r0
            android.text.SpannableString r1 = r7.A04(r8, r9, r10, r11, r12)
            X.33i r0 = r13.A00
            X.AnonymousClass0x2.A12(r3, r0)
            X.1VX r0 = r13.A05
            X.AnonymousClass0x2.A14(r0, r3)
            r3.setText(r1)
            r2.setVisibility(r5)
            goto L_0x00c2
        L_0x0125:
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "how-to-use-whatsapp-responsibly"
            android.net.Uri r0 = r5.A04(r1, r0)
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment.A0w(android.os.Bundle, android.view.View):void");
    }
}
