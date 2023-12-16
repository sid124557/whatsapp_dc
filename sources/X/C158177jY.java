package X;

import android.opengl.Matrix;

/* renamed from: X.7jY  reason: invalid class name and case insensitive filesystem */
public class C158177jY {
    public static final float[] A05 = {1.0f, 0.0f, -3.0f, 2.0f, 0.0f, 1.0f, -2.0f, 1.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 3.0f, -2.0f};
    public static final float[] A06 = {0.0f, -6.0f, 6.0f, 0.0f, 1.0f, -4.0f, 3.0f, 0.0f, 0.0f, -2.0f, 3.0f, 0.0f, 0.0f, 6.0f, -6.0f, 0.0f};
    public float A00 = -1.0f;
    public final float[] A01;
    public final float[] A02;
    public final float[] A03;
    public final float[] A04;

    public void A01(float[] fArr, float f) {
        float f2 = f * f;
        float[] fArr2 = fArr;
        Matrix.multiplyMV(fArr2, 0, this.A03, 0, new float[]{1.0f, f, f2, f2 * f}, 0);
    }

    public float A00() {
        float f = this.A00;
        float f2 = 0.0f;
        if (f >= 0.0f) {
            return f;
        }
        float f3 = 1.0f / ((float) 10);
        int i = 0;
        C124506Cq r5 = new C124506Cq(this.A01[0], this.A02[0]);
        C124506Cq r4 = new C124506Cq();
        float f4 = f3;
        do {
            float[] fArr = this.A04;
            A01(fArr, f4);
            r4.set(fArr[0], fArr[1]);
            f2 += AnonymousClass6C8.A00(r5.y, r4.y, r5.x - r4.x);
            r5.set(r4);
            i++;
            f4 += f3;
        } while (i < 10);
        this.A00 = f2;
        return f2;
    }

    public C158177jY(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        this.A04 = fArr3;
        float[] fArr4 = new float[16];
        this.A03 = fArr4;
        float[] fArr5 = fArr;
        this.A01 = fArr;
        float[] fArr6 = fArr2;
        this.A02 = fArr6;
        float[] fArr7 = A05;
        Matrix.multiplyMV(fArr3, 0, fArr7, 0, fArr5, 0);
        Matrix.multiplyMV(fArr3, 4, fArr7, 0, fArr6, 0);
        float[] fArr8 = A06;
        Matrix.multiplyMV(fArr3, 8, fArr8, 0, fArr5, 0);
        Matrix.multiplyMV(fArr3, 12, fArr8, 0, fArr6, 0);
        Matrix.transposeM(fArr4, 0, fArr3, 0);
    }
}
