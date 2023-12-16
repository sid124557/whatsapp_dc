package X;

import android.view.animation.Interpolator;

/* renamed from: X.0af  reason: invalid class name and case insensitive filesystem */
public abstract class C07310af implements Interpolator {
    public final float A00;
    public final float[] A01;

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.A01;
        int length = fArr.length;
        int min = Math.min((int) (((float) (length - 1)) * f), length - 2);
        float f2 = this.A00;
        float f3 = (f - (((float) min) * f2)) / f2;
        return AnonymousClass001.A00(fArr[min + 1], fArr[min], f3);
    }

    public C07310af(float[] fArr) {
        this.A01 = fArr;
        this.A00 = 1.0f / ((float) (fArr.length - 1));
    }
}
