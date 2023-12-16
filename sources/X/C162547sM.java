package X;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: X.7sM  reason: invalid class name and case insensitive filesystem */
public class C162547sM implements TypeEvaluator {
    public final Matrix A00;
    public final float[] A01;
    public final float[] A02;
    public final /* synthetic */ C160787oJ A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C162547sM(C160787oJ r1) {
        this();
        this.A03 = r1;
    }

    public /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        this.A03.A02 = f;
        float[] fArr = this.A02;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.A01;
        ((Matrix) obj2).getValues(fArr2);
        int i = 0;
        do {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = f3 + ((f2 - f3) * f);
            i++;
        } while (i < 9);
        Matrix matrix = this.A00;
        matrix.setValues(fArr2);
        return matrix;
    }

    public C162547sM() {
        this.A02 = new float[9];
        this.A01 = new float[9];
        this.A00 = new Matrix();
    }
}
