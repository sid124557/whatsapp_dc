package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.Comparator;

/* renamed from: X.9kA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201459kA implements Comparator {
    public final /* synthetic */ C117875sd A00;
    public final /* synthetic */ AnonymousClass9GO A01;

    public final int compare(Object obj, Object obj2) {
        AnonymousClass9GO r0 = this.A01;
        C117875sd r6 = this.A00;
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = r0.A00;
        C1907099n r1 = paymentGroupParticipantPickerActivity.A0B;
        AnonymousClass3ZH r5 = ((AnonymousClass9ON) obj).A00;
        Class<UserJid> cls = UserJid.class;
        int A05 = r1.A05((UserJid) r5.A0I(cls));
        C1907099n r12 = paymentGroupParticipantPickerActivity.A0B;
        AnonymousClass3ZH r2 = ((AnonymousClass9ON) obj2).A00;
        int A052 = r12.A05((UserJid) r2.A0I(cls));
        if (A05 == 2) {
            if (A052 != 2) {
                return -1;
            }
        } else if (A052 == 2) {
            return 1;
        }
        return r6.compare(r5, r2);
    }

    public /* synthetic */ C201459kA(C117875sd r1, AnonymousClass9GO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
