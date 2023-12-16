package X;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: X.7sL  reason: invalid class name and case insensitive filesystem */
public class C162537sL implements TypeEvaluator {
    public FloatEvaluator A00 = new FloatEvaluator();
    public final /* synthetic */ C160787oJ A01;

    public C162537sL(C160787oJ r2) {
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.A00.evaluate(f, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
