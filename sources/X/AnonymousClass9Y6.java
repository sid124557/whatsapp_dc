package X;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;

/* renamed from: X.9Y6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Y6 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A01;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        Intent intent = this.A00;
        AnonymousClass9ON r0 = ((C193589Pf) view.getTag()).A04;
        if (r0 != null) {
            AnonymousClass3ZH r4 = r0.A00;
            UserJid A07 = AnonymousClass3ZH.A07(r4);
            int A05 = paymentGroupParticipantPickerActivity.A0B.A05(A07);
            if (!paymentGroupParticipantPickerActivity.A02.A0P(A07) && A05 == 2) {
                C626936e.A06(A07);
                AnonymousClass9TK r42 = new AnonymousClass9TK(paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity.A05, paymentGroupParticipantPickerActivity.A0C, paymentGroupParticipantPickerActivity.A0G, new C201009jN(intent, A07, paymentGroupParticipantPickerActivity), new C201019jO(r4, A07, paymentGroupParticipantPickerActivity), false);
                if (r42.A02()) {
                    r42.A00(A07, (C203179nF) null, paymentGroupParticipantPickerActivity.A0I);
                } else {
                    paymentGroupParticipantPickerActivity.A74(intent, A07);
                }
            }
        }
    }

    public /* synthetic */ AnonymousClass9Y6(Intent intent, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A01 = paymentGroupParticipantPickerActivity;
        this.A00 = intent;
    }
}
