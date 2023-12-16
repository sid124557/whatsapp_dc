package com.whatsapp.xfamily.crossposting.ui;

import X.AnonymousClass0x7;
import X.AnonymousClass5YI;
import X.C08310eF;
import X.C102425Iu;
import X.C103855Or;
import X.C106245Ye;
import X.C1235268t;
import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.whatsapp.R;

public final class AudienceNuxDialogFragment extends Hilt_AudienceNuxDialogFragment {
    public final C102425Iu A00;

    public AudienceNuxDialogFragment(C102425Iu r1) {
        this.A00 = r1;
    }

    public Dialog A1J(Bundle bundle) {
        C103855Or r3 = new C103855Or(A0G());
        r3.A03 = Integer.valueOf(R.drawable.vec_xfamily_xp_nux_illustration);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AnonymousClass5YI.A04(A0G(), 260.0f), AnonymousClass5YI.A04(A0G(), 148.0f));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = AnonymousClass5YI.A04(A0G(), 20.0f);
        r3.A00 = layoutParams;
        r3.A06 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        r3.A05 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        r3.A02 = AnonymousClass0x7.A0h();
        C19340zH A0M = C18300x5.A0M(this);
        A0M.A0a(r3.A00());
        C1235268t.A02(A0M, this, 140, R.string.f11nameremoved);
        C1235268t.A01(A0M, this, 141, R.string.f11nameremoved);
        A1P(false);
        C106245Ye.A00("AudienceNuxDialogFragment Opening audience nux fragment");
        return C18300x5.A0H(A0M);
    }
}
