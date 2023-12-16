package com.whatsapp.voipcalling;

import X.C18280x3;
import X.C184988ss;
import X.C19340zH;
import X.C66433Lk;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class WASecuredDialogFragment extends Hilt_WASecuredDialogFragment {
    public C184988ss A00;
    public C66433Lk A01;

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0A(R.string.f11nameremoved);
        C85804Hr.A00(A0K, this, 121, R.string.f11nameremoved);
        A0K.A0X(new C85804Hr(this, 122), R.string.f11nameremoved);
        return A0K.create();
    }
}
