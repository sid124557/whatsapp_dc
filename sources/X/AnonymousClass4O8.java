package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4O8  reason: invalid class name */
public class AnonymousClass4O8 extends Animation {
    public final /* synthetic */ AnonymousClass5TP A00;

    public AnonymousClass4O8(AnonymousClass5TP r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass5TP r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.A0C.invalidate();
    }
}
