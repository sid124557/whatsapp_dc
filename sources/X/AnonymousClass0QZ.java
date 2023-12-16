package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: X.0QZ  reason: invalid class name */
public class AnonymousClass0QZ {
    public C04850Qx A00;
    public C04850Qx A01;
    public C04850Qx A02;
    public C04850Qx A03;
    public C04850Qx A04;
    public C04850Qx A05;
    public C04850Qx A06;
    public C01540Bg A07;
    public C01540Bg A08;
    public final Matrix A09 = AnonymousClass002.A05();
    public final Matrix A0A;
    public final Matrix A0B;
    public final Matrix A0C;
    public final float[] A0D;

    public Matrix A00() {
        float cos;
        float sin;
        float[] fArr;
        float A0G;
        Matrix matrix = this.A09;
        matrix.reset();
        C04850Qx r0 = this.A03;
        if (r0 != null) {
            PointF A042 = C04850Qx.A04(r0);
            float f = A042.x;
            if (!(f == 0.0f && A042.y == 0.0f)) {
                matrix.preTranslate(f, A042.y);
            }
        }
        C04850Qx r1 = this.A04;
        if (r1 != null) {
            if (r1 instanceof AnonymousClass0BZ) {
                A0G = C04850Qx.A02(r1);
            } else {
                A0G = ((C01540Bg) r1).A0G();
            }
            if (A0G != 0.0f) {
                matrix.preRotate(A0G);
            }
        }
        C01540Bg r2 = this.A07;
        if (r2 != null) {
            C01540Bg r5 = this.A08;
            if (r5 == null) {
                cos = 0.0f;
                sin = 1.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((double) ((-r5.A0G()) + 90.0f)));
                sin = (float) Math.sin(Math.toRadians((double) ((-r5.A0G()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) r2.A0G()));
            int i = 0;
            do {
                fArr = this.A0D;
                fArr[i] = 0.0f;
                i++;
            } while (i < 9);
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.A0A;
            matrix2.setValues(fArr);
            int i2 = 0;
            do {
                fArr[i2] = 0.0f;
                i2++;
            } while (i2 < 9);
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.A0B;
            matrix3.setValues(fArr);
            int i3 = 0;
            do {
                fArr[i3] = 0.0f;
                i3++;
            } while (i3 < 9);
            fArr[0] = cos;
            fArr[1] = f2;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.A0C;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        C04850Qx r02 = this.A05;
        if (r02 != null) {
            AnonymousClass0TZ r22 = (AnonymousClass0TZ) r02.A0A();
            float f3 = r22.A00;
            if (!(f3 == 1.0f && r22.A01 == 1.0f)) {
                matrix.preScale(f3, r22.A01);
            }
        }
        C04850Qx r03 = this.A00;
        if (r03 != null) {
            PointF A043 = C04850Qx.A04(r03);
            float f4 = A043.x;
            if (!(f4 == 0.0f && A043.y == 0.0f)) {
                matrix.preTranslate(-f4, -A043.y);
            }
        }
        return matrix;
    }

    public Matrix A01(float f) {
        PointF A042;
        AnonymousClass0TZ r0;
        float f2;
        C04850Qx r02 = this.A03;
        PointF pointF = null;
        if (r02 == null) {
            A042 = null;
        } else {
            A042 = C04850Qx.A04(r02);
        }
        C04850Qx r03 = this.A05;
        if (r03 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass0TZ) r03.A0A();
        }
        Matrix matrix = this.A09;
        matrix.reset();
        if (A042 != null) {
            matrix.preTranslate(A042.x * f, A042.y * f);
        }
        if (r0 != null) {
            double d = (double) f;
            matrix.preScale((float) Math.pow((double) r0.A00, d), (float) Math.pow((double) r0.A01, d));
        }
        C04850Qx r04 = this.A04;
        if (r04 != null) {
            float A022 = C04850Qx.A02(r04);
            C04850Qx r05 = this.A00;
            if (r05 != null) {
                pointF = C04850Qx.A04(r05);
            }
            float f3 = A022 * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return matrix;
    }

    public void A02(C16230sg r2) {
        C04850Qx r0 = this.A02;
        if (r0 != null) {
            C04850Qx.A06(r0, r2);
        }
        C04850Qx r02 = this.A06;
        if (r02 != null) {
            C04850Qx.A06(r02, r2);
        }
        C04850Qx r03 = this.A01;
        if (r03 != null) {
            C04850Qx.A06(r03, r2);
        }
        C04850Qx r04 = this.A00;
        if (r04 != null) {
            C04850Qx.A06(r04, r2);
        }
        C04850Qx r05 = this.A03;
        if (r05 != null) {
            C04850Qx.A06(r05, r2);
        }
        C04850Qx r06 = this.A05;
        if (r06 != null) {
            C04850Qx.A06(r06, r2);
        }
        C04850Qx r07 = this.A04;
        if (r07 != null) {
            C04850Qx.A06(r07, r2);
        }
        C01540Bg r08 = this.A07;
        if (r08 != null) {
            C04850Qx.A06(r08, r2);
        }
        C01540Bg r09 = this.A08;
        if (r09 != null) {
            C04850Qx.A06(r09, r2);
        }
    }

    public void A03(C09320g0 r2) {
        r2.A08(this.A02);
        r2.A08(this.A06);
        r2.A08(this.A01);
        r2.A08(this.A00);
        r2.A08(this.A03);
        r2.A08(this.A05);
        r2.A08(this.A04);
        r2.A08(this.A07);
        r2.A08(this.A08);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C05560Tz r4, java.lang.Object r5) {
        /*
            r3 = this;
            android.graphics.PointF r0 = X.C17150ue.A04
            if (r5 != r0) goto L_0x0016
            X.0Qx r1 = r3.A00
            if (r1 != 0) goto L_0x009c
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.0BZ r0 = new X.0BZ
            r0.<init>(r4, r1)
            r3.A00 = r0
        L_0x0014:
            r0 = 1
            return r0
        L_0x0016:
            android.graphics.PointF r0 = X.C17150ue.A05
            if (r5 != r0) goto L_0x002b
            X.0Qx r1 = r3.A03
            if (r1 != 0) goto L_0x009c
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.0BZ r0 = new X.0BZ
            r0.<init>(r4, r1)
            r3.A03 = r0
            goto L_0x0014
        L_0x002b:
            java.lang.Float r0 = X.C17150ue.A0L
            if (r5 != r0) goto L_0x0045
            X.0Qx r2 = r3.A03
            boolean r0 = r2 instanceof X.AnonymousClass0BY
            if (r0 == 0) goto L_0x0045
            X.0BY r2 = (X.AnonymousClass0BY) r2
            X.0Tz r1 = r2.A00
            if (r1 == 0) goto L_0x003e
            r0 = 0
            r1.A00 = r0
        L_0x003e:
            r2.A00 = r4
        L_0x0040:
            if (r4 == 0) goto L_0x0014
            r4.A00 = r2
            goto L_0x0014
        L_0x0045:
            java.lang.Float r0 = X.C17150ue.A0M
            if (r5 != r0) goto L_0x005b
            X.0Qx r2 = r3.A03
            boolean r0 = r2 instanceof X.AnonymousClass0BY
            if (r0 == 0) goto L_0x005b
            X.0BY r2 = (X.AnonymousClass0BY) r2
            X.0Tz r1 = r2.A01
            if (r1 == 0) goto L_0x0058
            r0 = 0
            r1.A00 = r0
        L_0x0058:
            r2.A01 = r4
            goto L_0x0040
        L_0x005b:
            X.0TZ r0 = X.C17150ue.A06
            if (r5 != r0) goto L_0x0070
            X.0Qx r1 = r3.A05
            if (r1 != 0) goto L_0x009c
            X.0TZ r1 = new X.0TZ
            r1.<init>()
            X.0BZ r0 = new X.0BZ
            r0.<init>(r4, r1)
            r3.A05 = r0
            goto L_0x0014
        L_0x0070:
            java.lang.Float r1 = X.C17150ue.A0N
            r0 = 0
            if (r5 != r1) goto L_0x0085
            X.0Qx r1 = r3.A04
            if (r1 != 0) goto L_0x009c
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.0BZ r0 = new X.0BZ
            r0.<init>(r4, r1)
            r3.A04 = r0
            goto L_0x0014
        L_0x0085:
            java.lang.Integer r1 = X.C17150ue.A0U
            r0 = 100
            if (r5 != r1) goto L_0x00a1
            X.0Qx r1 = r3.A02
            if (r1 != 0) goto L_0x009c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.0BZ r0 = new X.0BZ
            r0.<init>(r4, r1)
            r3.A02 = r0
            goto L_0x0014
        L_0x009c:
            r1.A0F(r4)
            goto L_0x0014
        L_0x00a1:
            java.lang.Float r0 = X.C17150ue.A0Q
            if (r5 != r0) goto L_0x00ae
            X.0Qx r0 = r3.A06
            if (r0 == 0) goto L_0x00ae
        L_0x00a9:
            r0.A0F(r4)
            goto L_0x0014
        L_0x00ae:
            java.lang.Float r0 = X.C17150ue.A0K
            if (r5 != r0) goto L_0x00b7
            X.0Qx r0 = r3.A01
            if (r0 == 0) goto L_0x00b7
            goto L_0x00a9
        L_0x00b7:
            java.lang.Float r0 = X.C17150ue.A0O
            if (r5 != r0) goto L_0x00c0
            X.0Bg r0 = r3.A07
            if (r0 == 0) goto L_0x00c0
            goto L_0x00a9
        L_0x00c0:
            java.lang.Float r0 = X.C17150ue.A0P
            if (r5 != r0) goto L_0x00c9
            X.0Bg r0 = r3.A08
            if (r0 == 0) goto L_0x00c9
            goto L_0x00a9
        L_0x00c9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QZ.A04(X.0Tz, java.lang.Object):boolean");
    }

    public AnonymousClass0QZ(C09510gJ r4) {
        C04850Qx B0O;
        C04850Qx B0O2;
        C01500Bc r1;
        C01540Bg A002;
        C01540Bg A003;
        C09380g6 r0 = r4.A06;
        C01540Bg r2 = null;
        if (r0 == null) {
            B0O = null;
        } else {
            B0O = r0.B0O();
        }
        this.A00 = B0O;
        C16890uC r02 = r4.A08;
        if (r02 == null) {
            B0O2 = null;
        } else {
            B0O2 = r02.B0O();
        }
        this.A03 = B0O2;
        C01630Bp r03 = r4.A07;
        if (r03 == null) {
            r1 = null;
        } else {
            r1 = new C01500Bc(r03.A00);
        }
        this.A05 = r1;
        C01610Bn r04 = r4.A01;
        if (r04 == null) {
            A002 = null;
        } else {
            A002 = AnonymousClass0BW.A00(r04);
        }
        this.A04 = A002;
        C01610Bn r05 = r4.A02;
        if (r05 == null) {
            A003 = null;
        } else {
            A003 = AnonymousClass0BW.A00(r05);
        }
        this.A07 = A003;
        if (A003 != null) {
            this.A0A = AnonymousClass002.A05();
            this.A0B = AnonymousClass002.A05();
            this.A0C = AnonymousClass002.A05();
            this.A0D = new float[9];
        }
        C01610Bn r06 = r4.A03;
        this.A08 = r06 != null ? AnonymousClass0BW.A00(r06) : r2;
        C01620Bo r07 = r4.A05;
        if (r07 != null) {
            this.A02 = new C01530Bf(r07.A00);
        }
        C01610Bn r08 = r4.A04;
        if (r08 != null) {
            this.A06 = AnonymousClass0BW.A00(r08);
        }
        C01610Bn r09 = r4.A00;
        if (r09 != null) {
            this.A01 = AnonymousClass0BW.A00(r09);
        }
    }
}
