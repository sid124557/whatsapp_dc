package com.whatsapp;

import X.AnonymousClass490;
import X.C162457s7;
import X.C626936e;
import android.content.Context;

public final class MessageDialogFragment extends BaseMessageDialogFragment {
    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        C626936e.A0D(context instanceof AnonymousClass490, "Attached context should be of type OnClickListener, otherwise it will not receive click events.");
    }
}
