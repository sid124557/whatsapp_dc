package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass2FG;
import X.AnonymousClass32Y;
import X.C18280x3;
import X.C19340zH;
import X.C85804Hr;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public class CommunityAdminDialogFragment extends WaDialogFragment {
    public int A00;
    public AnonymousClass2FG A01;
    public UserJid A02;

    public Dialog A1J(Bundle bundle) {
        Bundle A0H = A0H();
        if (A0H.containsKey("dialog_id")) {
            this.A00 = A0H.getInt("dialog_id");
            UserJid A08 = AnonymousClass32Y.A08(A0H.getString("user_jid"));
            this.A02 = A08;
            if (A08 != null) {
                C19340zH A0K = C18280x3.A0K(this);
                if (A0H.containsKey("title")) {
                    A0K.setTitle(A0H.getString("title"));
                }
                if (A0H.containsKey("message")) {
                    A0K.A0Q(A0H.getCharSequence("message"));
                }
                if (A0H.containsKey("positive_button")) {
                    A0K.A0I(new C85804Hr(this, 37), A0H.getString("positive_button"));
                }
                if (A0H.containsKey("negative_button")) {
                    A0K.A0G(new C85804Hr(this, 38), A0H.getString("negative_button"));
                }
                return A0K.create();
            }
            throw AnonymousClass001.A0c("CommunityAdminDialogFragment/user jid must be passed in");
        }
        throw AnonymousClass001.A0e("dialog_id should be provided.");
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass2FG.A00(this);
    }
}
