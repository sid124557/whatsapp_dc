package X;

/* renamed from: X.0TN  reason: invalid class name */
public final class AnonymousClass0TN {
    public static final AnonymousClass0TN A0A;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float[] A09;

    static {
        float f;
        float f2;
        float f3;
        float[] fArr = C05210Sl.A00;
        float pow = ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
        float f4 = (float) ((((double) pow) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C05210Sl.A03;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr[1];
        float A012 = AnonymousClass002.A01(fArr3, f6, fArr3[0] * f5, 1);
        float f7 = fArr[2];
        float A013 = AnonymousClass002.A01(fArr3, f7, A012, 2);
        float[] fArr4 = fArr2[1];
        float A014 = AnonymousClass002.A01(fArr4, f7, AnonymousClass002.A01(fArr4, f6, fArr4[0] * f5, 1), 2);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[0]) + (f6 * fArr5[1]) + (f7 * fArr5[2]);
        float f9 = (2.0f / 10.0f) + 0.8f;
        if (((double) f9) >= 0.9d) {
            f = (f9 - 0.9f) * 10.0f;
            f2 = 0.59f;
            f3 = 0.69f;
        } else {
            f = (f9 - 0.8f) * 10.0f;
            f2 = 0.525f;
            f3 = 0.59f;
        }
        float f10 = f2 + ((f3 - f2) * f);
        float exp = (1.0f - (((float) Math.exp((double) (((-f4) - 42.0f) / 92.0f))) * 0.2777778f)) * f9;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / A013) * exp) + 1.0f) - exp, (((100.0f / A014) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f11 = 1.0f / ((5.0f * f4) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (f12 * f4) + (0.1f * f13 * f13 * ((float) Math.cbrt(((double) f4) * 5.0d)));
        float f14 = pow / fArr[1];
        double d2 = (double) f14;
        float pow2 = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow3 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f8)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * A013)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * A014)) / 100.0d, 0.42d), pow3};
        float f15 = fArr7[0];
        float f16 = fArr7[1];
        float[] fArr8 = fArr6;
        float f17 = f14;
        A0A = new AnonymousClass0TN(fArr8, f17, ((((f15 * 400.0f) / (f15 + 27.13f)) * 2.0f) + ((f16 * 400.0f) / (f16 + 27.13f)) + (((400.0f * pow3) / (pow3 + 27.13f)) * 0.05f)) * pow2, pow2, pow2, f10, f9, cbrt, (float) Math.pow((double) cbrt, 0.25d), ((float) Math.sqrt(d2)) + 1.48f);
    }

    public AnonymousClass0TN(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A04 = f;
        this.A00 = f2;
        this.A05 = f3;
        this.A07 = f4;
        this.A01 = f5;
        this.A06 = f6;
        this.A09 = fArr;
        this.A02 = f7;
        this.A03 = f8;
        this.A08 = f9;
    }
}
