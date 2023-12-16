package com.whatsapp.invites;

import X.C18320x8;
import X.C19340zH;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class NobodyDeprecatedDialogFragment extends Hilt_NobodyDeprecatedDialogFragment {
    public Dialog A1J(Bundle bundle) {
        C19340zH A0H = C18320x8.A0H(this);
        A0H.A0A(R.string.f11nameremoved);
        C85804Hr r2 = new C85804Hr(this, 67);
        C85804Hr r1 = new C85804Hr(this, 68);
        A0H.setPositiveButton(R.string.f11nameremoved, r2);
        A0H.setNegativeButton(R.string.f11nameremoved, r1);
        return A0H.create();
    }
}
