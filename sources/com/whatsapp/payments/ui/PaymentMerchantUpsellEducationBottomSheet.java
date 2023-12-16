package com.whatsapp.payments.ui;

import X.AnonymousClass5NS;
import X.AnonymousClass9U4;
import X.C1235468v;
import X.C1236169c;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C183538qC;
import X.C86604Kt;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class PaymentMerchantUpsellEducationBottomSheet extends Hilt_PaymentMerchantUpsellEducationBottomSheet {
    public AnonymousClass5NS A00;
    public AnonymousClass9U4 A01;
    public WDSButton A02;
    public WDSButton A03;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        AnonymousClass5NS r0 = this.A00;
        if (r0 != null) {
            C183538qC r3 = r0.A01.A01;
            C86604Kt.A15(C18300x5.A0B(r3), "smb_merchant_payment_account_nag_count", C86664Kz.A08(C18300x5.A0B(r3), "smb_merchant_payment_account_nag_count", 0));
            this.A03 = C86654Ky.A0f(view, R.id.not_now_button);
            this.A02 = C86654Ky.A0f(view, R.id.link_a_payment_partner_button);
            Context A0G = A0G();
            WDSButton wDSButton = this.A02;
            if (wDSButton != null) {
                wDSButton.setOnClickListener(new C1236169c(A0G, 1, this));
            }
            WDSButton wDSButton2 = this.A03;
            if (wDSButton2 != null) {
                wDSButton2.setOnClickListener(new C1235468v(this, 3));
                return;
            }
            return;
        }
        throw C18270x1.A0S("merchantEducationManager");
    }

    public void A0c() {
        super.A0c();
        this.A03 = null;
        this.A02 = null;
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
