package com.whatsapp.payments.ui;

import X.AnonymousClass0x7;
import X.AnonymousClass4DM;
import X.C06560Yg;
import X.C08310eF;
import X.C162457s7;
import X.C18270x1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class PaymentCheckoutIncentiveFragment extends BasePaymentIncentiveFragment {
    public AnonymousClass4DM A00;
    public String A01;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        String string = A0H().getString("extra_formatted_discount");
        C162457s7.A0H(string);
        this.A01 = string;
        WaTextView waTextView = this.A02;
        Object[] objArr = new Object[1];
        if (string == null) {
            throw C18270x1.A0S("formattedDiscount");
        }
        waTextView.setText(AnonymousClass0x7.A0n(this, string, objArr, 0, R.string.f11nameremoved));
        TextEmojiLabel textEmojiLabel = this.A00;
        Object[] objArr2 = new Object[1];
        String str = this.A01;
        if (str == null) {
            throw C18270x1.A0S("formattedDiscount");
        }
        textEmojiLabel.setText(AnonymousClass0x7.A0n(this, str, objArr2, 0, R.string.f11nameremoved));
        this.A03.setText(R.string.f11nameremoved);
        C06560Yg.A02(view, R.id.security_container).setVisibility(0);
    }

    public void A1Z() {
        C08310eF r1 = this.A0E;
        if (r1 instanceof DialogFragment) {
            ((DialogFragment) r1).A1K();
        }
        AnonymousClass4DM r0 = this.A00;
        if (r0 != null) {
            r0.BR6();
        }
    }

    public void A1a() {
        C08310eF r1 = this.A0E;
        if (r1 instanceof DialogFragment) {
            ((DialogFragment) r1).A1K();
        }
        AnonymousClass4DM r0 = this.A00;
        if (r0 != null) {
            r0.BQ3();
        }
    }

    public void A0d() {
        super.A0d();
        AnonymousClass4DM r0 = this.A00;
        if (r0 != null) {
            r0.BR6();
        }
    }
}
