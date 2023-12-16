package com.whatsapp.payments.ui.compliance;

import X.C08310eF;
import X.C106715a2;
import X.C162457s7;
import X.C18270x1;
import X.C197109ca;
import X.C69953Zh;
import android.os.Bundle;
import com.whatsapp.R;

public final class IndiaConfirmLegalNameBottomSheetFragment extends Hilt_IndiaConfirmLegalNameBottomSheetFragment {
    public C197109ca A00;
    public String A01;
    public String A02;
    public String A03;

    public void A1K(Integer num, String str, String str2, int i) {
        String str3 = str;
        C162457s7.A0J(str, 2);
        C197109ca r0 = this.A00;
        if (r0 != null) {
            r0.A0A(Integer.valueOf(i), num, str3, this.A03, this.A02, this.A01, true);
            return;
        }
        throw C18270x1.A0S("indiaUpiFieldStatsLogger");
    }

    public CharSequence A1J() {
        C106715a2 r2 = this.A0C;
        if (r2 != null) {
            return r2.A04(A1D(), C08310eF.A09(this).getString(R.string.f11nameremoved), new Runnable[]{new C69953Zh(this)}, new String[]{"p2m-compliance-learn-more"}, new String[]{""});
        }
        throw C18270x1.A0S("linkifier");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Bundle A0H = A0H();
        this.A01 = A0H.getString("extra_payment_config_id");
        this.A02 = A0H.getString("extra_order_type");
        this.A03 = A0H.getString("extra_referral_screen");
    }
}
