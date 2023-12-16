package X;

import android.widget.TextView;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.9h6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9h6 implements Runnable {
    public final /* synthetic */ PaymentAmountInputField A00;

    public final void run() {
        PaymentAmountInputField paymentAmountInputField = this.A00;
        TextView textView = paymentAmountInputField.A0A;
        if (textView != null) {
            textView.startAnimation(paymentAmountInputField.A09);
        }
    }

    public /* synthetic */ AnonymousClass9h6(PaymentAmountInputField paymentAmountInputField) {
        this.A00 = paymentAmountInputField;
    }
}
