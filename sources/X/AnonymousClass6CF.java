package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.6CF  reason: invalid class name */
public class AnonymousClass6CF extends AnimatorListenerAdapter {
    public final /* synthetic */ TransitionValues A00;
    public final /* synthetic */ AnonymousClass7XE A01;
    public final /* synthetic */ AnonymousClass6EJ A02;

    public AnonymousClass6CF(TransitionValues transitionValues, AnonymousClass7XE r2, AnonymousClass6EJ r3) {
        this.A02 = r3;
        this.A00 = transitionValues;
        this.A01 = r2;
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        TransitionValues transitionValues = this.A00;
        transitionValues.view.setAlpha(1.0f);
        AnonymousClass7XE r2 = this.A01;
        if (((float) r2.A07) / ((float) r2.A06) < 1.0f || ((float) r2.A04) / ((float) r2.A05) < 1.0f) {
            ViewParent parent = transitionValues.view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipChildren(false);
            }
        }
    }
}
