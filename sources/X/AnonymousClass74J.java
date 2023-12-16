package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/* renamed from: X.74J  reason: invalid class name */
public final class AnonymousClass74J {
    public static final Animation A00(boolean z) {
        AnonymousClass3Z6 A02;
        AnonymousClass3Z6 A022;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (z) {
            A02 = AnonymousClass3Z6.A02(valueOf, valueOf2);
        } else {
            A02 = AnonymousClass3Z6.A02(valueOf2, valueOf);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(AnonymousClass001.A05(A02.first), AnonymousClass001.A05(A02.second));
        alphaAnimation.setDuration(160);
        if (z) {
            A022 = AnonymousClass3Z6.A02(valueOf, valueOf2);
        } else {
            A022 = AnonymousClass3Z6.A02(valueOf2, valueOf);
        }
        float A05 = AnonymousClass001.A05(A022.first);
        float A052 = AnonymousClass001.A05(A022.second);
        ScaleAnimation scaleAnimation = new ScaleAnimation(A05, A052, A05, A052, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(160);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(160);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }
}
