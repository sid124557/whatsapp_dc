package com.whatsapp.xfamily.crossposting.ui;

import X.AnonymousClass21S;
import X.AnonymousClass5IX;
import X.AnonymousClass5Yj;
import X.AnonymousClass6BW;
import X.C08310eF;
import X.C102505Jc;
import X.C103855Or;
import X.C106245Ye;
import X.C1235268t;
import X.C18270x1;
import X.C18300x5;
import X.C19340zH;
import X.C56042rK;
import X.C86624Kv;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class AutoShareNuxDialogFragment extends Hilt_AutoShareNuxDialogFragment {
    public static final AnonymousClass21S A03 = AnonymousClass21S.A06;
    public C56042rK A00;
    public boolean A01;
    public final C102505Jc A02;

    public AutoShareNuxDialogFragment(C102505Jc r1) {
        this.A02 = r1;
    }

    public Dialog A1J(Bundle bundle) {
        C103855Or r5 = new C103855Or(A0G());
        r5.A06 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        r5.A05 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        r5.A04 = Integer.valueOf(AnonymousClass5Yj.A03(A1D(), A0G(), R.attr.f3nameremoved, R.color.f5nameremoved));
        String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        C56042rK r1 = this.A00;
        if (r1 != null) {
            boolean A1Y = C86624Kv.A1Y(r1, A03);
            r5.A08.add(new AnonymousClass5IX(new AnonymousClass6BW(this, 2), string, A1Y));
            r5.A01 = 28;
            r5.A02 = 16;
            C19340zH A0M = C18300x5.A0M(this);
            A0M.A0a(r5.A00());
            C1235268t.A01(A0M, this, 143, R.string.f11nameremoved);
            C1235268t.A02(A0M, this, 142, R.string.f11nameremoved);
            A1P(false);
            C106245Ye.A00("AutoShareNuxDialogFragment Opening auto share nux dialog");
            return C18300x5.A0H(A0M);
        }
        throw C18270x1.A0S("fbAccountManager");
    }
}
