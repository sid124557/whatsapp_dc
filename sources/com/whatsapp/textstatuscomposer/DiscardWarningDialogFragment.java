package com.whatsapp.textstatuscomposer;

import X.AnonymousClass002;
import X.C107955cB;
import X.C18280x3;
import X.C19340zH;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class DiscardWarningDialogFragment extends Hilt_DiscardWarningDialogFragment {
    public static DiscardWarningDialogFragment A00(int i, boolean z) {
        DiscardWarningDialogFragment discardWarningDialogFragment = new DiscardWarningDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("content", i);
        A08.putBoolean("back_button_pressed", z);
        discardWarningDialogFragment.A0u(A08);
        return discardWarningDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        int i = A0H().getInt("content", 1);
        boolean z = A0H().getBoolean("back_button_pressed", false);
        int i2 = R.string.f11nameremoved;
        if (i == 1) {
            i2 = R.string.f11nameremoved;
        }
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0A(i2);
        C85804Hr.A00(A0K, this, 104, R.string.f11nameremoved);
        A0K.setPositiveButton(R.string.f11nameremoved, new C107955cB(this, i, z));
        return A0K.create();
    }
}
