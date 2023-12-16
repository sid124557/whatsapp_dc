package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.8zE  reason: invalid class name and case insensitive filesystem */
public class C188628zE extends AnimatorListenerAdapter {
    public float A00;
    public Object A01;
    public final int A02;

    public C188628zE(Object obj, float f, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = f;
    }

    public void onAnimationCancel(Animator animator) {
        ((View) this.A01).setX(this.A00);
    }

    public void onAnimationEnd(Animator animator) {
        ((View) this.A01).setX(this.A00);
    }
}
