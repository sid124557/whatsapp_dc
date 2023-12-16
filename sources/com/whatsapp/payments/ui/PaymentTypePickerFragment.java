package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C08310eF;
import X.C204249p3;
import X.C626936e;
import X.C86604Kt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class PaymentTypePickerFragment extends Hilt_PaymentTypePickerFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        String string;
        String string2;
        String string3 = A0H().getString("arg_type", "goodAndServices");
        C626936e.A06(string3);
        AnonymousClass002.A09(view, R.id.buying_goods_and_services_text).setText(R.string.f11nameremoved);
        TextView A09 = AnonymousClass002.A09(view, R.id.buying_goods_and_services_hint_text);
        boolean z = this instanceof BrazilPaymentTypePickerFragment;
        if (z) {
            string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        } else {
            string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        }
        A09.setText(string);
        AnonymousClass002.A09(view, R.id.sending_to_friends_and_family_text).setText(R.string.f11nameremoved);
        TextView A092 = AnonymousClass002.A09(view, R.id.sending_to_friends_and_family_hint_text);
        if (z) {
            string2 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        } else {
            string2 = C08310eF.A09(this).getString(R.string.f11nameremoved);
        }
        A092.setText(string2);
        boolean equals = string3.equals("goodAndServices");
        View findViewById = view.findViewById(R.id.buying_goods_and_services_check);
        if (equals) {
            findViewById.setVisibility(0);
            C86604Kt.A1F(view, R.id.sending_to_friends_and_family_check, 4);
        } else {
            findViewById.setVisibility(4);
            C86604Kt.A1F(view, R.id.sending_to_friends_and_family_check, 0);
        }
        C204249p3.A02(view.findViewById(R.id.sending_to_friends_and_family_container), this, 113);
        C204249p3.A02(view.findViewById(R.id.buying_goods_and_services_container), this, 114);
        C204249p3.A02(view.findViewById(R.id.back), this, 115);
    }
}
