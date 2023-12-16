package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.0H3  reason: invalid class name */
public class AnonymousClass0H3 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public static final void A00(ValueAnimator valueAnimator, AnonymousClass0H3 r3) {
        C162457s7.A0J(valueAnimator, 0);
        C152057Xj r0 = new C152057Xj();
        r0.A04(valueAnimator, 0);
        C157157hp.A00((C131266dJ) r3.A00, r0.A03(), (C835248t) r3.A01);
    }

    public AnonymousClass0H3(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A02 != 0) {
            A00(valueAnimator, this);
        } else {
            ((View) ((C08170dR) ((C15010qd) this.A00)).A00.A09.getParent()).invalidate();
        }
    }
}
