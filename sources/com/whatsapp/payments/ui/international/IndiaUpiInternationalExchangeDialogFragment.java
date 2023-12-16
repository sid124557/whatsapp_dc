package com.whatsapp.payments.ui.international;

import X.AnonymousClass002;
import X.AnonymousClass303;
import X.AnonymousClass9Wg;
import X.C06560Yg;
import X.C08310eF;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C1891290c;
import X.C197109ca;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public final class IndiaUpiInternationalExchangeDialogFragment extends Hilt_IndiaUpiInternationalExchangeDialogFragment {
    public C197109ca A00;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        String str;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C1891290c.A00(C06560Yg.A02(view, R.id.close), this, 24);
        C1891290c.A00(C06560Yg.A02(view, R.id.continue_button), this, 25);
        TextView A0G = C18300x5.A0G(view, R.id.exchange_rate);
        Object[] A0M = AnonymousClass002.A0M();
        Bundle bundle2 = this.A06;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("extra_base_currency");
        } else {
            str = null;
        }
        A0M[0] = str;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            str2 = bundle3.getString("extra_exchange_rate");
        }
        A0M[1] = str2;
        A0G.setText(C08310eF.A09(this).getString(R.string.f11nameremoved, A0M));
        C197109ca r1 = this.A00;
        if (r1 != null) {
            AnonymousClass9Wg.A03((AnonymousClass303) null, r1, "currency_exchange_prompt", (String) null);
            return;
        }
        throw C18270x1.A0S("indiaUpiFieldStatsLogger");
    }
}
