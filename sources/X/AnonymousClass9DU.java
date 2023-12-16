package X;

import com.whatsapp.payments.GlobalPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;

/* renamed from: X.9DU  reason: invalid class name */
public abstract class AnonymousClass9DU extends PaymentTransactionDetailsListActivity {
    public boolean A00 = false;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            GlobalPaymentTransactionDetailActivity globalPaymentTransactionDetailActivity = (GlobalPaymentTransactionDetailActivity) this;
            C88834as r4 = (C88834as) AnonymousClass0x9.A0K(this);
            C64333Db r2 = r4.A4Z;
            C1899593h.A15(r2, globalPaymentTransactionDetailActivity);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, globalPaymentTransactionDetailActivity, C1899593h.A0W(r2, r1, globalPaymentTransactionDetailActivity));
            AnonymousClass97V.A0Y(r2, r1, globalPaymentTransactionDetailActivity);
            AnonymousClass97V.A0X(r2, r1, globalPaymentTransactionDetailActivity);
            globalPaymentTransactionDetailActivity.A0M = C1899593h.A0I(r2);
            AnonymousClass97V.A0L(r4, r2, r1, globalPaymentTransactionDetailActivity, r2.AMe.get());
            AnonymousClass97V.A0C(r4, r2, r1, globalPaymentTransactionDetailActivity);
            globalPaymentTransactionDetailActivity.A00 = (AnonymousClass5PG) r1.A5d.get();
        }
    }

    public AnonymousClass9DU() {
        C204019og.A00(this, 6);
    }
}
