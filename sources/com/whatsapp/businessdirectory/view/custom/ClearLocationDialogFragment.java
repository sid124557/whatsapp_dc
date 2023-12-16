package com.whatsapp.businessdirectory.view.custom;

import X.AnonymousClass7Vq;
import X.C06560Yg;
import X.C18280x3;
import X.C18290x4;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ClearLocationDialogFragment extends Hilt_ClearLocationDialogFragment {
    public AnonymousClass7Vq A00;

    public Dialog A1J(Bundle bundle) {
        View inflate = View.inflate(A0G(), R.layout.f8nameremoved, (ViewGroup) null);
        View A02 = C06560Yg.A02(inflate, R.id.clear_btn);
        View A022 = C06560Yg.A02(inflate, R.id.cancel_btn);
        C18290x4.A1H(A02, this, 34);
        C18290x4.A1H(A022, this, 35);
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0a(inflate);
        A0K.A0i(true);
        return A0K.create();
    }
}
