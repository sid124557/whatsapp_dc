package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0g0  reason: invalid class name and case insensitive filesystem */
public abstract class C09320g0 implements C16230sg, C16790ty, C17350vO {
    public Paint A00;
    public C01540Bg A01;
    public C03800Lp A02;
    public C09320g0 A03;
    public C09320g0 A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public final Matrix A08;
    public final Matrix A09 = AnonymousClass002.A05();
    public final Paint A0A;
    public final Paint A0B = new AnonymousClass00u(1);
    public final Paint A0C = new AnonymousClass00u(1, PorterDuff.Mode.DST_IN);
    public final Paint A0D = new AnonymousClass00u(1, PorterDuff.Mode.DST_OUT);
    public final Paint A0E;
    public final Path A0F = AnonymousClass002.A06();
    public final RectF A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final AnonymousClass01G A0K;
    public final AnonymousClass0QZ A0L;
    public final C04510Oo A0M;
    public final String A0N;
    public final List A0O;

    public abstract void A07(Canvas canvas, Matrix matrix, int i);

    public final void A04() {
        if (this.A05 == null) {
            C09320g0 r1 = this.A04;
            if (r1 == null) {
                this.A05 = Collections.emptyList();
                return;
            }
            this.A05 = AnonymousClass001.A0s();
            do {
                this.A05.add(r1);
                r1 = r1.A04;
            } while (r1 != null);
        }
    }

    public void A05(float f) {
        AnonymousClass0QZ r1 = this.A0L;
        C04850Qx r0 = r1.A02;
        if (r0 != null) {
            r0.A0E(f);
        }
        C04850Qx r02 = r1.A06;
        if (r02 != null) {
            r02.A0E(f);
        }
        C04850Qx r03 = r1.A01;
        if (r03 != null) {
            r03.A0E(f);
        }
        C04850Qx r04 = r1.A00;
        if (r04 != null) {
            r04.A0E(f);
        }
        C04850Qx r05 = r1.A03;
        if (r05 != null) {
            r05.A0E(f);
        }
        C04850Qx r06 = r1.A05;
        if (r06 != null) {
            r06.A0E(f);
        }
        C04850Qx r07 = r1.A04;
        if (r07 != null) {
            r07.A0E(f);
        }
        C01540Bg r08 = r1.A07;
        if (r08 != null) {
            r08.A0E(f);
        }
        C01540Bg r09 = r1.A08;
        if (r09 != null) {
            r09.A0E(f);
        }
        C03800Lp r4 = this.A02;
        int i = 0;
        if (r4 != null) {
            int i2 = 0;
            while (true) {
                List list = r4.A00;
                if (i2 >= list.size()) {
                    break;
                }
                ((C04850Qx) list.get(i2)).A0E(f);
                i2++;
            }
        }
        float f2 = this.A0M.A01;
        if (f2 != 0.0f) {
            f /= f2;
        }
        C01540Bg r12 = this.A01;
        if (r12 != null) {
            r12.A0E(f / f2);
        }
        C09320g0 r13 = this.A03;
        if (r13 != null) {
            r13.A05(r13.A0M.A01 * f);
        }
        while (true) {
            List list2 = this.A0O;
            if (i < list2.size()) {
                ((C04850Qx) list2.get(i)).A0E(f);
                i++;
            } else {
                return;
            }
        }
    }

    public final void A06(Canvas canvas) {
        RectF rectF = this.A0I;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0A);
        AnonymousClass0K1.A01();
    }

    public void A08(C04850Qx r2) {
        if (r2 != null) {
            this.A0O.add(r2);
        }
    }

    public void A0A(boolean z) {
        if (z && this.A00 == null) {
            this.A00 = new AnonymousClass00u();
        }
        this.A06 = z;
    }

    public void Aws(C05560Tz r2, Object obj) {
        this.A0L.A04(r2, obj);
    }

    public void B2C(Canvas canvas, Matrix matrix, int i) {
        int A032;
        Paint paint;
        Paint paint2;
        C03800Lp r0;
        if (this.A07) {
            C04510Oo r02 = this.A0M;
            C04510Oo r18 = r02;
            if (!r02.A0L) {
                A04();
                Matrix matrix2 = this.A09;
                matrix2.reset();
                Matrix matrix3 = matrix;
                matrix2.set(matrix3);
                int size = this.A05.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(((C09320g0) this.A05.get(size)).A0L.A00());
                }
                AnonymousClass0K1.A01();
                AnonymousClass0QZ r10 = this.A0L;
                C04850Qx r03 = r10.A02;
                if (r03 == null) {
                    A032 = 100;
                } else {
                    A032 = C04850Qx.A03(r03);
                }
                int i2 = (int) ((((((float) i) / 255.0f) * ((float) A032)) / 100.0f) * 255.0f);
                Canvas canvas2 = canvas;
                if (AnonymousClass000.A1W(this.A03) || ((r0 = this.A02) != null && !r0.A00.isEmpty())) {
                    RectF rectF = this.A0I;
                    B4p(matrix2, rectF, false);
                    if (!(this.A03 == null || r18.A0F == AnonymousClass0FS.INVERT)) {
                        RectF rectF2 = this.A0H;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        this.A03.B4p(matrix3, rectF2, true);
                        if (!rectF.intersect(rectF2)) {
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                    matrix2.preConcat(r10.A00());
                    RectF rectF3 = this.A0G;
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                    C03800Lp r6 = this.A02;
                    if (r6 != null) {
                        List list = r6.A00;
                        if (!list.isEmpty()) {
                            List list2 = r6.A01;
                            int size2 = list2.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    AnonymousClass0MD r13 = (AnonymousClass0MD) list2.get(i3);
                                    Path A022 = A02(matrix2, (C04850Qx) list.get(i3), this);
                                    int ordinal = r13.A02.ordinal();
                                    if (ordinal == 3 || ordinal == 1 || ((ordinal == 2 || ordinal == 0) && r13.A03)) {
                                        break;
                                    }
                                    RectF rectF4 = this.A0J;
                                    A022.computeBounds(rectF4, false);
                                    if (i3 == 0) {
                                        rectF3.set(rectF4);
                                    } else {
                                        rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                    }
                                    i3++;
                                } else if (!rectF.intersect(rectF3)) {
                                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                            }
                        }
                    }
                    if (!rectF.intersect(0.0f, 0.0f, (float) canvas2.getWidth(), (float) canvas2.getHeight())) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    AnonymousClass0K1.A01();
                    if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                        Paint paint3 = this.A0B;
                        paint3.setAlpha(255);
                        AnonymousClass0Y0.A02(canvas2, paint3, rectF, 31);
                        AnonymousClass0K1.A01();
                        A06(canvas2);
                        A07(canvas2, matrix2, i2);
                        AnonymousClass0K1.A01();
                        if (r6 != null) {
                            List list3 = r6.A00;
                            if (!list3.isEmpty()) {
                                Paint paint4 = this.A0C;
                                AnonymousClass0Y0.A02(canvas2, paint4, rectF, 19);
                                if (Build.VERSION.SDK_INT < 28) {
                                    A06(canvas2);
                                }
                                AnonymousClass0K1.A01();
                                int i4 = 0;
                                while (true) {
                                    List list4 = r6.A01;
                                    if (i4 >= list4.size()) {
                                        break;
                                    }
                                    AnonymousClass0MD r14 = (AnonymousClass0MD) list4.get(i4);
                                    C04850Qx r132 = (C04850Qx) list3.get(i4);
                                    C04850Qx r12 = (C04850Qx) r6.A02.get(i4);
                                    int ordinal2 = r14.A02.ordinal();
                                    if (ordinal2 != 3) {
                                        if (ordinal2 == 1) {
                                            if (i4 == 0) {
                                                paint3.setColor(-16777216);
                                                paint3.setAlpha(255);
                                                canvas2.drawRect(rectF, paint3);
                                            }
                                            if (r14.A03) {
                                                paint2 = this.A0D;
                                                AnonymousClass0Y0.A02(canvas2, paint2, rectF, 31);
                                                canvas2.drawRect(rectF, paint3);
                                                A03(paint2, r12);
                                                canvas2.drawPath(A02(matrix2, r132, this), paint2);
                                            } else {
                                                canvas2.drawPath(A02(matrix2, r132, this), this.A0D);
                                            }
                                        } else if (ordinal2 != 2) {
                                            if (ordinal2 == 0) {
                                                if (r14.A03) {
                                                    AnonymousClass0Y0.A02(canvas2, paint3, rectF, 31);
                                                    canvas2.drawRect(rectF, paint3);
                                                    Path A023 = A02(matrix2, r132, this);
                                                    A03(paint3, r12);
                                                    canvas2.drawPath(A023, this.A0D);
                                                } else {
                                                    Path A024 = A02(matrix2, r132, this);
                                                    A03(paint3, r12);
                                                    canvas2.drawPath(A024, paint3);
                                                }
                                            }
                                        } else if (r14.A03) {
                                            AnonymousClass0Y0.A02(canvas2, paint4, rectF, 31);
                                            canvas2.drawRect(rectF, paint3);
                                            paint2 = this.A0D;
                                            A03(paint2, r12);
                                            canvas2.drawPath(A02(matrix2, r132, this), paint2);
                                        } else {
                                            AnonymousClass0Y0.A02(canvas2, paint4, rectF, 31);
                                            Path A025 = A02(matrix2, r132, this);
                                            A03(paint3, r12);
                                            canvas2.drawPath(A025, paint3);
                                        }
                                        canvas2.restore();
                                    } else if (!list3.isEmpty()) {
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 < list4.size()) {
                                                if (((AnonymousClass0MD) list4.get(i5)).A02 != C02330Ft.MASK_MODE_NONE) {
                                                    break;
                                                }
                                                i5++;
                                            } else {
                                                paint3.setAlpha(255);
                                                canvas2.drawRect(rectF, paint3);
                                                break;
                                            }
                                        }
                                    }
                                    i4++;
                                }
                                canvas2.restore();
                                AnonymousClass0K1.A01();
                            }
                        }
                        if (this.A03 != null) {
                            AnonymousClass0Y0.A02(canvas2, this.A0E, rectF, 19);
                            AnonymousClass0K1.A01();
                            A06(canvas2);
                            this.A03.B2C(canvas2, matrix3, i2);
                            canvas2.restore();
                            AnonymousClass0K1.A01();
                            AnonymousClass0K1.A01();
                        }
                        canvas2.restore();
                        AnonymousClass0K1.A01();
                    }
                    if (this.A06 && (paint = this.A00) != null) {
                        paint.setStyle(Paint.Style.STROKE);
                        this.A00.setColor(-251901);
                        this.A00.setStrokeWidth(4.0f);
                        canvas2.drawRect(rectF, this.A00);
                        AnonymousClass001.A10(this.A00);
                        this.A00.setColor(1357638635);
                        canvas2.drawRect(rectF, this.A00);
                    }
                } else {
                    matrix2.preConcat(r10.A00());
                    A07(canvas2, matrix2, i2);
                    AnonymousClass0K1.A01();
                }
                AnonymousClass0K1.A01();
                AnonymousClass0MB r5 = this.A0K.A04.A0D;
                String str = r18.A0G;
                if (r5.A00) {
                    Map map = r5.A02;
                    AnonymousClass0LL r3 = (AnonymousClass0LL) map.get(str);
                    if (r3 == null) {
                        r3 = new AnonymousClass0LL();
                        map.put(str, r3);
                    }
                    float f = r3.A00 + 0.0f;
                    r3.A00 = f;
                    int i6 = r3.A01 + 1;
                    r3.A01 = i6;
                    if (i6 == Integer.MAX_VALUE) {
                        r3.A00 = f / 2.0f;
                        r3.A01 = 1073741823;
                    }
                    if (str.equals("__container")) {
                        Iterator it = r5.A03.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AnonymousClass001.A0g("onFrameRendered");
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        AnonymousClass0K1.A01();
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        this.A0I.set(0.0f, 0.0f, 0.0f, 0.0f);
        A04();
        Matrix matrix2 = this.A08;
        matrix2.set(matrix);
        if (z) {
            List list = this.A05;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(((C09320g0) this.A05.get(size)).A0L.A00());
                }
            } else {
                C09320g0 r0 = this.A04;
                if (r0 != null) {
                    matrix2.preConcat(r0.A0L.A00());
                }
            }
        }
        matrix2.preConcat(this.A0L.A00());
    }

    public void BfC() {
        this.A0K.invalidateSelf();
    }

    public void Bk4(AnonymousClass0WB r4, AnonymousClass0WB r5, List list, int i) {
        C09320g0 r0 = this.A03;
        if (r0 != null) {
            String str = r0.A0M.A0G;
            AnonymousClass0WB r2 = new AnonymousClass0WB(r5);
            r2.A01.add(str);
            if (r4.A01(this.A03.A0M.A0G, i)) {
                C09320g0 r1 = this.A03;
                AnonymousClass0WB r02 = new AnonymousClass0WB(r2);
                r02.A00 = r1;
                list.add(r02);
            }
            if (r4.A03(this.A0M.A0G, i)) {
                this.A03.A09(r4, r2, list, r4.A00(this.A03.A0M.A0G, i) + i);
            }
        }
        String str2 = this.A0M.A0G;
        if (r4.A02(str2, i)) {
            if (!"__container".equals(str2)) {
                AnonymousClass0WB r12 = new AnonymousClass0WB(r5);
                r12.A01.add(str2);
                r5 = r12;
                if (r4.A01(str2, i)) {
                    AnonymousClass0WB r03 = new AnonymousClass0WB(r12);
                    r03.A00 = this;
                    list.add(r03);
                }
            }
            if (r4.A03(str2, i)) {
                A09(r4, r5, list, i + r4.A00(str2, i));
            }
        }
    }

    public String getName() {
        return this.A0M.A0G;
    }

    public C09320g0(AnonymousClass01G r6, C04510Oo r7) {
        PorterDuff.Mode mode;
        AnonymousClass00u r2 = new AnonymousClass00u(1);
        this.A0E = r2;
        this.A0A = new AnonymousClass00u(PorterDuff.Mode.CLEAR);
        this.A0I = AnonymousClass002.A07();
        this.A0G = AnonymousClass002.A07();
        this.A0H = AnonymousClass002.A07();
        this.A0J = AnonymousClass002.A07();
        this.A08 = AnonymousClass002.A05();
        this.A0O = AnonymousClass001.A0s();
        this.A07 = true;
        this.A0K = r6;
        this.A0M = r7;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r7.A0G);
        this.A0N = AnonymousClass000.A0X("#draw", A0o);
        if (r7.A0F == AnonymousClass0FS.INVERT) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        r2.setXfermode(new PorterDuffXfermode(mode));
        AnonymousClass0QZ r0 = new AnonymousClass0QZ(r7.A0D);
        this.A0L = r0;
        r0.A02(this);
        List list = r7.A0J;
        if (list != null && !list.isEmpty()) {
            C03800Lp r02 = new C03800Lp(list);
            this.A02 = r02;
            for (C04850Qx A062 : r02.A00) {
                C04850Qx.A06(A062, this);
            }
            for (C04850Qx r03 : this.A02.A02) {
                A08(r03);
                C04850Qx.A06(r03, this);
            }
        }
        List list2 = this.A0M.A0I;
        boolean z = true;
        if (!list2.isEmpty()) {
            C01540Bg r1 = new C01540Bg(list2);
            this.A01 = r1;
            r1.A05 = true;
            C04850Qx.A06(r1, new C09280fw(this));
            z = C04850Qx.A02(this.A01) != 1.0f ? false : z;
            if (z != this.A07) {
                this.A07 = z;
                this.A0K.invalidateSelf();
            }
            A08(this.A01);
        } else if (true != this.A07) {
            this.A07 = true;
            this.A0K.invalidateSelf();
        }
    }

    public static Path A02(Matrix matrix, C04850Qx r3, C09320g0 r4) {
        Path path = r4.A0F;
        path.set((Path) r3.A0A());
        path.transform(matrix);
        return path;
    }

    public static void A03(Paint paint, C04850Qx r3) {
        paint.setAlpha((int) (((float) ((Number) r3.A0A()).intValue()) * 2.55f));
    }

    public void Bm3(List list, List list2) {
    }

    public void A09(AnonymousClass0WB r1, AnonymousClass0WB r2, List list, int i) {
    }
}
