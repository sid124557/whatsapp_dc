package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass9NL;
import X.AnonymousClass9Wg;
import X.C06560Yg;
import X.C18290x4;
import X.C204249p3;
import X.C86654Ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class BasePaymentIncentiveFragment extends RoundedBottomSheetDialogFragment {
    public TextEmojiLabel A00;
    public WaImageButton A01;
    public WaTextView A02;
    public WDSButton A03;

    public void A1Z() {
        AnonymousClass9Wg.A04((PaymentIncentiveViewFragment) this, 1);
    }

    public void A1a() {
        PaymentIncentiveViewFragment paymentIncentiveViewFragment = (PaymentIncentiveViewFragment) this;
        AnonymousClass9NL r0 = paymentIncentiveViewFragment.A04;
        if (r0 != null) {
            r0.A00.A1K();
        }
        AnonymousClass9Wg.A04(paymentIncentiveViewFragment, C18290x4.A0c());
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        this.A02 = AnonymousClass0x7.A0L(view, R.id.payment_incentive_bottom_sheet_title);
        this.A00 = AnonymousClass0x7.A0K(view, R.id.payment_incentive_bottom_sheet_body);
        WDSButton A0f = C86654Ky.A0f(view, R.id.ok_button);
        this.A03 = A0f;
        C204249p3.A02(A0f, this, 10);
        WaImageButton waImageButton = (WaImageButton) C06560Yg.A02(view, R.id.back);
        this.A01 = waImageButton;
        C204249p3.A02(waImageButton, this, 11);
    }
}
