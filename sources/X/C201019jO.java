package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;

/* renamed from: X.9jO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201019jO implements Runnable {
    public final /* synthetic */ AnonymousClass3ZH A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    public final void run() {
        C627736r r0;
        Intent A1L;
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A02;
        UserJid userJid = this.A01;
        AnonymousClass3ZH r7 = this.A00;
        paymentGroupParticipantPickerActivity.A05.A0P(C18320x8.A0b(paymentGroupParticipantPickerActivity.getResources(), paymentGroupParticipantPickerActivity.A05.A0M(paymentGroupParticipantPickerActivity.A03.A0A(userJid)), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), 0);
        paymentGroupParticipantPickerActivity.finish();
        if (C86614Ku.A0D(paymentGroupParticipantPickerActivity) != null) {
            Bundle A0D = C86614Ku.A0D(paymentGroupParticipantPickerActivity);
            A1L = r0.A1L(paymentGroupParticipantPickerActivity, r7);
            A1L.putExtras(A0D);
        } else {
            r0 = new C627736r();
            A1L = r0.A1L(paymentGroupParticipantPickerActivity, r7);
        }
        paymentGroupParticipantPickerActivity.startActivity(A1L);
    }

    public /* synthetic */ C201019jO(AnonymousClass3ZH r1, UserJid userJid, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = userJid;
        this.A00 = r1;
    }
}
