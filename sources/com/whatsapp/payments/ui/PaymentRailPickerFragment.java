package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C08310eF;
import X.C133736hr;
import X.C133786hw;
import X.C166587yw;
import X.C18320x8;
import X.C204249p3;
import X.C626936e;
import X.C627136h;
import X.C86604Kt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class PaymentRailPickerFragment extends Hilt_PaymentRailPickerFragment {
    public final void A1J(int i) {
        C133786hw r0;
        ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) A0P(true);
        if (confirmPaymentFragment != null) {
            confirmPaymentFragment.A00 = i;
            TextView textView = confirmPaymentFragment.A0B;
            int i2 = R.string.f11nameremoved;
            if (i == 0) {
                i2 = R.string.f11nameremoved;
            }
            textView.setText(i2);
            C166587yw r1 = confirmPaymentFragment.A0J;
            if ((r1 instanceof C133736hr) && (r0 = (C133786hw) r1.A08) != null) {
                r0.A03 = i;
            }
        }
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0E;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1Y();
        }
    }

    public static PaymentRailPickerFragment A00(int i, boolean z) {
        String str;
        PaymentRailPickerFragment paymentRailPickerFragment = new PaymentRailPickerFragment();
        Bundle A08 = AnonymousClass002.A08();
        if (i != 0) {
            str = "debit";
        } else {
            str = "credit";
        }
        A08.putString("arg_type", str);
        A08.putBoolean("arg_is_p2p", z);
        paymentRailPickerFragment.A0u(A08);
        return paymentRailPickerFragment;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        Bundle A0H = A0H();
        String string = A0H.getString("arg_type", "credit");
        C626936e.A06(string);
        boolean equals = string.equals("credit");
        View findViewById = view.findViewById(R.id.credit_card_check);
        if (equals) {
            findViewById.setVisibility(0);
            C86604Kt.A1F(view, R.id.debit_card_check, 4);
        } else {
            findViewById.setVisibility(4);
            C86604Kt.A1F(view, R.id.debit_card_check, 0);
        }
        View findViewById2 = view.findViewById(R.id.payment_rail_credit_card_container);
        C626936e.A04(findViewById2);
        C204249p3.A02(findViewById2, this, 106);
        if (A0H.getBoolean("arg_is_p2p")) {
            findViewById2.setEnabled(false);
            View findViewById3 = findViewById2.findViewById(R.id.payment_rail_credit_card_text);
            C626936e.A04(findViewById3);
            C18320x8.A11(C08310eF.A09(this), (TextView) findViewById3, R.color.f5nameremoved);
            View findViewById4 = findViewById2.findViewById(R.id.payment_rail_credit_card_education);
            C626936e.A04(findViewById4);
            findViewById4.setVisibility(0);
        }
        C204249p3.A02(view.findViewById(R.id.payment_rail_debit_card_container), this, 107);
        C204249p3.A02(view.findViewById(R.id.back), this, C627136h.A03);
    }
}
