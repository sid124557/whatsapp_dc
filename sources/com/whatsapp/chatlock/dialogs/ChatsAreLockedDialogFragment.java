package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass002;
import X.C100385As;
import X.C141996wT;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatsAreLockedDialogFragment extends Hilt_ChatsAreLockedDialogFragment {
    public static final void A00(Bundle bundle, ChatsAreLockedDialogFragment chatsAreLockedDialogFragment) {
        bundle.putBoolean("result", false);
        chatsAreLockedDialogFragment.A0U().A0n("request_key", bundle);
        chatsAreLockedDialogFragment.A1K();
    }

    public static final void A01(Bundle bundle, ChatsAreLockedDialogFragment chatsAreLockedDialogFragment) {
        bundle.putBoolean("result", true);
        chatsAreLockedDialogFragment.A0U().A0n("request_key", bundle);
        chatsAreLockedDialogFragment.A1K();
    }

    public Dialog A1J(Bundle bundle) {
        this.A04 = C141996wT.DESTRUCTIVE;
        Bundle A08 = AnonymousClass002.A08();
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0U(R.string.f11nameremoved);
        A0K.A0T(R.string.f11nameremoved);
        A0K.A0c(this, new C100385As(this, 4, A08), R.string.f11nameremoved);
        A0K.A0d(this, new C100385As(this, 5, A08), R.string.f11nameremoved);
        return C18300x5.A0H(A0K);
    }
}
