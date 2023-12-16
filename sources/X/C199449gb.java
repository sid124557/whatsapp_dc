package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.List;

/* renamed from: X.9gb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199449gb implements Runnable {
    public final /* synthetic */ AnonymousClass9dS A00;

    public final void run() {
        String str;
        List list;
        AnonymousClass39R r0;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00.A00;
        AnonymousClass9U5 r4 = indiaUpiSendPaymentActivity.A0M;
        PaymentView paymentView = indiaUpiSendPaymentActivity.A0N;
        if (paymentView != null) {
            str = paymentView.getPaymentNote();
        } else {
            str = "";
        }
        PaymentView paymentView2 = indiaUpiSendPaymentActivity.A0N;
        if (paymentView2 != null) {
            list = paymentView2.getMentionedJids();
        } else {
            list = null;
        }
        C30481mW A75 = indiaUpiSendPaymentActivity.A75(str, list);
        UserJid userJid = indiaUpiSendPaymentActivity.A0E;
        C626936e.A06(userJid);
        AnonymousClass39Q r1 = indiaUpiSendPaymentActivity.A09;
        PaymentView paymentView3 = indiaUpiSendPaymentActivity.A0N;
        if (paymentView3 != null) {
            r0 = paymentView3.getPaymentBackground();
        } else {
            r0 = null;
        }
        if (r4.A0K(r1, r0, userJid, A75)) {
            r4.A05.A08(A75);
        }
    }

    public /* synthetic */ C199449gb(AnonymousClass9dS r1) {
        this.A00 = r1;
    }
}
