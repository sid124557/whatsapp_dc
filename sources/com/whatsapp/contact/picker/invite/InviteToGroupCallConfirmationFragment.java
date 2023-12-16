package com.whatsapp.contact.picker.invite;

import X.AnonymousClass043;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass32Y;
import X.AnonymousClass4I8;
import X.AnonymousClass5V0;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.C003203q;
import X.C107575bX;
import X.C18300x5;
import X.C19340zH;
import X.C626936e;
import X.C64773Ex;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class InviteToGroupCallConfirmationFragment extends Hilt_InviteToGroupCallConfirmationFragment {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;

    public Dialog A1J(Bundle bundle) {
        UserJid A08 = AnonymousClass32Y.A08(A0H().getString("peer_id"));
        C626936e.A07(A08, "null peer jid");
        C003203q A0Q = A0Q();
        C19340zH A002 = AnonymousClass5V0.A00(A0Q);
        A002.setTitle(AnonymousClass0x7.A0n(this, C18300x5.A0h(this.A01, this.A00.A0A(A08)), new Object[1], 0, R.string.f11nameremoved));
        A002.A0Q(AnonymousClass0x9.A0B(AnonymousClass0x7.A0n(this, C107575bX.A04(A0Q, AnonymousClass5Yj.A02(A1D(), R.attr.f3nameremoved, R.color.f5nameremoved)), new Object[1], 0, R.string.f11nameremoved)));
        A002.setPositiveButton(R.string.f11nameremoved, new AnonymousClass4I8(A08, 5, this));
        C85804Hr.A00(A002, this, 50, R.string.f11nameremoved);
        AnonymousClass043 create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
