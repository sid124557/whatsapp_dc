package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.4OA  reason: invalid class name */
public class AnonymousClass4OA extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5RH A01;

    public AnonymousClass4OA(AnonymousClass5RH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass5RH r3 = this.A01;
        ViewGroup.LayoutParams layoutParams = r3.A01.getLayoutParams();
        int i = this.A00;
        layoutParams.height = i - ((int) (((float) i) * f));
        r3.A01.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
