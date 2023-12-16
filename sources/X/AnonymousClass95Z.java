package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.95Z  reason: invalid class name */
public final class AnonymousClass95Z extends C05570Ua implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass9OQ A02;

    public void onClick(View view) {
        C162457s7.A0J(view, 0);
        PaymentSettingsFragment paymentSettingsFragment = this.A02.A00;
        if (paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment) {
            Intent A08 = AnonymousClass0x9.A08(paymentSettingsFragment.A1D(), IndiaUpiContactPicker.class);
            A08.putExtra("for_payments", true);
            paymentSettingsFragment.A0m(A08);
        }
    }

    public AnonymousClass95Z(View view, AnonymousClass9OQ r3) {
        super(view);
        this.A02 = r3;
        this.A00 = (ImageView) C18290x4.A0M(view, R.id.contact_icon);
        this.A01 = (TextEmojiLabel) C18290x4.A0M(view, R.id.contact_image);
        this.A0H.setOnClickListener(this);
    }
}
