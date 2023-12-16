package com.whatsapp.payments.ui;

import X.C162457s7;
import X.C171658Hx;
import X.C18270x1;
import X.C57062t0;
import android.os.Bundle;

public final class P2mLiteConfirmDateOfBirthBottomSheetFragment extends Hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment {
    public C171658Hx A00;
    public String A01;
    public String A02;

    public void A1J(Integer num, String str, String str2, int i) {
        String str3 = str;
        C162457s7.A0J(str, 2);
        C171658Hx r0 = this.A00;
        if (r0 != null) {
            r0.A01(C57062t0.A00(), num, str3, str2, this.A02, this.A01, i, true);
            return;
        }
        throw C18270x1.A0S("p2mLiteEventLogger");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Bundle A0H = A0H();
        this.A01 = A0H.getString("extra_payment_config_id");
        this.A02 = A0H.getString("extra_order_type");
    }
}
