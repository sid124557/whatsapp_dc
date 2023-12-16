package com.whatsapp;

import X.AnonymousClass4I8;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C111095hX;
import X.C19340zH;
import X.C66433Lk;
import android.app.Dialog;
import android.os.Bundle;

public class DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment extends Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment {
    public C111095hX A00;
    public C66433Lk A01;

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0i(true);
        C19340zH.A06(A002);
        A002.A0W(new AnonymousClass4I8(A0R, 0, this), R.string.f11nameremoved);
        return A002.create();
    }
}
