package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass2I0;
import X.AnonymousClass4I1;
import X.C08310eF;
import X.C103855Or;
import X.C18300x5;
import X.C19340zH;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class OldDeviceMoveAccountConfirmationDialogFragment extends Hilt_OldDeviceMoveAccountConfirmationDialogFragment {
    public final AnonymousClass2I0 A00;

    public OldDeviceMoveAccountConfirmationDialogFragment(AnonymousClass2I0 r1) {
        this.A00 = r1;
    }

    public Dialog A1J(Bundle bundle) {
        C103855Or r2 = new C103855Or(A1D());
        r2.A02 = 20;
        r2.A06 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        r2.A05 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        C19340zH A0M = C18300x5.A0M(this);
        A0M.A0a(r2.A00());
        C85804Hr.A01(A0M, this, 89, R.string.f11nameremoved);
        A0M.setNegativeButton(R.string.f11nameremoved, new AnonymousClass4I1(17));
        return A0M.create();
    }
}
