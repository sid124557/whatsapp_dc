package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4OB  reason: invalid class name */
public class AnonymousClass4OB extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C113245l7 A01;
    public final /* synthetic */ AnonymousClass4M8 A02;

    public AnonymousClass4OB(C113245l7 r1, AnonymousClass4M8 r2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.A00) * f);
        AnonymousClass4M8 r0 = this.A02;
        r0.A00 = i;
        r0.invalidateSelf();
    }

    public boolean willChangeBounds() {
        return false;
    }
}
