package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4O7  reason: invalid class name */
public class AnonymousClass4O7 extends Animation {
    public final /* synthetic */ C93324oK A00;

    public AnonymousClass4O7(C93324oK r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C93324oK r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.invalidate();
    }
}
