package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.95c  reason: invalid class name and case insensitive filesystem */
public final class C1902795c extends C05570Ua implements View.OnClickListener {
    public final ImageView A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass9OK A03;

    public void onClick(View view) {
        Intent intent;
        String str;
        C162457s7.A0J(view, 0);
        AnonymousClass9OK r2 = this.A03;
        AnonymousClass3ZH r3 = (AnonymousClass3ZH) r2.A01.get(AnonymousClass001.A0J(this));
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = r2.A00;
        C003203q A0Q = indiaUpiPaymentSettingsFragment.A0Q();
        if (A0Q != null) {
            intent = A0Q.getIntent();
        } else {
            intent = null;
        }
        AnonymousClass303 A0K = C1899593h.A0K();
        A0K.A03("merchant_name", r3.A0L());
        C197109ca r5 = indiaUpiPaymentSettingsFragment.A0M;
        Integer A0f = AnonymousClass001.A0f();
        if (intent != null) {
            str = intent.getStringExtra("referral_screen");
        } else {
            str = null;
        }
        r5.BKE(A0K, A0f, 187, "payment_home", str);
        Intent A1N = new C627736r().A1N(indiaUpiPaymentSettingsFragment.A0Q(), r3.A0H);
        C003203q A0Q2 = indiaUpiPaymentSettingsFragment.A0Q();
        A1N.putExtra("share_msg", "Hi");
        A1N.putExtra("confirm", true);
        A1N.putExtra("has_share", true);
        C57352tV.A00(A0Q2, A1N);
        indiaUpiPaymentSettingsFragment.A0m(A1N);
    }

    public C1902795c(View view, AnonymousClass9OK r3) {
        super(view);
        this.A03 = r3;
        this.A00 = (ImageView) C18290x4.A0M(view, R.id.contact_icon);
        this.A02 = (TextEmojiLabel) C18290x4.A0M(view, R.id.contact_image);
        this.A01 = (ImageView) C18290x4.A0M(view, R.id.contact_verified_badge);
        this.A0H.setOnClickListener(this);
    }
}
