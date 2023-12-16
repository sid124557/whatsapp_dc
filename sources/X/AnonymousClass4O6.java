package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4O6  reason: invalid class name */
public class AnonymousClass4O6 extends Animation {
    public final /* synthetic */ AnonymousClass6FC A00;

    public AnonymousClass4O6(AnonymousClass6FC r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass6FC r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.invalidate();
    }
}
