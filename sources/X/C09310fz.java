package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.0fz  reason: invalid class name and case insensitive filesystem */
public class C09310fz implements C16230sg, C17350vO, C17360vP {
    public C04850Qx A00;
    public AnonymousClass0BZ A01;
    public final int A02;
    public final Paint A03;
    public final Path A04;
    public final RectF A05;
    public final C10550i7 A06 = new C10550i7();
    public final C10550i7 A07 = new C10550i7();
    public final AnonymousClass01G A08;
    public final C04850Qx A09;
    public final C04850Qx A0A;
    public final C04850Qx A0B;
    public final C04850Qx A0C;
    public final AnonymousClass0FQ A0D;
    public final C09320g0 A0E;
    public final String A0F;
    public final List A0G;
    public final boolean A0H;

    public void Bm3(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof C17340vN) {
                this.A0G.add(obj);
            }
        }
    }

    public final int A00() {
        float f = this.A0C.A02;
        float f2 = (float) this.A02;
        int A072 = AnonymousClass001.A07(f, f2);
        int A073 = AnonymousClass001.A07(this.A0A.A02, f2);
        int A074 = AnonymousClass001.A07(this.A09.A02, f2);
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
        AnonymousClass0BZ r0 = this.A01;
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

    public void Aws(C05560Tz r4, Object obj) {
        C09320g0 r1;
        C04850Qx r0;
        if (obj == C17150ue.A0S) {
            this.A0B.A0F(r4);
            return;
        }
        if (obj == C17150ue.A00) {
            C04850Qx r12 = this.A00;
            if (r12 != null) {
                this.A0E.A0O.remove(r12);
            }
            if (r4 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0BZ r02 = new AnonymousClass0BZ(r4, (Object) null);
            this.A00 = r02;
            C04850Qx.A06(r02, this);
            r1 = this.A0E;
            r0 = this.A00;
        } else if (obj == C17150ue.A0V) {
            AnonymousClass0BZ r13 = this.A01;
            if (r13 != null) {
                this.A0E.A0O.remove(r13);
            }
            if (r4 == null) {
                this.A01 = null;
                return;
            }
            this.A06.A06();
            this.A07.A06();
            AnonymousClass0BZ r03 = new AnonymousClass0BZ(r4, (Object) null);
            this.A01 = r03;
            C04850Qx.A06(r03, this);
            r1 = this.A0E;
            r0 = this.A01;
        } else {
            return;
        }
        r1.A08(r0);
    }

    public void B2C(Canvas canvas, Matrix matrix, int i) {
        Matrix matrix2;
        Shader shader;
        if (!this.A0H) {
            Path path = this.A04;
            path.reset();
            int i2 = 0;
            while (true) {
                List list = this.A0G;
                matrix2 = matrix;
                if (i2 >= list.size()) {
                    break;
                }
                AnonymousClass000.A0r(matrix2, path, list, i2);
                i2++;
            }
            path.computeBounds(this.A05, false);
            AnonymousClass0FQ r3 = this.A0D;
            AnonymousClass0FQ r1 = AnonymousClass0FQ.LINEAR;
            int A002 = A00();
            if (r3 == r1) {
                C10550i7 r5 = this.A06;
                long j = (long) A002;
                shader = (Shader) C10550i7.A00(r5, j);
                if (shader == null) {
                    PointF A042 = C04850Qx.A04(this.A0C);
                    PointF A043 = C04850Qx.A04(this.A0A);
                    AnonymousClass0LJ r4 = (AnonymousClass0LJ) this.A09.A0A();
                    int[] A012 = A01(r4.A01);
                    float[] fArr = r4.A00;
                    float f = A042.x;
                    float f2 = A042.y;
                    float f3 = A043.x;
                    float f4 = A043.y;
                    shader = new LinearGradient(f, f2, f3, f4, A012, fArr, Shader.TileMode.CLAMP);
                    r5.A0A(j, shader);
                }
            } else {
                C10550i7 r7 = this.A07;
                long j2 = (long) A002;
                shader = (Shader) C10550i7.A00(r7, j2);
                if (shader == null) {
                    PointF A044 = C04850Qx.A04(this.A0C);
                    PointF A045 = C04850Qx.A04(this.A0A);
                    AnonymousClass0LJ r12 = (AnonymousClass0LJ) this.A09.A0A();
                    int[] A013 = A01(r12.A01);
                    float[] fArr2 = r12.A00;
                    float f5 = A044.x;
                    float f6 = A044.y;
                    float hypot = (float) Math.hypot((double) (A045.x - f5), (double) (A045.y - f6));
                    if (hypot <= 0.0f) {
                        hypot = 0.001f;
                    }
                    shader = new RadialGradient(f5, f6, hypot, A013, fArr2, Shader.TileMode.CLAMP);
                    r7.A0A(j2, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            Paint paint = this.A03;
            paint.setShader(shader);
            AnonymousClass001.A11(paint, this.A00);
            paint.setAlpha(AnonymousClass001.A0D(255, (int) ((((((float) i) / 255.0f) * ((float) C04850Qx.A03(this.A0B))) / 100.0f) * 255.0f), 0));
            canvas.drawPath(path, paint);
            AnonymousClass0K1.A01();
        }
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A04;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0G;
            if (i < list.size()) {
                AnonymousClass000.A0r(matrix, path, list, i);
                i++;
            } else {
                path.computeBounds(rectF, false);
                AnonymousClass000.A0s(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public void BfC() {
        this.A08.invalidateSelf();
    }

    public String getName() {
        return this.A0F;
    }

    public C09310fz(AnonymousClass01G r4, C09410g9 r5, C09320g0 r6) {
        Path A062 = AnonymousClass002.A06();
        this.A04 = A062;
        this.A03 = new AnonymousClass00u(1);
        this.A05 = AnonymousClass002.A07();
        this.A0G = AnonymousClass001.A0s();
        this.A0E = r6;
        this.A0F = r5.A06;
        this.A0H = r5.A07;
        this.A08 = r4;
        this.A0D = r5.A05;
        A062.setFillType(r5.A00);
        this.A02 = (int) (AnonymousClass0QL.A00(r4.A04) / 32.0f);
        C01490Bb r0 = new C01490Bb(r5.A01.A00);
        this.A09 = r0;
        C04850Qx.A05(r0, r6, this);
        C01530Bf r02 = new C01530Bf(r5.A02.A00);
        this.A0B = r02;
        C04850Qx.A05(r02, r6, this);
        C01550Bh r03 = new C01550Bh(r5.A04.A00);
        this.A0C = r03;
        C04850Qx.A05(r03, r6, this);
        C01550Bh r04 = new C01550Bh(r5.A03.A00);
        this.A0A = r04;
        C04850Qx.A05(r04, r6, this);
    }

    public void Bk4(AnonymousClass0WB r1, AnonymousClass0WB r2, List list, int i) {
        C06100Wg.A01(this, r1, r2, list, i);
    }
}
