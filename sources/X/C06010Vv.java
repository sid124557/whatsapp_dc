package X;

import android.graphics.Color;

/* renamed from: X.0Vv  reason: invalid class name and case insensitive filesystem */
public class C06010Vv {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public static C06010Vv A00(float f, float f2, float f3) {
        float f4 = f3;
        float log = ((float) Math.log((((double) (f2 * AnonymousClass0TN.A0A.A03)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (double) ((3.1415927f * f3) / 180.0f);
        return new C06010Vv(f4, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public int A02(AnonymousClass0TN r18) {
        float f;
        float f2 = this.A02;
        if (((double) f2) != 0.0d) {
            double d = (double) this.A04;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                AnonymousClass0TN r10 = r18;
                float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) r10.A04), 0.73d), 1.1111111111111112d);
                double d2 = (double) ((this.A03 * 3.1415927f) / 180.0f);
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * r10.A06 * r10.A07;
                float pow2 = (r10.A00 * ((float) Math.pow(((double) this.A04) / 100.0d, (1.0d / ((double) r10.A01)) / ((double) r10.A08)))) / r10.A05;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f3 = (((0.305f + pow2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
                float f4 = cos2 * f3;
                float f5 = f3 * sin;
                float f6 = pow2 * 460.0f;
                float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
                float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
                float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
                double abs = (double) Math.abs(f7);
                float signum = Math.signum(f7);
                float f10 = 100.0f / r10.A02;
                float pow3 = signum * f10 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs * 27.13d) / (400.0d - abs))), 2.380952380952381d));
                double abs2 = (double) Math.abs(f8);
                float signum2 = Math.signum(f8) * f10 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs2 * 27.13d) / (400.0d - abs2))), 2.380952380952381d));
                double abs3 = (double) Math.abs(f9);
                float signum3 = Math.signum(f9) * f10 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs3 * 27.13d) / (400.0d - abs3))), 2.380952380952381d));
                float[] fArr = r10.A09;
                float f11 = pow3 / fArr[0];
                float f12 = signum2 / fArr[1];
                float f13 = signum3 / fArr[2];
                float[][] fArr2 = C05210Sl.A01;
                float[] fArr3 = fArr2[0];
                float A012 = AnonymousClass002.A01(fArr3, f13, AnonymousClass002.A01(fArr3, f12, fArr3[0] * f11, 1), 2);
                float[] fArr4 = fArr2[1];
                float A013 = AnonymousClass002.A01(fArr4, f13, AnonymousClass002.A01(fArr4, f12, fArr4[0] * f11, 1), 2);
                float[] fArr5 = fArr2[2];
                return AnonymousClass0YI.A02((double) A012, (double) A013, (double) ((f11 * fArr5[0]) + (f12 * fArr5[1]) + (f13 * fArr5[2])));
            }
        }
        f = 0.0f;
        AnonymousClass0TN r102 = r18;
        float pow4 = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) r102.A04), 0.73d), 1.1111111111111112d);
        double d22 = (double) ((this.A03 * 3.1415927f) / 180.0f);
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f * 3846.1538f * r102.A06 * r102.A07;
        float pow22 = (r102.A00 * ((float) Math.pow(((double) this.A04) / 100.0d, (1.0d / ((double) r102.A01)) / ((double) r102.A08)))) / r102.A05;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f32 = (((0.305f + pow22) * 23.0f) * pow4) / (((cos3 * 23.0f) + ((11.0f * pow4) * cos22)) + ((pow4 * 108.0f) * sin2));
        float f42 = cos22 * f32;
        float f52 = f32 * sin2;
        float f62 = pow22 * 460.0f;
        float f72 = (((451.0f * f42) + f62) + (288.0f * f52)) / 1403.0f;
        float f82 = ((f62 - (891.0f * f42)) - (261.0f * f52)) / 1403.0f;
        float f92 = ((f62 - (f42 * 220.0f)) - (f52 * 6300.0f)) / 1403.0f;
        double abs4 = (double) Math.abs(f72);
        float signum4 = Math.signum(f72);
        float f102 = 100.0f / r102.A02;
        float pow32 = signum4 * f102 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs4 * 27.13d) / (400.0d - abs4))), 2.380952380952381d));
        double abs22 = (double) Math.abs(f82);
        float signum22 = Math.signum(f82) * f102 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs22 * 27.13d) / (400.0d - abs22))), 2.380952380952381d));
        double abs32 = (double) Math.abs(f92);
        float signum32 = Math.signum(f92) * f102 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs32 * 27.13d) / (400.0d - abs32))), 2.380952380952381d));
        float[] fArr6 = r102.A09;
        float f112 = pow32 / fArr6[0];
        float f122 = signum22 / fArr6[1];
        float f132 = signum32 / fArr6[2];
        float[][] fArr22 = C05210Sl.A01;
        float[] fArr32 = fArr22[0];
        float A0122 = AnonymousClass002.A01(fArr32, f132, AnonymousClass002.A01(fArr32, f122, fArr32[0] * f112, 1), 2);
        float[] fArr42 = fArr22[1];
        float A0132 = AnonymousClass002.A01(fArr42, f132, AnonymousClass002.A01(fArr42, f122, fArr42[0] * f112, 1), 2);
        float[] fArr52 = fArr22[2];
        return AnonymousClass0YI.A02((double) A0122, (double) A0132, (double) ((f112 * fArr52[0]) + (f122 * fArr52[1]) + (f132 * fArr52[2])));
    }

    public C06010Vv(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A03 = f;
        this.A02 = f2;
        this.A04 = f3;
        this.A05 = f4;
        this.A00 = f5;
        this.A01 = f6;
    }

    public static C06010Vv A01(AnonymousClass0TN r17, int i) {
        float f;
        float A002 = C05210Sl.A00(Color.red(i));
        float A003 = C05210Sl.A00(Color.green(i));
        float A004 = C05210Sl.A00(Color.blue(i));
        float[][] fArr = C05210Sl.A02;
        float[] fArr2 = fArr[0];
        float A012 = AnonymousClass002.A01(fArr2, A004, AnonymousClass002.A01(fArr2, A003, fArr2[0] * A002, 1), 2);
        float[] fArr3 = fArr[1];
        float A013 = AnonymousClass002.A01(fArr3, A004, AnonymousClass002.A01(fArr3, A003, fArr3[0] * A002, 1), 2);
        float[] fArr4 = fArr[2];
        float f2 = (A002 * fArr4[0]) + (A003 * fArr4[1]) + (A004 * fArr4[2]);
        float[] fArr5 = {A012, A013, f2};
        float[][] fArr6 = C05210Sl.A03;
        float f3 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f4 = fArr5[1];
        float A014 = AnonymousClass002.A01(fArr7, f2, AnonymousClass002.A01(fArr7, f4, fArr7[0] * f3, 1), 2);
        float[] fArr8 = fArr6[1];
        float A015 = AnonymousClass002.A01(fArr8, f2, AnonymousClass002.A01(fArr8, f4, fArr8[0] * f3, 1), 2);
        float[] fArr9 = fArr6[2];
        float f5 = (f3 * fArr9[0]) + (f4 * fArr9[1]) + (f2 * fArr9[2]);
        AnonymousClass0TN r7 = r17;
        float[] fArr10 = r7.A09;
        float f6 = fArr10[0] * A014;
        float f7 = fArr10[1] * A015;
        float f8 = fArr10[2] * f5;
        float f9 = r7.A02;
        float pow = (float) Math.pow(((double) (Math.abs(f6) * f9)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f7) * f9)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (f9 * Math.abs(f8))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f10 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f11 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f12 = signum2 * 20.0f;
        float f13 = (((signum * 20.0f) + f12) + (21.0f * signum3)) / 20.0f;
        float f14 = (((signum * 40.0f) + f12) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f11, (double) f10)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f15 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f14 * r7.A05) / r7.A00), (double) (r7.A01 * r7.A08))) * 100.0f;
        float f16 = r7.A03;
        if (((double) atan2) < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) r7.A04), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * r7.A06) * r7.A07) * ((float) Math.sqrt((double) ((f10 * f10) + (f11 * f11))))) / (f13 + 0.305f)), 0.9d)) * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float f17 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * pow5 * f16) + 1.0f))) * 43.85965f;
        double d2 = (double) f15;
        return new C06010Vv(atan2, pow5, pow4, f17, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }
}
