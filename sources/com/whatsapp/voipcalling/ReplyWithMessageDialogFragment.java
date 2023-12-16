package com.whatsapp.voipcalling;

import X.AnonymousClass043;
import X.AnonymousClass4I8;
import X.AnonymousClass7SF;
import X.C18260x0;
import X.C18280x3;
import X.C19340zH;
import X.C56612sH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class ReplyWithMessageDialogFragment extends Hilt_ReplyWithMessageDialogFragment {
    public static final int[] A04 = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public AnonymousClass7SF A00;
    public C56612sH A01;
    public final UserJid A02;
    public final String A03;

    public ReplyWithMessageDialogFragment(UserJid userJid, String str) {
        C18260x0.A0Q(userJid, str);
        this.A02 = userJid;
        this.A03 = str;
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        String[] A0V = this.A01.A0V(A04);
        A0K.A0J(new AnonymousClass4I8(A0V, 22, this), A0V);
        AnonymousClass043 create = A0K.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
