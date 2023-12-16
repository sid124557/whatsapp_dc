package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.C06560Yg;
import X.C18290x4;
import X.C197109ca;
import X.C202119lP;
import X.C204249p3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class IndiaUpiPaymentRaiseComplaintFragment extends Hilt_IndiaUpiPaymentRaiseComplaintFragment {
    public C197109ca A00;
    public C202119lP A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0d() {
        super.A0d();
        this.A01 = null;
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        C204249p3.A02(C06560Yg.A02(view, R.id.complaint_button), this, 65);
        C204249p3.A02(C06560Yg.A02(view, R.id.close), this, 66);
        this.A00.BKB(C18290x4.A0Z(), (Integer) null, "raise_complaint_prompt", (String) null);
    }
}
