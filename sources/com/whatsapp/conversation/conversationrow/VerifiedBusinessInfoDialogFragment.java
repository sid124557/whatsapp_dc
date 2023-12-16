package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass4FV;
import X.AnonymousClass4I4;
import X.AnonymousClass5Y0;
import X.C107345b9;
import X.C111095hX;
import X.C18300x5;
import X.C19340zH;
import X.C66433Lk;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class VerifiedBusinessInfoDialogFragment extends Hilt_VerifiedBusinessInfoDialogFragment {
    public C111095hX A00;
    public AnonymousClass5Y0 A01;
    public AnonymousClass4FV A02;
    public C66433Lk A03;

    public Dialog A1J(Bundle bundle) {
        A0H();
        String string = this.A06.getString("message");
        int i = this.A06.getInt("system_action");
        C19340zH A0L = C18300x5.A0L(this);
        A0L.A0g(C107345b9.A05(A1D(), this.A01, string));
        A0L.A0i(true);
        A0L.A0X(new AnonymousClass4I4(this, i, 5), R.string.f11nameremoved);
        C19340zH.A07(A0L, this, 54, R.string.f11nameremoved);
        return A0L.create();
    }
}
