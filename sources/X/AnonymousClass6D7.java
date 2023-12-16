package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;

/* renamed from: X.6D7  reason: invalid class name */
public class AnonymousClass6D7 extends Drawable implements C181238mQ, C14920qU {
    public static final Paint A0N;
    public static final String A0O = AnonymousClass6D7.class.getSimpleName();
    public int A00;
    public PorterDuffColorFilter A01;
    public PorterDuffColorFilter A02;
    public AnonymousClass6Cs A03;
    public C161877ql A04;
    public boolean A05;
    public boolean A06;
    public final Matrix A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;
    public final Path A0B;
    public final RectF A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final Region A0F;
    public final Region A0G;
    public final C157687ii A0H;
    public final C178898iH A0I;
    public final AnonymousClass7XF A0J;
    public final BitSet A0K;
    public final C157217hw[] A0L;
    public final C157217hw[] A0M;

    public void A08(Canvas canvas) {
        Paint paint = this.A09;
        Path path = this.A0B;
        C161877ql r6 = this.A04;
        RectF rectF = this.A0C;
        RectF rectF2 = this.A0E;
        AnonymousClass6C8.A0v(rectF2, this);
        rectF.set(rectF2);
        float A012 = A01();
        rectF.inset(A012, A012);
        A0A(canvas, paint, path, rectF, r6);
    }

    public void invalidateSelf() {
        this.A05 = true;
        super.invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        this.A05 = true;
        super.onBoundsChange(rect);
    }

    static {
        Paint A0B2 = C86604Kt.A0B();
        A0N = A0B2;
        A0B2.setColor(-1);
        C86634Kw.A18(A0B2, PorterDuff.Mode.DST_OUT);
    }

    public final float A01() {
        Paint.Style style = this.A03.A0G;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.STROKE) {
            return 0.0f;
        }
        Paint paint = this.A09;
        if (paint.getStrokeWidth() > 0.0f) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public int A02(int i) {
        AnonymousClass6Cs r2 = this.A03;
        float f = r2.A00 + r2.A05 + r2.A02;
        C157567iW r0 = r2.A0J;
        if (r0 != null) {
            return r0.A00(i, f);
        }
        return i;
    }

    public final void A03() {
        AnonymousClass6Cs r2 = this.A03;
        float f = r2.A00 + r2.A05;
        r2.A09 = AnonymousClass6C9.A04(0.75f, f);
        r2.A08 = AnonymousClass6C9.A04(f, 0.25f);
        A0C();
        super.invalidateSelf();
    }

    public void A04(float f) {
        AnonymousClass6Cs r1 = this.A03;
        if (r1.A00 != f) {
            r1.A00 = f;
            A03();
        }
    }

    public void A05(Context context) {
        this.A03.A0J = new C157567iW(context);
        A03();
    }

    public void A06(ColorStateList colorStateList) {
        AnonymousClass6Cs r1 = this.A03;
        if (r1.A0B != colorStateList) {
            r1.A0B = colorStateList;
            onStateChange(getState());
        }
    }

    public void A07(ColorStateList colorStateList) {
        AnonymousClass6Cs r1 = this.A03;
        if (r1.A0C != colorStateList) {
            r1.A0C = colorStateList;
            onStateChange(getState());
        }
    }

    public final void A09(Canvas canvas) {
        if (this.A0K.cardinality() > 0) {
            Log.w(A0O, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.A03.A08 != 0) {
            canvas.drawPath(this.A0A, this.A0H.A05);
        }
        int i = 0;
        do {
            C157217hw r1 = this.A0L[i];
            C157687ii r3 = this.A0H;
            int i2 = this.A03.A09;
            Matrix matrix = C157217hw.A01;
            r1.A00(canvas, matrix, r3, i2);
            this.A0M[i].A00(canvas, matrix, r3, this.A03.A09);
            i++;
        } while (i < 4);
        if (this.A06) {
            AnonymousClass6Cs r12 = this.A03;
            double d = (double) r12.A08;
            double radians = Math.toRadians((double) r12.A0A);
            int sin = (int) (d * Math.sin(radians));
            int cos = (int) (d * Math.cos(radians));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(this.A0A, A0N);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void A0B(Path path, RectF rectF) {
        AnonymousClass7XF r4 = this.A0J;
        AnonymousClass6Cs r0 = this.A03;
        Path path2 = path;
        RectF rectF2 = rectF;
        r4.A00(path2, rectF2, r0.A0K, this.A0I, r0.A01);
        if (this.A03.A03 != 1.0f) {
            Matrix matrix = this.A07;
            matrix.reset();
            float f = this.A03.A03;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A0D, true);
    }

    public final boolean A0C() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.A02;
        PorterDuffColorFilter porterDuffColorFilter4 = this.A01;
        AnonymousClass6Cs r0 = this.A03;
        ColorStateList colorStateList = r0.A0E;
        PorterDuff.Mode mode = r0.A0H;
        Paint paint = this.A08;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int A022 = A02(color);
            this.A00 = A022;
            if (A022 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(A022, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            int A023 = A02(colorStateList.getColorForState(getState(), 0));
            this.A00 = A023;
            porterDuffColorFilter = new PorterDuffColorFilter(A023, mode);
        }
        this.A02 = porterDuffColorFilter;
        AnonymousClass6Cs r02 = this.A03;
        ColorStateList colorStateList2 = r02.A0D;
        PorterDuff.Mode mode2 = r02.A0H;
        if (colorStateList2 == null || mode2 == null) {
            porterDuffColorFilter2 = null;
        } else {
            int colorForState = colorStateList2.getColorForState(getState(), 0);
            this.A00 = colorForState;
            porterDuffColorFilter2 = new PorterDuffColorFilter(colorForState, mode2);
        }
        this.A01 = porterDuffColorFilter2;
        AnonymousClass6Cs r1 = this.A03;
        if (r1.A0L) {
            C157687ii r5 = this.A0H;
            int colorForState2 = r1.A0E.getColorForState(getState(), 0);
            int A062 = AnonymousClass0YI.A06(colorForState2, 68);
            r5.A02 = A062;
            r5.A01 = AnonymousClass0YI.A06(colorForState2, 20);
            r5.A00 = colorForState2 & 16777215;
            r5.A05.setColor(A062);
        }
        if (!C04880Ra.A01(porterDuffColorFilter3, this.A02) || !C04880Ra.A01(porterDuffColorFilter4, this.A01)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r5.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r2 = r5.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D(int[] r6) {
        /*
            r5 = this;
            X.6Cs r0 = r5.A03
            android.content.res.ColorStateList r0 = r0.A0B
            r4 = 1
            if (r0 == 0) goto L_0x0035
            android.graphics.Paint r2 = r5.A08
            int r1 = r2.getColor()
            X.6Cs r0 = r5.A03
            android.content.res.ColorStateList r0 = r0.A0B
            int r0 = r0.getColorForState(r6, r1)
            if (r1 == r0) goto L_0x0035
            r2.setColor(r0)
            r3 = 1
        L_0x001b:
            X.6Cs r0 = r5.A03
            android.content.res.ColorStateList r0 = r0.A0C
            if (r0 == 0) goto L_0x0037
            android.graphics.Paint r2 = r5.A09
            int r1 = r2.getColor()
            X.6Cs r0 = r5.A03
            android.content.res.ColorStateList r0 = r0.A0C
            int r0 = r0.getColorForState(r6, r1)
            if (r1 == r0) goto L_0x0037
            r2.setColor(r0)
            return r4
        L_0x0035:
            r3 = 0
            goto L_0x001b
        L_0x0037:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6D7.A0D(int[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e8, code lost:
        if (r2 < 29) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r13 = r19
            android.graphics.Paint r15 = r13.A08
            android.graphics.PorterDuffColorFilter r0 = r13.A02
            r15.setColorFilter(r0)
            int r6 = r15.getAlpha()
            X.6Cs r0 = r13.A03
            int r1 = r0.A06
            int r0 = r1 >>> 7
            int r1 = r1 + r0
            int r0 = r6 * r1
            int r0 = r0 >>> 8
            r15.setAlpha(r0)
            android.graphics.Paint r5 = r13.A09
            android.graphics.PorterDuffColorFilter r0 = r13.A01
            r5.setColorFilter(r0)
            X.6Cs r0 = r13.A03
            float r0 = r0.A04
            r5.setStrokeWidth(r0)
            int r4 = r5.getAlpha()
            X.6Cs r0 = r13.A03
            int r1 = r0.A06
            int r0 = r1 >>> 7
            int r1 = r1 + r0
            int r0 = r4 * r1
            int r0 = r0 >>> 8
            r5.setAlpha(r0)
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x00bf
            float r0 = r13.A01()
            float r0 = -r0
            X.6Cs r2 = r13.A03
            X.7ql r7 = r2.A0K
            X.7GS r8 = new X.7GS
            r8.<init>(r13, r0)
            X.7jd r3 = new X.7jd
            r3.<init>(r7)
            X.8mP r9 = r7.A02
            boolean r0 = r9 instanceof X.C170098Bw
            if (r0 != 0) goto L_0x0060
            float r1 = r8.A00
            X.8Bx r0 = new X.8Bx
            r0.<init>(r9, r1)
            r9 = r0
        L_0x0060:
            r3.A02 = r9
            X.8mP r9 = r7.A03
            boolean r0 = r9 instanceof X.C170098Bw
            if (r0 != 0) goto L_0x0070
            float r1 = r8.A00
            X.8Bx r0 = new X.8Bx
            r0.<init>(r9, r1)
            r9 = r0
        L_0x0070:
            r3.A03 = r9
            X.8mP r9 = r7.A00
            boolean r0 = r9 instanceof X.C170098Bw
            if (r0 != 0) goto L_0x0080
            float r1 = r8.A00
            X.8Bx r0 = new X.8Bx
            r0.<init>(r9, r1)
            r9 = r0
        L_0x0080:
            r3.A00 = r9
            X.8mP r7 = r7.A01
            boolean r0 = r7 instanceof X.C170098Bw
            if (r0 != 0) goto L_0x0090
            float r1 = r8.A00
            X.8Bx r0 = new X.8Bx
            r0.<init>(r7, r1)
            r7 = r0
        L_0x0090:
            r3.A01 = r7
            X.7ql r10 = new X.7ql
            r10.<init>(r3)
            r13.A04 = r10
            X.7XF r7 = r13.A0J
            float r12 = r2.A01
            android.graphics.RectF r9 = r13.A0C
            android.graphics.RectF r1 = r13.A0E
            X.AnonymousClass6C8.A0v(r1, r13)
            r9.set(r1)
            float r0 = r13.A01()
            r9.inset(r0, r0)
            android.graphics.Path r8 = r13.A0B
            r11 = 0
            r7.A00(r8, r9, r10, r11, r12)
            X.AnonymousClass6C8.A0v(r1, r13)
            android.graphics.Path r0 = r13.A0A
            r13.A0B(r0, r1)
            r0 = 0
            r13.A05 = r0
        L_0x00bf:
            X.6Cs r3 = r13.A03
            int r1 = r3.A07
            r0 = 1
            r14 = r20
            if (r1 == r0) goto L_0x0115
            int r0 = r3.A09
            if (r0 <= 0) goto L_0x0115
            r0 = 2
            if (r1 == r0) goto L_0x00ea
            int r2 = android.os.Build.VERSION.SDK_INT
            X.7ql r1 = r3.A0K
            android.graphics.RectF r0 = r13.A0E
            X.AnonymousClass6C8.A0v(r0, r13)
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x0115
            android.graphics.Path r0 = r13.A0A
            boolean r0 = r0.isConvex()
            if (r0 != 0) goto L_0x0115
            r0 = 29
            if (r2 >= r0) goto L_0x0115
        L_0x00ea:
            r14.save()
            X.6Cs r1 = r13.A03
            int r0 = r1.A08
            double r2 = (double) r0
            int r0 = r1.A0A
            double r0 = (double) r0
            double r9 = java.lang.Math.toRadians(r0)
            double r7 = java.lang.Math.sin(r9)
            double r0 = r2 * r7
            int r7 = (int) r0
            double r0 = java.lang.Math.cos(r9)
            double r2 = r2 * r0
            int r0 = (int) r2
            float r1 = (float) r7
            float r0 = (float) r0
            r14.translate(r1, r0)
            boolean r0 = r13.A06
            if (r0 != 0) goto L_0x0152
            r13.A09(r14)
        L_0x0112:
            r14.restore()
        L_0x0115:
            X.6Cs r3 = r13.A03
            android.graphics.Paint$Style r1 = r3.A0G
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r0) goto L_0x0121
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            if (r1 != r0) goto L_0x0133
        L_0x0121:
            android.graphics.Path r2 = r13.A0A
            X.7ql r1 = r3.A0K
            android.graphics.RectF r0 = r13.A0E
            X.AnonymousClass6C8.A0v(r0, r13)
            r16 = r2
            r17 = r0
            r18 = r1
            r13.A0A(r14, r15, r16, r17, r18)
        L_0x0133:
            X.6Cs r0 = r13.A03
            android.graphics.Paint$Style r1 = r0.A0G
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r0) goto L_0x013f
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            if (r1 != r0) goto L_0x014b
        L_0x013f:
            float r1 = r5.getStrokeWidth()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x014b
            r13.A08(r14)
        L_0x014b:
            r15.setAlpha(r6)
            r5.setAlpha(r4)
            return
        L_0x0152:
            android.graphics.RectF r1 = r13.A0D
            float r2 = r1.width()
            android.graphics.Rect r0 = r13.getBounds()
            int r0 = r0.width()
            float r0 = (float) r0
            float r2 = r2 - r0
            int r3 = (int) r2
            float r2 = r1.height()
            android.graphics.Rect r0 = r13.getBounds()
            int r0 = r0.height()
            float r0 = (float) r0
            float r2 = r2 - r0
            int r2 = (int) r2
            if (r3 < 0) goto L_0x01c4
            if (r2 < 0) goto L_0x01c4
            float r0 = r1.width()
            int r7 = (int) r0
            X.6Cs r0 = r13.A03
            int r0 = r0.A09
            int r0 = r0 * 2
            int r7 = r7 + r0
            int r7 = r7 + r3
            float r0 = r1.height()
            int r1 = (int) r0
            X.6Cs r0 = r13.A03
            int r0 = r0.A09
            int r0 = r0 * 2
            int r1 = r1 + r0
            int r1 = r1 + r2
            android.graphics.Bitmap r7 = X.C86664Kz.A0Y(r7, r1)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r7)
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.left
            X.6Cs r0 = r13.A03
            int r0 = r0.A09
            int r1 = r1 - r0
            int r1 = r1 - r3
            float r3 = (float) r1
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.top
            X.6Cs r0 = r13.A03
            int r0 = r0.A09
            int r1 = r1 - r0
            int r1 = r1 - r2
            float r2 = (float) r1
            float r1 = -r3
            float r0 = -r2
            r8.translate(r1, r0)
            r13.A09(r8)
            r0 = 0
            r14.drawBitmap(r7, r3, r2, r0)
            r7.recycle()
            goto L_0x0112
        L_0x01c4:
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6D7.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        return this.A03.A06;
    }

    public Drawable.ConstantState getConstantState() {
        return this.A03;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        AnonymousClass6Cs r2 = this.A03;
        if (r2.A07 != 2) {
            C161877ql r0 = r2.A0K;
            RectF rectF = this.A0E;
            AnonymousClass6C8.A0v(rectF, this);
            if (r0.A03(rectF)) {
                C181228mP r02 = this.A03.A0K.A02;
                AnonymousClass6C8.A0v(rectF, this);
                outline.setRoundRect(getBounds(), r02.B60(rectF) * this.A03.A01);
                return;
            }
            AnonymousClass6C8.A0v(rectF, this);
            Path path = this.A0A;
            A0B(path, rectF);
            C1446372i.A00(outline, path);
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.A03.A0I;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Drawable mutate() {
        this.A03 = new AnonymousClass6Cs(this.A03);
        return this;
    }

    public void setAlpha(int i) {
        AnonymousClass6Cs r1 = this.A03;
        if (r1.A06 != i) {
            r1.A06 = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.A0F = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(C161877ql r2) {
        this.A03.A0K = r2;
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A03.A0E = colorStateList;
        A0C();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        AnonymousClass6Cs r1 = this.A03;
        if (r1.A0H != mode) {
            r1.A0H = mode;
            A0C();
            super.invalidateSelf();
        }
    }

    public AnonymousClass6D7(AnonymousClass6Cs r6) {
        AnonymousClass7XF r0;
        this.A0L = new C157217hw[4];
        this.A0M = new C157217hw[4];
        this.A0K = new BitSet(8);
        this.A07 = new Matrix();
        this.A0A = AnonymousClass002.A06();
        this.A0B = AnonymousClass002.A06();
        this.A0E = AnonymousClass002.A07();
        this.A0C = AnonymousClass002.A07();
        this.A0G = new Region();
        this.A0F = new Region();
        Paint paint = new Paint(1);
        this.A08 = paint;
        Paint paint2 = new Paint(1);
        this.A09 = paint2;
        this.A0H = new C157687ii();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            r0 = AnonymousClass772.A00;
        } else {
            r0 = new AnonymousClass7XF();
        }
        this.A0J = r0;
        this.A0D = AnonymousClass002.A07();
        this.A06 = true;
        this.A03 = r6;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        A0C();
        A0D(getState());
        this.A0I = new C170118By(this);
    }

    public final void A0A(Canvas canvas, Paint paint, Path path, RectF rectF, C161877ql r7) {
        if (r7.A03(rectF)) {
            float B60 = r7.A03.B60(rectF) * this.A03.A01;
            canvas.drawRoundRect(rectF, B60, B60, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.A0G;
        region.set(bounds);
        RectF rectF = this.A0E;
        AnonymousClass6C8.A0v(rectF, this);
        Path path = this.A0A;
        A0B(path, rectF);
        Region region2 = this.A0F;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.A03.A0E;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.A03.A0D;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A03.A0C;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A03.A0B;
        if (colorStateList4 == null || !colorStateList4.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean A0D2 = A0D(iArr);
        boolean A0C2 = A0C();
        if (!A0D2 && !A0C2) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public AnonymousClass6D7() {
        this(new C161877ql());
    }

    public AnonymousClass6D7(C161877ql r2) {
        this(new AnonymousClass6Cs(r2));
    }
}
