package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9GW  reason: invalid class name */
public class AnonymousClass9GW extends AnonymousClass5ZM {
    public final ArrayList A00;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A01;

    public AnonymousClass9GW(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, ArrayList arrayList) {
        ArrayList arrayList2;
        this.A01 = paymentGroupParticipantPickerActivity;
        if (arrayList != null) {
            arrayList2 = AnonymousClass002.A0J(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A00 = arrayList2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        paymentGroupParticipantPickerActivity.A0D = null;
        AnonymousClass947 r0 = paymentGroupParticipantPickerActivity.A0E;
        r0.A00 = (List) obj;
        r0.notifyDataSetChanged();
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        HashSet A0K = AnonymousClass002.A0K();
        ArrayList arrayList = this.A00;
        if (arrayList == null || arrayList.isEmpty()) {
            A0s.addAll(this.A01.A0M);
            return A0s;
        }
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        Iterator it = paymentGroupParticipantPickerActivity.A0M.iterator();
        while (it.hasNext()) {
            AnonymousClass9ON r4 = (AnonymousClass9ON) it.next();
            AnonymousClass3ZH r3 = r4.A00;
            Jid A0I = r3.A0I(UserJid.class);
            if (paymentGroupParticipantPickerActivity.A05.A0f(r3, arrayList, true) && !A0K.contains(A0I)) {
                A0s.add(r4);
                A0K.add(A0I);
            }
            if (this.A02.isCancelled()) {
                break;
            }
        }
        return A0s;
    }
}
