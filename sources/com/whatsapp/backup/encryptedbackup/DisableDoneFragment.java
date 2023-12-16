package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass001;
import X.AnonymousClass0w5;
import X.C06560Yg;
import X.C08310eF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public class DisableDoneFragment extends WaFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        C06560Yg.A02(view, R.id.disable_done_done_button).setOnClickListener(new AnonymousClass0w5(this, 1, C08310eF.A0B(this)));
    }
}
