package X;

import android.animation.ValueAnimator;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.9Wz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195289Wz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PaymentAmountInputField A00;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C195289Wz.super.setTextSize(0, AnonymousClass001.A05(valueAnimator.getAnimatedValue()));
    }

    public /* synthetic */ C195289Wz(PaymentAmountInputField paymentAmountInputField) {
        this.A00 = paymentAmountInputField;
    }
}
