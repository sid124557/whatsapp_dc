package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;

/* renamed from: X.5bs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107775bs implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ QuantitySelector A02;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        QuantitySelector quantitySelector = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        int A012 = C86604Kt.A01(valueAnimator);
        if (A012 == i) {
            quantitySelector.A0B = true;
        }
        ViewGroup.LayoutParams layoutParams = quantitySelector.getLayoutParams();
        layoutParams.width = A012;
        quantitySelector.setLayoutParams(layoutParams);
        int measuredWidth = quantitySelector.A0H.getMeasuredWidth();
        TextView textView = quantitySelector.A0F;
        if (A012 > i + (textView.getMeasuredWidth() * 2) + (((measuredWidth - textView.getMeasuredWidth()) / 2) / 2)) {
            quantitySelector.A02();
        }
        if (A012 == i2) {
            quantitySelector.A0B = false;
            quantitySelector.A02.removeAllUpdateListeners();
        }
    }

    public /* synthetic */ C107775bs(QuantitySelector quantitySelector, int i, int i2) {
        this.A02 = quantitySelector;
        this.A00 = i;
        this.A01 = i2;
    }
}
