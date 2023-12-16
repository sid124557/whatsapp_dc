package X;

import android.widget.TextView;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9h9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9h9 implements Runnable {
    public final /* synthetic */ PaymentView A00;

    public final void run() {
        PaymentView paymentView = this.A00;
        TextView textView = paymentView.A0J;
        if (textView != null) {
            textView.startAnimation(paymentView.A04);
        }
    }

    public /* synthetic */ AnonymousClass9h9(PaymentView paymentView) {
        this.A00 = paymentView;
    }
}
