package com.whatsapp;

import X.AnonymousClass4I1;
import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;

public class SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment extends Hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment {
    public Dialog A1J(Bundle bundle) {
        C19340zH A0M = C18300x5.A0M(this);
        A0M.A0B(R.string.f11nameremoved);
        A0M.A0A(R.string.f11nameremoved);
        A0M.setPositiveButton(R.string.f11nameremoved, new AnonymousClass4I1(2));
        return A0M.create();
    }
}
