package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;

/* renamed from: X.75O  reason: invalid class name */
public class AnonymousClass75O implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public AnonymousClass75O(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A03 != 0) {
            int i = this.A00;
            int i2 = this.A01;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            ((ViewGroup.MarginLayoutParams) this.A02).setMargins(0, (int) ((animatedFraction * ((float) i)) + ((1.0f - animatedFraction) * ((float) i2))), 0, 0);
            return;
        }
        QuantitySelector quantitySelector = (QuantitySelector) this.A02;
        int i3 = this.A00;
        int i4 = this.A01;
        int A012 = C86604Kt.A01(valueAnimator);
        if (A012 == i3) {
            quantitySelector.A0B = true;
        }
        ViewGroup.LayoutParams layoutParams = quantitySelector.getLayoutParams();
        layoutParams.width = A012;
        quantitySelector.setLayoutParams(layoutParams);
        TextView textView = quantitySelector.A0F;
        if (A012 < (textView.getMeasuredWidth() * 2) + i4 + (((i4 - textView.getMeasuredWidth()) / 2) / 2)) {
            quantitySelector.A01();
        }
        if (A012 == i4) {
            quantitySelector.A0B = false;
            quantitySelector.A02.removeAllUpdateListeners();
        }
    }
}
