package X;

/* renamed from: X.7hW  reason: invalid class name and case insensitive filesystem */
public final class C156977hW {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;

    public static C156977hW A00(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f;
        float f10 = ((f - f3) + f5) - f7;
        float f11 = f2;
        float f12 = ((f2 - f4) + f6) - f8;
        if (f10 == 0.0f && f12 == 0.0f) {
            return new C156977hW(f3 - f9, f5 - f3, f9, f4 - f2, f6 - f4, f11, 0.0f, 0.0f, 1.0f);
        }
        float f13 = f3 - f5;
        float f14 = f7 - f5;
        float f15 = f4 - f6;
        float f16 = f8 - f6;
        float f17 = (f13 * f16) - (f14 * f15);
        float f18 = ((f16 * f10) - (f14 * f12)) / f17;
        float f19 = ((f13 * f12) - (f10 * f15)) / f17;
        return new C156977hW((f18 * f3) + (f3 - f9), (f19 * f7) + (f7 - f9), f9, (f4 - f11) + (f18 * f4), (f8 - f11) + (f19 * f8), f11, f18, f19, 1.0f);
    }

    public C156977hW(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A00 = f;
        this.A01 = f4;
        this.A02 = f7;
        this.A03 = f2;
        this.A04 = f5;
        this.A05 = f8;
        this.A06 = f3;
        this.A07 = f6;
        this.A08 = f9;
    }
}
