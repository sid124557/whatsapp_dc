package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/* renamed from: X.5CJ  reason: invalid class name */
public class AnonymousClass5CJ {
    public static Animation A00(boolean z) {
        AlphaAnimation A0C;
        AnimationSet animationSet = new AnimationSet(true);
        if (z) {
            A0C = AnonymousClass4L0.A0C(0.0f, 1.0f);
        } else {
            A0C = AnonymousClass4L0.A0C(1.0f, 0.0f);
        }
        A0C.setDuration(125);
        animationSet.addAnimation(A0C);
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        }
        ScaleAnimation A0Q = C86634Kw.A0Q(f, f2);
        A0Q.setDuration(75);
        animationSet.addAnimation(A0Q);
        animationSet.setDuration(75);
        return animationSet;
    }
}
