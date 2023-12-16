package X;

import android.graphics.RectF;

/* renamed from: X.6l4  reason: invalid class name and case insensitive filesystem */
public abstract class C135676l4 extends C105425Uw {
    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        float A0X = A0X();
        RectF rectF2 = rectF;
        float f5 = f3;
        float f6 = f4;
        if (A0X != 0.0f) {
            float f7 = f3 - f;
            float f8 = f4 - f2;
            if (f7 / f8 < A0X) {
                f8 = f7 / A0X;
            } else {
                f7 = f8 * A0X;
            }
            float f9 = (f + f3) / 2.0f;
            float f10 = (f2 + f4) / 2.0f;
            float f11 = f7 / 2.0f;
            float f12 = f8 / 2.0f;
            super.A0M(rectF2, f9 - f11, f10 - f12, f9 + f11, f10 + f12);
            return;
        }
        super.A0M(rectF, f, f2, f5, f6);
    }

    public float A0X() {
        return 0.0f;
    }
}
