package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;

/* renamed from: X.97Z  reason: invalid class name */
public abstract class AnonymousClass97Z extends C89644eZ {
    public boolean A00 = false;

    public static void A0C(C64333Db r1, C107695bk r2, PaymentTransactionHistoryActivity paymentTransactionHistoryActivity) {
        paymentTransactionHistoryActivity.A04 = (C620733j) r1.AbU.get();
        paymentTransactionHistoryActivity.A06 = (C66533Lu) r1.AFp.get();
        paymentTransactionHistoryActivity.A0B = (AnonymousClass9U4) r1.AQC.get();
        paymentTransactionHistoryActivity.A0A = (C1907099n) r1.AQ8.get();
        paymentTransactionHistoryActivity.A08 = (C194539Ti) r1.AMj.get();
        paymentTransactionHistoryActivity.A0C = (C196419ao) r2.A8e.get();
        paymentTransactionHistoryActivity.A09 = (C29271iY) r1.AQ0.get();
        paymentTransactionHistoryActivity.A0I = (C195219Wq) r1.AQK.get();
        paymentTransactionHistoryActivity.A05 = (C66543Lv) r1.A71.get();
        paymentTransactionHistoryActivity.A0G = (C194459Sy) r2.A8y.get();
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = (PaymentTransactionHistoryActivity) this;
            C64333Db r2 = ((C88834as) AnonymousClass0x9.A0K(this)).A4Z;
            C1899593h.A15(r2, paymentTransactionHistoryActivity);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, paymentTransactionHistoryActivity, C1899593h.A0W(r2, r1, paymentTransactionHistoryActivity));
            A0C(r2, r1, paymentTransactionHistoryActivity);
        }
    }

    public AnonymousClass97Z() {
        C204019og.A00(this, 113);
    }
}
