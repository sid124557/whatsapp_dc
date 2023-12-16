package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.0BV  reason: invalid class name */
public class AnonymousClass0BV extends C09290fx {
    public AnonymousClass0BZ A00;
    public final int A01;
    public final RectF A02;
    public final C10550i7 A03;
    public final C10550i7 A04;
    public final C04850Qx A05;
    public final C04850Qx A06;
    public final C04850Qx A07;
    public final AnonymousClass0FQ A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0BV(X.AnonymousClass01G r13, X.C09440gC r14, X.C09320g0 r15) {
        /*
            r12 = this;
            X.0FJ r0 = r14.A08
            int r1 = r0.ordinal()
            r2 = 0
            if (r1 == r2) goto L_0x0091
            r0 = 1
            if (r1 == r0) goto L_0x008d
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000e:
            X.0FK r0 = r14.A09
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x008a
            if (r1 == r2) goto L_0x0087
            r0 = 1
            if (r1 == r0) goto L_0x0084
            r4 = 0
        L_0x001d:
            float r11 = r14.A00
            X.0Bo r8 = r14.A04
            X.0Bn r6 = r14.A02
            java.util.List r10 = r14.A0B
            X.0Bn r7 = r14.A01
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.0i7 r0 = new X.0i7
            r0.<init>()
            r12.A03 = r0
            X.0i7 r0 = new X.0i7
            r0.<init>()
            r12.A04 = r0
            android.graphics.RectF r0 = X.AnonymousClass002.A07()
            r12.A02 = r0
            java.lang.String r0 = r14.A0A
            r12.A09 = r0
            X.0FQ r0 = r14.A07
            r12.A08 = r0
            boolean r0 = r14.A0C
            r12.A0A = r0
            X.0QL r0 = r13.A04
            float r1 = X.AnonymousClass0QL.A00(r0)
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            r12.A01 = r0
            X.0Bj r0 = r14.A03
            java.util.List r1 = r0.A00
            X.0Bb r0 = new X.0Bb
            r0.<init>(r1)
            r12.A05 = r0
            X.C04850Qx.A05(r0, r15, r12)
            X.0Bk r0 = r14.A06
            java.util.List r1 = r0.A00
            X.0Bh r0 = new X.0Bh
            r0.<init>(r1)
            r12.A07 = r0
            X.C04850Qx.A05(r0, r15, r12)
            X.0Bk r0 = r14.A05
            java.util.List r1 = r0.A00
            X.0Bh r0 = new X.0Bh
            r0.<init>(r1)
            r12.A06 = r0
            X.C04850Qx.A05(r0, r15, r12)
            return
        L_0x0084:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x001d
        L_0x0087:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L_0x001d
        L_0x008a:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x001d
        L_0x008d:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000e
        L_0x0091:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BV.<init>(X.01G, X.0gC, X.0g0):void");
    }

    public final int A00() {
        float f = this.A07.A02;
        float f2 = (float) this.A01;
        int A072 = AnonymousClass001.A07(f, f2);
        int A073 = AnonymousClass001.A07(this.A06.A02, f2);
        int A074 = AnonymousClass001.A07(this.A05.A02, f2);
        int i = 17;
        if (A072 != 0) {
            i = 527 * A072;
        }
        if (A073 != 0) {
            i = i * 31 * A073;
        }
        if (A074 != 0) {
            return i * 31 * A074;
        }
        return i;
    }

    public final int[] A01(int[] iArr) {
        AnonymousClass0BZ r0 = this.A00;
        if (r0 != null) {
            Integer[] numArr = (Integer[]) r0.A0A();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < length2) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (i < length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public void B2C(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.A0A) {
            Matrix matrix2 = matrix;
            B4p(matrix2, this.A02, false);
            AnonymousClass0FQ r3 = this.A08;
            AnonymousClass0FQ r2 = AnonymousClass0FQ.LINEAR;
            int A002 = A00();
            if (r3 == r2) {
                C10550i7 r5 = this.A03;
                long j = (long) A002;
                shader = (Shader) C10550i7.A00(r5, j);
                if (shader == null) {
                    PointF A042 = C04850Qx.A04(this.A07);
                    PointF A043 = C04850Qx.A04(this.A06);
                    AnonymousClass0LJ r4 = (AnonymousClass0LJ) this.A05.A0A();
                    shader = new LinearGradient(A042.x, A042.y, A043.x, A043.y, A01(r4.A01), r4.A00, Shader.TileMode.CLAMP);
                    r5.A0A(j, shader);
                }
            } else {
                C10550i7 r7 = this.A04;
                long j2 = (long) A002;
                shader = (Shader) C10550i7.A00(r7, j2);
                if (shader == null) {
                    PointF A044 = C04850Qx.A04(this.A07);
                    PointF A045 = C04850Qx.A04(this.A06);
                    AnonymousClass0LJ r22 = (AnonymousClass0LJ) this.A05.A0A();
                    int[] A012 = A01(r22.A01);
                    float[] fArr = r22.A00;
                    float f = A044.x;
                    float f2 = A044.y;
                    shader = new RadialGradient(f, f2, (float) Math.hypot((double) (A045.x - f), (double) (A045.y - f2)), A012, fArr, Shader.TileMode.CLAMP);
                    r7.A0A(j2, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            this.A01.setShader(shader);
            super.B2C(canvas, matrix2, i);
        }
    }

    public String getName() {
        return this.A09;
    }

    public void Aws(C05560Tz r3, Object obj) {
        super.Aws(r3, obj);
        if (obj == C17150ue.A0V) {
            AnonymousClass0BZ r1 = this.A00;
            if (r1 != null) {
                this.A0A.A0O.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0BZ r0 = new AnonymousClass0BZ(r3, (Object) null);
            this.A00 = r0;
            C04850Qx.A06(r0, this);
            this.A0A.A08(this.A00);
        }
    }
}
