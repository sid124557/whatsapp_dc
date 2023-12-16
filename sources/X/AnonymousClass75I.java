package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.HeaderBehavior;

/* renamed from: X.75I  reason: invalid class name */
public class AnonymousClass75I implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass75I(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A03;
        Object obj = this.A00;
        if (i != 0) {
            ((AnonymousClass4QR) obj).A02((View) this.A01, (View) this.A02, valueAnimator.getAnimatedFraction());
            return;
        }
        ((HeaderBehavior) obj).A0M((View) this.A01, (CoordinatorLayout) this.A02, C86604Kt.A01(valueAnimator));
    }
}
