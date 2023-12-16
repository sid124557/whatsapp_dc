package com.whatsapp.twofactor;

import X.AnonymousClass001;
import X.C18280x3;
import X.C18300x5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class DoneFragment extends Hilt_DoneFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A0H().getString("primaryCTA", "DONE");
    }

    public void A0w(Bundle bundle, View view) {
        TextView A0G = C18300x5.A0G(view, R.id.done_button);
        A0G.setText(R.string.f11nameremoved);
        C18280x3.A0o(A0G, this, 40);
        TwoFactorAuthActivity twoFactorAuthActivity = (TwoFactorAuthActivity) A0Q();
        twoFactorAuthActivity.A74(view, twoFactorAuthActivity.A08.length);
    }
}
