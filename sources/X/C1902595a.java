package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.95a  reason: invalid class name and case insensitive filesystem */
public final class C1902595a extends C05570Ua implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass9OK A02;

    public void onClick(View view) {
        String str;
        C162457s7.A0J(view, 0);
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A02.A00;
        Intent intent = indiaUpiPaymentSettingsFragment.A0Q().getIntent();
        C197109ca r4 = indiaUpiPaymentSettingsFragment.A0M;
        Integer A0f = AnonymousClass001.A0f();
        if (intent != null) {
            str = intent.getStringExtra("referral_screen");
        } else {
            str = null;
        }
        r4.BKB(A0f, 188, "payment_home", str);
        Intent A08 = AnonymousClass0x9.A08(indiaUpiPaymentSettingsFragment.A1D(), IndiaUpiContactPicker.class);
        A08.putExtra("for_payment_merchants", true);
        indiaUpiPaymentSettingsFragment.A0m(A08);
    }

    public C1902595a(View view, AnonymousClass9OK r3) {
        super(view);
        this.A02 = r3;
        this.A00 = (ImageView) C18290x4.A0M(view, R.id.contact_icon);
        this.A01 = (TextEmojiLabel) C18290x4.A0M(view, R.id.contact_image);
        this.A0H.setOnClickListener(this);
    }
}
