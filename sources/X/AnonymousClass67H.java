package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.67H  reason: invalid class name */
public class AnonymousClass67H extends AnimatorListenerAdapter {
    public float A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass67H(Object obj, Object obj2, float f, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = f;
        this.A02 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A03) {
            case 0:
                ((AnonymousClass66Z) this.A02).setForegroundScale(this.A00);
                return;
            case 1:
                ((AnonymousClass66Z) this.A02).setBackgroundScale(this.A00);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (2 - this.A03 != 0) {
            super.onAnimationEnd(animator);
            return;
        }
        super.onAnimationEnd(animator);
        if (this.A00 == 0.0f) {
            View view = (View) this.A02;
            view.setVisibility(8);
            view.setAlpha(1.0f);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (2 - this.A03 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        super.onAnimationStart(animator);
        if (this.A00 == 1.0f) {
            ((View) this.A02).setVisibility(0);
        }
    }
}
