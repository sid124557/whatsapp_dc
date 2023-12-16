package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.02V  reason: invalid class name */
public class AnonymousClass02V extends View {
    public final Drawable A00;

    public void setIsSwirlAnimating(boolean z) {
        Drawable drawable = this.A00;
        if (drawable instanceof AnonymousClass013) {
            AnonymousClass013 r2 = (AnonymousClass013) drawable;
            if (false != z) {
                ValueAnimator valueAnimator = r2.A01;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    r2.A01 = null;
                }
                ValueAnimator valueAnimator2 = new ValueAnimator();
                r2.A01 = valueAnimator2;
                valueAnimator2.addUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
                r2.A01.setRepeatCount(-1);
                throw new NullPointerException("array-length");
            }
        }
    }

    public AnonymousClass02V(Context context, C153427bI r4, C142316x0 r5, int i, int i2) {
        super(context);
        C153867c9.A01(context, r4);
        C161937qr.A06(r5, C141206vC.A01);
        this.A00 = new AnonymousClass016(i, (float) i2);
        setLayerType(2, (Paint) null);
        setAlpha(0.08f);
        setBackground(this.A00);
    }

    public void A00(int i, int i2) {
        setMeasuredDimension(i, i2);
    }
}
