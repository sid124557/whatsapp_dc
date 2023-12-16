package X;

import com.whatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.9h7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9h7 implements Runnable {
    public final /* synthetic */ AnonymousClass9OP A00;

    public final void run() {
        String A1X;
        AnonymousClass9OP r0 = this.A00;
        PaymentSettingsFragment paymentSettingsFragment = r0.A00;
        C1902394t r4 = paymentSettingsFragment.A0x;
        if (r4 != null) {
            if (r0.A01.A01 == 1) {
                A1X = "incentive_banner";
            } else {
                A1X = paymentSettingsFragment.A1X();
            }
            AnonymousClass9Wg.A02(AnonymousClass9Wg.A00(r4.A05, (AnonymousClass39Q) null, paymentSettingsFragment.A0q, A1X, false), r4.A0B, C18300x5.A0Y(), "payment_home", (String) null, 1);
        }
    }

    public /* synthetic */ AnonymousClass9h7(AnonymousClass9OP r1) {
        this.A00 = r1;
    }
}
