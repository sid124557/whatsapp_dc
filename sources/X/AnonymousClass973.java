package X;

import android.view.animation.Animation;
import android.widget.TextView;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.973  reason: invalid class name */
public class AnonymousClass973 extends C167047zg {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ PaymentAmountInputField A01;

    public AnonymousClass973(TextView textView, PaymentAmountInputField paymentAmountInputField) {
        this.A01 = paymentAmountInputField;
        this.A00 = textView;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.setVisibility(8);
    }
}
