package com.whatsapp;

import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment extends Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment {
    public Dialog A1J(Bundle bundle) {
        C19340zH A0M = C18300x5.A0M(this);
        A0M.A0U(R.string.f11nameremoved);
        A0M.A0T(R.string.device_unsupported);
        A0M.A0i(false);
        C19340zH.A06(A0M);
        return A0M.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C18300x5.A1A(this);
    }
}
