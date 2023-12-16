package X;

import android.animation.ValueAnimator;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.7sO  reason: invalid class name and case insensitive filesystem */
public class C162567sO implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FormItemEditText A01;

    public C162567sO(FormItemEditText formItemEditText, int i) {
        this.A01 = formItemEditText;
        this.A00 = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        FormItemEditText formItemEditText = this.A01;
        formItemEditText.A0O[this.A00] = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        formItemEditText.invalidate();
    }
}
