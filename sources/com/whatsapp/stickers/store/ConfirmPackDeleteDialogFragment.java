package com.whatsapp.stickers.store;

import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass4I0;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C18310x6;
import X.C19340zH;
import X.C56932sn;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ConfirmPackDeleteDialogFragment extends Hilt_ConfirmPackDeleteDialogFragment {
    public C56932sn A00;

    public Dialog A1J(Bundle bundle) {
        C003203q A0Q = A0Q();
        String A0k = C18310x6.A0k(A0H(), "pack_id");
        String A0k2 = C18310x6.A0k(A0H(), "pack_name");
        AnonymousClass4I0 r4 = new AnonymousClass4I0(2, A0k, this);
        C19340zH A002 = AnonymousClass5V0.A00(A0Q);
        A002.A0Q(AnonymousClass0x7.A0m(this, A0k2, new Object[1], R.string.f11nameremoved));
        AnonymousClass0x2.A0t(r4, A002, R.string.f11nameremoved);
        AnonymousClass043 create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
