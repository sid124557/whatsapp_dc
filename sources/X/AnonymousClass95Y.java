package X;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.math.BigDecimal;

/* renamed from: X.95Y  reason: invalid class name */
public final class AnonymousClass95Y extends C05570Ua implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass9OQ A02;

    public void onClick(View view) {
        Intent intent;
        AnonymousClass39Q r0;
        AnonymousClass39Q r02;
        String str;
        String str2;
        C162457s7.A0J(view, 0);
        AnonymousClass9OQ r3 = this.A02;
        AnonymousClass3ZQ r2 = (AnonymousClass3ZQ) r3.A01.get(AnonymousClass001.A0J(this));
        PaymentSettingsFragment paymentSettingsFragment = r3.A00;
        C003203q A0Q = paymentSettingsFragment.A0Q();
        if (A0Q != null) {
            intent = A0Q.getIntent();
        } else {
            intent = null;
        }
        boolean z = paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment;
        if (z) {
            C197109ca r9 = ((IndiaUpiPaymentSettingsFragment) paymentSettingsFragment).A0M;
            Integer A0f = AnonymousClass001.A0f();
            if (intent != null) {
                str2 = intent.getStringExtra("referral_screen");
            } else {
                str2 = null;
            }
            r9.BKB(A0f, 149, "payment_home", str2);
        }
        if (!r2.A06) {
            UserJid userJid = r2.A04;
            if (paymentSettingsFragment.A0m.A05(userJid) == 2) {
                C626936e.A06(userJid);
                synchronized (r2) {
                    r02 = r2.A02;
                }
                BigDecimal bigDecimal = r02.A00;
                if (bigDecimal != null) {
                    C85204Fi A012 = paymentSettingsFragment.A0l.A01();
                    C626936e.A06(A012);
                    AnonymousClass3H6 r03 = (AnonymousClass3H6) A012;
                    String A022 = AnonymousClass359.A02(paymentSettingsFragment.A01, r03.A04, r03.A05, bigDecimal, false);
                    if (z) {
                        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) paymentSettingsFragment;
                        C69263Wi r10 = indiaUpiPaymentSettingsFragment.A0L;
                        AnonymousClass9U4 r11 = indiaUpiPaymentSettingsFragment.A0n;
                        AnonymousClass9TK r7 = new AnonymousClass9TK(indiaUpiPaymentSettingsFragment.A0Q(), (AnonymousClass4FU) indiaUpiPaymentSettingsFragment.A0R(), r10, r11, indiaUpiPaymentSettingsFragment.A0Q, new C200999jM(userJid, indiaUpiPaymentSettingsFragment, A022), new C200399iG(userJid, indiaUpiPaymentSettingsFragment), true);
                        if (r7.A02()) {
                            if (intent != null) {
                                str = intent.getStringExtra("referral_screen");
                            } else {
                                str = null;
                            }
                            r7.A00(userJid, new C204829pz(indiaUpiPaymentSettingsFragment, 0), str);
                            return;
                        }
                    }
                    paymentSettingsFragment.A1e(userJid, A022);
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass1S4 r72 = r2.A03;
        synchronized (r2) {
            r0 = r2.A02;
        }
        BigDecimal bigDecimal2 = r0.A00;
        if (z) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment2 = (IndiaUpiPaymentSettingsFragment) paymentSettingsFragment;
            AnonymousClass99L r73 = (AnonymousClass99L) r72;
            C166557yt A0G = C1899693i.A0G(AnonymousClass3QD.A00(), r73.A0O, "paymentHandle");
            Intent A013 = indiaUpiPaymentSettingsFragment2.A0F.A01(indiaUpiPaymentSettingsFragment2.A1D(), false, true);
            A013.putExtra("extra_payment_handle", A0G);
            A013.putExtra("extra_payee_name", r73.A0A);
            A013.putExtra("extra_payment_upi_number", (Parcelable) null);
            A013.putExtra("extra_transaction_token", r73.A0U);
            indiaUpiPaymentSettingsFragment2.A12.A01(A013);
            A013.putExtra("extra_payment_preset_amount", bigDecimal2);
            A013.putExtra("referral_screen", "send_again_contact");
            indiaUpiPaymentSettingsFragment2.A0m(A013);
        }
    }

    public AnonymousClass95Y(View view, AnonymousClass9OQ r3) {
        super(view);
        this.A02 = r3;
        this.A00 = (ImageView) C18290x4.A0M(view, R.id.contact_icon);
        this.A01 = (TextEmojiLabel) C18290x4.A0M(view, R.id.contact_image);
        this.A0H.setOnClickListener(this);
    }
}
