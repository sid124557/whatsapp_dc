package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass318;
import X.AnonymousClass3ZH;
import X.AnonymousClass4I0;
import X.AnonymousClass4I8;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C58422vE;
import X.C626936e;
import X.C66653Mg;
import X.C95814uZ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class IdentityChangeDialogFragment extends Hilt_IdentityChangeDialogFragment {
    public AnonymousClass318 A00;
    public C66653Mg A01;

    public Dialog A1J(Bundle bundle) {
        A0H();
        String string = this.A06.getString("participant_jid");
        C95814uZ A0S = C18310x6.A0S(string);
        C626936e.A07(A0S, AnonymousClass000.A0V("IdentityChangeDialogFragment/onCreateDialog/invalid remote resource jid=", string, AnonymousClass001.A0o()));
        AnonymousClass3ZH A0A = this.A02.A0A(A0S);
        C19340zH A0H = C18320x8.A0H(this);
        A0H.A0g(A1V(A0A, R.string.f11nameremoved));
        A0H.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        A0H.A0X(new AnonymousClass4I8(A0A, 10, this), R.string.f11nameremoved);
        boolean A0Y = this.A02.A0Y(C58422vE.A02, 3336);
        int i = R.string.f11nameremoved;
        if (A0Y) {
            i = R.string.f11nameremoved;
        }
        A0H.setPositiveButton(i, new AnonymousClass4I0(1, string, this));
        return A0H.create();
    }
}
