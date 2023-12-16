package com.whatsapp.chatlock;

import X.AnonymousClass002;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;

public final class ChatNowLockedDialogFragment extends Hilt_ChatNowLockedDialogFragment {
    public boolean A00 = true;

    public static final void A00(ChatNowLockedDialogFragment chatNowLockedDialogFragment) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("ChatNowLockedDialogFragment_result_key", true);
        chatNowLockedDialogFragment.A0U().A0n("ChatNowLockedDialogFragment_request_key", A08);
        chatNowLockedDialogFragment.A00 = false;
        chatNowLockedDialogFragment.A1K();
    }

    public void A0a() {
        if (this.A00) {
            Bundle A08 = AnonymousClass002.A08();
            A08.putBoolean("ChatNowLockedDialogFragment_result_key", false);
            A0U().A0n("ChatNowLockedDialogFragment_request_key", A08);
            this.A00 = false;
        }
        super.A0a();
    }

    public Dialog A1J(Bundle bundle) {
        View A0H = C18310x6.A0H(LayoutInflater.from(A1D()), R.layout.f8nameremoved);
        Context A1D = A1D();
        if (A1D != null) {
            int dimensionPixelSize = A1D.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            A0H.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0a(A0H);
        C19340zH.A03(this, A0K, 22, R.string.f11nameremoved);
        C19340zH.A04(this, A0K, 23, R.string.f11nameremoved);
        return C18300x5.A0H(A0K);
    }
}
