package X;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.0YF  reason: invalid class name */
public class AnonymousClass0YF {
    public static HashSet A06;
    public Canvas A00;
    public AnonymousClass0QT A01;
    public AnonymousClass0TM A02;
    public Stack A03;
    public Stack A04;
    public Stack A05;

    public static float A02(AnonymousClass0CU r3, AnonymousClass0YF r4) {
        List list = r3.A01;
        if (list == null || list.size() == 0) {
            return 0.0f;
        }
        return ((C10540i6) r3.A01.get(0)).A03(r4);
    }

    public final C05400Te A0N(C10540i6 r6, C10540i6 r7, C10540i6 r8, C10540i6 r9) {
        float f;
        float f2;
        float f3 = 0.0f;
        float A012 = A01(r6, this);
        if (r7 != null) {
            f3 = r7.A03(this);
        }
        AnonymousClass0TM r1 = this.A02;
        C05400Te r0 = r1.A02;
        if (r0 == null) {
            r0 = r1.A03;
        }
        if (r8 != null) {
            f = r8.A02(this);
        } else {
            f = r0.A03;
        }
        if (r9 != null) {
            f2 = r9.A03(this);
        } else {
            f2 = r0.A00;
        }
        return new C05400Te(A012, f3, f, f2);
    }

    public final void A0T(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        AnonymousClass0MF r0 = this.A02.A04.A01;
        if (r0 != null) {
            f += r0.A01.A02(this);
            f2 += this.A02.A04.A01.A03.A03(this);
            f5 -= this.A02.A04.A01.A02.A02(this);
            f6 -= this.A02.A04.A01.A00.A03(this);
        }
        this.A00.clipRect(f, f2, f5, f6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.booleanValue() == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0c(X.AnonymousClass0CR r7, X.C01740Ca r8) {
        /*
            r6 = this;
            r4 = 0
            java.lang.Boolean r0 = r7.A05
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r5 = 1065353216(0x3f800000, float:1.0)
            X.0i6 r0 = r7.A01
            if (r1 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0070
            float r2 = r0.A02(r6)
        L_0x0019:
            X.0i6 r0 = r7.A00
            if (r0 == 0) goto L_0x006b
            float r3 = r0.A03(r6)
        L_0x0021:
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            r6.A0R()
            X.0TM r1 = new X.0TM
            r1.<init>(r6)
            X.0i4 r0 = X.C10520i4.A00()
            r6.A0e(r0, r1)
            r6.A0l(r7, r1)
            r6.A02 = r1
            X.0i4 r1 = r1.A04
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r1.A0P = r0
            java.lang.Boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0064
            android.graphics.Canvas r2 = r6.A00
            X.0Te r0 = r8.A00
            float r1 = r0.A01
            float r0 = r0.A02
            r2.translate(r1, r0)
            X.0Te r0 = r8.A00
            float r1 = r0.A03
            float r0 = r0.A00
            r2.scale(r1, r0)
        L_0x0064:
            r6.A0f(r7, r4)
            r6.A0Q()
        L_0x006a:
            return
        L_0x006b:
            X.0Te r0 = r8.A00
            float r3 = r0.A00
            goto L_0x0021
        L_0x0070:
            X.0Te r0 = r8.A00
            float r2 = r0.A03
            goto L_0x0019
        L_0x0075:
            r3 = 1067030938(0x3f99999a, float:1.2)
            if (r0 == 0) goto L_0x008f
            float r2 = r0.A04(r6, r5)
        L_0x007e:
            X.0i6 r0 = r7.A00
            if (r0 == 0) goto L_0x0086
            float r3 = r0.A04(r6, r5)
        L_0x0086:
            X.0Te r1 = r8.A00
            float r0 = r1.A03
            float r2 = r2 * r0
            float r0 = r1.A00
            float r3 = r3 * r0
            goto L_0x0021
        L_0x008f:
            r2 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0c(X.0CR, X.0Ca):void");
    }

    public static float A00(C10540i6 r0, AnonymousClass0YF r1) {
        if (r0 != null) {
            return r0.A03(r1);
        }
        return 0.0f;
    }

    public static float A01(C10540i6 r0, AnonymousClass0YF r1) {
        if (r0 != null) {
            return r0.A02(r1);
        }
        return 0.0f;
    }

    public static int A03(int i, float f) {
        int i2 = 255;
        int A07 = AnonymousClass001.A07((float) ((i >> 24) & 255), f);
        if (A07 < 0) {
            i2 = 0;
        } else if (A07 <= 255) {
            i2 = A07;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static Matrix A05(C05400Te r3, boolean z) {
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(r3.A01, r3.A02);
            matrix.preScale(r3.A03, r3.A00);
        }
        return matrix;
    }

    public static void A07(Matrix matrix, AnonymousClass0YF r2) {
        if (matrix != null) {
            r2.A00.concat(matrix);
        }
    }

    public static void A08(C05400Te r4, AnonymousClass0TM r5, AnonymousClass0YF r6) {
        if (!r5.A04.A0M.booleanValue()) {
            r6.A0T(r4.A01, r4.A02, r4.A03, r4.A00);
        }
    }

    public static void A0A(AnonymousClass0NJ r2, AnonymousClass0YF r3) {
        AnonymousClass0TM r1 = new AnonymousClass0TM(r3);
        r3.A0e(C10520i4.A00(), r1);
        r3.A0l(r2, r1);
        r3.A02 = r1;
    }

    public static final void A0B(C10510i3 r3, AnonymousClass0TM r4, boolean z) {
        Float f;
        C01820Ci r32;
        Paint paint;
        C10520i4 r2 = r4.A04;
        if (z) {
            f = r2.A0O;
        } else {
            f = r2.A0T;
        }
        float floatValue = f.floatValue();
        if (r3 instanceof C01820Ci) {
            r32 = (C01820Ci) r3;
        } else if (r3 instanceof C01810Ch) {
            r32 = r2.A02;
        } else {
            return;
        }
        int A032 = A03(r32.A00, floatValue);
        if (z) {
            paint = r4.A00;
        } else {
            paint = r4.A01;
        }
        paint.setColor(A032);
    }

    public static void A0C(AnonymousClass0CP r5, AnonymousClass0YF r6, float f, float f2) {
        if (r5.A00 == null) {
            C01870Cn r0 = new C01870Cn(r6, f, f2);
            r6.A0m(r5, r0);
            RectF rectF = r0.A02;
            r5.A00 = new C05400Te(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
    }

    public static void A0D(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static final boolean A0E(C10520i4 r4, long j) {
        return AnonymousClass000.A1S(((r4.A00 & j) > 0 ? 1 : ((r4.A00 & j) == 0 ? 0 : -1)));
    }

    public static boolean A0F(C01740Ca r1, AnonymousClass0YF r2) {
        r2.A0Y(r1.A00, r1);
        return r2.A0o();
    }

    public static boolean A0G(C01780Ce r1, AnonymousClass0YF r2) {
        r2.A0j(r1, r2.A02);
        Boolean bool = r2.A02.A04.A0L;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path A0H(C05400Te r8, C01740Ca r9) {
        Path A0M;
        AnonymousClass0NJ A042 = r9.A01.A04(this.A02.A04.A0W);
        boolean z = false;
        if (A042 == null) {
            A0D("ClipPath reference '%s' not found", this.A02.A04.A0W);
            return null;
        }
        AnonymousClass0CF r5 = (AnonymousClass0CF) A042;
        this.A05.push(this.A02);
        A0A(r5, this);
        Boolean bool = r5.A00;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix A052 = A05(r8, z);
        Matrix matrix = r5.A00;
        if (matrix != null) {
            A052.preConcat(matrix);
        }
        Path A062 = AnonymousClass002.A06();
        for (AnonymousClass0NJ r1 : r5.A01) {
            if ((r1 instanceof C01740Ca) && (A0M = A0M((C01740Ca) r1, true)) != null) {
                A062.op(A0M, Path.Op.UNION);
            }
        }
        if (this.A02.A04.A0W != null) {
            C05400Te r0 = r5.A00;
            if (r0 == null) {
                r0 = A06(A062);
                r5.A00 = r0;
            }
            Path A0H = A0H(r0, r5);
            if (A0H != null) {
                A062.op(A0H, Path.Op.INTERSECT);
            }
        }
        A062.transform(A052);
        this.A02 = (AnonymousClass0TM) this.A05.pop();
        return A062;
    }

    public final Path A0I(AnonymousClass0C8 r24) {
        AnonymousClass0C8 r4 = r24;
        float f = 0.0f;
        float A012 = A01(r4.A00, this);
        C10540i6 r0 = r4.A01;
        if (r0 != null) {
            f = r0.A03(this);
        }
        float A013 = r4.A02.A01(this);
        float f2 = A012 - A013;
        float f3 = f - A013;
        float f4 = A012 + A013;
        float f5 = f + A013;
        if (r4.A00 == null) {
            float f6 = 2.0f * A013;
            r4.A00 = new C05400Te(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * A013;
        Path A062 = AnonymousClass002.A06();
        A062.moveTo(A012, f3);
        float f8 = A012 + f7;
        float f9 = f - f7;
        A062.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        A062.cubicTo(f4, f10, f8, f5, A012, f5);
        float f11 = A012 - f7;
        A062.cubicTo(f11, f5, f2, f10, f2, f);
        A062.cubicTo(f2, f9, f11, f3, A012, f3);
        A062.close();
        return A062;
    }

    public final Path A0J(AnonymousClass0C9 r27) {
        AnonymousClass0C9 r7 = r27;
        float f = 0.0f;
        float A012 = A01(r7.A00, this);
        C10540i6 r0 = r7.A01;
        if (r0 != null) {
            f = r0.A03(this);
        }
        float A022 = r7.A02.A02(this);
        float A032 = r7.A03.A03(this);
        float f2 = A012 - A022;
        float f3 = f - A032;
        float f4 = A012 + A022;
        float f5 = f + A032;
        if (r7.A00 == null) {
            r7.A00 = new C05400Te(f2, f3, A022 * 2.0f, 2.0f * A032);
        }
        float f6 = A022 * 0.5522848f;
        float f7 = 0.5522848f * A032;
        Path A062 = AnonymousClass002.A06();
        A062.moveTo(A012, f3);
        float f8 = A012 + f6;
        float f9 = f - f7;
        A062.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f7 + f;
        A062.cubicTo(f4, f10, f8, f5, A012, f5);
        float f11 = A012 - f6;
        A062.cubicTo(f11, f5, f2, f10, f2, f);
        A062.cubicTo(f2, f9, f11, f3, A012, f3);
        A062.close();
        return A062;
    }

    public final Path A0L(AnonymousClass0CB r25) {
        float f;
        float f2;
        AnonymousClass0CB r3 = r25;
        C10540i6 r1 = r3.A01;
        C10540i6 r0 = r3.A02;
        if (r1 != null) {
            f = r1.A02(this);
            if (r0 != null) {
                f2 = r3.A02.A03(this);
            }
            f2 = f;
        } else if (r0 == null) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = r0.A03(this);
            f2 = f;
        }
        float min = Math.min(f, r3.A03.A02(this) / 2.0f);
        float min2 = Math.min(f2, r3.A00.A03(this) / 2.0f);
        float A012 = A01(r3.A04, this);
        float A002 = A00(r3.A05, this);
        float A022 = r3.A03.A02(this);
        float A032 = r3.A00.A03(this);
        if (r3.A00 == null) {
            r3.A00 = new C05400Te(A012, A002, A022, A032);
        }
        float f3 = A012 + A022;
        float f4 = A002 + A032;
        Path A062 = AnonymousClass002.A06();
        if (min == 0.0f || min2 == 0.0f) {
            A062.moveTo(A012, A002);
            A062.lineTo(f3, A002);
            A062.lineTo(f3, f4);
            A062.lineTo(A012, f4);
            A062.lineTo(A012, A002);
        } else {
            float f5 = min * 0.5522848f;
            float f6 = 0.5522848f * min2;
            float f7 = A002 + min2;
            A062.moveTo(A012, f7);
            float f8 = f7 - f6;
            float f9 = A012 + min;
            float f10 = f9 - f5;
            A062.cubicTo(A012, f8, f10, A002, f9, A002);
            float f11 = f3 - min;
            A062.lineTo(f11, A002);
            float f12 = f11 + f5;
            float f13 = f3;
            A062.cubicTo(f12, A002, f13, f8, f3, f7);
            float f14 = f4 - min2;
            A062.lineTo(f3, f14);
            float f15 = f14 + f6;
            A062.cubicTo(f13, f15, f12, f4, f11, f4);
            A062.lineTo(f9, f4);
            A062.cubicTo(f10, f4, A012, f15, A012, f14);
            A062.lineTo(A012, f7);
        }
        A062.close();
        return A062;
    }

    public final Path A0M(C01740Ca r9, boolean z) {
        boolean z2;
        Path path;
        Path A0H;
        float f;
        float f2;
        float f3;
        Matrix matrix;
        Path.FillType fillType;
        this.A05.push(this.A02);
        AnonymousClass0TM r0 = new AnonymousClass0TM(this.A02, this);
        this.A02 = r0;
        A0j(r9, r0);
        Boolean bool = this.A02.A04.A0L;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        if (z2 && A0p()) {
            if (r9 instanceof AnonymousClass0CD) {
                if (!z) {
                    A0D("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                AnonymousClass0CD r3 = (AnonymousClass0CD) r9;
                AnonymousClass0NJ A042 = r9.A01.A04(r3.A04);
                if (A042 == null) {
                    A0D("Use reference '%s' not found", r3.A04);
                } else if (A042 instanceof C01740Ca) {
                    path = A0M((C01740Ca) A042, false);
                    if (path != null) {
                        if (r3.A00 == null) {
                            r3.A00 = A06(path);
                        }
                        Matrix matrix2 = r3.A00;
                        if (matrix2 != null) {
                            path.transform(matrix2);
                        }
                    }
                    return null;
                }
            } else {
                if (r9 instanceof AnonymousClass0CS) {
                    AnonymousClass0CS r1 = (AnonymousClass0CS) r9;
                    if (r9 instanceof AnonymousClass0C6) {
                        path = new C09770gj(((AnonymousClass0C6) r9).A00, this).A02;
                        if (r9.A00 == null) {
                            r9.A00 = A06(path);
                        }
                    } else if (r9 instanceof AnonymousClass0CB) {
                        path = A0L((AnonymousClass0CB) r9);
                    } else if (r9 instanceof AnonymousClass0C8) {
                        path = A0I((AnonymousClass0C8) r9);
                    } else if (r9 instanceof AnonymousClass0C9) {
                        path = A0J((AnonymousClass0C9) r9);
                    } else {
                        if (r9 instanceof AnonymousClass0C7) {
                            path = A0K((AnonymousClass0C7) r9);
                        }
                        return null;
                    }
                    if (r1.A00 == null) {
                        r1.A00 = A06(path);
                    }
                    matrix = r1.A00;
                } else if (r9 instanceof AnonymousClass0CX) {
                    AnonymousClass0CX r32 = (AnonymousClass0CX) r9;
                    List list = r32.A02;
                    if (list == null || list.size() == 0) {
                        f = 0.0f;
                    } else {
                        f = ((C10540i6) r32.A02.get(0)).A02(this);
                    }
                    List list2 = r32.A03;
                    if (list2 == null || list2.size() == 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = ((C10540i6) r32.A03.get(0)).A03(this);
                    }
                    List list3 = r32.A00;
                    if (list3 == null || list3.size() == 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = ((C10540i6) r32.A00.get(0)).A02(this);
                    }
                    float A022 = A02(r32, this);
                    if (this.A02.A04.A0C != C02290Fp.Start) {
                        C01840Ck r02 = new C01840Ck(this);
                        A0m(r32, r02);
                        float f4 = r02.A00;
                        if (this.A02.A04.A0C == C02290Fp.Middle) {
                            f4 /= 2.0f;
                        }
                        f -= f4;
                    }
                    A0C(r32, this, f, f2);
                    path = AnonymousClass002.A06();
                    A0m(r32, new C01860Cm(path, this, f + f3, f2 + A022));
                    matrix = r32.A00;
                } else {
                    A0D("Invalid %s element found in clipPath definition", r9.A00());
                    return null;
                }
                if (matrix != null) {
                    path.transform(matrix);
                }
                AnonymousClass0FZ r12 = this.A02.A04.A06;
                if (r12 == null || r12 != AnonymousClass0FZ.EvenOdd) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path.setFillType(fillType);
            }
            if (!(this.A02.A04.A0W == null || (A0H = A0H(r9.A00, r9)) == null)) {
                path.op(A0H, Path.Op.INTERSECT);
            }
            this.A02 = (AnonymousClass0TM) this.A05.pop();
            return path;
        }
        this.A02 = (AnonymousClass0TM) this.A05.pop();
        return null;
    }

    public final C02290Fp A0O() {
        C02290Fp r1;
        C10520i4 r2 = this.A02.A04;
        if (r2.A0E == C02140Fa.LTR || (r1 = r2.A0C) == C02290Fp.Middle) {
            return r2.A0C;
        }
        C02290Fp r0 = C02290Fp.Start;
        if (r1 == r0) {
            return C02290Fp.End;
        }
        return r0;
    }

    public final String A0P(String str, boolean z, boolean z2) {
        String str2;
        if (this.A02.A07) {
            str2 = "[\\n\\t]";
        } else {
            str = str.replaceAll("\\n", "").replaceAll("\\t", " ");
            if (z) {
                str = str.replaceAll("^\\s+", "");
            }
            if (z2) {
                str = str.replaceAll("\\s+$", "");
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, " ");
    }

    public final void A0Q() {
        this.A00.restore();
        this.A02 = (AnonymousClass0TM) this.A05.pop();
    }

    public final void A0R() {
        this.A00.save();
        this.A05.push(this.A02);
        this.A02 = new AnonymousClass0TM(this.A02, this);
    }

    public final void A0S() {
        C01820Ci r1;
        C10520i4 r2 = this.A02.A04;
        C10510i3 r12 = r2.A0K;
        if (r12 instanceof C01820Ci) {
            r1 = (C01820Ci) r12;
        } else if (r12 instanceof C01810Ch) {
            r1 = r2.A02;
        } else {
            return;
        }
        int i = r1.A00;
        Float f = r2.A0U;
        if (f != null) {
            i = A03(i, f.floatValue());
        }
        this.A00.drawColor(i);
    }

    public final void A0U(Path path) {
        AnonymousClass0TM r2 = this.A02;
        if (r2.A04.A0F == C02150Fb.NonScalingStroke) {
            Canvas canvas = this.A00;
            Matrix matrix = canvas.getMatrix();
            Path A062 = AnonymousClass002.A06();
            path.transform(matrix, A062);
            canvas.setMatrix(AnonymousClass002.A05());
            Shader shader = this.A02.A01.getShader();
            Matrix A052 = AnonymousClass002.A05();
            if (shader != null) {
                shader.getLocalMatrix(A052);
                Matrix matrix2 = new Matrix(A052);
                matrix2.postConcat(matrix);
                shader.setLocalMatrix(matrix2);
            }
            canvas.drawPath(A062, this.A02.A01);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(A052);
                return;
            }
            return;
        }
        this.A00.drawPath(path, r2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0172, code lost:
        if (r4 != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r0.booleanValue() == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(android.graphics.Path r21, X.C01740Ca r22) {
        /*
            r20 = this;
            r10 = r20
            X.0TM r0 = r10.A02
            X.0i4 r0 = r0.A04
            X.0i3 r2 = r0.A0G
            boolean r0 = r2 instanceof X.C01800Cg
            r6 = r21
            if (r0 == 0) goto L_0x01cc
            X.0QT r1 = r10.A01
            X.0Cg r2 = (X.C01800Cg) r2
            java.lang.String r0 = r2.A01
            X.0NJ r9 = r1.A04(r0)
            boolean r0 = r9 instanceof X.AnonymousClass0CM
            if (r0 == 0) goto L_0x01cc
            X.0CM r9 = (X.AnonymousClass0CM) r9
            java.lang.Boolean r0 = r9.A06
            r17 = 0
            r14 = 1
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            java.lang.String r0 = r9.A07
            if (r0 == 0) goto L_0x0034
            r10.A0d(r9, r0)
        L_0x0034:
            r8 = 0
            X.0i6 r0 = r9.A03
            r11 = r22
            if (r1 == 0) goto L_0x0186
            float r16 = A01(r0, r10)
            X.0i6 r0 = r9.A04
            float r2 = A00(r0, r10)
            X.0i6 r0 = r9.A02
            float r1 = A01(r0, r10)
            X.0i6 r0 = r9.A01
            float r0 = A00(r0, r10)
        L_0x0051:
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01d5
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01d5
            X.0Tw r3 = r9.A00
            r19 = r3
            if (r3 != 0) goto L_0x0061
            X.0Tw r19 = X.C05530Tw.A02
        L_0x0061:
            r10.A0R()
            android.graphics.Canvas r7 = r10.A00
            r7.clipPath(r6)
            X.0TM r5 = new X.0TM
            r5.<init>(r10)
            X.0i4 r3 = X.C10520i4.A00()
            r10.A0e(r3, r5)
            X.0i4 r4 = r5.A04
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.A0M = r3
            r10.A0l(r9, r5)
            r10.A02 = r5
            X.0Te r6 = r11.A00
            android.graphics.Matrix r3 = r9.A00
            if (r3 == 0) goto L_0x0101
            r7.concat(r3)
            android.graphics.Matrix r4 = X.AnonymousClass002.A05()
            android.graphics.Matrix r3 = r9.A00
            boolean r3 = r3.invert(r4)
            if (r3 == 0) goto L_0x0101
            r3 = 8
            float[] r15 = new float[r3]
            X.0Te r12 = r11.A00
            float r6 = r12.A01
            r15[r17] = r6
            float r5 = r12.A02
            r15[r14] = r5
            float r3 = r12.A03
            float r13 = r6 + r3
            r3 = 2
            r15[r3] = r13
            r3 = 3
            r15[r3] = r5
            r3 = 4
            r15[r3] = r13
            float r3 = r12.A00
            float r5 = r5 + r3
            r3 = 5
            r15[r3] = r5
            r18 = 6
            r15[r18] = r6
            r3 = 7
            r15[r3] = r5
            r4.mapPoints(r15)
            r4 = r15[r17]
            r3 = r15[r14]
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>(r4, r3, r4, r3)
            r6 = 2
        L_0x00ca:
            r4 = r15[r6]
            float r13 = r14.left
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x00d5
            r14.left = r4
            r13 = r4
        L_0x00d5:
            float r12 = r14.right
            int r3 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            r14.right = r4
            r12 = r4
        L_0x00de:
            int r3 = r6 + 1
            r3 = r15[r3]
            float r5 = r14.top
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00eb
            r14.top = r3
            r5 = r3
        L_0x00eb:
            float r4 = r14.bottom
            int r17 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r17 <= 0) goto L_0x00f4
            r14.bottom = r3
            r4 = r3
        L_0x00f4:
            int r6 = r6 + 2
            r3 = r18
            if (r6 <= r3) goto L_0x00ca
            float r12 = r12 - r13
            float r4 = r4 - r5
            X.0Te r6 = new X.0Te
            r6.<init>(r13, r5, r12, r4)
        L_0x0101:
            float r5 = r6.A01
            float r3 = r5 - r16
            float r3 = r3 / r1
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r12 = (float) r3
            float r12 = r12 * r1
            float r16 = r16 + r12
            float r12 = r6.A02
            float r3 = r12 - r2
            float r3 = r3 / r0
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r13 = (float) r3
            float r13 = r13 * r0
            float r2 = r2 + r13
            float r3 = r6.A03
            float r5 = r5 + r3
            float r3 = r6.A00
            float r12 = r12 + r3
            X.0Te r6 = new X.0Te
            r6.<init>(r8, r8, r1, r0)
            boolean r13 = r10.A0o()
        L_0x012b:
            int r3 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01c3
            r8 = r16
        L_0x0131:
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0184
            r6.A01 = r8
            r6.A02 = r2
            r10.A0R()
            X.0TM r3 = r10.A02
            A08(r6, r3, r10)
            X.0Te r4 = r9.A00
            if (r4 == 0) goto L_0x0169
            r3 = r19
            android.graphics.Matrix r3 = A04(r3, r6, r4)
            r7.concat(r3)
        L_0x014e:
            java.util.List r3 = r9.A01
            java.util.Iterator r4 = r3.iterator()
        L_0x0154:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0164
            java.lang.Object r3 = r4.next()
            X.0NJ r3 = (X.AnonymousClass0NJ) r3
            r10.A0k(r3)
            goto L_0x0154
        L_0x0164:
            r10.A0Q()
            float r8 = r8 + r1
            goto L_0x0131
        L_0x0169:
            java.lang.Boolean r3 = r9.A05
            if (r3 == 0) goto L_0x0174
            boolean r4 = r3.booleanValue()
            r3 = 0
            if (r4 == 0) goto L_0x0175
        L_0x0174:
            r3 = 1
        L_0x0175:
            r7.translate(r8, r2)
            if (r3 != 0) goto L_0x014e
            X.0Te r3 = r11.A00
            float r4 = r3.A03
            float r3 = r3.A00
            r7.scale(r4, r3)
            goto L_0x014e
        L_0x0184:
            float r2 = r2 + r0
            goto L_0x012b
        L_0x0186:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01c0
            float r16 = r0.A04(r10, r3)
        L_0x018e:
            X.0i6 r0 = r9.A04
            if (r0 == 0) goto L_0x01be
            float r2 = r0.A04(r10, r3)
        L_0x0196:
            X.0i6 r0 = r9.A02
            if (r0 == 0) goto L_0x01bc
            float r1 = r0.A04(r10, r3)
        L_0x019e:
            X.0i6 r0 = r9.A01
            if (r0 == 0) goto L_0x01ba
            float r0 = r0.A04(r10, r3)
        L_0x01a6:
            X.0Te r7 = r11.A00
            float r3 = r7.A01
            float r5 = r7.A03
            float r16 = r16 * r5
            float r16 = r16 + r3
            float r4 = r7.A02
            float r3 = r7.A00
            float r2 = r2 * r3
            float r2 = r2 + r4
            float r1 = r1 * r5
            float r0 = r0 * r3
            goto L_0x0051
        L_0x01ba:
            r0 = 0
            goto L_0x01a6
        L_0x01bc:
            r1 = 0
            goto L_0x019e
        L_0x01be:
            r2 = 0
            goto L_0x0196
        L_0x01c0:
            r16 = 0
            goto L_0x018e
        L_0x01c3:
            if (r13 == 0) goto L_0x01c8
            r10.A0h(r9)
        L_0x01c8:
            r10.A0Q()
            return
        L_0x01cc:
            android.graphics.Canvas r1 = r10.A00
            X.0TM r0 = r10.A02
            android.graphics.Paint r0 = r0.A00
            r1.drawPath(r6, r0)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0V(android.graphics.Path, X.0Ca):void");
    }

    public final void A0W(C05530Tw r4, C05400Te r5, C05400Te r6, AnonymousClass0CI r7) {
        if (r5.A03 != 0.0f && r5.A00 != 0.0f) {
            if (r4 == null && (r4 = r7.A00) == null) {
                r4 = C05530Tw.A02;
            }
            if (A0G(r7, this)) {
                AnonymousClass0TM r0 = this.A02;
                r0.A03 = r5;
                A08(r5, r0, this);
                A0Y(this.A02.A03, r7);
                Canvas canvas = this.A00;
                C05400Te r02 = this.A02.A03;
                if (r6 != null) {
                    canvas.concat(A04(r4, r02, r6));
                    this.A02.A02 = r7.A00;
                } else {
                    canvas.translate(r02.A01, r02.A02);
                }
                boolean A0o = A0o();
                A0S();
                A0f(r7, true);
                if (A0o) {
                    A0h(r7);
                }
                A0i(r7);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0.booleanValue() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e5, code lost:
        if (r0.booleanValue() == false) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0X(X.C05400Te r23, X.C01800Cg r24, boolean r25) {
        /*
            r22 = this;
            r2 = r22
            X.0QT r0 = r2.A01
            r6 = r24
            java.lang.String r4 = r6.A01
            X.0NJ r5 = r0.A04(r4)
            r8 = r25
            if (r5 != 0) goto L_0x0030
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            if (r25 == 0) goto L_0x002d
            java.lang.String r0 = "Fill"
        L_0x0018:
            r3 = 0
            r1[r3] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r0 = "%s reference '%s' not found"
            A0D(r0, r1)
            X.0i3 r1 = r6.A00
            X.0TM r0 = r2.A02
            if (r1 == 0) goto L_0x01df
            A0B(r1, r0, r8)
        L_0x002c:
            return
        L_0x002d:
            java.lang.String r0 = "Stroke"
            goto L_0x0018
        L_0x0030:
            boolean r0 = r5 instanceof X.AnonymousClass0C4
            r4 = r23
            if (r0 == 0) goto L_0x00ce
            X.0C4 r5 = (X.AnonymousClass0C4) r5
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x003f
            r2.A0Z(r5, r0)
        L_0x003f:
            java.lang.Boolean r0 = r5.A02
            r3 = 1
            r10 = 0
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.booleanValue()
            r9 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r9 = 0
        L_0x004d:
            X.0TM r1 = r2.A02
            if (r25 == 0) goto L_0x00cb
            android.graphics.Paint r0 = r1.A00
        L_0x0053:
            if (r9 == 0) goto L_0x009d
            X.0Te r6 = r1.A02
            if (r6 != 0) goto L_0x005b
            X.0Te r6 = r1.A03
        L_0x005b:
            X.0i6 r1 = r5.A00
            float r15 = A01(r1, r2)
            X.0i6 r1 = r5.A02
            float r16 = A00(r1, r2)
            X.0i6 r1 = r5.A01
            if (r1 == 0) goto L_0x009a
            float r6 = r1.A02(r2)
        L_0x006f:
            X.0i6 r1 = r5.A03
            if (r1 == 0) goto L_0x00c8
            float r18 = r1.A03(r2)
        L_0x0077:
            r2.A0R()
            A0A(r5, r2)
            android.graphics.Matrix r7 = A05(r4, r9)
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto L_0x0088
            r7.preConcat(r1)
        L_0x0088:
            java.util.List r1 = r5.A04
            int r9 = r1.size()
            if (r9 != 0) goto L_0x01ea
            r2.A0Q()
            X.0TM r0 = r2.A02
            if (r25 == 0) goto L_0x01e7
            r0.A05 = r10
            return
        L_0x009a:
            float r6 = r6.A03
            goto L_0x006f
        L_0x009d:
            X.0i6 r1 = r5.A00
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x00c6
            float r15 = r1.A04(r2, r7)
        L_0x00a7:
            X.0i6 r1 = r5.A02
            if (r1 == 0) goto L_0x00c3
            float r16 = r1.A04(r2, r7)
        L_0x00af:
            X.0i6 r1 = r5.A01
            if (r1 == 0) goto L_0x00c0
            float r6 = r1.A04(r2, r7)
        L_0x00b7:
            X.0i6 r1 = r5.A03
            if (r1 == 0) goto L_0x00c8
            float r18 = r1.A04(r2, r7)
            goto L_0x0077
        L_0x00c0:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b7
        L_0x00c3:
            r16 = 0
            goto L_0x00af
        L_0x00c6:
            r15 = 0
            goto L_0x00a7
        L_0x00c8:
            r18 = 0
            goto L_0x0077
        L_0x00cb:
            android.graphics.Paint r0 = r1.A01
            goto L_0x0053
        L_0x00ce:
            boolean r0 = r5 instanceof X.AnonymousClass0C5
            if (r0 == 0) goto L_0x016a
            X.0C5 r5 = (X.AnonymousClass0C5) r5
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x00db
            r2.A0Z(r5, r0)
        L_0x00db:
            java.lang.Boolean r0 = r5.A02
            r7 = 0
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 != 0) goto L_0x00e8
        L_0x00e7:
            r6 = 0
        L_0x00e8:
            X.0TM r0 = r2.A02
            if (r25 == 0) goto L_0x0167
            android.graphics.Paint r0 = r0.A00
        L_0x00ee:
            if (r6 == 0) goto L_0x0143
            r9 = 1112014848(0x42480000, float:50.0)
            X.0G3 r1 = X.AnonymousClass0G3.percent
            X.0i6 r3 = new X.0i6
            r3.<init>(r1, r9)
            X.0i6 r1 = r5.A00
            if (r1 == 0) goto L_0x013e
            float r11 = r1.A02(r2)
        L_0x0101:
            X.0i6 r1 = r5.A01
            if (r1 == 0) goto L_0x0139
            float r12 = r1.A03(r2)
        L_0x0109:
            X.0i6 r1 = r5.A04
            if (r1 == 0) goto L_0x0134
            float r13 = r1.A01(r2)
        L_0x0111:
            r2.A0R()
            A0A(r5, r2)
            android.graphics.Matrix r4 = A05(r4, r6)
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto L_0x0122
            r4.preConcat(r1)
        L_0x0122:
            java.util.List r1 = r5.A04
            int r3 = r1.size()
            if (r3 != 0) goto L_0x0282
            r2.A0Q()
            X.0TM r0 = r2.A02
            if (r25 == 0) goto L_0x027f
            r0.A05 = r7
            return
        L_0x0134:
            float r13 = r3.A01(r2)
            goto L_0x0111
        L_0x0139:
            float r12 = r3.A03(r2)
            goto L_0x0109
        L_0x013e:
            float r11 = r3.A02(r2)
            goto L_0x0101
        L_0x0143:
            X.0i6 r1 = r5.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0161
            float r11 = r1.A04(r2, r3)
        L_0x014d:
            X.0i6 r1 = r5.A01
            if (r1 == 0) goto L_0x015e
            float r12 = r1.A04(r2, r3)
        L_0x0155:
            X.0i6 r1 = r5.A04
            if (r1 == 0) goto L_0x0164
            float r13 = r1.A04(r2, r3)
            goto L_0x0111
        L_0x015e:
            r12 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0155
        L_0x0161:
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x014d
        L_0x0164:
            r13 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0111
        L_0x0167:
            android.graphics.Paint r0 = r0.A01
            goto L_0x00ee
        L_0x016a:
            boolean r0 = r5 instanceof X.C01760Cc
            if (r0 == 0) goto L_0x002c
            X.0Ce r5 = (X.C01780Ce) r5
            r10 = 1
            r6 = 6442450944(0x180000000, double:3.1829936864E-314)
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            X.0i4 r9 = r5.A00
            boolean r0 = A0E(r9, r0)
            if (r25 == 0) goto L_0x01b5
            if (r0 == 0) goto L_0x0197
            X.0TM r5 = r2.A02
            X.0i4 r1 = r5.A04
            X.0i3 r0 = r9.A0H
            r1.A0G = r0
            if (r0 != 0) goto L_0x0195
            r10 = 0
        L_0x0195:
            r5.A05 = r10
        L_0x0197:
            boolean r0 = A0E(r9, r3)
            if (r0 == 0) goto L_0x01a5
            X.0TM r0 = r2.A02
            X.0i4 r1 = r0.A04
            java.lang.Float r0 = r9.A0Q
            r1.A0O = r0
        L_0x01a5:
            boolean r0 = A0E(r9, r6)
            if (r0 == 0) goto L_0x002c
            X.0TM r1 = r2.A02
            X.0i4 r0 = r1.A04
            X.0i3 r0 = r0.A0G
        L_0x01b1:
            A0B(r0, r1, r8)
            return
        L_0x01b5:
            if (r0 == 0) goto L_0x01c4
            X.0TM r5 = r2.A02
            X.0i4 r1 = r5.A04
            X.0i3 r0 = r9.A0H
            r1.A0J = r0
            if (r0 != 0) goto L_0x01c2
            r10 = 0
        L_0x01c2:
            r5.A06 = r10
        L_0x01c4:
            boolean r0 = A0E(r9, r3)
            if (r0 == 0) goto L_0x01d2
            X.0TM r0 = r2.A02
            X.0i4 r1 = r0.A04
            java.lang.Float r0 = r9.A0Q
            r1.A0T = r0
        L_0x01d2:
            boolean r0 = A0E(r9, r6)
            if (r0 == 0) goto L_0x002c
            X.0TM r1 = r2.A02
            X.0i4 r0 = r1.A04
            X.0i3 r0 = r0.A0J
            goto L_0x01b1
        L_0x01df:
            if (r25 == 0) goto L_0x01e4
            r0.A05 = r3
            return
        L_0x01e4:
            r0.A06 = r3
            return
        L_0x01e7:
            r0.A06 = r10
            return
        L_0x01ea:
            int[] r8 = new int[r9]
            float[] r4 = new float[r9]
            java.util.List r1 = r5.A04
            java.util.Iterator r14 = r1.iterator()
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x01f6:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0242
            java.lang.Object r11 = r14.next()
            X.0NJ r11 = (X.AnonymousClass0NJ) r11
            X.0Cd r11 = (X.C01770Cd) r11
            java.lang.Float r1 = r11.A00
            if (r1 == 0) goto L_0x0240
            float r12 = r1.floatValue()
        L_0x020c:
            if (r10 == 0) goto L_0x023c
            int r1 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x023c
            r4[r10] = r13
        L_0x0214:
            r2.A0R()
            X.0TM r1 = r2.A02
            r2.A0j(r11, r1)
            X.0TM r1 = r2.A02
            X.0i4 r12 = r1.A04
            X.0i3 r1 = r12.A0I
            X.0Ci r1 = (X.C01820Ci) r1
            if (r1 != 0) goto L_0x0228
            X.0Ci r1 = X.C01820Ci.A01
        L_0x0228:
            int r11 = r1.A00
            java.lang.Float r1 = r12.A0R
            float r1 = r1.floatValue()
            int r1 = A03(r11, r1)
            r8[r10] = r1
            int r10 = r10 + 1
            r2.A0Q()
            goto L_0x01f6
        L_0x023c:
            r4[r10] = r12
            r13 = r12
            goto L_0x0214
        L_0x0240:
            r12 = 0
            goto L_0x020c
        L_0x0242:
            int r1 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x024a
            int r1 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x0275
        L_0x024a:
            if (r9 == r3) goto L_0x0275
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.CLAMP
            X.0Fk r3 = r5.A01
            if (r3 == 0) goto L_0x0258
            X.0Fk r1 = X.C02240Fk.reflect
            if (r3 != r1) goto L_0x026e
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.MIRROR
        L_0x0258:
            r2.A0Q()
            android.graphics.LinearGradient r14 = new android.graphics.LinearGradient
            r19 = r8
            r20 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r14.setLocalMatrix(r7)
            r0.setShader(r14)
            goto L_0x02fa
        L_0x026e:
            X.0Fk r1 = X.C02240Fk.repeat
            if (r3 != r1) goto L_0x0258
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x0258
        L_0x0275:
            r2.A0Q()
            int r9 = r9 - r3
            r1 = r8[r9]
            r0.setColor(r1)
            return
        L_0x027f:
            r0.A06 = r7
            return
        L_0x0282:
            int[] r14 = new int[r3]
            float[] r15 = new float[r3]
            java.util.List r1 = r5.A04
            java.util.Iterator r10 = r1.iterator()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x028e:
            boolean r1 = r10.hasNext()
            r8 = 0
            if (r1 == 0) goto L_0x02d9
            java.lang.Object r6 = r10.next()
            X.0NJ r6 = (X.AnonymousClass0NJ) r6
            X.0Cd r6 = (X.C01770Cd) r6
            java.lang.Float r1 = r6.A00
            if (r1 == 0) goto L_0x02a5
            float r8 = r1.floatValue()
        L_0x02a5:
            if (r7 == 0) goto L_0x02d5
            int r1 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d5
            r15[r7] = r9
        L_0x02ad:
            r2.A0R()
            X.0TM r1 = r2.A02
            r2.A0j(r6, r1)
            X.0TM r1 = r2.A02
            X.0i4 r8 = r1.A04
            X.0i3 r1 = r8.A0I
            X.0Ci r1 = (X.C01820Ci) r1
            if (r1 != 0) goto L_0x02c1
            X.0Ci r1 = X.C01820Ci.A01
        L_0x02c1:
            int r6 = r1.A00
            java.lang.Float r1 = r8.A0R
            float r1 = r1.floatValue()
            int r1 = A03(r6, r1)
            r14[r7] = r1
            int r7 = r7 + 1
            r2.A0Q()
            goto L_0x028e
        L_0x02d5:
            r15[r7] = r8
            r9 = r8
            goto L_0x02ad
        L_0x02d9:
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x031d
            r1 = 1
            if (r3 == r1) goto L_0x031d
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            X.0Fk r3 = r5.A01
            if (r3 == 0) goto L_0x02ec
            X.0Fk r1 = X.C02240Fk.reflect
            if (r3 != r1) goto L_0x0316
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.MIRROR
        L_0x02ec:
            r2.A0Q()
            android.graphics.RadialGradient r10 = new android.graphics.RadialGradient
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r10.setLocalMatrix(r4)
            r0.setShader(r10)
        L_0x02fa:
            X.0TM r1 = r2.A02
            X.0i4 r1 = r1.A04
            java.lang.Float r1 = r1.A0O
            float r2 = r1.floatValue()
            r1 = 1132462080(0x43800000, float:256.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            if (r2 >= 0) goto L_0x030f
            r2 = 0
        L_0x030b:
            r0.setAlpha(r2)
            return
        L_0x030f:
            r1 = 255(0xff, float:3.57E-43)
            if (r2 <= r1) goto L_0x030b
            r2 = 255(0xff, float:3.57E-43)
            goto L_0x030b
        L_0x0316:
            X.0Fk r1 = X.C02240Fk.repeat
            if (r3 != r1) goto L_0x02ec
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x02ec
        L_0x031d:
            r2.A0Q()
            r1 = 1
            int r3 = r3 - r1
            r1 = r14[r3]
            r0.setColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0X(X.0Te, X.0Cg, boolean):void");
    }

    public final void A0Y(C05400Te r3, C01740Ca r4) {
        Path A0H;
        if (this.A02.A04.A0W != null && (A0H = A0H(r3, r4)) != null) {
            this.A00.clipPath(A0H);
        }
    }

    public final void A0Z(C01750Cb r6, String str) {
        AnonymousClass0NJ A042 = r6.A01.A04(str);
        if (A042 == null) {
            Log.w("SVGAndroidRenderer", String.format("Gradient reference '%s' not found", new Object[]{str}));
        } else if (!(A042 instanceof C01750Cb)) {
            A0D("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (A042 == r6) {
            A0D("Circular reference in gradient href attribute '%s'", str);
        } else {
            C01750Cb r2 = (C01750Cb) A042;
            if (r6.A02 == null) {
                r6.A02 = r2.A02;
            }
            if (r6.A00 == null) {
                r6.A00 = r2.A00;
            }
            if (r6.A01 == null) {
                r6.A01 = r2.A01;
            }
            if (r6.A04.isEmpty()) {
                r6.A04 = r2.A04;
            }
            try {
                if (r6 instanceof AnonymousClass0C4) {
                    AnonymousClass0C4 r1 = (AnonymousClass0C4) r6;
                    AnonymousClass0C4 r3 = (AnonymousClass0C4) A042;
                    if (r1.A00 == null) {
                        r1.A00 = r3.A00;
                    }
                    if (r1.A02 == null) {
                        r1.A02 = r3.A02;
                    }
                    if (r1.A01 == null) {
                        r1.A01 = r3.A01;
                    }
                    if (r1.A03 == null) {
                        r1.A03 = r3.A03;
                    }
                } else {
                    AnonymousClass0C5 r12 = (AnonymousClass0C5) r6;
                    AnonymousClass0C5 r32 = (AnonymousClass0C5) A042;
                    if (r12.A00 == null) {
                        r12.A00 = r32.A00;
                    }
                    if (r12.A01 == null) {
                        r12.A01 = r32.A01;
                    }
                    if (r12.A04 == null) {
                        r12.A04 = r32.A04;
                    }
                    if (r12.A02 == null) {
                        r12.A02 = r32.A02;
                    }
                    if (r12.A03 == null) {
                        r12.A03 = r32.A03;
                    }
                }
            } catch (ClassCastException unused) {
            }
            String str2 = r2.A03;
            if (str2 != null) {
                A0Z(r6, str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0a(X.AnonymousClass0CS r25) {
        /*
            r24 = this;
            r9 = r25
            r3 = r24
            X.0TM r0 = r3.A02
            X.0i4 r1 = r0.A04
            java.lang.String r4 = r1.A0Z
            if (r4 != 0) goto L_0x0015
            java.lang.String r0 = r1.A0Y
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r1.A0X
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r7 = "Marker reference '%s' not found"
            r16 = 0
            r2 = 0
            r1 = 1
            if (r4 == 0) goto L_0x01d0
            X.0QT r0 = r9.A01
            X.0NJ r6 = r0.A04(r4)
            if (r6 == 0) goto L_0x01c3
            X.0CL r6 = (X.AnonymousClass0CL) r6
        L_0x0027:
            X.0TM r0 = r3.A02
            X.0i4 r0 = r0.A04
            java.lang.String r4 = r0.A0Y
            if (r4 == 0) goto L_0x01bf
            X.0QT r0 = r9.A01
            X.0NJ r5 = r0.A04(r4)
            if (r5 == 0) goto L_0x01b2
            X.0CL r5 = (X.AnonymousClass0CL) r5
        L_0x0039:
            X.0TM r0 = r3.A02
            X.0i4 r0 = r0.A04
            java.lang.String r4 = r0.A0X
            if (r4 == 0) goto L_0x01ae
            X.0QT r0 = r9.A01
            X.0NJ r4 = r0.A04(r4)
            if (r4 == 0) goto L_0x01a1
            X.0CL r4 = (X.AnonymousClass0CL) r4
        L_0x004b:
            boolean r0 = r9 instanceof X.AnonymousClass0C6
            if (r0 == 0) goto L_0x00d9
            X.0C6 r9 = (X.AnonymousClass0C6) r9
            X.0gl r7 = r9.A00
            X.0gk r0 = new X.0gk
            r0.<init>(r7, r3)
            java.util.List r0 = r0.A04
        L_0x005a:
            int r8 = r0.size()
            if (r8 == 0) goto L_0x0014
            X.0TM r7 = r3.A02
            X.0i4 r9 = r7.A04
            r7 = r16
            r9.A0X = r7
            r9.A0Y = r7
            r9.A0Z = r7
            if (r6 == 0) goto L_0x0077
            java.lang.Object r7 = r0.get(r2)
            X.0Ps r7 = (X.AnonymousClass0Ps) r7
            r3.A0b(r6, r7)
        L_0x0077:
            if (r5 == 0) goto L_0x01d4
            int r7 = r0.size()
            r6 = 2
            if (r7 <= r6) goto L_0x01d4
            java.lang.Object r13 = r0.get(r2)
            X.0Ps r13 = (X.AnonymousClass0Ps) r13
            java.lang.Object r9 = r0.get(r1)
            X.0Ps r9 = (X.AnonymousClass0Ps) r9
            r7 = 1
        L_0x008d:
            int r2 = r8 + -1
            if (r7 >= r2) goto L_0x01d4
            int r7 = r7 + 1
            java.lang.Object r6 = r0.get(r7)
            X.0Ps r6 = (X.AnonymousClass0Ps) r6
            boolean r2 = r9.A04
            if (r2 == 0) goto L_0x00cc
            float r11 = r9.A00
            float r10 = r9.A01
            float r15 = r9.A02
            float r2 = r13.A02
            float r12 = r15 - r2
            float r14 = r9.A03
            float r2 = r13.A03
            float r2 = r14 - r2
            float r12 = r12 * r11
            float r2 = r2 * r10
            float r12 = r12 + r2
            r13 = 0
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00be
            float r12 = r6.A02
            float r12 = r12 - r15
            float r2 = r6.A03
            float r2 = r2 - r14
            float r12 = r12 * r11
            float r2 = r2 * r10
            float r12 = r12 + r2
        L_0x00be:
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00cc
            if (r2 != 0) goto L_0x00d2
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00cc
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00d2
        L_0x00cc:
            r13 = r9
            r3.A0b(r5, r9)
            r9 = r6
            goto L_0x008d
        L_0x00d2:
            float r2 = -r11
            r9.A00 = r2
            float r2 = -r10
            r9.A01 = r2
            goto L_0x00cc
        L_0x00d9:
            boolean r0 = r9 instanceof X.AnonymousClass0CA
            if (r0 == 0) goto L_0x011b
            X.0CA r9 = (X.AnonymousClass0CA) r9
            X.0i6 r0 = r9.A00
            float r10 = A01(r0, r3)
            X.0i6 r0 = r9.A02
            float r11 = A00(r0, r3)
            X.0i6 r0 = r9.A01
            float r19 = A01(r0, r3)
            X.0i6 r0 = r9.A03
            float r20 = A00(r0, r3)
            r0 = 2
            java.util.ArrayList r0 = X.AnonymousClass002.A0I(r0)
            float r12 = r19 - r10
            float r13 = r20 - r11
            X.0Ps r8 = new X.0Ps
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            r0.add(r8)
            X.0Ps r7 = new X.0Ps
            r17 = r7
            r18 = r3
            r21 = r12
            r22 = r13
            r17.<init>(r18, r19, r20, r21, r22)
            r0.add(r7)
            goto L_0x005a
        L_0x011b:
            X.0C7 r9 = (X.AnonymousClass0C7) r9
            float[] r12 = r9.A00
            int r0 = r12.length
            r23 = r0
            r11 = 2
            if (r0 < r11) goto L_0x0014
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r14 = r12[r2]
            r10 = r12[r1]
            r21 = 0
            X.0Ps r8 = new X.0Ps
            r19 = r14
            r20 = r10
            r22 = r21
            r17 = r8
            r18 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            r13 = 0
            r7 = 0
        L_0x0140:
            r15 = r23
            if (r11 >= r15) goto L_0x0166
            r13 = r12[r11]
            int r7 = r11 + 1
            r7 = r12[r7]
            r8.A00(r13, r7)
            r0.add(r8)
            float r15 = r8.A02
            float r21 = r13 - r15
            float r8 = r8.A03
            float r22 = r7 - r8
            X.0Ps r8 = new X.0Ps
            r19 = r13
            r20 = r7
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22)
            int r11 = r11 + 2
            goto L_0x0140
        L_0x0166:
            boolean r9 = r9 instanceof X.AnonymousClass0CG
            if (r9 == 0) goto L_0x019c
            int r9 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x005a
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x005a
            r8.A00(r14, r10)
            r0.add(r8)
            float r7 = r8.A02
            float r21 = r14 - r7
            float r7 = r8.A03
            float r22 = r10 - r7
            X.0Ps r8 = new X.0Ps
            r19 = r14
            r20 = r10
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.Object r7 = r0.get(r2)
            X.0Ps r7 = (X.AnonymousClass0Ps) r7
            r8.A01(r7)
            r0.add(r8)
            r0.set(r2, r8)
            goto L_0x005a
        L_0x019c:
            r0.add(r8)
            goto L_0x005a
        L_0x01a1:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            X.0TM r0 = r3.A02
            X.0i4 r0 = r0.A04
            java.lang.String r0 = r0.A0X
            r4[r2] = r0
            A0D(r7, r4)
        L_0x01ae:
            r4 = r16
            goto L_0x004b
        L_0x01b2:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            X.0TM r0 = r3.A02
            X.0i4 r0 = r0.A04
            java.lang.String r0 = r0.A0Y
            r4[r2] = r0
            A0D(r7, r4)
        L_0x01bf:
            r5 = r16
            goto L_0x0039
        L_0x01c3:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            X.0TM r0 = r3.A02
            X.0i4 r0 = r0.A04
            java.lang.String r0 = r0.A0Z
            r4[r2] = r0
            A0D(r7, r4)
        L_0x01d0:
            r6 = r16
            goto L_0x0027
        L_0x01d4:
            if (r4 == 0) goto L_0x0014
            int r8 = r8 - r1
            java.lang.Object r0 = r0.get(r8)
            X.0Ps r0 = (X.AnonymousClass0Ps) r0
            r3.A0b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0a(X.0CS):void");
    }

    public final void A0d(AnonymousClass0CM r5, String str) {
        AnonymousClass0NJ A042 = r5.A01.A04(str);
        if (A042 == null) {
            Log.w("SVGAndroidRenderer", String.format("Pattern reference '%s' not found", new Object[]{str}));
        } else if (!(A042 instanceof AnonymousClass0CM)) {
            A0D("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (A042 == r5) {
            A0D("Circular reference in pattern href attribute '%s'", str);
        } else {
            AnonymousClass0CM r1 = (AnonymousClass0CM) A042;
            if (r5.A06 == null) {
                r5.A06 = r1.A06;
            }
            if (r5.A05 == null) {
                r5.A05 = r1.A05;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            if (r5.A03 == null) {
                r5.A03 = r1.A03;
            }
            if (r5.A04 == null) {
                r5.A04 = r1.A04;
            }
            if (r5.A02 == null) {
                r5.A02 = r1.A02;
            }
            if (r5.A01 == null) {
                r5.A01 = r1.A01;
            }
            if (r5.A01.isEmpty()) {
                r5.A01 = r1.A01;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            String str2 = r1.A07;
            if (str2 != null) {
                A0d(r5, str2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r4 == X.C01820Ci.A02) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x028e, code lost:
        if (r5.equals(r0) == false) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0290, code lost:
        r0 = android.graphics.Typeface.SANS_SERIF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0292, code lost:
        r1 = android.graphics.Typeface.create(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0296, code lost:
        if (r1 == null) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x021d, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r4 == X.C01820Ci.A02) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e(X.C10520i4 r13, X.AnonymousClass0TM r14) {
        /*
            r12 = this;
            r0 = 4096(0x1000, double:2.0237E-320)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x000e
            X.0i4 r1 = r14.A04
            X.0Ci r0 = r13.A02
            r1.A02 = r0
        L_0x000e:
            r0 = 2048(0x800, double:1.0118E-320)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x001c
            X.0i4 r1 = r14.A04
            java.lang.Float r0 = r13.A0P
            r1.A0P = r0
        L_0x001c:
            r0 = 1
            boolean r0 = A0E(r13, r0)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0038
            X.0i4 r1 = r14.A04
            X.0i3 r0 = r13.A0G
            r1.A0G = r0
            X.0i3 r4 = r13.A0G
            if (r4 == 0) goto L_0x0035
            X.0Ci r1 = X.C01820Ci.A02
            r0 = 1
            if (r4 != r1) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r14.A05 = r0
        L_0x0038:
            r0 = 4
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0046
            X.0i4 r1 = r14.A04
            java.lang.Float r0 = r13.A0O
            r1.A0O = r0
        L_0x0046:
            r0 = 6149(0x1805, double:3.038E-320)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0055
            X.0i4 r0 = r14.A04
            X.0i3 r0 = r0.A0G
            A0B(r0, r14, r3)
        L_0x0055:
            r0 = 2
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0063
            X.0i4 r1 = r14.A04
            X.0FZ r0 = r13.A07
            r1.A07 = r0
        L_0x0063:
            r0 = 8
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x007d
            X.0i4 r1 = r14.A04
            X.0i3 r0 = r13.A0J
            r1.A0J = r0
            X.0i3 r4 = r13.A0J
            if (r4 == 0) goto L_0x007a
            X.0Ci r1 = X.C01820Ci.A02
            r0 = 1
            if (r4 != r1) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r14.A06 = r0
        L_0x007d:
            r0 = 16
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x008b
            X.0i4 r1 = r14.A04
            java.lang.Float r0 = r13.A0T
            r1.A0T = r0
        L_0x008b:
            r0 = 6168(0x1818, double:3.0474E-320)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x009a
            X.0i4 r0 = r14.A04
            X.0i3 r0 = r0.A0J
            A0B(r0, r14, r2)
        L_0x009a:
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x00ab
            X.0i4 r1 = r14.A04
            X.0Fb r0 = r13.A0F
            r1.A0F = r0
        L_0x00ab:
            r0 = 32
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x00c2
            X.0i4 r1 = r14.A04
            X.0i6 r0 = r13.A05
            r1.A05 = r0
            android.graphics.Paint r1 = r14.A01
            float r0 = r0.A01(r12)
            r1.setStrokeWidth(r0)
        L_0x00c2:
            r0 = 64
            boolean r0 = A0E(r13, r0)
            r4 = 2
            if (r0 == 0) goto L_0x00e4
            X.0i4 r1 = r14.A04
            X.0Fm r0 = r13.A09
            r1.A09 = r0
            X.0Fm r0 = r13.A09
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x0178
            if (r0 == r3) goto L_0x0172
            if (r0 != r4) goto L_0x00e4
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        L_0x00e1:
            r1.setStrokeCap(r0)
        L_0x00e4:
            r0 = 128(0x80, double:6.32E-322)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0105
            X.0i4 r1 = r14.A04
            X.0Fn r0 = r13.A0A
            r1.A0A = r0
            X.0Fn r0 = r13.A0A
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x016d
            if (r0 == r3) goto L_0x0168
            if (r0 != r4) goto L_0x0105
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
        L_0x0102:
            r1.setStrokeJoin(r0)
        L_0x0105:
            r0 = 256(0x100, double:1.265E-321)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x011e
            X.0i4 r1 = r14.A04
            java.lang.Float r0 = r13.A0S
            r1.A0S = r0
            android.graphics.Paint r1 = r14.A01
            java.lang.Float r0 = r13.A0S
            float r0 = r0.floatValue()
            r1.setStrokeMiter(r0)
        L_0x011e:
            r0 = 512(0x200, double:2.53E-321)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x012c
            X.0i4 r1 = r14.A04
            X.0i6[] r0 = r13.A0c
            r1.A0c = r0
        L_0x012c:
            r0 = 1024(0x400, double:5.06E-321)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x013a
            X.0i4 r1 = r14.A04
            X.0i6 r0 = r13.A04
            r1.A04 = r0
        L_0x013a:
            r0 = 1536(0x600, double:7.59E-321)
            boolean r0 = A0E(r13, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0198
            X.0i4 r8 = r14.A04
            X.0i6[] r0 = r8.A0c
            if (r0 == 0) goto L_0x0402
            int r10 = r0.length
            int r0 = r10 % 2
            int r7 = r10 * 2
            if (r0 != 0) goto L_0x0151
            r7 = r10
        L_0x0151:
            float[] r5 = new float[r7]
            r11 = 0
            r4 = 0
            r6 = 0
        L_0x0156:
            if (r4 >= r7) goto L_0x017e
            X.0i6[] r1 = r8.A0c
            int r0 = r4 % r10
            r0 = r1[r0]
            float r0 = r0.A01(r12)
            r5[r4] = r0
            float r6 = r6 + r0
            int r4 = r4 + 1
            goto L_0x0156
        L_0x0168:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L_0x0102
        L_0x016d:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L_0x0102
        L_0x0172:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L_0x00e1
        L_0x0178:
            android.graphics.Paint r1 = r14.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L_0x00e1
        L_0x017e:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0402
            X.0i6 r0 = r8.A04
            float r4 = r0.A01(r12)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x018e
            float r4 = r4 % r6
            float r4 = r4 + r6
        L_0x018e:
            android.graphics.Paint r1 = r14.A01
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r5, r4)
            r1.setPathEffect(r0)
        L_0x0198:
            r0 = 16384(0x4000, double:8.0948E-320)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x01c4
            X.0TM r0 = r12.A02
            android.graphics.Paint r0 = r0.A00
            float r4 = r0.getTextSize()
            X.0i4 r1 = r14.A04
            X.0i6 r0 = r13.A03
            r1.A03 = r0
            android.graphics.Paint r1 = r14.A00
            X.0i6 r0 = r13.A03
            float r0 = r0.A04(r12, r4)
            r1.setTextSize(r0)
            android.graphics.Paint r1 = r14.A01
            X.0i6 r0 = r13.A03
            float r0 = r0.A04(r12, r4)
            r1.setTextSize(r0)
        L_0x01c4:
            r0 = 8192(0x2000, double:4.0474E-320)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x01d2
            X.0i4 r1 = r14.A04
            java.util.List r0 = r13.A0b
            r1.A0b = r0
        L_0x01d2:
            r0 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x01f7
            java.lang.Integer r5 = r13.A0V
            int r1 = r5.intValue()
            r0 = -1
            r4 = 100
            if (r1 != r0) goto L_0x03e4
            X.0i4 r1 = r14.A04
            java.lang.Integer r0 = r1.A0V
            int r0 = r0.intValue()
            if (r0 <= r4) goto L_0x03fc
            int r0 = r0 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0V = r0
        L_0x01f7:
            r0 = 65536(0x10000, double:3.2379E-319)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0206
            X.0i4 r1 = r14.A04
            X.0Fl r0 = r13.A08
            r1.A08 = r0
        L_0x0206:
            r0 = 106496(0x1a000, double:5.2616E-319)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x02a2
            X.0i4 r3 = r14.A04
            java.util.List r1 = r3.A0b
            if (r1 == 0) goto L_0x0266
            X.0QT r0 = r12.A01
            if (r0 == 0) goto L_0x0266
            java.util.Iterator r7 = r1.iterator()
        L_0x021d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0266
            java.lang.String r5 = X.AnonymousClass001.A0m(r7)
            java.lang.Integer r6 = r3.A0V
            X.0Fl r1 = r3.A08
            X.0Fl r0 = X.C02250Fl.Italic
            boolean r4 = X.AnonymousClass000.A1Y(r1, r0)
            int r1 = r6.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 <= r0) goto L_0x0261
            r1 = 1
            if (r4 == 0) goto L_0x023d
            r1 = 3
        L_0x023d:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1536685117: goto L_0x0288;
                case -1431958525: goto L_0x0256;
                case -1081737434: goto L_0x0253;
                case 109326717: goto L_0x0248;
                case 1126973893: goto L_0x0245;
                default: goto L_0x0244;
            }
        L_0x0244:
            goto L_0x021d
        L_0x0245:
            java.lang.String r0 = "cursive"
            goto L_0x028a
        L_0x0248:
            java.lang.String r0 = "serif"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            goto L_0x0292
        L_0x0253:
            java.lang.String r0 = "fantasy"
            goto L_0x028a
        L_0x0256:
            java.lang.String r0 = "monospace"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            goto L_0x0292
        L_0x0261:
            r1 = 0
            if (r4 == 0) goto L_0x023d
            r1 = 2
            goto L_0x023d
        L_0x0266:
            java.lang.Integer r4 = r3.A0V
            X.0Fl r1 = r3.A08
            X.0Fl r0 = X.C02250Fl.Italic
            boolean r3 = X.AnonymousClass000.A1Y(r1, r0)
            int r1 = r4.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 <= r0) goto L_0x0283
            r1 = 1
            if (r3 == 0) goto L_0x027c
            r1 = 3
        L_0x027c:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r0, r1)
            goto L_0x0298
        L_0x0283:
            r1 = 0
            if (r3 == 0) goto L_0x027c
            r1 = 2
            goto L_0x027c
        L_0x0288:
            java.lang.String r0 = "sans-serif"
        L_0x028a:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
        L_0x0292:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r0, r1)
            if (r1 == 0) goto L_0x021d
        L_0x0298:
            android.graphics.Paint r0 = r14.A00
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r14.A01
            r0.setTypeface(r1)
        L_0x02a2:
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x02dc
            X.0i4 r1 = r14.A04
            X.0Fx r0 = r13.A0D
            r1.A0D = r0
            android.graphics.Paint r1 = r14.A00
            X.0Fx r0 = r13.A0D
            X.0Fx r4 = X.C02370Fx.LineThrough
            boolean r0 = X.AnonymousClass000.A1Y(r0, r4)
            r1.setStrikeThruText(r0)
            X.0Fx r0 = r13.A0D
            X.0Fx r3 = X.C02370Fx.Underline
            boolean r0 = X.AnonymousClass000.A1Y(r0, r3)
            r1.setUnderlineText(r0)
            android.graphics.Paint r1 = r14.A01
            X.0Fx r0 = r13.A0D
            boolean r0 = X.AnonymousClass000.A1Y(r0, r4)
            r1.setStrikeThruText(r0)
            X.0Fx r0 = r13.A0D
            if (r0 != r3) goto L_0x02d9
            r2 = 1
        L_0x02d9:
            r1.setUnderlineText(r2)
        L_0x02dc:
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x02ed
            X.0i4 r1 = r14.A04
            X.0Fa r0 = r13.A0E
            r1.A0E = r0
        L_0x02ed:
            r0 = 262144(0x40000, double:1.295163E-318)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x02fc
            X.0i4 r1 = r14.A04
            X.0Fp r0 = r13.A0C
            r1.A0C = r0
        L_0x02fc:
            r0 = 524288(0x80000, double:2.590327E-318)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x030b
            X.0i4 r1 = r14.A04
            java.lang.Boolean r0 = r13.A0M
            r1.A0M = r0
        L_0x030b:
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x031a
            X.0i4 r1 = r14.A04
            java.lang.String r0 = r13.A0Z
            r1.A0Z = r0
        L_0x031a:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0329
            X.0i4 r1 = r14.A04
            java.lang.String r0 = r13.A0Y
            r1.A0Y = r0
        L_0x0329:
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0338
            X.0i4 r1 = r14.A04
            java.lang.String r0 = r13.A0X
            r1.A0X = r0
        L_0x0338:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0347
            X.0i4 r1 = r14.A04
            java.lang.Boolean r0 = r13.A0L
            r1.A0L = r0
        L_0x0347:
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0356
            X.0i4 r1 = r14.A04
            java.lang.Boolean r0 = r13.A0N
            r1.A0N = r0
        L_0x0356:
            r0 = 1048576(0x100000, double:5.180654E-318)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0365
            X.0i4 r1 = r14.A04
            X.0MF r0 = r13.A01
            r1.A01 = r0
        L_0x0365:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0374
            X.0i4 r1 = r14.A04
            java.lang.String r0 = r13.A0W
            r1.A0W = r0
        L_0x0374:
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0383
            X.0i4 r1 = r14.A04
            X.0FZ r0 = r13.A06
            r1.A06 = r0
        L_0x0383:
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x0392
            X.0i4 r1 = r14.A04
            java.lang.String r0 = r13.A0a
            r1.A0a = r0
        L_0x0392:
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x03a1
            X.0i4 r1 = r14.A04
            X.0i3 r0 = r13.A0I
            r1.A0I = r0
        L_0x03a1:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x03b0
            X.0i4 r1 = r14.A04
            java.lang.Float r0 = r13.A0R
            r1.A0R = r0
        L_0x03b0:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x03c1
            X.0i4 r1 = r14.A04
            X.0i3 r0 = r13.A0K
            r1.A0K = r0
        L_0x03c1:
            r0 = 17179869184(0x400000000, double:8.4879831639E-314)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x03d2
            X.0i4 r1 = r14.A04
            java.lang.Float r0 = r13.A0U
            r1.A0U = r0
        L_0x03d2:
            r0 = 137438953472(0x2000000000, double:6.7903865311E-313)
            boolean r0 = A0E(r13, r0)
            if (r0 == 0) goto L_0x03e3
            X.0i4 r1 = r14.A04
            X.0Fo r0 = r13.A0B
            r1.A0B = r0
        L_0x03e3:
            return
        L_0x03e4:
            if (r1 != r3) goto L_0x03fc
            X.0i4 r3 = r14.A04
            java.lang.Integer r0 = r3.A0V
            int r1 = r0.intValue()
            r0 = 900(0x384, float:1.261E-42)
            if (r1 >= r0) goto L_0x03fc
            int r0 = r1 + 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0V = r0
            goto L_0x01f7
        L_0x03fc:
            X.0i4 r0 = r14.A04
            r0.A0V = r5
            goto L_0x01f7
        L_0x0402:
            android.graphics.Paint r0 = r14.A01
            r0.setPathEffect(r9)
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0e(X.0i4, X.0TM):void");
    }

    public final void A0f(C16810u0 r3, boolean z) {
        if (z) {
            this.A04.push(r3);
            this.A03.push(this.A00.getMatrix());
        }
        for (AnonymousClass0NJ A0k : r3.B5U()) {
            A0k(A0k);
        }
        if (z) {
            this.A04.pop();
            this.A03.pop();
        }
    }

    public final void A0g(C01740Ca r4) {
        C10510i3 r2 = this.A02.A04.A0G;
        if (r2 instanceof C01800Cg) {
            A0X(r4.A00, (C01800Cg) r2, true);
        }
        C10510i3 r22 = this.A02.A04.A0J;
        if (r22 instanceof C01800Cg) {
            A0X(r4.A00, (C01800Cg) r22, false);
        }
    }

    public final void A0h(C01740Ca r8) {
        if (this.A02.A04.A0a != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Canvas canvas = this.A00;
            canvas.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer((RectF) null, paint2, 31);
            AnonymousClass0CR r3 = (AnonymousClass0CR) this.A01.A04(this.A02.A04.A0a);
            A0c(r3, r8);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer((RectF) null, paint3, 31);
            A0c(r3, r8);
            canvas.restore();
            canvas.restore();
        }
        A0Q();
    }

    public final void A0i(C01740Ca r11) {
        if (r11.A00 != null && r11.A00 != null) {
            Matrix A052 = AnonymousClass002.A05();
            if (((Matrix) this.A03.peek()).invert(A052)) {
                C05400Te r2 = r11.A00;
                float f = r2.A01;
                float f2 = r2.A02;
                float f3 = f + r2.A03;
                int i = 2;
                float f4 = f2 + r2.A00;
                float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
                A052.preConcat(this.A00.getMatrix());
                A052.mapPoints(fArr);
                float f5 = fArr[0];
                float f6 = fArr[1];
                RectF rectF = new RectF(f5, f6, f5, f6);
                do {
                    float f7 = fArr[i];
                    if (f7 < rectF.left) {
                        rectF.left = f7;
                    }
                    if (f7 > rectF.right) {
                        rectF.right = f7;
                    }
                    float f8 = fArr[i + 1];
                    if (f8 < rectF.top) {
                        rectF.top = f8;
                    }
                    if (f8 > rectF.bottom) {
                        rectF.bottom = f8;
                    }
                    i += 2;
                } while (i <= 6);
                C01740Ca r5 = (C01740Ca) this.A04.peek();
                C05400Te r3 = r5.A00;
                float f9 = rectF.left;
                if (r3 == null) {
                    float f10 = rectF.top;
                    r5.A00 = new C05400Te(f9, f10, rectF.right - f9, rectF.bottom - f10);
                    return;
                }
                float f11 = rectF.top;
                C05400Te r52 = new C05400Te(f9, f11, rectF.right - f9, rectF.bottom - f11);
                float f12 = r52.A01;
                float f13 = r3.A01;
                if (f12 < f13) {
                    r3.A01 = f12;
                    f13 = f12;
                }
                float f14 = r52.A02;
                float f15 = r3.A02;
                if (f14 < f15) {
                    r3.A02 = f14;
                    f15 = f14;
                }
                float f16 = r52.A01 + r52.A03;
                if (f16 > r3.A03 + f13) {
                    r3.A03 = f16 - f13;
                }
                float f17 = r52.A02 + r52.A00;
                if (f17 > r3.A00 + f15) {
                    r3.A00 = f17 - f15;
                }
            }
        }
    }

    public final void A0j(C01780Ce r5, AnonymousClass0TM r6) {
        boolean A1X = AnonymousClass000.A1X(r5.A00);
        C10520i4 r3 = r6.A04;
        Boolean bool = Boolean.TRUE;
        r3.A0L = bool;
        if (!A1X) {
            bool = Boolean.FALSE;
        }
        r3.A0M = bool;
        r3.A01 = null;
        r3.A0W = null;
        Float valueOf = Float.valueOf(1.0f);
        r3.A0P = valueOf;
        r3.A0I = C01820Ci.A01;
        r3.A0R = valueOf;
        r3.A0a = null;
        r3.A0H = null;
        r3.A0Q = valueOf;
        r3.A0K = null;
        r3.A0U = valueOf;
        r3.A0F = C02150Fb.None;
        C10520i4 r0 = r5.A00;
        if (r0 != null) {
            A0e(r0, r6);
        }
        List list = this.A01.A00.A00;
        if (list != null && !list.isEmpty()) {
            for (AnonymousClass0NW r2 : this.A01.A00.A00) {
                if (AnonymousClass0YE.A02((C02420Gc) null, r2.A00, r5)) {
                    A0e(r2.A02, r6);
                }
            }
        }
        C10520i4 r02 = r5.A01;
        if (r02 != null) {
            A0e(r02, r6);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.0CX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.0CA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.0C9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.0C8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.0CB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: X.0C6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: X.0CH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: X.0C7} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0261, code lost:
        if (r8 != false) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x034d, code lost:
        if (r3 != false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03bc, code lost:
        if (r2 != false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x040e, code lost:
        if (r1 != false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04d4, code lost:
        if (r0 != false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r7 == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024f, code lost:
        if (r1 != false) goto L_0x0263;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0k(X.AnonymousClass0NJ r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C15480rP
            if (r0 != 0) goto L_0x0036
            r11.A0R()
            boolean r0 = r12 instanceof X.C01780Ce
            if (r0 == 0) goto L_0x001a
            r0 = r12
            X.0Ce r0 = (X.C01780Ce) r0
            java.lang.Boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001a
            X.0TM r1 = r11.A02
            boolean r0 = r0.booleanValue()
            r1.A07 = r0
        L_0x001a:
            boolean r0 = r12 instanceof X.AnonymousClass0CI
            if (r0 == 0) goto L_0x0037
            X.0CI r12 = (X.AnonymousClass0CI) r12
            X.0i6 r3 = r12.A02
            X.0i6 r2 = r12.A03
            X.0i6 r1 = r12.A01
            X.0i6 r0 = r12.A00
            X.0Te r2 = r11.A0N(r3, r2, r1, r0)
            X.0Te r1 = r12.A00
            X.0Tw r0 = r12.A00
            r11.A0W(r0, r2, r1, r12)
        L_0x0033:
            r11.A0Q()
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r12 instanceof X.AnonymousClass0CD
            if (r0 == 0) goto L_0x0140
            X.0CD r12 = (X.AnonymousClass0CD) r12
            r2 = 0
            X.0i6 r0 = r12.A01
            if (r0 == 0) goto L_0x004a
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            goto L_0x0033
        L_0x004a:
            X.0i6 r0 = r12.A00
            if (r0 == 0) goto L_0x0056
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            goto L_0x0033
        L_0x0056:
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            X.0QT r1 = r12.A01
            java.lang.String r0 = r12.A04
            X.0NJ r3 = r1.A04(r0)
            if (r3 != 0) goto L_0x0074
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            java.lang.String r0 = r12.A04
            r1[r2] = r0
            java.lang.String r0 = "Use reference '%s' not found"
            A0D(r0, r1)
            goto L_0x0033
        L_0x0074:
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            X.0i6 r0 = r12.A02
            r2 = 0
            float r1 = A01(r0, r11)
            X.0i6 r0 = r12.A03
            if (r0 == 0) goto L_0x0088
            float r2 = r0.A03(r11)
        L_0x0088:
            android.graphics.Canvas r4 = r11.A00
            r4.translate(r1, r2)
            boolean r7 = A0F(r12, r11)
            java.util.Stack r0 = r11.A04
            r0.push(r12)
            java.util.Stack r1 = r11.A03
            android.graphics.Matrix r0 = r4.getMatrix()
            r1.push(r0)
            boolean r0 = r3 instanceof X.AnonymousClass0CI
            r6 = 0
            if (r0 == 0) goto L_0x00c9
            X.0CI r3 = (X.AnonymousClass0CI) r3
            X.0i6 r1 = r12.A01
            X.0i6 r0 = r12.A00
            X.0Te r2 = r11.A0N(r6, r6, r1, r0)
            r11.A0R()
            X.0Te r1 = r3.A00
            X.0Tw r0 = r3.A00
            r11.A0W(r0, r2, r1, r3)
        L_0x00b8:
            r11.A0Q()
        L_0x00bb:
            java.util.Stack r0 = r11.A04
            r0.pop()
            java.util.Stack r0 = r11.A03
            r0.pop()
            if (r7 == 0) goto L_0x0266
            goto L_0x0263
        L_0x00c9:
            boolean r0 = r3 instanceof X.AnonymousClass0CJ
            if (r0 == 0) goto L_0x013b
            X.0i6 r5 = r12.A01
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r5 != 0) goto L_0x00da
            X.0G3 r0 = X.AnonymousClass0G3.percent
            X.0i6 r5 = new X.0i6
            r5.<init>(r0, r2)
        L_0x00da:
            X.0i6 r1 = r12.A00
            if (r1 != 0) goto L_0x00e5
            X.0G3 r0 = X.AnonymousClass0G3.percent
            X.0i6 r1 = new X.0i6
            r1.<init>(r0, r2)
        L_0x00e5:
            X.0Te r5 = r11.A0N(r6, r6, r5, r1)
            r11.A0R()
            X.0CN r3 = (X.AnonymousClass0CN) r3
            float r0 = r5.A03
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            float r0 = r5.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            X.0Tw r2 = r3.A00
            if (r2 != 0) goto L_0x0101
            X.0Tw r2 = X.C05530Tw.A02
        L_0x0101:
            X.0TM r0 = r11.A02
            r11.A0j(r3, r0)
            X.0TM r0 = r11.A02
            r0.A03 = r5
            A08(r5, r0, r11)
            X.0Te r1 = r3.A00
            X.0TM r0 = r11.A02
            X.0Te r0 = r0.A03
            if (r1 == 0) goto L_0x0133
            android.graphics.Matrix r0 = A04(r2, r0, r1)
            r4.concat(r0)
            X.0TM r1 = r11.A02
            X.0Te r0 = r3.A00
            r1.A02 = r0
        L_0x0122:
            boolean r1 = r11.A0o()
            r0 = 1
            r11.A0f(r3, r0)
            if (r1 == 0) goto L_0x012f
            r11.A0h(r3)
        L_0x012f:
            r11.A0i(r3)
            goto L_0x00b8
        L_0x0133:
            float r1 = r0.A01
            float r0 = r0.A02
            r4.translate(r1, r0)
            goto L_0x0122
        L_0x013b:
            r11.A0k(r3)
            goto L_0x00bb
        L_0x0140:
            boolean r0 = r12 instanceof X.AnonymousClass0CC
            if (r0 == 0) goto L_0x0236
            X.0CQ r12 = (X.AnonymousClass0CQ) r12
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            boolean r8 = A0F(r12, r11)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r4 = r0.getLanguage()
            java.util.List r0 = r12.A01
            java.util.Iterator r7 = r0.iterator()
        L_0x0163:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r3 = r7.next()
            X.0NJ r3 = (X.AnonymousClass0NJ) r3
            boolean r0 = r3 instanceof X.C17040uT
            if (r0 == 0) goto L_0x0163
            r2 = r3
            X.0uT r2 = (X.C17040uT) r2
            java.lang.String r0 = r2.BCA()
            if (r0 != 0) goto L_0x0163
            java.util.Set r1 = r2.BDS()
            if (r1 == 0) goto L_0x018f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0163
            boolean r0 = r1.contains(r4)
            if (r0 != 0) goto L_0x018f
            goto L_0x0163
        L_0x018f:
            java.util.Set r5 = r2.BCB()
            if (r5 == 0) goto L_0x0252
            java.util.HashSet r0 = A06
            if (r0 != 0) goto L_0x0226
            java.lang.Class<X.0YF> r6 = X.AnonymousClass0YF.class
            monitor-enter(r6)
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x060b }
            A06 = r1     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Structure"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "BasicStructure"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "ConditionalProcessing"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Image"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Style"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "ViewportAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Shape"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "BasicText"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "PaintAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "BasicPaintAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "OpacityAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "BasicGraphicsAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Marker"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Gradient"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Pattern"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Clip"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "BasicClip"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "Mask"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060b }
            java.lang.String r0 = "View"
            r1.add(r0)     // Catch:{ all -> 0x060b }
            monitor-exit(r6)
        L_0x0226:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0163
            java.util.HashSet r0 = A06
            boolean r0 = r0.containsAll(r5)
            if (r0 != 0) goto L_0x0252
            goto L_0x0163
        L_0x0236:
            boolean r0 = r12 instanceof X.AnonymousClass0CQ
            if (r0 == 0) goto L_0x0270
            X.0CQ r12 = (X.AnonymousClass0CQ) r12
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            boolean r1 = A0F(r12, r11)
            r0 = 1
            r11.A0f(r12, r0)
            if (r1 == 0) goto L_0x0266
            goto L_0x0263
        L_0x0252:
            java.util.Set r0 = r2.BCD()
            if (r0 != 0) goto L_0x026b
            java.util.Set r0 = r2.BCC()
            if (r0 != 0) goto L_0x026b
            r11.A0k(r3)
        L_0x0261:
            if (r8 == 0) goto L_0x0266
        L_0x0263:
            r11.A0h(r12)
        L_0x0266:
            r11.A0i(r12)
            goto L_0x0033
        L_0x026b:
            r0.isEmpty()
            goto L_0x0163
        L_0x0270:
            boolean r0 = r12 instanceof X.AnonymousClass0CH
            if (r0 == 0) goto L_0x0354
            X.0CH r12 = (X.AnonymousClass0CH) r12
            r6 = 0
            X.0i6 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            X.0i6 r0 = r12.A01
            if (r0 == 0) goto L_0x0033
            float r0 = r0.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            java.lang.String r3 = r12.A05
            if (r3 == 0) goto L_0x0033
            X.0Tw r8 = r12.A00
            if (r8 != 0) goto L_0x0296
            X.0Tw r8 = X.C05530Tw.A02
        L_0x0296:
            java.lang.String r0 = "data:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0033
            int r1 = r3.length()
            r0 = 14
            if (r1 < r0) goto L_0x0033
            r0 = 44
            int r2 = r3.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0033
            r0 = 12
            if (r2 < r0) goto L_0x0033
            int r0 = r2 + -7
            java.lang.String r1 = r3.substring(r0, r2)
            java.lang.String r0 = ";base64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0033
            int r0 = r2 + 1
            java.lang.String r0 = r3.substring(r0)
            byte[] r1 = android.util.Base64.decode(r0, r6)
            int r0 = r1.length
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r1, r6, r0)
            if (r5 == 0) goto L_0x0033
            int r0 = r5.getWidth()
            float r1 = (float) r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            r4 = 0
            X.0Te r7 = new X.0Te
            r7.<init>(r4, r4, r1, r0)
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            X.0i6 r0 = r12.A03
            float r10 = A01(r0, r11)
            X.0i6 r0 = r12.A04
            float r9 = A00(r0, r11)
            X.0i6 r0 = r12.A02
            float r3 = r0.A02(r11)
            X.0i6 r0 = r12.A01
            float r2 = r0.A02(r11)
            X.0TM r1 = r11.A02
            X.0Te r0 = new X.0Te
            r0.<init>(r10, r9, r3, r2)
            r1.A03 = r0
            A08(r0, r1, r11)
            X.0TM r0 = r11.A02
            X.0Te r0 = r0.A03
            r12.A00 = r0
            r11.A0i(r12)
            boolean r3 = A0F(r12, r11)
            r11.A0S()
            android.graphics.Canvas r2 = r11.A00
            r2.save()
            X.0TM r0 = r11.A02
            X.0Te r0 = r0.A03
            android.graphics.Matrix r0 = A04(r8, r0, r7)
            r2.concat(r0)
            X.0TM r0 = r11.A02
            X.0i4 r0 = r0.A04
            X.0Fo r1 = r0.A0B
            X.0Fo r0 = X.C02280Fo.optimizeSpeed
            if (r1 == r0) goto L_0x0342
            r6 = 2
        L_0x0342:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r6)
            r2.drawBitmap(r5, r4, r4, r0)
            r2.restore()
            if (r3 == 0) goto L_0x0033
        L_0x034f:
            r11.A0h(r12)
            goto L_0x0033
        L_0x0354:
            boolean r0 = r12 instanceof X.AnonymousClass0C6
            if (r0 == 0) goto L_0x03c2
            X.0C6 r12 = (X.AnonymousClass0C6) r12
            X.0gl r0 = r12.A00
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x0033
            X.0TM r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0376
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0376
            goto L_0x0033
        L_0x0376:
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            X.0gl r1 = r12.A00
            X.0gj r0 = new X.0gj
            r0.<init>(r1, r11)
            android.graphics.Path r3 = r0.A02
            X.0Te r0 = r12.A00
            if (r0 != 0) goto L_0x038e
            X.0Te r0 = A06(r3)
            r12.A00 = r0
        L_0x038e:
            r11.A0i(r12)
            r11.A0g(r12)
            boolean r2 = A0F(r12, r11)
            X.0TM r1 = r11.A02
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x03b0
            X.0i4 r0 = r1.A04
            X.0FZ r1 = r0.A07
            if (r1 == 0) goto L_0x03bf
            X.0FZ r0 = X.AnonymousClass0FZ.EvenOdd
            if (r1 != r0) goto L_0x03bf
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x03aa:
            r3.setFillType(r0)
            r11.A0V(r3, r12)
        L_0x03b0:
            X.0TM r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x03b9
            r11.A0U(r3)
        L_0x03b9:
            r11.A0a(r12)
            if (r2 == 0) goto L_0x0033
            goto L_0x034f
        L_0x03bf:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x03aa
        L_0x03c2:
            boolean r0 = r12 instanceof X.AnonymousClass0CB
            if (r0 == 0) goto L_0x0412
            X.0CB r12 = (X.AnonymousClass0CB) r12
            X.0i6 r0 = r12.A03
            if (r0 == 0) goto L_0x0033
            X.0i6 r2 = r12.A00
            if (r2 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            android.graphics.Path r2 = r11.A0L(r12)
        L_0x03f2:
            r11.A0i(r12)
            r11.A0g(r12)
            boolean r1 = A0F(r12, r11)
            X.0TM r0 = r11.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0405
            r11.A0V(r2, r12)
        L_0x0405:
            X.0TM r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x040e
            r11.A0U(r2)
        L_0x040e:
            if (r1 == 0) goto L_0x0033
            goto L_0x034f
        L_0x0412:
            boolean r0 = r12 instanceof X.AnonymousClass0C8
            if (r0 == 0) goto L_0x0439
            X.0C8 r12 = (X.AnonymousClass0C8) r12
            X.0i6 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            android.graphics.Path r2 = r11.A0I(r12)
            goto L_0x03f2
        L_0x0439:
            boolean r0 = r12 instanceof X.AnonymousClass0C9
            if (r0 == 0) goto L_0x046a
            X.0C9 r12 = (X.AnonymousClass0C9) r12
            X.0i6 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            X.0i6 r2 = r12.A03
            if (r2 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            android.graphics.Path r2 = r11.A0J(r12)
            goto L_0x03f2
        L_0x046a:
            boolean r0 = r12 instanceof X.AnonymousClass0CA
            if (r0 == 0) goto L_0x04e7
            X.0CA r12 = (X.AnonymousClass0CA) r12
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x0033
            X.0TM r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            X.0i6 r0 = r12.A00
            r8 = 0
            if (r0 != 0) goto L_0x04e2
            r7 = 0
        L_0x048d:
            X.0i6 r0 = r12.A02
            if (r0 != 0) goto L_0x04dd
            r6 = 0
        L_0x0492:
            X.0i6 r0 = r12.A01
            if (r0 != 0) goto L_0x04d8
            r5 = 0
        L_0x0497:
            X.0i6 r0 = r12.A03
            if (r0 == 0) goto L_0x049f
            float r8 = r0.A03(r11)
        L_0x049f:
            X.0Te r0 = r12.A00
            if (r0 != 0) goto L_0x04ba
            float r4 = java.lang.Math.min(r7, r5)
            float r3 = java.lang.Math.min(r6, r8)
            float r2 = X.AnonymousClass002.A00(r5, r7)
            float r1 = X.AnonymousClass002.A00(r8, r6)
            X.0Te r0 = new X.0Te
            r0.<init>(r4, r3, r2, r1)
            r12.A00 = r0
        L_0x04ba:
            android.graphics.Path r1 = X.AnonymousClass002.A06()
            r1.moveTo(r7, r6)
            r1.lineTo(r5, r8)
            r11.A0i(r12)
            r11.A0g(r12)
            boolean r0 = A0F(r12, r11)
            r11.A0U(r1)
            r11.A0a(r12)
            if (r0 == 0) goto L_0x0033
            goto L_0x034f
        L_0x04d8:
            float r5 = r0.A02(r11)
            goto L_0x0497
        L_0x04dd:
            float r6 = r0.A03(r11)
            goto L_0x0492
        L_0x04e2:
            float r7 = r0.A02(r11)
            goto L_0x048d
        L_0x04e7:
            boolean r0 = r12 instanceof X.AnonymousClass0CG
            if (r0 == 0) goto L_0x0518
            X.0C7 r12 = (X.AnonymousClass0C7) r12
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x0033
            X.0TM r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0505
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0505
            goto L_0x0033
        L_0x0505:
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            float[] r0 = r12.A00
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x0033
            android.graphics.Path r2 = r11.A0K(r12)
            r11.A0i(r12)
            goto L_0x0559
        L_0x0518:
            boolean r0 = r12 instanceof X.AnonymousClass0C7
            if (r0 == 0) goto L_0x057a
            X.0C7 r12 = (X.AnonymousClass0C7) r12
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x0033
            X.0TM r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0536
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0536
            goto L_0x0033
        L_0x0536:
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            float[] r0 = r12.A00
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x0033
            android.graphics.Path r2 = r11.A0K(r12)
            r11.A0i(r12)
            X.0TM r0 = r11.A02
            X.0i4 r0 = r0.A04
            X.0FZ r1 = r0.A07
            if (r1 == 0) goto L_0x0577
            X.0FZ r0 = X.AnonymousClass0FZ.EvenOdd
            if (r1 != r0) goto L_0x0577
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0556:
            r2.setFillType(r0)
        L_0x0559:
            r11.A0g(r12)
            boolean r1 = A0F(r12, r11)
            X.0TM r0 = r11.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0569
            r11.A0V(r2, r12)
        L_0x0569:
            X.0TM r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0572
            r11.A0U(r2)
        L_0x0572:
            r11.A0a(r12)
            goto L_0x040e
        L_0x0577:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x0556
        L_0x057a:
            boolean r0 = r12 instanceof X.AnonymousClass0CX
            if (r0 == 0) goto L_0x0033
            X.0CX r12 = (X.AnonymousClass0CX) r12
            r1 = 0
            boolean r0 = A0G(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A07(r0, r11)
            java.util.List r0 = r12.A02
            if (r0 == 0) goto L_0x0609
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0609
            java.util.List r0 = r12.A02
            java.lang.Object r0 = r0.get(r1)
            X.0i6 r0 = (X.C10540i6) r0
            float r5 = r0.A02(r11)
        L_0x05a2:
            java.util.List r0 = r12.A03
            if (r0 == 0) goto L_0x0607
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0607
            java.util.List r0 = r12.A03
            java.lang.Object r0 = r0.get(r1)
            X.0i6 r0 = (X.C10540i6) r0
            float r6 = r0.A03(r11)
        L_0x05b8:
            java.util.List r0 = r12.A00
            if (r0 == 0) goto L_0x0605
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0605
            java.util.List r0 = r12.A00
            java.lang.Object r0 = r0.get(r1)
            X.0i6 r0 = (X.C10540i6) r0
            float r4 = r0.A02(r11)
        L_0x05ce:
            float r3 = A02(r12, r11)
            X.0Fp r2 = r11.A0O()
            X.0Fp r0 = X.C02290Fp.Start
            if (r2 == r0) goto L_0x05ec
            X.0Ck r0 = new X.0Ck
            r0.<init>(r11)
            r11.A0m(r12, r0)
            float r1 = r0.A00
            X.0Fp r0 = X.C02290Fp.Middle
            if (r2 != r0) goto L_0x05eb
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x05eb:
            float r5 = r5 - r1
        L_0x05ec:
            A0C(r12, r11, r5, r6)
            r11.A0i(r12)
            r11.A0g(r12)
            boolean r1 = A0F(r12, r11)
            float r5 = r5 + r4
            float r6 = r6 + r3
            X.0Cl r0 = new X.0Cl
            r0.<init>(r11, r5, r6)
            r11.A0m(r12, r0)
            goto L_0x040e
        L_0x0605:
            r4 = 0
            goto L_0x05ce
        L_0x0607:
            r6 = 0
            goto L_0x05b8
        L_0x0609:
            r5 = 0
            goto L_0x05a2
        L_0x060b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0k(X.0NJ):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.0CY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.0CW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.0CY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.0CY} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        if (r1 != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0151, code lost:
        if (r0 != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0153, code lost:
        A0h(r5);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0m(X.AnonymousClass0CP r12, X.AnonymousClass0OD r13) {
        /*
            r11 = this;
            X.0TM r0 = r11.A02
            X.0i4 r0 = r0.A04
            java.lang.Boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            java.util.List r0 = r12.A01
            java.util.Iterator r10 = r0.iterator()
            r2 = 1
        L_0x0016:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r5 = r10.next()
            X.0NJ r5 = (X.AnonymousClass0NJ) r5
            boolean r0 = r5 instanceof X.C01790Cf
            if (r0 == 0) goto L_0x0039
            X.0Cf r5 = (X.C01790Cf) r5
            java.lang.String r1 = r5.A00
            boolean r0 = r10.hasNext()
            r0 = r0 ^ 1
            java.lang.String r0 = r11.A0P(r1, r2, r0)
            r13.A00(r0)
        L_0x0037:
            r2 = 0
            goto L_0x0016
        L_0x0039:
            r0 = r5
            X.0CP r0 = (X.AnonymousClass0CP) r0
            boolean r0 = r13.A01(r0)
            if (r0 == 0) goto L_0x0037
            boolean r0 = r5 instanceof X.AnonymousClass0CW
            if (r0 == 0) goto L_0x00c7
            r11.A0R()
            X.0CW r5 = (X.AnonymousClass0CW) r5
            r3 = 0
            boolean r0 = A0G(r5, r11)
            if (r0 == 0) goto L_0x006f
            boolean r0 = r11.A0p()
            if (r0 == 0) goto L_0x006f
            X.0QT r1 = r5.A01
            java.lang.String r0 = r5.A02
            X.0NJ r2 = r1.A04(r0)
            if (r2 != 0) goto L_0x0073
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            java.lang.String r0 = r5.A02
            r1[r3] = r0
            java.lang.String r0 = "TextPath reference '%s' not found"
        L_0x006c:
            A0D(r0, r1)
        L_0x006f:
            r11.A0Q()
            goto L_0x0037
        L_0x0073:
            X.0C6 r2 = (X.AnonymousClass0C6) r2
            X.0gl r1 = r2.A00
            X.0gj r0 = new X.0gj
            r0.<init>(r1, r11)
            android.graphics.Path r4 = r0.A02
            android.graphics.Matrix r0 = r2.A00
            if (r0 == 0) goto L_0x0085
            r4.transform(r0)
        L_0x0085:
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r0.<init>(r4, r3)
            X.0i6 r1 = r5.A00
            if (r1 == 0) goto L_0x00c5
            float r0 = r0.getLength()
            float r3 = r1.A04(r11, r0)
        L_0x0096:
            X.0Fp r2 = r11.A0O()
            X.0Fp r0 = X.C02290Fp.Start
            if (r2 == r0) goto L_0x00b0
            X.0Ck r0 = new X.0Ck
            r0.<init>(r11)
            r11.A0m(r5, r0)
            float r1 = r0.A00
            X.0Fp r0 = X.C02290Fp.Middle
            if (r2 != r0) goto L_0x00af
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x00af:
            float r3 = r3 - r1
        L_0x00b0:
            X.0CX r0 = r5.A01
            r11.A0g(r0)
            boolean r1 = r11.A0o()
            X.0Cj r0 = new X.0Cj
            r0.<init>(r4, r11, r3)
            r11.A0m(r5, r0)
            if (r1 == 0) goto L_0x006f
            goto L_0x0153
        L_0x00c5:
            r3 = 0
            goto L_0x0096
        L_0x00c7:
            boolean r0 = r5 instanceof X.AnonymousClass0CY
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0174
            r11.A0R()
            X.0CY r5 = (X.AnonymousClass0CY) r5
            boolean r0 = A0G(r5, r11)
            if (r0 == 0) goto L_0x006f
            java.util.List r0 = r5.A02
            if (r0 == 0) goto L_0x0171
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0171
        L_0x00e2:
            boolean r2 = r13 instanceof X.C01850Cl
            r3 = 0
            if (r2 == 0) goto L_0x016d
            if (r6 != 0) goto L_0x0160
            r0 = r13
            X.0Cl r0 = (X.C01850Cl) r0
            float r3 = r0.A00
        L_0x00ee:
            java.util.List r0 = r5.A03
            if (r0 == 0) goto L_0x015a
            int r0 = r0.size()
            if (r0 == 0) goto L_0x015a
            java.util.List r0 = r5.A03
            java.lang.Object r0 = r0.get(r4)
            X.0i6 r0 = (X.C10540i6) r0
            float r7 = r0.A03(r11)
        L_0x0104:
            java.util.List r0 = r5.A00
            if (r0 == 0) goto L_0x0158
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0158
            java.util.List r0 = r5.A00
            java.lang.Object r0 = r0.get(r4)
            X.0i6 r0 = (X.C10540i6) r0
            float r9 = r0.A02(r11)
        L_0x011a:
            float r8 = A02(r5, r11)
        L_0x011e:
            if (r6 == 0) goto L_0x013a
            X.0Fp r4 = r11.A0O()
            X.0Fp r0 = X.C02290Fp.Start
            if (r4 == r0) goto L_0x013a
            X.0Ck r0 = new X.0Ck
            r0.<init>(r11)
            r11.A0m(r5, r0)
            float r1 = r0.A00
            X.0Fp r0 = X.C02290Fp.Middle
            if (r4 != r0) goto L_0x0139
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x0139:
            float r3 = r3 - r1
        L_0x013a:
            X.0CX r0 = r5.A00
            r11.A0g(r0)
            if (r2 == 0) goto L_0x014a
            r0 = r13
            X.0Cl r0 = (X.C01850Cl) r0
            float r3 = r3 + r9
            r0.A00 = r3
            float r7 = r7 + r8
            r0.A01 = r7
        L_0x014a:
            boolean r0 = r11.A0o()
            r11.A0m(r5, r13)
            if (r0 == 0) goto L_0x006f
        L_0x0153:
            r11.A0h(r5)
            goto L_0x006f
        L_0x0158:
            r9 = 0
            goto L_0x011a
        L_0x015a:
            r0 = r13
            X.0Cl r0 = (X.C01850Cl) r0
            float r7 = r0.A01
            goto L_0x0104
        L_0x0160:
            java.util.List r0 = r5.A02
            java.lang.Object r0 = r0.get(r4)
            X.0i6 r0 = (X.C10540i6) r0
            float r3 = r0.A02(r11)
            goto L_0x00ee
        L_0x016d:
            r8 = 0
            r7 = 0
            r9 = 0
            goto L_0x011e
        L_0x0171:
            r6 = 0
            goto L_0x00e2
        L_0x0174:
            boolean r0 = r5 instanceof X.AnonymousClass0CV
            if (r0 == 0) goto L_0x0037
            r11.A0R()
            r3 = r5
            X.0CV r3 = (X.AnonymousClass0CV) r3
            boolean r0 = A0G(r3, r11)
            if (r0 == 0) goto L_0x006f
            X.0CX r0 = r3.A00
            r11.A0g(r0)
            X.0QT r1 = r5.A01
            java.lang.String r0 = r3.A01
            X.0NJ r2 = r1.A04(r0)
            if (r2 == 0) goto L_0x01af
            boolean r0 = r2 instanceof X.AnonymousClass0CP
            if (r0 == 0) goto L_0x01af
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.0CP r2 = (X.AnonymousClass0CP) r2
            r11.A0n(r2, r1)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x006f
            java.lang.String r0 = r1.toString()
            r13.A00(r0)
            goto L_0x006f
        L_0x01af:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r3.A01
            r1[r4] = r0
            java.lang.String r0 = "Tref reference '%s' not found"
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0m(X.0CP, X.0OD):void");
    }

    public final void A0n(AnonymousClass0CP r5, StringBuilder sb) {
        Iterator it = r5.A01.iterator();
        boolean z = true;
        while (it.hasNext()) {
            AnonymousClass0NJ r1 = (AnonymousClass0NJ) it.next();
            if (r1 instanceof AnonymousClass0CP) {
                A0n((AnonymousClass0CP) r1, sb);
            } else if (r1 instanceof C01790Cf) {
                sb.append(A0P(((C01790Cf) r1).A00, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1.A0a != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0o() {
        /*
            r5 = this;
            X.0TM r0 = r5.A02
            X.0i4 r1 = r0.A04
            java.lang.Float r0 = r1.A0P
            float r3 = r0.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            java.lang.String r1 = r1.A0a
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r4 = 0
            if (r0 != 0) goto L_0x001a
            return r4
        L_0x001a:
            android.graphics.Canvas r2 = r5.A00
            r0 = 1132462080(0x43800000, float:256.0)
            float r3 = r3 * r0
            int r1 = (int) r3
            if (r1 >= 0) goto L_0x0062
            r1 = 0
        L_0x0023:
            r0 = 31
            r3 = 0
            r2.saveLayerAlpha(r3, r1, r0)
            java.util.Stack r1 = r5.A05
            X.0TM r0 = r5.A02
            r1.push(r0)
            X.0TM r1 = r5.A02
            X.0TM r0 = new X.0TM
            r0.<init>(r1, r5)
            r5.A02 = r0
            X.0i4 r0 = r0.A04
            java.lang.String r1 = r0.A0a
            r2 = 1
            if (r1 == 0) goto L_0x0061
            X.0QT r0 = r5.A01
            X.0NJ r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0 instanceof X.AnonymousClass0CR
            if (r0 != 0) goto L_0x0061
        L_0x004c:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.0TM r0 = r5.A02
            X.0i4 r0 = r0.A04
            java.lang.String r0 = r0.A0a
            r1[r4] = r0
            java.lang.String r0 = "Mask reference '%s' not found"
            A0D(r0, r1)
            X.0TM r0 = r5.A02
            X.0i4 r0 = r0.A04
            r0.A0a = r3
        L_0x0061:
            return r2
        L_0x0062:
            r0 = 255(0xff, float:3.57E-43)
            if (r1 <= r0) goto L_0x0023
            r1 = 255(0xff, float:3.57E-43)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0o():boolean");
    }

    public final boolean A0p() {
        Boolean bool = this.A02.A04.A0N;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public AnonymousClass0YF(Canvas canvas) {
        this.A00 = canvas;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r8 != 7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r4 = r4 - r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Matrix A04(X.C05530Tw r12, X.C05400Te r13, X.C05400Te r14) {
        /*
            android.graphics.Matrix r5 = X.AnonymousClass002.A05()
            X.0G6 r11 = r12.A00
            if (r11 == 0) goto L_0x002f
            float r10 = r13.A03
            float r9 = r14.A03
            float r8 = r10 / r9
            float r7 = r13.A00
            float r6 = r14.A00
            float r2 = r7 / r6
            float r0 = r14.A01
            float r4 = -r0
            float r0 = r14.A02
            float r3 = -r0
            X.0Tw r0 = X.C05530Tw.A03
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0030
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r8, r2)
        L_0x002c:
            r5.preTranslate(r4, r3)
        L_0x002f:
            return r5
        L_0x0030:
            X.0FY r1 = r12.A01
            X.0FY r0 = X.AnonymousClass0FY.slice
            if (r1 != r0) goto L_0x0070
            float r2 = java.lang.Math.max(r8, r2)
        L_0x003a:
            float r10 = r10 / r2
            float r7 = r7 / r2
            int r8 = r11.ordinal()
            r1 = 1073741824(0x40000000, float:2.0)
            switch(r8) {
                case 2: goto L_0x006a;
                case 3: goto L_0x006d;
                case 4: goto L_0x0045;
                case 5: goto L_0x006a;
                case 6: goto L_0x006d;
                case 7: goto L_0x0045;
                case 8: goto L_0x006a;
                case 9: goto L_0x006d;
                default: goto L_0x0045;
            }
        L_0x0045:
            r0 = 5
            if (r8 == r0) goto L_0x0064
            r0 = 8
            if (r8 == r0) goto L_0x0067
            r0 = 6
            if (r8 == r0) goto L_0x0064
            r0 = 9
            if (r8 == r0) goto L_0x0067
            r0 = 4
            if (r8 == r0) goto L_0x0064
            r0 = 7
            if (r8 == r0) goto L_0x0067
        L_0x0059:
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r2, r2)
            goto L_0x002c
        L_0x0064:
            float r6 = r6 - r7
            float r6 = r6 / r1
            goto L_0x0068
        L_0x0067:
            float r6 = r6 - r7
        L_0x0068:
            float r3 = r3 - r6
            goto L_0x0059
        L_0x006a:
            float r9 = r9 - r10
            float r9 = r9 / r1
            goto L_0x006e
        L_0x006d:
            float r9 = r9 - r10
        L_0x006e:
            float r4 = r4 - r9
            goto L_0x0045
        L_0x0070:
            float r2 = java.lang.Math.min(r8, r2)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A04(X.0Tw, X.0Te, X.0Te):android.graphics.Matrix");
    }

    public static final C05400Te A06(Path path) {
        RectF A07 = AnonymousClass002.A07();
        path.computeBounds(A07, true);
        return new C05400Te(A07.left, A07.top, A07.width(), A07.height());
    }

    public final Path A0K(AnonymousClass0C7 r6) {
        Path A062 = AnonymousClass002.A06();
        float[] fArr = r6.A00;
        A062.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = r6.A00;
            if (i >= fArr2.length) {
                break;
            }
            A062.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (r6 instanceof AnonymousClass0CG) {
            A062.close();
        }
        if (r6.A00 == null) {
            r6.A00 = A06(A062);
        }
        return A062;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        if (r9 != 7) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0b(X.AnonymousClass0CL r13, X.AnonymousClass0Ps r14) {
        /*
            r12 = this;
            r12.A0R()
            java.lang.Float r0 = r13.A04
            r4 = 0
            if (r0 == 0) goto L_0x0125
            float r3 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L_0x002b
            float r1 = r14.A00
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            float r0 = r14.A01
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
        L_0x001e:
            float r0 = r14.A01
            double r2 = (double) r0
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r3 = (float) r0
        L_0x002b:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x0119
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0031:
            A0A(r13, r12)
            android.graphics.Matrix r5 = X.AnonymousClass002.A05()
            float r1 = r14.A02
            float r0 = r14.A03
            r5.preTranslate(r1, r0)
            r5.preRotate(r3)
            r5.preScale(r2, r2)
            X.0i6 r0 = r13.A02
            float r10 = A01(r0, r12)
            X.0i6 r0 = r13.A03
            float r8 = A00(r0, r12)
            X.0i6 r0 = r13.A01
            r3 = 1077936128(0x40400000, float:3.0)
            if (r0 == 0) goto L_0x0115
            float r2 = r0.A02(r12)
        L_0x005b:
            X.0i6 r0 = r13.A00
            if (r0 == 0) goto L_0x0063
            float r3 = r0.A03(r12)
        L_0x0063:
            X.0Te r1 = r13.A00
            if (r1 == 0) goto L_0x00fb
            float r0 = r1.A03
            float r7 = r2 / r0
            float r0 = r1.A00
            float r6 = r3 / r0
            X.0Tw r9 = r13.A00
            if (r9 != 0) goto L_0x0075
            X.0Tw r9 = X.C05530Tw.A02
        L_0x0075:
            X.0Tw r0 = X.C05530Tw.A03
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0088
            X.0FY r1 = r9.A01
            X.0FY r0 = X.AnonymousClass0FY.slice
            if (r1 != r0) goto L_0x00f6
            float r6 = java.lang.Math.max(r7, r6)
        L_0x0087:
            r7 = r6
        L_0x0088:
            float r1 = -r10
            float r1 = r1 * r7
            float r0 = -r8
            float r0 = r0 * r6
            r5.preTranslate(r1, r0)
            android.graphics.Canvas r1 = r12.A00
            r1.concat(r5)
            X.0Te r0 = r13.A00
            float r8 = r0.A03
            float r8 = r8 * r7
            float r10 = r0.A00
            float r10 = r10 * r6
            X.0G6 r0 = r9.A00
            int r9 = r0.ordinal()
            r11 = 1073741824(0x40000000, float:2.0)
            switch(r9) {
                case 2: goto L_0x00f0;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00a7;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00ed;
                case 7: goto L_0x00a7;
                case 8: goto L_0x00f0;
                case 9: goto L_0x00ed;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            r0 = 5
            if (r9 == r0) goto L_0x00e8
            r0 = 8
            if (r9 == r0) goto L_0x00e5
            r0 = 6
            if (r9 == r0) goto L_0x00e8
            r0 = 9
            if (r9 == r0) goto L_0x00e5
            r0 = 4
            if (r9 == r0) goto L_0x00e8
            r0 = 7
            if (r9 == r0) goto L_0x00e5
        L_0x00bc:
            X.0TM r0 = r12.A02
            X.0i4 r0 = r0.A04
            java.lang.Boolean r0 = r0.A0M
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00cb
            r12.A0T(r8, r4, r2, r3)
        L_0x00cb:
            r5.reset()
            r5.preScale(r7, r6)
            r1.concat(r5)
        L_0x00d4:
            boolean r1 = r12.A0o()
            r0 = 0
            r12.A0f(r13, r0)
            if (r1 == 0) goto L_0x00e1
            r12.A0h(r13)
        L_0x00e1:
            r12.A0Q()
            return
        L_0x00e5:
            float r0 = r3 - r10
            goto L_0x00eb
        L_0x00e8:
            float r0 = r3 - r10
            float r0 = r0 / r11
        L_0x00eb:
            float r4 = r4 - r0
            goto L_0x00bc
        L_0x00ed:
            float r0 = r2 - r8
            goto L_0x00f3
        L_0x00f0:
            float r0 = r2 - r8
            float r0 = r0 / r11
        L_0x00f3:
            float r8 = r4 - r0
            goto L_0x00a8
        L_0x00f6:
            float r6 = java.lang.Math.min(r7, r6)
            goto L_0x0087
        L_0x00fb:
            float r1 = -r10
            float r0 = -r8
            r5.preTranslate(r1, r0)
            android.graphics.Canvas r0 = r12.A00
            r0.concat(r5)
            X.0TM r0 = r12.A02
            X.0i4 r0 = r0.A04
            java.lang.Boolean r0 = r0.A0M
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d4
            r12.A0T(r4, r4, r2, r3)
            goto L_0x00d4
        L_0x0115:
            r2 = 1077936128(0x40400000, float:3.0)
            goto L_0x005b
        L_0x0119:
            X.0TM r0 = r12.A02
            X.0i4 r0 = r0.A04
            X.0i6 r0 = r0.A05
            float r2 = r0.A00()
            goto L_0x0031
        L_0x0125:
            r3 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YF.A0b(X.0CL, X.0Ps):void");
    }

    public final void A0l(AnonymousClass0NJ r3, AnonymousClass0TM r4) {
        ArrayList A0s = AnonymousClass001.A0s();
        while (true) {
            if (r3 instanceof C01780Ce) {
                A0s.add(0, r3);
            }
            C16810u0 r32 = r3.A00;
            if (r32 == null) {
                break;
            }
            r3 = (AnonymousClass0NJ) r32;
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A0j((C01780Ce) it.next(), r4);
        }
        AnonymousClass0TM r1 = this.A02;
        r4.A02 = r1.A02;
        r4.A03 = r1.A03;
    }

    public static void A09(C17010uP r29, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        float f8 = f6;
        float f9 = f;
        float f10 = f7;
        if (f != f6 || f2 != f7) {
            C17010uP r30 = r29;
            if (f3 == 0.0f || f4 == 0.0f) {
                r30.BJh(f8, f10);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            float f11 = f5;
            double radians = (double) ((float) Math.toRadians(((double) f11) % 360.0d));
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f12 = (f9 - f6) / 2.0f;
            float f13 = (f2 - f7) / 2.0f;
            float f14 = (cos * f12) + (sin * f13);
            float f15 = ((-sin) * f12) + (f13 * cos);
            float f16 = abs * abs;
            float f17 = abs2 * abs2;
            float f18 = f14 * f14;
            float f19 = f15 * f15;
            float f20 = (f18 / f16) + (f19 / f17);
            if (f20 > 1.0f) {
                float sqrt = (float) Math.sqrt((double) f20);
                abs *= sqrt;
                abs2 *= sqrt;
                f16 = abs * abs;
                f17 = abs2 * abs2;
            }
            float f21 = 1.0f;
            if (z == z2) {
                f21 = -1.0f;
            }
            float f22 = f16 * f17;
            float f23 = f16 * f19;
            float f24 = f17 * f18;
            float f25 = ((f22 - f23) - f24) / (f23 + f24);
            if (f25 < 0.0f) {
                f25 = 0.0f;
            }
            float sqrt2 = (float) (((double) f21) * Math.sqrt((double) f25));
            float f26 = ((abs * f15) / abs2) * sqrt2;
            float f27 = sqrt2 * (-((abs2 * f14) / abs));
            float f28 = ((f9 + f6) / 2.0f) + ((cos * f26) - (sin * f27));
            float f29 = ((f2 + f7) / 2.0f) + (sin * f26) + (cos * f27);
            float f30 = (f14 - f26) / abs;
            float f31 = (f15 - f27) / abs2;
            float f32 = ((-f14) - f26) / abs;
            float f33 = ((-f15) - f27) / abs2;
            float f34 = (f30 * f30) + (f31 * f31);
            float sqrt3 = (float) Math.sqrt((double) f34);
            float f35 = 1.0f;
            if (f31 < 0.0f) {
                f35 = -1.0f;
            }
            float degrees = (float) Math.toDegrees(((double) f35) * Math.acos((double) (f30 / sqrt3)));
            float sqrt4 = (float) Math.sqrt((double) (f34 * ((f32 * f32) + (f33 * f33))));
            float f36 = (f30 * f32) + (f31 * f33);
            float f37 = 1.0f;
            if ((f30 * f33) - (f31 * f32) < 0.0f) {
                f37 = -1.0f;
            }
            double degrees2 = Math.toDegrees(((double) f37) * Math.acos((double) (f36 / sqrt4)));
            if (z2 || degrees2 <= 0.0d) {
                d = 360.0d;
                if (z2 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            } else {
                d = 360.0d;
                degrees2 -= 360.0d;
            }
            double d2 = degrees2 % d;
            double d3 = (double) (degrees % 360.0f);
            int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
            int i = ceil;
            double radians2 = Math.toRadians(d3);
            float radians3 = (float) (Math.toRadians(d2) / ((double) ceil));
            float f38 = radians3;
            double d4 = (double) radians3;
            double d5 = d4 / 2.0d;
            double sin2 = (Math.sin(d5) * 1.3333333333333333d) / (Math.cos(d5) + 1.0d);
            int i2 = i * 6;
            float[] fArr = new float[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                double d6 = ((double) (((float) i4) * f38)) + radians2;
                double cos2 = Math.cos(d6);
                double sin3 = Math.sin(d6);
                int i5 = i3 + 1;
                fArr[i3] = (float) (cos2 - (sin2 * sin3));
                int i6 = i5 + 1;
                fArr[i5] = (float) (sin3 + (cos2 * sin2));
                double d7 = d6 + d4;
                double cos3 = Math.cos(d7);
                double sin4 = Math.sin(d7);
                int i7 = i6 + 1;
                fArr[i6] = (float) ((sin2 * sin4) + cos3);
                int i8 = i7 + 1;
                fArr[i7] = (float) (sin4 - (sin2 * cos3));
                int i9 = i8 + 1;
                fArr[i8] = (float) cos3;
                i3 = i9 + 1;
                fArr[i9] = (float) sin4;
            }
            Matrix A052 = AnonymousClass002.A05();
            A052.postScale(abs, abs2);
            A052.postRotate(f11);
            A052.postTranslate(f28, f29);
            A052.mapPoints(fArr);
            fArr[i2 - 2] = f6;
            fArr[i2 - 1] = f7;
            for (int i10 = 0; i10 < i2; i10 += 6) {
                r30.B1B(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]);
            }
        }
    }
}
