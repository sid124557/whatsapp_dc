package X;

import android.opengl.Matrix;

/* renamed from: X.7ia  reason: invalid class name and case insensitive filesystem */
public class C157607ia {
    public static final float[] A06;
    public long A00;
    public C151837Wm A01 = null;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public float[] A05;

    public C157607ia() {
        float[] fArr = A06;
        this.A04 = fArr;
        this.A05 = fArr;
        this.A03 = fArr;
    }

    static {
        float[] fArr = new float[16];
        A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }
}
