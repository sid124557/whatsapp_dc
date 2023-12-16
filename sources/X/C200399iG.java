package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.9iG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200399iG implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ IndiaUpiPaymentSettingsFragment A01;

    public final void run() {
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A01;
        UserJid userJid = this.A00;
        C003203q A0Q = indiaUpiPaymentSettingsFragment.A0Q();
        if (A0Q != null) {
            AnonymousClass0x2.A0m(A0Q, C18320x8.A07().putExtra("extra_invitee_jid", userJid.getRawString()));
        }
    }

    public /* synthetic */ C200399iG(UserJid userJid, IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        this.A01 = indiaUpiPaymentSettingsFragment;
        this.A00 = userJid;
    }
}
