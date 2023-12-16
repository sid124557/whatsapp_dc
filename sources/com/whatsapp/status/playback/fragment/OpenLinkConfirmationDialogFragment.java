package com.whatsapp.status.playback.fragment;

import X.AnonymousClass69K;
import X.C1235268t;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class OpenLinkConfirmationDialogFragment extends Hilt_OpenLinkConfirmationDialogFragment {
    public boolean A1T() {
        return true;
    }

    public Dialog A1J(Bundle bundle) {
        String string = A0H().getString("url");
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0B(R.string.f11nameremoved);
        A0K.A0Q(string);
        C1235268t.A01(A0K, this, 126, R.string.f11nameremoved);
        A0K.setPositiveButton(R.string.f11nameremoved, new AnonymousClass69K(3, string, this));
        return C18300x5.A0H(A0K);
    }
}
