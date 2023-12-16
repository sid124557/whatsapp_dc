package com.whatsapp.registration;

import X.AnonymousClass0x2;
import X.C06560Yg;
import X.C18300x5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class VerifyAnotherWayBottomSheetFragment extends Hilt_VerifyAnotherWayBottomSheetFragment {
    public WDSButton A00;
    public WDSButton A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) C06560Yg.A02(inflate, R.id.request_otp_code_buttons_layout);
        this.A01 = (WDSButton) layoutInflater.inflate(R.layout.f8nameremoved, viewGroup2, false);
        this.A00 = (WDSButton) layoutInflater.inflate(R.layout.f8nameremoved, viewGroup2, false);
        viewGroup2.addView(this.A01);
        viewGroup2.addView(this.A00);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        AnonymousClass0x2.A0y(C06560Yg.A02(view, R.id.request_otp_code_bottom_sheet_close_button), this, 39);
        C06560Yg.A02(view, R.id.request_otp_code_bottom_sheet_icon).setVisibility(8);
        TextView A0G = C18300x5.A0G(view, R.id.request_otp_code_bottom_sheet_title);
        TextView A0G2 = C18300x5.A0G(view, R.id.request_otp_code_bottom_sheet_description);
        A0G.setText(R.string.f11nameremoved);
        A0G2.setText(R.string.f11nameremoved);
        this.A01.setText(R.string.f11nameremoved);
        this.A01.setIcon((int) R.drawable.ic_reg_sms_normal);
        AnonymousClass0x2.A0y(this.A01, this, 38);
        this.A00.setText(R.string.f11nameremoved);
        this.A00.setIcon((int) R.drawable.ic_reg_call_normal);
        AnonymousClass0x2.A0y(this.A00, this, 37);
    }
}
