package X;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.02L  reason: invalid class name */
public final class AnonymousClass02L extends GestureDetector.SimpleOnGestureListener {
    public final AnonymousClass03E A00;

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass03E r3 = this.A00;
        if (r3.getContext() == null) {
            return false;
        }
        float translationY = r3.getTranslationY();
        if (f2 > 0.0f) {
            r3.A01((int) Math.abs(((((float) r3.getHeight()) - translationY) / f2) * 1000.0f));
        } else {
            r3.A02((Animator.AnimatorListener) null, (int) Math.abs((translationY / (-f2)) * 1000.0f));
        }
        r3.A0B = true;
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass03E r3 = this.A00;
        if (r3.getTranslationY() <= 0.0f && f2 > 0.0f) {
            return false;
        }
        r3.A0B = false;
        return true;
    }

    public AnonymousClass02L(AnonymousClass03E r1) {
        this.A00 = r1;
    }
}
