package com.whatsapp.community;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass30W;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass5V0;
import X.C06560Yg;
import X.C106405Yw;
import X.C107935c9;
import X.C108025cI;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C27991fJ;
import X.C54682p7;
import X.C626936e;
import X.C64773Ex;
import X.C69263Wi;
import X.C86604Kt;
import X.C89654ea;
import X.C95814uZ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.R;

public class CommunitySpamReportDialogFragment extends Hilt_CommunitySpamReportDialogFragment {
    public C69263Wi A00;
    public C64773Ex A01;
    public AnonymousClass30W A02;
    public C54682p7 A03;
    public AnonymousClass4FS A04;

    public Dialog A1J(Bundle bundle) {
        C89654ea r7 = (C89654ea) A0Q();
        C95814uZ A022 = C106405Yw.A02(A0H(), "jid");
        C626936e.A06(A022);
        String string = A0H().getString("spamFlow");
        AnonymousClass3ZH A0A = this.A01.A0A(A022);
        C54682p7 r1 = this.A03;
        boolean A1Y = AnonymousClass0x2.A1Y(string, A022);
        r1.A01(A022, string, 0);
        View A0H = C18310x6.A0H(LayoutInflater.from(A1D()), R.layout.f8nameremoved);
        TextView A0G = C18300x5.A0G(A0H, R.id.report_spam_dialog_message);
        CheckBox checkBox = (CheckBox) C06560Yg.A02(A0H, R.id.block_checkbox);
        C626936e.A06(r7);
        C19340zH A023 = AnonymousClass5V0.A02(r7, A0H);
        A023.A0B(R.string.f11nameremoved);
        A0G.setText(R.string.f11nameremoved);
        boolean z = A0H().getBoolean("shouldUpsellExit");
        if (z) {
            View findViewById = A0H.findViewById(R.id.block_checkbox_text);
            C626936e.A04(findViewById);
            ((TextView) findViewById).setText(R.string.f11nameremoved);
        } else {
            C86604Kt.A1B(A0H, R.id.block_container);
        }
        A023.setPositiveButton(R.string.f11nameremoved, new C108025cI(checkBox, r7, this, A0A, string, z));
        A023.setNegativeButton(R.string.f11nameremoved, new C107935c9(this, A022, string));
        AnonymousClass043 create = A023.create();
        create.setCanceledOnTouchOutside(A1Y);
        return create;
    }

    public static CommunitySpamReportDialogFragment A00(C27991fJ r3, boolean z) {
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, r3, "jid");
        A08.putString("spamFlow", "community_home");
        A08.putBoolean("shouldUpsellExit", z);
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = new CommunitySpamReportDialogFragment();
        communitySpamReportDialogFragment.A0u(A08);
        return communitySpamReportDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        String string = A0H().getString("spamFlow");
        C95814uZ A022 = C106405Yw.A02(A0H(), "jid");
        C626936e.A06(A022);
        this.A03.A00(A022, string);
    }
}
