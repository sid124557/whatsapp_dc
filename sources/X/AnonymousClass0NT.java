package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.0NT  reason: invalid class name */
public class AnonymousClass0NT {
    public final Matrix A00 = AnonymousClass002.A05();
    public final View A01;
    public final float[] A02 = new float[2];

    public PointF A00(PointF pointF) {
        float[] fArr = this.A02;
        float f = pointF.x;
        View view = this.A01;
        fArr[0] = f - ((float) view.getLeft());
        fArr[1] = pointF.y - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = this.A00;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        return new PointF(fArr[0], fArr[1]);
    }

    public AnonymousClass0NT(View view) {
        this.A01 = view;
    }
}
