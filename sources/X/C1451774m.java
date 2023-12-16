package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.74m  reason: invalid class name and case insensitive filesystem */
public class C1451774m {
    public static Matrix A00(Matrix matrix, RectF rectF, float f) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        matrix.setRotate(f);
        float f2 = 0.0f;
        if (f != 90.0f) {
            if (f == 180.0f) {
                f2 = -rectF.width();
            } else if (f == 270.0f) {
                matrix.preTranslate(-rectF.width(), 0.0f);
                return matrix;
            } else {
                if (f != 0.0f) {
                    throw AnonymousClass6CA.A0N();
                }
                return matrix;
            }
        }
        matrix.preTranslate(f2, -rectF.height());
        return matrix;
    }
}
