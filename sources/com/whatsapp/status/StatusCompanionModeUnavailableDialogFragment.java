package com.whatsapp.status;

import X.AnonymousClass5V0;
import X.C003203q;
import X.C08310eF;
import X.C162457s7;
import X.C18300x5;
import X.C19340zH;
import X.C85324Fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class StatusCompanionModeUnavailableDialogFragment extends WaDialogFragment {
    public C85324Fu A00;

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C85324Fu r0 = this.A00;
        if (r0 != null) {
            r0.BR7(this, false);
        }
    }

    public Dialog A1J(Bundle bundle) {
        C85324Fu r0 = this.A00;
        if (r0 != null) {
            r0.BR7(this, true);
        }
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            C19340zH A002 = AnonymousClass5V0.A00(A0Q);
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            A002.A0i(true);
            C19340zH.A08(A002, this, 94, R.string.f11nameremoved);
            return C18300x5.A0H(A002);
        }
        throw C18300x5.A0X();
    }

    public void A0a() {
        super.A0a();
        this.A00 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        try {
            C08310eF A0N = A0N();
            C162457s7.A0K(A0N, "null cannot be cast to non-null type com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment.Host");
            this.A00 = (C85324Fu) A0N;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
