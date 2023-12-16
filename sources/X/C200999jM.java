package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.9jM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200999jM implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ IndiaUpiPaymentSettingsFragment A01;
    public final /* synthetic */ String A02;

    public final void run() {
        this.A01.A1e(this.A00, this.A02);
    }

    public /* synthetic */ C200999jM(UserJid userJid, IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, String str) {
        this.A01 = indiaUpiPaymentSettingsFragment;
        this.A00 = userJid;
        this.A02 = str;
    }
}
