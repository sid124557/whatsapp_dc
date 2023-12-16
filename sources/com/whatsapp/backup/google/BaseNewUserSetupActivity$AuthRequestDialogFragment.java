package com.whatsapp.backup.google;

import X.AnonymousClass0E2;
import X.C003203q;
import X.C08310eF;
import X.C17780wE;
import X.C18390xG;
import X.C626936e;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class BaseNewUserSetupActivity$AuthRequestDialogFragment extends Hilt_BaseNewUserSetupActivity_AuthRequestDialogFragment {
    /* access modifiers changed from: private */
    public /* synthetic */ void A00() {
        C003203q A0Q = A0Q();
        C626936e.A06(A0Q);
        ((AnonymousClass0E2) A0Q).A0U = true;
    }

    public Dialog A1J(Bundle bundle) {
        C18390xG r3 = new C18390xG(A1D());
        r3.setTitle(R.string.f11nameremoved);
        r3.setIndeterminate(true);
        r3.setMessage(C08310eF.A09(this).getString(R.string.f11nameremoved));
        r3.setCancelable(true);
        r3.setOnCancelListener(new C17780wE(this, 2));
        return r3;
    }
}
