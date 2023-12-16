package X;

import android.animation.TimeInterpolator;

/* renamed from: X.5bo  reason: invalid class name and case insensitive filesystem */
public class C107735bo implements TimeInterpolator {
    public final C378124c A00;

    public float getInterpolation(float f) {
        if (((double) f) > 0.5d) {
            return Math.min(f, (float) Double.longBitsToDouble(this.A00.A00.get()));
        }
        return 0.0f;
    }

    public C107735bo(C378124c r1) {
        this.A00 = r1;
    }
}
