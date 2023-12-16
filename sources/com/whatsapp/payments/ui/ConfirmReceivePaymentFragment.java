package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass3XA;
import X.AnonymousClass9U4;
import X.C08310eF;
import X.C133796hx;
import X.C158777kX;
import X.C162457s7;
import X.C166587yw;
import X.C195169Wk;
import X.C202729mU;
import X.C203879oS;
import X.C204409pJ;
import X.C29251iW;
import X.C43942Ub;
import X.C626936e;
import X.C86604Kt;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public abstract class ConfirmReceivePaymentFragment extends Hilt_ConfirmReceivePaymentFragment implements C202729mU {
    public Button A00;
    public AnonymousClass3XA A01;
    public C166587yw A02;
    public C29251iW A03;
    public AnonymousClass9U4 A04;
    public PaymentMethodRow A05;
    public final C43942Ub A06 = new C203879oS(this, 1);

    public void BXr(C166587yw r6) {
        this.A02 = r6;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
        brazilConfirmReceivePaymentFragment.A05.A03.setVisibility(0);
        PaymentMethodRow paymentMethodRow = brazilConfirmReceivePaymentFragment.A05;
        C158777kX r0 = brazilConfirmReceivePaymentFragment.A0H;
        C162457s7.A0J(r6, 0);
        paymentMethodRow.A06(r0.A02(r6, true));
        C133796hx r02 = r6.A08;
        C626936e.A06(r02);
        if (!r02.A0B()) {
            brazilConfirmReceivePaymentFragment.A05.A05(C08310eF.A09(brazilConfirmReceivePaymentFragment).getString(R.string.f11nameremoved));
        }
        PaymentMethodRow paymentMethodRow2 = brazilConfirmReceivePaymentFragment.A05;
        if (C195169Wk.A08(r6)) {
            brazilConfirmReceivePaymentFragment.A0F.A02(r6, paymentMethodRow2);
        }
        brazilConfirmReceivePaymentFragment.A05.A07(true);
        C204409pJ.A00(this.A00, r6, this, 10);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        this.A05 = (PaymentMethodRow) A0R.findViewById(R.id.payment_method_row);
        this.A00 = (Button) A0R.findViewById(R.id.confirm_payment);
        View findViewById = A0R.findViewById(R.id.add_another_method);
        A0R.findViewById(R.id.account_number_divider).setVisibility(8);
        C86604Kt.A1F(A0R, R.id.payment_method_account_id, 8);
        C626936e.A06(this.A02);
        BXr(this.A02);
        C08310eF r1 = this.A0E;
        if (r1 != null) {
            C204409pJ.A00(A0R.findViewById(R.id.payment_method_container), r1, this, 8);
            C204409pJ.A00(findViewById, r1, this, 9);
        }
        return A0R;
    }

    public void A0a() {
        super.A0a();
        this.A03.A07(this.A06);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        AnonymousClass3XA r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        this.A01 = AnonymousClass9U4.A00(this.A04).A02();
        Parcelable parcelable = A0H().getParcelable("args_payment_method");
        C626936e.A06(parcelable);
        this.A02 = (C166587yw) parcelable;
        this.A03.A06(this.A06);
    }
}
