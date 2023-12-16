package com.whatsapp.dialogs;

import X.AnonymousClass001;
import X.AnonymousClass0Uj;
import X.AnonymousClass0x2;
import X.AnonymousClass4FS;
import X.AnonymousClass4K2;
import X.AnonymousClass4K4;
import X.AnonymousClass4K7;
import X.C06560Yg;
import X.C08310eF;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C56542sA;
import X.C56982ss;
import X.C621033m;
import X.C626936e;
import X.C628536z;
import X.C69263Wi;
import X.C95814uZ;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class DeleteOrArchiveChatDialog extends Hilt_DeleteOrArchiveChatDialog {
    public C69263Wi A00;
    public C621033m A01;
    public C56542sA A02;
    public C56982ss A03;
    public AnonymousClass4FS A04;

    public Dialog A1J(Bundle bundle) {
        C95814uZ A0S = C18310x6.A0S(A0H().getString("arg_chat_jid", (String) null));
        C626936e.A06(A0S);
        View A0R = AnonymousClass001.A0R(LayoutInflater.from(A1D()), (ViewGroup) null, R.layout.f8nameremoved);
        View A0E = C18280x3.A0E(A0R, R.id.checkbox);
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0a(A0R);
        A0K.A0d(this, new AnonymousClass4K4(A0E, this, A0S, 3), R.string.f11nameremoved);
        C56982ss r0 = this.A03;
        if (r0 != null) {
            if (r0.A0M(A0S)) {
                C19340zH.A03(this, A0K, 87, R.string.f11nameremoved);
            } else {
                A0K.A0c(this, new AnonymousClass4K7(A0S, 3, this), R.string.f11nameremoved);
                AnonymousClass4K2 r3 = new AnonymousClass4K2(this, 88);
                AnonymousClass0Uj r2 = A0K.A00;
                String string = r2.getContext().getString(R.string.f11nameremoved);
                C628536z r02 = A0K.A01;
                r2.A0H(r02, string);
                r02.A01.A0B(this, r3);
            }
            AnonymousClass0x2.A0I(A0R, R.id.dialog_title).setText(C08310eF.A09(this).getQuantityString(R.plurals.f9nameremoved, 1));
            AnonymousClass0x2.A0I(A0R, R.id.dialog_message).setText(R.string.f11nameremoved);
            C18290x4.A1G(C06560Yg.A02(A0R, R.id.checkbox_container), A0E, 49);
            return C18300x5.A0H(A0K);
        }
        throw C18270x1.A0S("chatsCache");
    }
}
