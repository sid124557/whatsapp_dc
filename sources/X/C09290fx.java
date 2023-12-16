package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.0fx  reason: invalid class name and case insensitive filesystem */
public abstract class C09290fx implements C16230sg, C17350vO, C17360vP {
    public C04850Qx A00;
    public final Paint A01;
    public final Path A02 = AnonymousClass002.A06();
    public final Path A03 = AnonymousClass002.A06();
    public final PathMeasure A04 = new PathMeasure();
    public final RectF A05 = AnonymousClass002.A07();
    public final AnonymousClass01G A06;
    public final C04850Qx A07;
    public final C04850Qx A08;
    public final C04850Qx A09;
    public final C09320g0 A0A;
    public final List A0B;
    public final List A0C = AnonymousClass001.A0s();
    public final float[] A0D;

    public void Aws(C05560Tz r3, Object obj) {
        C04850Qx r0;
        if (obj == C17150ue.A0S) {
            r0 = this.A08;
        } else if (obj == C17150ue.A0G) {
            r0 = this.A09;
        } else if (obj == C17150ue.A00) {
            C04850Qx r1 = this.A00;
            if (r1 != null) {
                this.A0A.A0O.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0BZ r02 = new AnonymousClass0BZ(r3, (Object) null);
            this.A00 = r02;
            C04850Qx.A06(r02, this);
            this.A0A.A08(this.A00);
            return;
        } else {
            return;
        }
        r0.A0F(r3);
    }

    public void B2C(Canvas canvas, Matrix matrix, int i) {
        float f;
        float f2;
        float A022;
        float[] fArr = (float[]) AnonymousClass0Y0.A03.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        Matrix matrix2 = matrix;
        matrix2.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            C01530Bf r2 = (C01530Bf) this.A08;
            Paint paint = this.A01;
            int i2 = 0;
            paint.setAlpha(AnonymousClass001.A0D(255, (int) ((((((float) i) / 255.0f) * ((float) r2.A0G(AnonymousClass0K1.A00(r2), r2.A08()))) / 100.0f) * 255.0f), 0));
            paint.setStrokeWidth(((C01540Bg) this.A09).A0G() * AnonymousClass0Y0.A01(matrix2));
            if (paint.getStrokeWidth() > 0.0f) {
                List list = this.A0B;
                if (!list.isEmpty()) {
                    float A012 = AnonymousClass0Y0.A01(matrix2);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        float[] fArr2 = this.A0D;
                        float A023 = C04850Qx.A02((C04850Qx) list.get(i3));
                        fArr2[i3] = A023;
                        float f3 = 0.1f;
                        if (i3 % 2 == 0) {
                            f3 = 1.0f;
                        }
                        if (A023 < f3) {
                            fArr2[i3] = f3;
                        }
                        fArr2[i3] = fArr2[i3] * A012;
                    }
                    C04850Qx r0 = this.A07;
                    if (r0 == null) {
                        A022 = 0.0f;
                    } else {
                        A022 = A012 * C04850Qx.A02(r0);
                    }
                    paint.setPathEffect(new DashPathEffect(this.A0D, A022));
                }
                AnonymousClass0K1.A01();
                AnonymousClass001.A11(paint, this.A00);
                while (true) {
                    List list2 = this.A0C;
                    if (i2 >= list2.size()) {
                        break;
                    }
                    AnonymousClass0LI r9 = (AnonymousClass0LI) list2.get(i2);
                    Canvas canvas2 = canvas;
                    if (r9.A00 != null) {
                        C09200fo r3 = r9.A00;
                        if (r3 != null) {
                            Path path = this.A02;
                            path.reset();
                            List list3 = r9.A01;
                            int size = list3.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                                AnonymousClass000.A0r(matrix2, path, list3, size);
                            }
                            PathMeasure pathMeasure = this.A04;
                            pathMeasure.setPath(path, false);
                            float length = pathMeasure.getLength();
                            while (pathMeasure.nextContour()) {
                                length += pathMeasure.getLength();
                            }
                            float A024 = (C04850Qx.A02(r3.A01) * length) / 360.0f;
                            float A025 = ((C04850Qx.A02(r3.A02) * length) / 100.0f) + A024;
                            float A026 = ((C04850Qx.A02(r3.A00) * length) / 100.0f) + A024;
                            float f4 = 0.0f;
                            for (int A032 = AnonymousClass002.A03(list3); A032 >= 0; A032--) {
                                Path path2 = this.A03;
                                path2.set(((C17340vN) list3.get(A032)).BAd());
                                path2.transform(matrix2);
                                pathMeasure.setPath(path2, false);
                                float length2 = pathMeasure.getLength();
                                float f5 = 1.0f;
                                if (A026 > length) {
                                    float f6 = A026 - length;
                                    if (f6 < f4 + length2 && f4 < f6) {
                                        if (A025 > length) {
                                            f2 = (A025 - length) / length2;
                                        } else {
                                            f2 = 0.0f;
                                        }
                                        f5 = Math.min(f6 / length2, 1.0f);
                                        AnonymousClass0Y0.A03(path2, f2, f5, 0.0f);
                                        canvas2.drawPath(path2, paint);
                                        f4 += length2;
                                    }
                                }
                                float f7 = f4 + length2;
                                if (f7 >= A025 && f4 <= A026) {
                                    if (f7 > A026 || A025 >= f4) {
                                        if (A025 < f4) {
                                            f = 0.0f;
                                        } else {
                                            f = (A025 - f4) / length2;
                                        }
                                        if (A026 <= f7) {
                                            f5 = (A026 - f4) / length2;
                                        }
                                        AnonymousClass0Y0.A03(path2, f2, f5, 0.0f);
                                    }
                                    canvas2.drawPath(path2, paint);
                                }
                                f4 += length2;
                            }
                        }
                    } else {
                        Path path3 = this.A02;
                        path3.reset();
                        int size2 = r9.A01.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            AnonymousClass000.A0r(matrix2, path3, r9.A01, size2);
                        }
                        AnonymousClass0K1.A01();
                        canvas2.drawPath(path3, paint);
                    }
                    AnonymousClass0K1.A01();
                    i2++;
                }
            }
        }
        AnonymousClass0K1.A01();
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A02;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0C;
            if (i < list.size()) {
                AnonymousClass0LI r2 = (AnonymousClass0LI) list.get(i);
                for (int i2 = 0; i2 < r2.A01.size(); i2++) {
                    AnonymousClass000.A0r(matrix, path, r2.A01, i2);
                }
                i++;
            } else {
                RectF rectF2 = this.A05;
                path.computeBounds(rectF2, false);
                AnonymousClass000.A0s(rectF2, rectF2.left, ((C01540Bg) this.A09).A0G() / 2.0f);
                rectF.set(rectF2);
                AnonymousClass000.A0s(rectF, rectF.left, 1.0f);
                AnonymousClass0K1.A01();
                return;
            }
        }
    }

    public void BfC() {
        this.A06.invalidateSelf();
    }

    public C09290fx(Paint.Cap cap, Paint.Join join, AnonymousClass01G r7, C01610Bn r8, C01610Bn r9, C01620Bo r10, C09320g0 r11, List list, float f) {
        C01540Bg A002;
        AnonymousClass00u r1 = new AnonymousClass00u(1);
        this.A01 = r1;
        this.A06 = r7;
        this.A0A = r11;
        r1.setStyle(Paint.Style.STROKE);
        r1.setStrokeCap(cap);
        r1.setStrokeJoin(join);
        r1.setStrokeMiter(f);
        this.A08 = new C01530Bf(r10.A00);
        this.A09 = AnonymousClass0BW.A00(r8);
        if (r9 == null) {
            A002 = null;
        } else {
            A002 = AnonymousClass0BW.A00(r9);
        }
        this.A07 = A002;
        this.A0B = AnonymousClass000.A0p(list);
        this.A0D = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.A0B.add(AnonymousClass0BW.A00((C09360g4) list.get(i)));
        }
        r11.A08(this.A08);
        r11.A08(this.A09);
        for (int i2 = 0; i2 < this.A0B.size(); i2++) {
            r11.A08((C04850Qx) this.A0B.get(i2));
        }
        C04850Qx r0 = this.A07;
        if (r0 != null) {
            r11.A08(r0);
        }
        C04850Qx.A06(this.A08, this);
        C04850Qx.A06(this.A09, this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            C04850Qx.A06((C04850Qx) this.A0B.get(i3), this);
        }
        C04850Qx r02 = this.A07;
        if (r02 != null) {
            C04850Qx.A06(r02, this);
        }
    }

    public void Bm3(List list, List list2) {
        AnonymousClass0LI r5 = null;
        C09200fo r6 = null;
        for (int A032 = AnonymousClass002.A03(list); A032 >= 0; A032--) {
            C16780tx r2 = (C16780tx) list.get(A032);
            if (r2 instanceof C09200fo) {
                C09200fo r22 = (C09200fo) r2;
                if (r22.A03 == AnonymousClass0FR.INDIVIDUALLY) {
                    r6 = r22;
                }
            }
        }
        if (r6 != null) {
            r6.A05.add(this);
        }
        for (int A033 = AnonymousClass002.A03(list2); A033 >= 0; A033--) {
            C16780tx r3 = (C16780tx) list2.get(A033);
            if (r3 instanceof C09200fo) {
                C09200fo r23 = (C09200fo) r3;
                if (r23.A03 == AnonymousClass0FR.INDIVIDUALLY) {
                    if (r5 != null) {
                        this.A0C.add(r5);
                    }
                    r5 = new AnonymousClass0LI(r23);
                    r23.A05.add(this);
                }
            }
            if (r3 instanceof C17340vN) {
                if (r5 == null) {
                    r5 = new AnonymousClass0LI(r6);
                }
                r5.A01.add(r3);
            }
        }
        if (r5 != null) {
            this.A0C.add(r5);
        }
    }

    public void Bk4(AnonymousClass0WB r1, AnonymousClass0WB r2, List list, int i) {
        C06100Wg.A01(this, r1, r2, list, i);
    }
}
