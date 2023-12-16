package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass002;
import X.C15930sC;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class UnarchiveForQuickLockDialogFragment extends Hilt_UnarchiveForQuickLockDialogFragment {
    public boolean A00;

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("UnarchiveForQuickLockDialogFragment_result_key", this.A00);
        A0U().A0n("UnarchiveForQuickLockDialogFragment_request_key", A08);
        super.onDismiss(dialogInterface);
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0T(R.string.f11nameremoved);
        A0K.A0c(this, (C15930sC) null, R.string.f11nameremoved);
        C19340zH.A04(this, A0K, 26, R.string.f11nameremoved);
        return C18300x5.A0H(A0K);
    }
}
