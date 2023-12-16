package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass001;
import X.AnonymousClass5UK;
import X.C1235268t;
import X.C141996wT;
import X.C18270x1;
import X.C88634aS;
import X.C95814uZ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockForgotSecretCodeUnlockClearDialog extends Hilt_ChatLockForgotSecretCodeUnlockClearDialog {
    public int A00;
    public DialogInterface.OnClickListener A01;
    public AnonymousClass5UK A02;

    public Dialog A1J(Bundle bundle) {
        AnonymousClass5UK r4 = this.A02;
        if (r4 != null) {
            r4.A04((C95814uZ) null, Integer.valueOf(this.A00), AnonymousClass001.A0f(), 7);
            this.A04 = C141996wT.DESTRUCTIVE;
            C88634aS r2 = new C88634aS(A0G(), R.style.f12nameremoved);
            r2.A0V(R.string.f11nameremoved);
            r2.A0U(R.string.f11nameremoved);
            r2.A0X(C1235268t.A00(this, 20), R.string.f11nameremoved);
            r2.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
            return r2.create();
        }
        throw C18270x1.A0S("chatLockLogger");
    }

    public ChatLockForgotSecretCodeUnlockClearDialog(DialogInterface.OnClickListener onClickListener, int i) {
        this.A00 = i;
        this.A01 = onClickListener;
    }
}
