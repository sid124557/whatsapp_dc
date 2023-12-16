package com.whatsapp.companiondevice;

import X.AnonymousClass2FO;
import X.C18320x8;
import X.C19340zH;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class WifiSpeedBumpDialogFragment extends Hilt_WifiSpeedBumpDialogFragment {
    public AnonymousClass2FO A00;

    public Dialog A1J(Bundle bundle) {
        C19340zH A0H = C18320x8.A0H(this);
        A0H.A0U(R.string.f11nameremoved);
        A0H.A0T(R.string.f11nameremoved);
        C19340zH.A08(A0H, this, 45, R.string.f11nameremoved);
        A0H.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        return A0H.create();
    }
}
