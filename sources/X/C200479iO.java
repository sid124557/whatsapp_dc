package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;

/* renamed from: X.9iO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200479iO implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentContactPickerFragment A01;

    public final void run() {
        this.A01.A2M(this.A00);
    }

    public /* synthetic */ C200479iO(UserJid userJid, PaymentContactPickerFragment paymentContactPickerFragment) {
        this.A01 = paymentContactPickerFragment;
        this.A00 = userJid;
    }
}
