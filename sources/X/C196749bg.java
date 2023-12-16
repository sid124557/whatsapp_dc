package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.9bg  reason: invalid class name and case insensitive filesystem */
public class C196749bg implements C202969mu {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentIncentiveViewModel A01;

    public C196749bg(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        this.A01 = paymentIncentiveViewModel;
        this.A00 = userJid;
    }

    public void BRy() {
        Log.e("PAY: PaymentIncentiveViewModel/syncIncentiveData/on-error");
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        paymentIncentiveViewModel.A00.A0G(AnonymousClass9WE.A02(paymentIncentiveViewModel.A06.A00(), AnonymousClass002.A0E("Failed syncing incentive")));
    }

    public void Bd5(AnonymousClass9VG r6) {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        UserJid userJid = this.A00;
        AnonymousClass08M r4 = paymentIncentiveViewModel.A00;
        int A0D = paymentIncentiveViewModel.A0D(userJid);
        C194969Vi r0 = paymentIncentiveViewModel.A06;
        r4.A0G(AnonymousClass9WE.A01(new AnonymousClass9VG(r0.A02(), r0.A03(), A0D)));
    }
}
