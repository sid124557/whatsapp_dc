package com.whatsapp;

import X.AnonymousClass4I1;
import X.C18300x5;
import X.C19340zH;
import X.C61072zf;
import android.app.Dialog;
import android.os.Bundle;

public class SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment extends Hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment {
    public C61072zf A00;

    public Dialog A1J(Bundle bundle) {
        C19340zH A0M = C18300x5.A0M(this);
        boolean A01 = C61072zf.A01();
        int i = R.string.f11nameremoved;
        if (A01) {
            i = R.string.f11nameremoved;
        }
        A0M.A0B(i);
        int i2 = R.string.f11nameremoved;
        if (A01) {
            i2 = R.string.f11nameremoved;
        }
        A0M.A0A(i2);
        A0M.setPositiveButton(R.string.f11nameremoved, new AnonymousClass4I1(3));
        return A0M.create();
    }
}
