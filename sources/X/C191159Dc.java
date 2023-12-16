package X;

import com.whatsapp.payments.ui.MessageWithLinkWebViewActivity;
import com.whatsapp.payments.ui.PaymentWebViewActivity;

/* renamed from: X.9Dc  reason: invalid class name and case insensitive filesystem */
public abstract class C191159Dc extends PaymentWebViewActivity {
    public boolean A00 = false;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            MessageWithLinkWebViewActivity messageWithLinkWebViewActivity = (MessageWithLinkWebViewActivity) this;
            C64333Db r2 = ((C88834as) AnonymousClass0x9.A0K(this)).A4Z;
            C1899593h.A15(r2, messageWithLinkWebViewActivity);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, messageWithLinkWebViewActivity, C1899593h.A0W(r2, r1, messageWithLinkWebViewActivity));
            C1899593h.A14(r2, r1, messageWithLinkWebViewActivity);
            messageWithLinkWebViewActivity.A04 = (C53262mo) r2.AMi.get();
            messageWithLinkWebViewActivity.A02 = C1899593h.A0I(r2);
        }
    }

    public C191159Dc() {
        C204019og.A00(this, 98);
    }
}
