package X;

import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;

/* renamed from: X.9jN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201009jN implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    public final void run() {
        this.A02.A74(this.A00, this.A01);
    }

    public /* synthetic */ C201009jN(Intent intent, UserJid userJid, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = userJid;
        this.A00 = intent;
    }
}
