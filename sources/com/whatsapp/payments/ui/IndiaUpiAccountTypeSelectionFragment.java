package com.whatsapp.payments.ui;

import X.AnonymousClass0VX;
import X.C08310eF;
import X.C162457s7;
import X.C166587yw;
import X.C18270x1;
import X.C18280x3;
import X.C182858p6;
import X.C1891090a;
import X.C1891290c;
import X.C197109ca;
import X.C203739oE;
import X.C86604Kt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public final class IndiaUpiAccountTypeSelectionFragment extends Hilt_IndiaUpiAccountTypeSelectionFragment implements C203739oE {
    public C197109ca A00;
    public String A01;
    public boolean A02;
    public final C182858p6 A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        String str;
        C162457s7.A0J(view, 0);
        ImageView A0J = C86604Kt.A0J(view, R.id.nav_icon);
        C08310eF r0 = this.A0E;
        if (r0 == null || r0.A0T().A07() <= 1) {
            A0J.setImageDrawable(AnonymousClass0VX.A01(view.getContext(), R.drawable.ic_close));
            i = 13;
        } else {
            A0J.setImageDrawable(AnonymousClass0VX.A01(view.getContext(), R.drawable.ic_back));
            i = 14;
        }
        C1891290c.A00(A0J, this, i);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("referral_screen");
        } else {
            str = null;
        }
        this.A01 = str;
        PaymentMethodRow paymentMethodRow = (PaymentMethodRow) C18280x3.A0E(view, R.id.bank_account_row);
        PaymentMethodRow paymentMethodRow2 = (PaymentMethodRow) C18280x3.A0E(view, R.id.credit_card_row);
        View findViewById = paymentMethodRow.findViewById(R.id.payment_method_radio_button);
        View findViewById2 = paymentMethodRow2.findViewById(R.id.payment_method_radio_button);
        paymentMethodRow.A06(C08310eF.A09(this).getString(R.string.f11nameremoved));
        paymentMethodRow.A05(C08310eF.A09(this).getString(R.string.f11nameremoved));
        paymentMethodRow.A04(R.drawable.av_bank);
        paymentMethodRow.A00();
        paymentMethodRow.setRadioButtonChecked(true);
        paymentMethodRow.setOnClickListener(new C1891090a((Object) findViewById, (Object) findViewById2, (Object) this, 5));
        paymentMethodRow2.A06(C08310eF.A09(this).getString(R.string.f11nameremoved));
        paymentMethodRow2.A05(C08310eF.A09(this).getString(R.string.f11nameremoved));
        paymentMethodRow2.A04(R.drawable.av_card);
        paymentMethodRow2.A00();
        paymentMethodRow2.A08(false);
        paymentMethodRow2.setOnClickListener(new C1891090a((Object) findViewById, (Object) findViewById2, (Object) this, 6));
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C18280x3.A0E(view, R.id.continue_button);
        waButtonWithLoader.setButtonText((int) R.string.f11nameremoved);
        waButtonWithLoader.A00 = new C1891290c(this, 12);
        C197109ca r3 = this.A00;
        if (r3 != null) {
            r3.BKB(0, (Integer) null, "available_payment_methods_prompt", this.A01);
            return;
        }
        throw C18270x1.A0S("indiaUpiFieldStatsLogger");
    }

    public /* synthetic */ int B9g(C166587yw r2) {
        return 0;
    }

    public String B9i(C166587yw r2) {
        return null;
    }

    public /* synthetic */ String B9j(C166587yw r2) {
        return null;
    }

    public /* synthetic */ boolean BoB(C166587yw r2) {
        return false;
    }

    public boolean BoN() {
        return false;
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public IndiaUpiAccountTypeSelectionFragment(C182858p6 r1) {
        this.A03 = r1;
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }
}
