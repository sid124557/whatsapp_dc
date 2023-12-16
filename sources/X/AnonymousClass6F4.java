package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.6F4  reason: invalid class name */
public class AnonymousClass6F4 extends Animation {
    public final int A00;
    public final int A01;
    public final View A02;
    public final /* synthetic */ C111445i6 A03;

    public AnonymousClass6F4(View view, C111445i6 r3, int i) {
        this.A03 = r3;
        this.A02 = view;
        this.A01 = i;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i + ((int) (((float) (this.A01 - i)) * f));
        View view = this.A02;
        C86624Kv.A0w(view, i2);
        view.requestLayout();
        C111445i6 r2 = this.A03;
        C111445i6.A03(r2, (float) (i2 + r2.A0S.getHeight()), false);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
