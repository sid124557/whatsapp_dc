package X;

import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.5Lo  reason: invalid class name and case insensitive filesystem */
public class C103105Lo {
    public void A00(C151687Vx r4) {
        float[] A0T = AnonymousClass4L0.A0T();
        // fill-array-data instruction
        A0T[0] = 0;
        A0T[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A0T);
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new OvershootInterpolator(1.2f));
        ofFloat.addListener(new C188658zH(r4, 1, this));
        C86604Kt.A0w(ofFloat, r4, 22);
        ofFloat.start();
    }
}
