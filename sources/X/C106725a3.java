package X;

import android.graphics.Point;

/* renamed from: X.5a3  reason: invalid class name and case insensitive filesystem */
public final class C106725a3 {
    public final C110885hC A00;
    public final C157467iL A01 = new C157467iL();
    public final float[] A02 = AnonymousClass4L0.A0T();

    public static double A02(double d) {
        return ((Math.atan(Math.exp((1.0d - (d * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d;
    }

    public double A03(float f) {
        AnonymousClass4PH r0 = this.A00.A0R;
        return (double) (f / (((float) r0.A0J) * r0.A0B));
    }

    public Point A04(C108975ds r11) {
        double d = r11.A00;
        double d2 = r11.A01;
        float[] fArr = this.A02;
        A08(fArr, A01(d2), A00(d));
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public C108975ds A05(float f, float f2) {
        float[] fArr = this.A02;
        A0A(fArr, f, f2);
        return C108975ds.A00(A02((double) fArr[1]), (((double) fArr[0]) * 360.0d) - 180.0d);
    }

    public AnonymousClass7ZW A06() {
        C110885hC r3 = this.A00;
        AnonymousClass4PH r4 = r3.A0R;
        float f = (float) 0;
        C108975ds A05 = A05(f, (float) (r4.A0D - r3.A04));
        C108975ds A052 = A05((float) (r4.A0F - r3.A05), (float) (r4.A0D - r3.A04));
        C108975ds A053 = A05(f, (float) r3.A06);
        C108975ds A054 = A05((float) (r4.A0F - r3.A05), (float) r3.A06);
        C158137jU r0 = new C158137jU();
        r0.A01(A05);
        r0.A01(A053);
        r0.A01(A052);
        r0.A01(A054);
        return new AnonymousClass7ZW(A05, A052, A053, A054, r0.A00());
    }

    public final void A07(C157467iL r9) {
        AnonymousClass4PH r6 = this.A00.A0R;
        double d = r6.A03;
        double d2 = r6.A01;
        r9.A03 = d - d2;
        r9.A00 = d + d2;
        double d3 = r6.A02;
        double d4 = r6.A00;
        double d5 = d3 - d4;
        r9.A01 = d5;
        double d6 = d3 + d4;
        r9.A02 = d6;
        if (d5 < 0.0d) {
            double ceil = (double) ((int) Math.ceil(-d5));
            r9.A01 = d5 + ceil;
            r9.A02 = d6 + ceil;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if ((r4 - r12) < (r2 - r8)) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(float[] r11, double r12, double r14) {
        /*
            r10 = this;
            X.7iL r6 = r10.A01
            r10.A07(r6)
            double r4 = r6.A01
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0011
            double r1 = r6.A02
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
        L_0x0011:
            double r0 = r4 - r12
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            double r2 = (double) r0
            double r2 = r2 + r12
            double r8 = r6.A02
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            double r6 = r2 - r8
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r2 - r0
            double r4 = r4 - r12
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
        L_0x002b:
            r10.A09(r11, r12, r14)
            return
        L_0x002f:
            r12 = r2
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106725a3.A08(float[], double, double):void");
    }

    public void A09(float[] fArr, double d, double d2) {
        AnonymousClass4PH r4 = this.A00.A0R;
        double d3 = r4.A02;
        C157467iL r6 = this.A01;
        A07(r6);
        double d4 = r6.A01;
        if (d4 > d3 || d3 > r6.A02) {
            d3 += (double) ((int) Math.ceil(d4 - d3));
        }
        float f = (float) r4.A0J;
        fArr[0] = ((float) (d - d3)) * f;
        fArr[1] = ((float) (d2 - r4.A03)) * f;
        r4.A0g.mapVectors(fArr);
        fArr[0] = fArr[0] + r4.A04;
        fArr[1] = fArr[1] + r4.A05;
    }

    public void A0A(float[] fArr, float f, float f2) {
        AnonymousClass4PH r4 = this.A00.A0R;
        fArr[0] = f - r4.A04;
        fArr[1] = f2 - r4.A05;
        r4.A0h.mapVectors(fArr);
        double d = r4.A02;
        double d2 = (double) fArr[0];
        double d3 = (double) r4.A0J;
        double d4 = d + (d2 / d3);
        double d5 = r4.A03 + (((double) fArr[1]) / d3);
        if (d4 > 1.0d) {
            d4 -= 1.0d;
        } else if (d4 < 0.0d) {
            d4 += 1.0d;
        }
        fArr[0] = (float) d4;
        fArr[1] = (float) d5;
    }

    public C106725a3(C110885hC r2) {
        this.A00 = r2;
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
    }

    public static double A01(double d) {
        return (d + 180.0d) / 360.0d;
    }
}
