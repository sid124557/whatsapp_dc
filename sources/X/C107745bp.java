package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.5bp  reason: invalid class name and case insensitive filesystem */
public class C107745bp implements ValueAnimator.AnimatorUpdateListener {
    public final View A00;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.A00;
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(view);
        A0r.setMargins(A0r.leftMargin, C86604Kt.A01(valueAnimator), A0r.rightMargin, A0r.bottomMargin);
        view.setLayoutParams(A0r);
    }

    public C107745bp(View view) {
        this.A00 = view;
    }
}
