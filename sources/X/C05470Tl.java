package X;

import java.nio.FloatBuffer;

/* renamed from: X.0Tl  reason: invalid class name and case insensitive filesystem */
public class C05470Tl {
    public static final FloatBuffer A07;
    public static final FloatBuffer A08;
    public static final FloatBuffer A09;
    public static final FloatBuffer A0A;
    public static final FloatBuffer A0B;
    public static final FloatBuffer A0C;
    public static final float[] A0D;
    public static final float[] A0E;
    public static final float[] A0F;
    public static final float[] A0G;
    public static final float[] A0H;
    public static final float[] A0I;
    public int A00 = 2;
    public int A01 = 8;
    public int A02 = (A0D.length / 2);
    public int A03 = 8;
    public C02200Fg A04;
    public FloatBuffer A05 = A08;
    public FloatBuffer A06 = A07;

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        A0H = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0I = fArr2;
        A0B = AnonymousClass0X6.A01(fArr);
        A0C = AnonymousClass0X6.A01(fArr2);
        float[] fArr3 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        A0F = fArr3;
        float[] fArr4 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        A0G = fArr4;
        A09 = AnonymousClass0X6.A01(fArr3);
        A0A = AnonymousClass0X6.A01(fArr4);
        float[] fArr5 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0D = fArr5;
        float[] fArr6 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0E = fArr6;
        A07 = AnonymousClass0X6.A01(fArr5);
        A08 = AnonymousClass0X6.A01(fArr6);
    }

    public String toString() {
        C02200Fg r2 = this.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[Drawable2d: ");
        return AnonymousClass000.A0S(r2, A0o);
    }

    public C05470Tl(C02200Fg r3) {
        this.A04 = r3;
    }
}
