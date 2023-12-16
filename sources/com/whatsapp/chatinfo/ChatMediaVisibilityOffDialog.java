package com.whatsapp.chatinfo;

import X.AnonymousClass4K6;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C08310eF;
import X.C18310x6;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;

public class ChatMediaVisibilityOffDialog extends Hilt_ChatMediaVisibilityOffDialog {
    public Dialog A1J(Bundle bundle) {
        int i;
        C003203q A0R = A0R();
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("reason");
        } else {
            i = 0;
        }
        C19340zH A00 = AnonymousClass5V0.A00(A0R);
        TextView textView = (TextView) C18310x6.A0H(A0R.getLayoutInflater(), R.layout.f8nameremoved);
        if (i != 1) {
            textView.setText(R.string.f11nameremoved);
            A00.A0T(R.string.f11nameremoved);
        } else {
            textView.setText(R.string.f11nameremoved);
            C19340zH.A01(A0G(), A00, R.string.f11nameremoved);
        }
        A00.A0Z(textView);
        A00.A0f(this, new AnonymousClass4K6(0), C08310eF.A09(this).getString(R.string.f11nameremoved));
        return A00.create();
    }
}
