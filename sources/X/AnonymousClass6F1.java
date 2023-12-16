package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.6F1  reason: invalid class name */
public final class AnonymousClass6F1 extends Animation {
    public final int A00;
    public final int A01;
    public final View A02;

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A01;
        int i2 = (int) (((float) i) + (((float) (this.A00 - i)) * f));
        View view = this.A02;
        C06560Yg.A0J(view, i2 - view.getTop());
    }

    public AnonymousClass6F1(View view, int i) {
        this.A00 = i;
        this.A01 = view.getTop();
        this.A02 = view;
        setDuration(300);
    }
}
