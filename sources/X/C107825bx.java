package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.5bx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107825bx implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C94134px A03;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C94134px r4 = this.A03;
        View view = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        view.setBackgroundColor(C86604Kt.A01(valueAnimator));
        if (i == AnonymousClass5Yj.A01(r4.A01) && C86604Kt.A01(valueAnimator) == i2) {
            view.setBackgroundResource(0);
        }
    }

    public /* synthetic */ C107825bx(View view, C94134px r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = view;
        this.A00 = i;
        this.A01 = i2;
    }
}
