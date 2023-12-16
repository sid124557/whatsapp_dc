package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.6F3  reason: invalid class name */
public class AnonymousClass6F3 extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass7T7 A02;

    public AnonymousClass6F3(View view, AnonymousClass7T7 r3, int i) {
        this.A02 = r3;
        this.A01 = i;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i + ((int) (((float) (this.A01 - i)) * f));
        AnonymousClass7T7 r1 = this.A02;
        View view = r1.A01;
        C86624Kv.A0w(view, i2);
        view.requestLayout();
        r1.A00((float) i2);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
