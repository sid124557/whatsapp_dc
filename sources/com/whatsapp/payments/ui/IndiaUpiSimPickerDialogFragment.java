package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass303;
import X.AnonymousClass36P;
import X.C06560Yg;
import X.C08310eF;
import X.C18260x0;
import X.C18300x5;
import X.C1899693i;
import X.C197109ca;
import X.C202769mY;
import X.C204249p3;
import X.C204409pJ;
import X.C56972sr;
import X.C86634Kw;
import X.C86644Kx;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public class IndiaUpiSimPickerDialogFragment extends Hilt_IndiaUpiSimPickerDialogFragment {
    public C56972sr A00;
    public C197109ca A01;
    public C202769mY A02;
    public List A03;

    public void A0w(Bundle bundle, View view) {
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A03 = bundle2.getParcelableArrayList("extra_subscriptions");
        }
        View view2 = view;
        C1899693i.A0l(C18300x5.A0G(view2, R.id.title), this, new Object[]{AnonymousClass36P.A02(C86634Kw.A0V(this.A00))}, R.string.f11nameremoved);
        ViewGroup A0I = C86644Kx.A0I(view2, R.id.radio_group);
        A0I.removeAllViews();
        AnonymousClass303 r13 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        if (this.A03 != null) {
            int i = 0;
            while (i < this.A03.size()) {
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) this.A03.get(i);
                TextView textView = (TextView) LayoutInflater.from(A1D()).inflate(R.layout.f8nameremoved, A0I, false);
                textView.setId(i);
                int i2 = i + 1;
                if (Build.VERSION.SDK_INT < 22 || TextUtils.isEmpty(subscriptionInfo.getDisplayName())) {
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1P(objArr, i2, 0);
                    C1899693i.A0l(textView, this, objArr, R.string.f11nameremoved);
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1P(objArr2, i2, 0);
                    A0o.append(C08310eF.A09(this).getString(R.string.f11nameremoved, objArr2));
                    A0o.append(" - ");
                    textView.setText(AnonymousClass000.A0R(subscriptionInfo.getDisplayName(), A0o));
                    r13.A03(AnonymousClass000.A0Y("SIM_", AnonymousClass001.A0o(), i), String.valueOf(subscriptionInfo.getDisplayName()));
                }
                A0I.addView(textView);
                i = i2;
            }
            if (A0I.getChildCount() > 0) {
                ((CompoundButton) A0I.getChildAt(0)).setChecked(true);
            }
        }
        this.A01.BKE(r13, 0, (Integer) null, "payments_device_binding_sim_picker", "payments_device_binding_precheck");
        C204249p3.A02(C06560Yg.A02(view2, R.id.cancel_button), this, 100);
        C204409pJ.A00(C06560Yg.A02(view2, R.id.confirm_button), A0I, this, 18);
    }

    public static /* synthetic */ void A00(RadioGroup radioGroup, IndiaUpiSimPickerDialogFragment indiaUpiSimPickerDialogFragment) {
        List list;
        indiaUpiSimPickerDialogFragment.A1K();
        if (indiaUpiSimPickerDialogFragment.A02 != null && (list = indiaUpiSimPickerDialogFragment.A03) != null) {
            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) list.get(radioGroup.getCheckedRadioButtonId());
            AnonymousClass303 r4 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
            r4.A03("sim_slot_picked", String.valueOf(radioGroup.getCheckedRadioButtonId()));
            if (Build.VERSION.SDK_INT >= 22 && !TextUtils.isEmpty(subscriptionInfo.getDisplayName())) {
                r4.A03("sim_carrier_picked", String.valueOf(subscriptionInfo.getDisplayName()));
            }
            indiaUpiSimPickerDialogFragment.A01.BKE(r4, AnonymousClass001.A0f(), (Integer) null, "payments_device_binding_sim_picker", "payments_device_binding_precheck");
            indiaUpiSimPickerDialogFragment.A02.Bbf(subscriptionInfo);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0d() {
        super.A0d();
        this.A02 = null;
    }

    public void A0g() {
        super.A0g();
        Dialog dialog = this.A03;
        if (dialog != null && dialog.getWindow() != null) {
            this.A03.getWindow().setLayout(-1, -2);
        }
    }

    public void A1G(Context context) {
        super.A1G(context);
        try {
            this.A02 = (C202769mY) A0Q();
        } catch (ClassCastException e) {
            C18260x0.A16("onAttach:", AnonymousClass001.A0o(), e);
        }
    }
}
