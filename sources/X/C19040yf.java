package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.0yf  reason: invalid class name and case insensitive filesystem */
public class C19040yf extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4ZC A01;

    public C19040yf(AnonymousClass4ZC r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i;
        if (f < 1.0f) {
            int i2 = this.A00;
            i = i2 - ((int) (((float) i2) * f));
        } else {
            i = 0;
        }
        AnonymousClass4ZC r1 = this.A01;
        r1.getLayoutParams().height = i;
        r1.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
