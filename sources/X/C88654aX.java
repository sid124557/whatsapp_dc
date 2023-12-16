package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.4aX  reason: invalid class name and case insensitive filesystem */
public class C88654aX extends AnonymousClass6D7 implements Drawable.Callback, C184948so, C14920qU {
    public static final ShapeDrawable A0w = C86634Kw.A0H();
    public static final int[] A0x = {16842910};
    public float A00 = -1.0f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D = 255;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorStateList A0P;
    public ColorStateList A0Q;
    public ColorStateList A0R;
    public ColorStateList A0S;
    public ColorFilter A0T;
    public PorterDuff.Mode A0U = PorterDuff.Mode.SRC_IN;
    public PorterDuffColorFilter A0V;
    public Drawable A0W;
    public Drawable A0X;
    public Drawable A0Y;
    public Drawable A0Z;
    public TextUtils.TruncateAt A0a;
    public C161407pZ A0b;
    public C161407pZ A0c;
    public CharSequence A0d;
    public CharSequence A0e;
    public WeakReference A0f = AnonymousClass0x9.A14((Object) null);
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public int[] A0o;
    public final Context A0p;
    public final Paint.FontMetrics A0q = new Paint.FontMetrics();
    public final Paint A0r = C86664Kz.A0a(1);
    public final Path A0s = AnonymousClass002.A06();
    public final PointF A0t = new PointF();
    public final RectF A0u = AnonymousClass002.A07();
    public final C151957Wy A0v;

    public void A0R(ColorStateList colorStateList) {
        this.A0l = true;
        if (this.A0N != colorStateList) {
            this.A0N = colorStateList;
            if (A0e()) {
                AnonymousClass0YG.A01(colorStateList, this.A0X);
            }
            C86634Kw.A1O(this);
        }
    }

    public float A0G() {
        if (!this.A0m) {
            return this.A00;
        }
        C181228mP r2 = this.A03.A0K.A02;
        RectF rectF = this.A0E;
        rectF.set(getBounds());
        return r2.B60(rectF);
    }

    public void A0H() {
        C178788i6 r1 = (C178788i6) this.A0f.get();
        if (r1 != null) {
            Chip chip = (Chip) r1;
            chip.A06(chip.A01);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Deprecated
    public void A0I(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            setShapeAppearanceModel(C86624Kv.A0I(this.A03.A0K, f));
        }
    }

    public void A0J(float f) {
        if (this.A02 != f) {
            float A0E2 = A0E();
            this.A02 = f;
            float A0E3 = A0E();
            invalidateSelf();
            if (A0E2 != A0E3) {
                A0H();
            }
        }
    }

    public void A0K(float f) {
        if (this.A05 != f) {
            this.A05 = f;
            this.A0r.setStrokeWidth(f);
            if (this.A0m) {
                this.A03.A04 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void A0L(float f) {
        if (this.A06 != f) {
            this.A06 = f;
            invalidateSelf();
            if (A0f()) {
                A0H();
            }
        }
    }

    public void A0M(float f) {
        if (this.A07 != f) {
            this.A07 = f;
            invalidateSelf();
            if (A0f()) {
                A0H();
            }
        }
    }

    public void A0N(float f) {
        if (this.A08 != f) {
            this.A08 = f;
            invalidateSelf();
            if (A0f()) {
                A0H();
            }
        }
    }

    public void A0O(float f) {
        if (this.A09 != f) {
            float A0E2 = A0E();
            this.A09 = f;
            float A0E3 = A0E();
            invalidateSelf();
            if (A0E2 != A0E3) {
                A0H();
            }
        }
    }

    public void A0P(float f) {
        if (this.A0A != f) {
            float A0E2 = A0E();
            this.A0A = f;
            float A0E3 = A0E();
            invalidateSelf();
            if (A0E2 != A0E3) {
                A0H();
            }
        }
    }

    public void A0Q(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.A0L != colorStateList) {
            this.A0L = colorStateList;
            if (this.A0h && (drawable = this.A0W) != null && this.A0g) {
                AnonymousClass0YG.A01(colorStateList, drawable);
            }
            C86634Kw.A1O(this);
        }
    }

    public void A0S(ColorStateList colorStateList) {
        if (this.A0O != colorStateList) {
            this.A0O = colorStateList;
            if (this.A0m) {
                A07(colorStateList);
            }
            C86634Kw.A1O(this);
        }
    }

    public void A0T(ColorStateList colorStateList) {
        if (this.A0Q != colorStateList) {
            this.A0Q = colorStateList;
            if (A0f()) {
                AnonymousClass0YG.A01(colorStateList, this.A0Y);
            }
            C86634Kw.A1O(this);
        }
    }

    public void A0V(Drawable drawable) {
        if (this.A0W != drawable) {
            float A0E2 = A0E();
            this.A0W = drawable;
            float A0E3 = A0E();
            C86644Kx.A0q(this.A0W);
            A0Y(this.A0W);
            invalidateSelf();
            if (A0E2 != A0E3) {
                A0H();
            }
        }
    }

    public void A0W(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0X;
        if (drawable3 == null) {
            drawable3 = null;
        } else if (drawable3 instanceof C15750rs) {
            drawable3 = ((AnonymousClass01J) ((C15750rs) drawable3)).A02;
        }
        if (drawable3 != drawable) {
            float A0E2 = A0E();
            if (drawable != null) {
                drawable2 = C86634Kw.A0G(drawable);
            } else {
                drawable2 = null;
            }
            this.A0X = drawable2;
            float A0E3 = A0E();
            C86644Kx.A0q(drawable3);
            if (A0e()) {
                A0Y(this.A0X);
            }
            invalidateSelf();
            if (A0E2 != A0E3) {
                A0H();
            }
        }
    }

    public void A0X(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0Y;
        if (drawable3 == null) {
            drawable3 = null;
        } else if (drawable3 instanceof C15750rs) {
            drawable3 = ((AnonymousClass01J) ((C15750rs) drawable3)).A02;
        }
        if (drawable3 != drawable) {
            float A0F2 = A0F();
            if (drawable != null) {
                drawable2 = C86634Kw.A0G(drawable);
            } else {
                drawable2 = null;
            }
            this.A0Y = drawable2;
            this.A0Z = new RippleDrawable(C106925aO.A02(this.A0R), this.A0Y, A0w);
            float A0F3 = A0F();
            C86644Kx.A0q(drawable3);
            if (A0f()) {
                A0Y(this.A0Y);
            }
            invalidateSelf();
            if (A0F2 != A0F3) {
                A0H();
            }
        }
    }

    public final void A0Y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C06130Wj.A03(C06130Wj.A00(this), drawable);
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.A0Y) {
                if (drawable.isStateful()) {
                    drawable.setState(this.A0o);
                }
                AnonymousClass0YG.A01(this.A0Q, drawable);
                return;
            }
            Drawable drawable2 = this.A0X;
            if (drawable == drawable2 && this.A0l) {
                AnonymousClass0YG.A01(this.A0N, drawable2);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public void A0Z(boolean z) {
        if (this.A0g != z) {
            this.A0g = z;
            float A0E2 = A0E();
            if (!z && this.A0k) {
                this.A0k = false;
            }
            float A0E3 = A0E();
            invalidateSelf();
            if (A0E2 != A0E3) {
                A0H();
            }
        }
    }

    public void A0a(boolean z) {
        if (this.A0h != z) {
            boolean A0d2 = A0d();
            this.A0h = z;
            boolean A0d3 = A0d();
            if (A0d2 != A0d3) {
                Drawable drawable = this.A0W;
                if (A0d3) {
                    A0Y(drawable);
                } else {
                    C86644Kx.A0q(drawable);
                }
                invalidateSelf();
                A0H();
            }
        }
    }

    public void A0b(boolean z) {
        if (this.A0i != z) {
            boolean A0e2 = A0e();
            this.A0i = z;
            boolean A0e3 = A0e();
            if (A0e2 != A0e3) {
                Drawable drawable = this.A0X;
                if (A0e3) {
                    A0Y(drawable);
                } else {
                    C86644Kx.A0q(drawable);
                }
                invalidateSelf();
                A0H();
            }
        }
    }

    public void A0c(boolean z) {
        if (this.A0j != z) {
            boolean A0f2 = A0f();
            this.A0j = z;
            boolean A0f3 = A0f();
            if (A0f2 != A0f3) {
                Drawable drawable = this.A0Y;
                if (A0f3) {
                    A0Y(drawable);
                } else {
                    C86644Kx.A0q(drawable);
                }
                invalidateSelf();
                A0H();
            }
        }
    }

    public final boolean A0d() {
        if (!this.A0h || this.A0W == null || !this.A0k) {
            return false;
        }
        return true;
    }

    public final boolean A0e() {
        if (!this.A0i || this.A0X == null) {
            return false;
        }
        return true;
    }

    public final boolean A0f() {
        if (!this.A0j || this.A0Y == null) {
            return false;
        }
        return true;
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        float f;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.A0D) != 0) {
            Canvas canvas2 = canvas;
            if (i < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i2 = canvas2.saveLayerAlpha(f2, f3, f4, f5, i);
                } else {
                    i2 = canvas2.saveLayerAlpha(f2, f3, f4, f5, i, 31);
                }
            } else {
                i2 = 0;
            }
            if (!this.A0m) {
                Paint paint = this.A0r;
                C86604Kt.A0u(this.A0G, paint);
                RectF rectF = this.A0u;
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, A0G(), A0G(), paint);
            }
            if (!this.A0m) {
                Paint paint2 = this.A0r;
                C86604Kt.A0u(this.A0E, paint2);
                ColorFilter colorFilter = this.A0T;
                if (colorFilter == null) {
                    colorFilter = this.A0V;
                }
                paint2.setColorFilter(colorFilter);
                RectF rectF2 = this.A0u;
                rectF2.set(bounds);
                canvas2.drawRoundRect(rectF2, A0G(), A0G(), paint2);
            }
            if (this.A0m) {
                super.draw(canvas2);
            }
            if (this.A05 > 0.0f && !this.A0m) {
                Paint paint3 = this.A0r;
                C86624Kv.A0e(this.A0F, paint3);
                if (!this.A0m) {
                    ColorFilter colorFilter2 = this.A0T;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.A0V;
                    }
                    paint3.setColorFilter(colorFilter2);
                }
                RectF rectF3 = this.A0u;
                float f6 = this.A05 / 2.0f;
                rectF3.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.A00 - (this.A05 / 2.0f);
                canvas2.drawRoundRect(rectF3, f7, f7, paint3);
            }
            Paint paint4 = this.A0r;
            C86604Kt.A0u(0, paint4);
            RectF rectF4 = this.A0u;
            rectF4.set(bounds);
            if (!this.A0m) {
                canvas2.drawRoundRect(rectF4, A0G(), A0G(), paint4);
            } else {
                RectF rectF5 = new RectF(bounds);
                Path path = this.A0s;
                AnonymousClass7XF r13 = this.A0J;
                AnonymousClass6Cs r0 = this.A03;
                r13.A00(path, rectF5, r0.A0K, this.A0I, r0.A01);
                RectF rectF6 = this.A0E;
                rectF6.set(getBounds());
                A0A(canvas2, paint4, path, rectF6, this.A03.A0K);
            }
            if (A0e()) {
                A0U(bounds, rectF4);
                float f8 = rectF4.left;
                float f9 = rectF4.top;
                canvas2.translate(f8, f9);
                this.A0X.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0X.draw(canvas2);
                canvas2.translate(-f8, -f9);
            }
            if (A0d()) {
                A0U(bounds, rectF4);
                float f10 = rectF4.left;
                float f11 = rectF4.top;
                canvas2.translate(f10, f11);
                this.A0W.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0W.draw(canvas2);
                canvas2.translate(-f10, -f11);
            }
            if (this.A0n && this.A0e != null) {
                PointF pointF = this.A0t;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.A0e != null) {
                    float A0E2 = this.A04 + A0E() + this.A0C;
                    if (C06130Wj.A00(this) == 0) {
                        pointF.x = ((float) bounds.left) + A0E2;
                    } else {
                        pointF.x = ((float) bounds.right) - A0E2;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = (float) bounds.centerY();
                    TextPaint textPaint = this.A0v.A04;
                    Paint.FontMetrics fontMetrics = this.A0q;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF4.setEmpty();
                if (this.A0e != null) {
                    float A0E3 = this.A04 + A0E() + this.A0C;
                    float A0F2 = this.A01 + A0F() + this.A0B;
                    int A002 = C06130Wj.A00(this);
                    float f12 = (float) bounds.left;
                    if (A002 == 0) {
                        rectF4.left = f12 + A0E3;
                        f = ((float) bounds.right) - A0F2;
                    } else {
                        rectF4.left = f12 + A0F2;
                        f = ((float) bounds.right) - A0E3;
                    }
                    rectF4.right = f;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                C151957Wy r10 = this.A0v;
                if (r10.A01 != null) {
                    TextPaint textPaint2 = r10.A04;
                    textPaint2.drawableState = getState();
                    r10.A01.A03(this.A0p, textPaint2, r10.A05);
                }
                TextPaint textPaint3 = r10.A04;
                textPaint3.setTextAlign(align);
                int round = Math.round(r10.A00(this.A0e.toString()));
                int i3 = 0;
                boolean z = false;
                if (round > Math.round(rectF4.width())) {
                    z = true;
                    i3 = canvas2.save();
                    canvas2.clipRect(rectF4);
                }
                CharSequence charSequence = this.A0e;
                if (z && this.A0a != null) {
                    charSequence = TextUtils.ellipsize(charSequence, textPaint3, rectF4.width(), this.A0a);
                }
                canvas2.drawText(charSequence, 0, charSequence.length(), pointF.x, pointF.y, textPaint3);
                if (z) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (A0f()) {
                rectF4.setEmpty();
                if (A0f()) {
                    float f13 = this.A01 + this.A06;
                    if (C06130Wj.A00(this) == 0) {
                        float f14 = ((float) bounds.right) - f13;
                        rectF4.right = f14;
                        rectF4.left = f14 - this.A07;
                    } else {
                        float f15 = ((float) bounds.left) + f13;
                        rectF4.left = f15;
                        rectF4.right = f15 + this.A07;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f16 = this.A07;
                    float f17 = exactCenterY - (f16 / 2.0f);
                    rectF4.top = f17;
                    rectF4.bottom = f17 + f16;
                }
                float f18 = rectF4.left;
                float f19 = rectF4.top;
                canvas2.translate(f18, f19);
                this.A0Y.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0Z.setBounds(this.A0Y.getBounds());
                this.A0Z.jumpToCurrentState();
                this.A0Z.draw(canvas2);
                canvas2.translate(-f18, -f19);
            }
            if (this.A0D < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    public int getAlpha() {
        return this.A0D;
    }

    public ColorFilter getColorFilter() {
        return this.A0T;
    }

    public int getIntrinsicHeight() {
        return (int) this.A03;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.A04 + A0E() + this.A0C + this.A0v.A00(this.A0e.toString()) + this.A0B + A0F() + this.A01), this.A0K);
    }

    public void getOutline(Outline outline) {
        Outline outline2 = outline;
        if (this.A0m) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A00);
        } else {
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A03, this.A00);
        }
        outline.setAlpha(((float) this.A0D) / 255.0f);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A0P;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A0M;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A0O;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        C153517bS r0 = this.A0v.A01;
        if (r0 != null && (colorStateList = r0.A01) != null && colorStateList.isStateful()) {
            return true;
        }
        if (this.A0h && this.A0W != null && this.A0g) {
            return true;
        }
        Drawable drawable = this.A0X;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        Drawable drawable2 = this.A0W;
        if (drawable2 != null && drawable2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList5 = this.A0S;
        if (colorStateList5 == null || !colorStateList5.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.A0m) {
            super.onStateChange(iArr);
        }
        return A0g(iArr, this.A0o);
    }

    public void setAlpha(int i) {
        if (this.A0D != i) {
            this.A0D = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.A0T != colorFilter) {
            this.A0T = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.A0S != colorStateList) {
            this.A0S = colorStateList;
            C86634Kw.A1O(this);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.A0U != mode) {
            this.A0U = mode;
            ColorStateList colorStateList = this.A0S;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.A0V = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public C88654aX(Context context, AttributeSet attributeSet, int i) {
        super(new C161877ql(C161877ql.A01(context, attributeSet, i, R.style.f12nameremoved)));
        A05(context);
        this.A0p = context;
        C151957Wy r1 = new C151957Wy(this);
        this.A0v = r1;
        this.A0e = "";
        r1.A04.density = C86604Kt.A00(context);
        int[] iArr = A0x;
        setState(iArr);
        if (!Arrays.equals(this.A0o, iArr)) {
            this.A0o = iArr;
            if (A0f()) {
                A0g(getState(), iArr);
            }
        }
        this.A0n = true;
        A0w.setTint(-1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0223  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C88654aX A00(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = 2132084523(0x7f15072b, float:1.9809219E38)
            X.4aX r2 = new X.4aX
            r8 = r14
            r11 = r15
            r2.<init>(r13, r14, r15)
            android.content.Context r7 = r2.A0p
            int[] r9 = X.C1463179t.A05
            r1 = 0
            int[] r10 = new int[r1]
            android.content.res.TypedArray r3 = X.C161837qd.A00(r7, r8, r9, r10, r11, r12)
            r0 = 37
            boolean r0 = r3.hasValue(r0)
            r2.A0m = r0
            r0 = 24
            android.content.res.ColorStateList r4 = X.C160917of.A00(r7, r3, r0)
            android.content.res.ColorStateList r0 = r2.A0P
            if (r0 == r4) goto L_0x002c
            r2.A0P = r4
            X.C86634Kw.A1O(r2)
        L_0x002c:
            r0 = 11
            android.content.res.ColorStateList r4 = X.C160917of.A00(r7, r3, r0)
            android.content.res.ColorStateList r0 = r2.A0M
            if (r0 == r4) goto L_0x003b
            r2.A0M = r4
            X.C86634Kw.A1O(r2)
        L_0x003b:
            r0 = 19
            r4 = 0
            float r5 = r3.getDimension(r0, r4)
            float r0 = r2.A03
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0050
            r2.A03 = r5
            r2.invalidateSelf()
            r2.A0H()
        L_0x0050:
            r5 = 12
            boolean r0 = r3.hasValue(r5)
            if (r0 == 0) goto L_0x005f
            float r0 = r3.getDimension(r5, r4)
            r2.A0I(r0)
        L_0x005f:
            r0 = 22
            android.content.res.ColorStateList r0 = X.C160917of.A00(r7, r3, r0)
            r2.A0S(r0)
            r0 = 23
            float r0 = r3.getDimension(r0, r4)
            r2.A0K(r0)
            r0 = 36
            android.content.res.ColorStateList r5 = X.C160917of.A00(r7, r3, r0)
            android.content.res.ColorStateList r0 = r2.A0R
            if (r0 == r5) goto L_0x0080
            r2.A0R = r5
            X.C86634Kw.A1O(r2)
        L_0x0080:
            r0 = 5
            java.lang.CharSequence r5 = r3.getText(r0)
            if (r5 != 0) goto L_0x0089
            java.lang.String r5 = ""
        L_0x0089:
            java.lang.CharSequence r0 = r2.A0e
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 != 0) goto L_0x009e
            r2.A0e = r5
            X.7Wy r5 = r2.A0v
            r0 = 1
            r5.A03 = r0
            r2.invalidateSelf()
            r2.A0H()
        L_0x009e:
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x0241
            int r0 = r3.getResourceId(r1, r1)
            if (r0 == 0) goto L_0x0241
            X.7bS r6 = new X.7bS
            r6.<init>(r7, r0)
        L_0x00af:
            r5 = 1
            float r0 = r6.A00
            float r0 = r3.getDimension(r5, r0)
            r6.A00 = r0
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r5 >= r0) goto L_0x00c5
            r0 = 2
            android.content.res.ColorStateList r0 = X.C160917of.A00(r7, r3, r0)
            r6.A01 = r0
        L_0x00c5:
            X.7Wy r0 = r2.A0v
            r0.A01(r7, r6)
            r0 = 3
            int r5 = r3.getInt(r0, r1)
            r0 = 1
            if (r5 == r0) goto L_0x023d
            r0 = 2
            if (r5 == r0) goto L_0x0239
            r0 = 3
            if (r5 != r0) goto L_0x00dc
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x00da:
            r2.A0a = r0
        L_0x00dc:
            r0 = 18
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0b(r0)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r14 == 0) goto L_0x0102
            java.lang.String r0 = "chipIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = "chipIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x0102
            r0 = 15
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0b(r0)
        L_0x0102:
            r0 = 14
            android.graphics.drawable.Drawable r0 = X.C160917of.A02(r7, r3, r0)
            r2.A0W(r0)
            r6 = 17
            boolean r0 = r3.hasValue(r6)
            if (r0 == 0) goto L_0x011a
            android.content.res.ColorStateList r0 = X.C160917of.A00(r7, r3, r6)
            r2.A0R(r0)
        L_0x011a:
            r6 = 16
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r3.getDimension(r6, r0)
            r2.A0J(r0)
            r0 = 31
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0c(r0)
            if (r14 == 0) goto L_0x0149
            java.lang.String r0 = "closeIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = "closeIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x0149
            r0 = 26
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0c(r0)
        L_0x0149:
            r0 = 25
            android.graphics.drawable.Drawable r0 = X.C160917of.A02(r7, r3, r0)
            r2.A0X(r0)
            r0 = 30
            android.content.res.ColorStateList r0 = X.C160917of.A00(r7, r3, r0)
            r2.A0T(r0)
            r0 = 28
            float r0 = r3.getDimension(r0, r4)
            r2.A0M(r0)
            r0 = 6
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0Z(r0)
            r0 = 10
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0a(r0)
            if (r14 == 0) goto L_0x0190
            java.lang.String r0 = "checkedIconEnabled"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = "checkedIconVisible"
            java.lang.String r0 = r14.getAttributeValue(r5, r0)
            if (r0 != 0) goto L_0x0190
            r0 = 8
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0a(r0)
        L_0x0190:
            r0 = 7
            android.graphics.drawable.Drawable r0 = X.C160917of.A02(r7, r3, r0)
            r2.A0V(r0)
            r1 = 9
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x01a7
            android.content.res.ColorStateList r0 = X.C160917of.A00(r7, r3, r1)
            r2.A0Q(r0)
        L_0x01a7:
            r0 = 39
            X.7pZ r0 = X.C161407pZ.A01(r7, r3, r0)
            r2.A0c = r0
            r0 = 33
            X.7pZ r0 = X.C161407pZ.A01(r7, r3, r0)
            r2.A0b = r0
            r0 = 21
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01cb
            r2.A04 = r1
            r2.invalidateSelf()
            r2.A0H()
        L_0x01cb:
            r0 = 35
            float r0 = r3.getDimension(r0, r4)
            r2.A0P(r0)
            r0 = 34
            float r0 = r3.getDimension(r0, r4)
            r2.A0O(r0)
            r0 = 41
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A0C
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01f1
            r2.A0C = r1
            r2.invalidateSelf()
            r2.A0H()
        L_0x01f1:
            r0 = 40
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A0B
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0205
            r2.A0B = r1
            r2.invalidateSelf()
            r2.A0H()
        L_0x0205:
            r0 = 29
            float r0 = r3.getDimension(r0, r4)
            r2.A0N(r0)
            r0 = 27
            float r0 = r3.getDimension(r0, r4)
            r2.A0L(r0)
            r0 = 13
            float r1 = r3.getDimension(r0, r4)
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x022b
            r2.A01 = r1
            r2.invalidateSelf()
            r2.A0H()
        L_0x022b:
            r1 = 4
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r3.getDimensionPixelSize(r1, r0)
            r2.A0K = r0
            r3.recycle()
            return r2
        L_0x0239:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00da
        L_0x023d:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x00da
        L_0x0241:
            r6 = 0
            goto L_0x00af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88654aX.A00(android.content.Context, android.util.AttributeSet, int):X.4aX");
    }

    public float A0E() {
        Drawable drawable;
        if (!A0e() && !A0d()) {
            return 0.0f;
        }
        float f = this.A0A;
        if (this.A0k) {
            drawable = this.A0W;
        } else {
            drawable = this.A0X;
        }
        float f2 = this.A02;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f + f2 + this.A09;
    }

    public float A0F() {
        if (A0f()) {
            return this.A08 + this.A07 + this.A06;
        }
        return 0.0f;
    }

    public final void A0U(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (A0e() || A0d()) {
            float f = this.A04 + this.A0A;
            if (this.A0k) {
                drawable = this.A0W;
            } else {
                drawable = this.A0X;
            }
            float f2 = this.A02;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (C06130Wj.A00(this) == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.A0k) {
                drawable2 = this.A0W;
            } else {
                drawable2 = this.A0X;
            }
            float f5 = this.A02;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) C159337lf.A00(this.A0p, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r8.A0g == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        if (r1 != A0E()) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0g(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r7 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.A0P
            r4 = 0
            if (r1 == 0) goto L_0x013c
            int r0 = r8.A0G
            int r0 = r1.getColorForState(r9, r0)
        L_0x000f:
            int r2 = r8.A02(r0)
            int r0 = r8.A0G
            r6 = 1
            if (r0 == r2) goto L_0x001b
            r8.A0G = r2
            r7 = 1
        L_0x001b:
            android.content.res.ColorStateList r1 = r8.A0M
            if (r1 == 0) goto L_0x0139
            int r0 = r8.A0E
            int r0 = r1.getColorForState(r9, r0)
        L_0x0025:
            int r1 = r8.A02(r0)
            int r0 = r8.A0E
            if (r0 == r1) goto L_0x0030
            r8.A0E = r1
            r7 = 1
        L_0x0030:
            int r2 = X.AnonymousClass0YI.A05(r1, r2)
            int r0 = r8.A0H
            boolean r1 = X.AnonymousClass001.A1X(r0, r2)
            X.6Cs r0 = r8.A03
            android.content.res.ColorStateList r0 = r0.A0B
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r1 = r1 | r0
            if (r1 == 0) goto L_0x004f
            r8.A0H = r2
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r2)
            r8.A06(r0)
            r7 = 1
        L_0x004f:
            android.content.res.ColorStateList r1 = r8.A0O
            if (r1 == 0) goto L_0x0136
            int r0 = r8.A0F
            int r1 = r1.getColorForState(r9, r0)
        L_0x0059:
            int r0 = r8.A0F
            if (r0 == r1) goto L_0x0060
            r8.A0F = r1
            r7 = 1
        L_0x0060:
            X.7Wy r0 = r8.A0v
            X.7bS r0 = r0.A01
            if (r0 == 0) goto L_0x0133
            android.content.res.ColorStateList r1 = r0.A01
            if (r1 == 0) goto L_0x0133
            int r0 = r8.A0I
            int r1 = r1.getColorForState(r9, r0)
        L_0x0070:
            int r0 = r8.A0I
            if (r0 == r1) goto L_0x0077
            r8.A0I = r1
            r7 = 1
        L_0x0077:
            int[] r5 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r5 == 0) goto L_0x008d
            int r2 = r5.length
            r1 = 0
        L_0x0082:
            if (r1 >= r2) goto L_0x008d
            r0 = r5[r1]
            if (r0 != r3) goto L_0x012f
            boolean r0 = r8.A0g
            r2 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            boolean r0 = r8.A0k
            if (r0 == r2) goto L_0x00a6
            android.graphics.drawable.Drawable r0 = r8.A0W
            if (r0 == 0) goto L_0x00a6
            float r1 = r8.A0E()
            r8.A0k = r2
            float r0 = r8.A0E()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r7 = 1
            r5 = 1
            if (r0 != 0) goto L_0x00a7
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            android.content.res.ColorStateList r1 = r8.A0S
            if (r1 == 0) goto L_0x012d
            int r0 = r8.A0J
            int r1 = r1.getColorForState(r9, r0)
        L_0x00b1:
            int r0 = r8.A0J
            if (r0 == r1) goto L_0x012b
            r8.A0J = r1
            android.content.res.ColorStateList r1 = r8.A0S
            android.graphics.PorterDuff$Mode r2 = r8.A0U
            if (r1 == 0) goto L_0x0129
            if (r2 == 0) goto L_0x0129
            int[] r0 = r8.getState()
            int r0 = r1.getColorForState(r0, r4)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r2)
        L_0x00cc:
            r8.A0V = r1
        L_0x00ce:
            android.graphics.drawable.Drawable r0 = r8.A0X
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00df
            android.graphics.drawable.Drawable r0 = r8.A0X
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00df:
            android.graphics.drawable.Drawable r0 = r8.A0W
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00f0
            android.graphics.drawable.Drawable r0 = r8.A0W
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00f0:
            android.graphics.drawable.Drawable r0 = r8.A0Y
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x010d
            int r3 = r9.length
            int r2 = r10.length
            int r0 = r3 + r2
            int[] r1 = new int[r0]
            java.lang.System.arraycopy(r9, r4, r1, r4, r3)
            java.lang.System.arraycopy(r10, r4, r1, r3, r2)
            android.graphics.drawable.Drawable r0 = r8.A0Y
            boolean r0 = r0.setState(r1)
            r6 = r6 | r0
        L_0x010d:
            android.graphics.drawable.Drawable r0 = r8.A0Z
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x011e
            android.graphics.drawable.Drawable r0 = r8.A0Z
            boolean r0 = r0.setState(r10)
            r6 = r6 | r0
        L_0x011e:
            if (r6 == 0) goto L_0x0123
            r8.invalidateSelf()
        L_0x0123:
            if (r5 == 0) goto L_0x0128
            r8.A0H()
        L_0x0128:
            return r6
        L_0x0129:
            r1 = 0
            goto L_0x00cc
        L_0x012b:
            r6 = r7
            goto L_0x00ce
        L_0x012d:
            r1 = 0
            goto L_0x00b1
        L_0x012f:
            int r1 = r1 + 1
            goto L_0x0082
        L_0x0133:
            r1 = 0
            goto L_0x0070
        L_0x0136:
            r1 = 0
            goto L_0x0059
        L_0x0139:
            r0 = 0
            goto L_0x0025
        L_0x013c:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88654aX.A0g(int[], int[]):boolean");
    }

    public void Bdz() {
        A0H();
        invalidateSelf();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (A0e()) {
            onLayoutDirectionChanged |= C06130Wj.A03(i, this.A0X);
        }
        if (A0d()) {
            onLayoutDirectionChanged |= C06130Wj.A03(i, this.A0W);
        }
        if (A0f()) {
            onLayoutDirectionChanged |= C06130Wj.A03(i, this.A0Y);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (A0e()) {
            onLevelChange |= this.A0X.setLevel(i);
        }
        if (A0d()) {
            onLevelChange |= this.A0W.setLevel(i);
        }
        if (A0f()) {
            onLevelChange |= this.A0Y.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (A0e()) {
            visible |= this.A0X.setVisible(z, z2);
        }
        if (A0d()) {
            visible |= this.A0W.setVisible(z, z2);
        }
        if (A0f()) {
            visible |= this.A0Y.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
