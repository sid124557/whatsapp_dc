package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0Ym  reason: invalid class name and case insensitive filesystem */
public class C06610Ym implements TypeEvaluator {
    public float[] A00;

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.A00;
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }

    public C06610Ym(float[] fArr) {
        this.A00 = fArr;
    }
}
