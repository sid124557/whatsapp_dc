package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9jH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200949jH implements Runnable {
    public final /* synthetic */ AnonymousClass39Q A00;
    public final /* synthetic */ AnonymousClass9DC A01;
    public final /* synthetic */ PaymentView A02;

    public final void run() {
        UserJid A03;
        AnonymousClass9DC r5 = this.A01;
        PaymentView paymentView = this.A02;
        AnonymousClass39Q r4 = this.A00;
        AnonymousClass9U5 r3 = r5.A0M;
        C30481mW A75 = r5.A75(paymentView.getPaymentNote(), paymentView.getMentionedJids());
        C95814uZ r1 = r5.A0E;
        if (C627336j.A0K(r1)) {
            A03 = r5.A0G;
        } else {
            A03 = AnonymousClass32Y.A03(r1);
        }
        if (r3.A0K(r4, (AnonymousClass39R) null, A03, A75)) {
            r3.A05.A08(A75);
        }
    }

    public /* synthetic */ C200949jH(AnonymousClass39Q r1, AnonymousClass9DC r2, PaymentView paymentView) {
        this.A01 = r2;
        this.A02 = paymentView;
        this.A00 = r1;
    }
}
