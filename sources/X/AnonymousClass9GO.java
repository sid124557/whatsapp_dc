package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.9GO  reason: invalid class name */
public class AnonymousClass9GO extends AnonymousClass5ZM {
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A00;

    public AnonymousClass9GO(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A00 = paymentGroupParticipantPickerActivity;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        paymentGroupParticipantPickerActivity.BjL();
        AnonymousClass947 r0 = paymentGroupParticipantPickerActivity.A0E;
        ArrayList arrayList = paymentGroupParticipantPickerActivity.A0M;
        r0.A00 = arrayList;
        r0.notifyDataSetChanged();
        AnonymousClass0R8 supportActionBar = paymentGroupParticipantPickerActivity.getSupportActionBar();
        if (supportActionBar != null) {
            C620733j r5 = paymentGroupParticipantPickerActivity.A00;
            long size = (long) arrayList.size();
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L, arrayList.size());
            supportActionBar.A0I(r5.A0L(A0L, R.plurals.f9nameremoved, size));
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        HashSet A0K = AnonymousClass002.A0K();
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        C56892sj r0 = paymentGroupParticipantPickerActivity.A09;
        C172878Nf it = r0.A09.A07(paymentGroupParticipantPickerActivity.A0A).A04().iterator();
        while (true) {
            C133676hl r4 = null;
            if (it.hasNext()) {
                AnonymousClass3ZH A0A = paymentGroupParticipantPickerActivity.A03.A0A(((C60842zG) it.next()).A03);
                if (!A0K.contains(A0A) && !paymentGroupParticipantPickerActivity.A01.A0a(A0A.A0H)) {
                    UserJid A07 = AnonymousClass3ZH.A07(A0A);
                    if (A07 != null) {
                        r4 = AnonymousClass9U4.A03(paymentGroupParticipantPickerActivity.A0C).A05(A07);
                    }
                    paymentGroupParticipantPickerActivity.A0M.add(new AnonymousClass9ON(A0A, r4));
                    A0K.add(A0A);
                }
            } else {
                Collections.sort(paymentGroupParticipantPickerActivity.A0M, new C201459kA(new C117875sd(paymentGroupParticipantPickerActivity.A01, paymentGroupParticipantPickerActivity.A05, 1), this));
                return null;
            }
        }
    }
}
