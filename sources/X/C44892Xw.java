package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.2Xw  reason: invalid class name and case insensitive filesystem */
public class C44892Xw {
    public Bitmap A00;
    public Matrix A01;

    public boolean A00() {
        Matrix matrix = this.A01;
        if (matrix != null) {
            float[] fArr = {0.0f, 1.0f};
            matrix.mapVectors(fArr);
            if (fArr[0] != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public C44892Xw(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
