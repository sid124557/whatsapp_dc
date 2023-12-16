package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass001;
import X.C05550Ty;
import X.C06560Yg;
import X.C08310eF;
import X.C17760wC;
import X.C57822uG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public class ConfirmDisableFragment extends WaFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        C05550Ty A0B = C08310eF.A0B(this);
        C57822uG.A00(new C17760wC(A0B, 7), C06560Yg.A02(view, R.id.confirm_disable_disable_button));
        C57822uG.A00(new C17760wC(A0B, 8), C06560Yg.A02(view, R.id.confirm_disable_cancel_button));
    }
}
