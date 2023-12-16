package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;

/* renamed from: X.9iP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200489iP implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentContactPickerFragment A01;

    public final void run() {
        PaymentContactPickerFragment paymentContactPickerFragment = this.A01;
        UserJid userJid = this.A00;
        C003203q A0Q = paymentContactPickerFragment.A0Q();
        if (A0Q != null) {
            AnonymousClass0x2.A0m(A0Q, C18320x8.A07().putExtra("extra_invitee_jid", userJid.getRawString()));
        }
    }

    public /* synthetic */ C200489iP(UserJid userJid, PaymentContactPickerFragment paymentContactPickerFragment) {
        this.A01 = paymentContactPickerFragment;
        this.A00 = userJid;
    }
}
