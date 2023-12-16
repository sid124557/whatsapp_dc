package com.whatsapp.invites;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass32Y;
import X.AnonymousClass3ZH;
import X.AnonymousClass4I8;
import X.AnonymousClass5V0;
import X.AnonymousClass5ZU;
import X.C003203q;
import X.C18300x5;
import X.C19340zH;
import X.C30391mN;
import X.C626936e;
import X.C64773Ex;
import X.C83864Ac;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class RevokeInviteDialogFragment extends Hilt_RevokeInviteDialogFragment {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;
    public C83864Ac A02;

    public static RevokeInviteDialogFragment A00(UserJid userJid, C30391mN r6) {
        RevokeInviteDialogFragment revokeInviteDialogFragment = new RevokeInviteDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("jid", C18300x5.A0i(userJid));
        A08.putLong("invite_row_id", r6.A1L);
        revokeInviteDialogFragment.A0u(A08);
        return revokeInviteDialogFragment;
    }

    public void A0d() {
        super.A0d();
        this.A02 = null;
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof C83864Ac) {
            this.A02 = (C83864Ac) context;
        }
    }

    public Dialog A1J(Bundle bundle) {
        Bundle A0H = A0H();
        C003203q A0R = A0R();
        UserJid A08 = AnonymousClass32Y.A08(A0H.getString("jid"));
        C626936e.A06(A08);
        AnonymousClass3ZH A0A = this.A00.A0A(A08);
        AnonymousClass4I8 r5 = new AnonymousClass4I8(A08, 17, this);
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        A002.A0Q(AnonymousClass0x7.A0m(this, C18300x5.A0h(this.A01, A0A), new Object[1], R.string.f11nameremoved));
        AnonymousClass0x2.A0t(r5, A002, R.string.f11nameremoved);
        AnonymousClass043 create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
