package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0vb  reason: invalid class name and case insensitive filesystem */
public class C17450vb extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public final int A02;

    public C17450vb(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A02 != 0) {
            ((C06290Wz) this.A01).remove(animator);
            ((C10560i8) this.A00).A0C.remove(animator);
            return;
        }
        C04910Rd.A01((View) this.A01, (Rect) null);
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A02 != 0) {
            super.onAnimationStart(animator);
        } else {
            ((C10560i8) this.A00).A0C.add(animator);
        }
    }
}
