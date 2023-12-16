package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass001;
import X.AnonymousClass5UK;
import X.C08310eF;
import X.C141996wT;
import X.C18270x1;
import X.C18290x4;
import X.C88634aS;
import X.C95814uZ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockPrivacySettingsUnlockClearDialog extends Hilt_ChatLockPrivacySettingsUnlockClearDialog {
    public DialogInterface.OnClickListener A00;
    public AnonymousClass5UK A01;

    public Dialog A1J(Bundle bundle) {
        AnonymousClass5UK r1 = this.A01;
        if (r1 != null) {
            Integer A0c = C18290x4.A0c();
            Integer A0f = AnonymousClass001.A0f();
            r1.A04((C95814uZ) null, A0c, A0f, 7);
            AnonymousClass5UK r12 = this.A01;
            if (r12 != null) {
                r12.A04((C95814uZ) null, A0c, A0f, 16);
                this.A04 = C141996wT.DESTRUCTIVE;
                C88634aS r2 = new C88634aS(A0G(), R.style.f12nameremoved);
                r2.A0V(R.string.f11nameremoved);
                r2.A0Y(C08310eF.A09(this).getString(R.string.f11nameremoved));
                r2.A0X(this.A00, R.string.f11nameremoved);
                r2.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                return r2.create();
            }
            throw C18270x1.A0S("chatLockLogger");
        }
        throw C18270x1.A0S("chatLockLogger");
    }

    public ChatLockPrivacySettingsUnlockClearDialog(DialogInterface.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
