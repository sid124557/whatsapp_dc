package X;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* renamed from: X.7lI  reason: invalid class name and case insensitive filesystem */
public final class C159177lI {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07 = 15.0f;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public float A0N;
    public float A0O = 15.0f;
    public float A0P;
    public float A0Q;
    public float A0R = 0.0f;
    public float A0S = 1.0f;
    public float A0T;
    public int A0U = 16;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y = 16;
    public int A0Z = C157747io.A0F;
    public int A0a = 1;
    public TimeInterpolator A0b;
    public TimeInterpolator A0c;
    public ColorStateList A0d;
    public ColorStateList A0e;
    public ColorStateList A0f;
    public ColorStateList A0g;
    public Typeface A0h;
    public Typeface A0i;
    public Typeface A0j;
    public Typeface A0k;
    public Typeface A0l;
    public Typeface A0m;
    public Typeface A0n;
    public StaticLayout A0o;
    public TextUtils.TruncateAt A0p = TextUtils.TruncateAt.END;
    public C178858iD A0q;
    public AnonymousClass6Z8 A0r;
    public AnonymousClass6Z8 A0s;
    public CharSequence A0t;
    public CharSequence A0u;
    public CharSequence A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z = true;
    public int[] A10;
    public final Rect A11;
    public final Rect A12;
    public final RectF A13;
    public final TextPaint A14;
    public final TextPaint A15;
    public final View A16;

    public final int A02(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.A10;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public void A04(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.A0I) {
            this.A0I = f;
            A03();
        }
    }

    public static int A00(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), Math.round((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), Math.round((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), Math.round((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    public float A01() {
        TextPaint textPaint = this.A15;
        textPaint.setTextSize(this.A07);
        textPaint.setTypeface(this.A0h);
        textPaint.setLetterSpacing(this.A02);
        return -textPaint.ascent();
    }

    public final void A03() {
        View view;
        float f;
        int A022;
        float A002;
        Rect rect;
        float f2 = this.A0I;
        float f3 = f2;
        boolean z = this.A0x;
        RectF rectF = this.A13;
        if (z) {
            if (f2 < this.A0Q) {
                rect = this.A12;
            } else {
                rect = this.A11;
            }
            rectF.set(rect);
        } else {
            Rect rect2 = this.A12;
            float f4 = (float) rect2.left;
            Rect rect3 = this.A11;
            float f5 = (float) rect3.left;
            TimeInterpolator timeInterpolator = this.A0b;
            float f6 = f2;
            if (timeInterpolator != null) {
                f6 = timeInterpolator.getInterpolation(f2);
            }
            rectF.left = AnonymousClass001.A00(f5, f4, f6);
            float f7 = this.A0H;
            float f8 = this.A01;
            TimeInterpolator timeInterpolator2 = this.A0b;
            float f9 = f2;
            if (timeInterpolator2 != null) {
                f9 = timeInterpolator2.getInterpolation(f2);
            }
            rectF.top = AnonymousClass001.A00(f8, f7, f9);
            float f10 = (float) rect2.right;
            float f11 = (float) rect3.right;
            TimeInterpolator timeInterpolator3 = this.A0b;
            float f12 = f2;
            if (timeInterpolator3 != null) {
                f12 = timeInterpolator3.getInterpolation(f2);
            }
            rectF.right = AnonymousClass001.A00(f11, f10, f12);
            float f13 = (float) rect2.bottom;
            float f14 = (float) rect3.bottom;
            TimeInterpolator timeInterpolator4 = this.A0b;
            if (timeInterpolator4 != null) {
                f3 = timeInterpolator4.getInterpolation(f2);
            }
            rectF.bottom = AnonymousClass001.A00(f14, f13, f3);
        }
        if (!this.A0x) {
            float f15 = this.A0G;
            float f16 = this.A00;
            TimeInterpolator timeInterpolator5 = this.A0b;
            float f17 = f2;
            if (timeInterpolator5 != null) {
                f17 = timeInterpolator5.getInterpolation(f2);
            }
            this.A09 = AnonymousClass001.A00(f16, f15, f17);
            float f18 = this.A0H;
            float f19 = this.A01;
            TimeInterpolator timeInterpolator6 = this.A0b;
            float f20 = f2;
            if (timeInterpolator6 != null) {
                f20 = timeInterpolator6.getInterpolation(f2);
            }
            this.A0A = AnonymousClass001.A00(f19, f18, f20);
            A05(f2, false);
            view = this.A16;
            AnonymousClass0YY.A05(view);
            f = f2;
        } else if (f2 < this.A0Q) {
            this.A09 = this.A0G;
            this.A0A = this.A0H;
            A05(0.0f, false);
            view = this.A16;
            AnonymousClass0YY.A05(view);
            f = 0.0f;
        } else {
            this.A09 = this.A00;
            this.A0A = this.A01 - ((float) Math.max(0, this.A0V));
            A05(1.0f, false);
            view = this.A16;
            AnonymousClass0YY.A05(view);
            f = 1.0f;
        }
        TimeInterpolator timeInterpolator7 = C159917mg.A02;
        this.A06 = 1.0f - AnonymousClass001.A00(1.0f, 0.0f, timeInterpolator7.getInterpolation(1.0f - f2));
        AnonymousClass0YY.A05(view);
        this.A0N = AnonymousClass001.A00(0.0f, 1.0f, timeInterpolator7.getInterpolation(f2));
        AnonymousClass0YY.A05(view);
        ColorStateList colorStateList = this.A0e;
        ColorStateList colorStateList2 = this.A0g;
        TextPaint textPaint = this.A14;
        if (colorStateList != colorStateList2) {
            A022 = A00(f, A02(colorStateList2), A02(this.A0e));
        } else {
            A022 = A02(colorStateList);
        }
        textPaint.setColor(A022);
        float f21 = this.A02;
        float f22 = this.A0J;
        if (f21 != f22) {
            f21 = AnonymousClass001.A00(f21, f22, timeInterpolator7.getInterpolation(f2));
        }
        textPaint.setLetterSpacing(f21);
        this.A0E = AnonymousClass001.A00(this.A05, this.A0M, f2);
        this.A0C = AnonymousClass001.A00(this.A03, this.A0K, f2);
        this.A0D = AnonymousClass001.A00(this.A04, this.A0L, f2);
        int A003 = A00(f2, A02(this.A0f), A02(this.A0d));
        this.A0W = A003;
        textPaint.setShadowLayer(this.A0E, this.A0C, this.A0D, A003);
        if (this.A0x) {
            int alpha = textPaint.getAlpha();
            float f23 = this.A0Q;
            if (f2 <= f23) {
                A002 = C159917mg.A00(1.0f, 0.0f, this.A0P, f23, f2);
            } else {
                A002 = C159917mg.A00(0.0f, 1.0f, f23, 1.0f, f2);
            }
            textPaint.setAlpha((int) (A002 * ((float) alpha)));
        }
        AnonymousClass0YY.A05(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r1 == 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r12.A0w != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(float r13, boolean r14) {
        /*
            r12 = this;
            java.lang.CharSequence r0 = r12.A0t
            if (r0 == 0) goto L_0x0155
            android.graphics.Rect r0 = r12.A11
            int r0 = r0.width()
            float r4 = (float) r0
            android.graphics.Rect r0 = r12.A12
            int r0 = r0.width()
            float r5 = (float) r0
            r8 = 1065353216(0x3f800000, float:1.0)
            float r1 = X.AnonymousClass002.A00(r13, r8)
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r7 = 0
            if (r0 == 0) goto L_0x00bc
            float r6 = r12.A07
            float r3 = r12.A02
            r12.A0T = r8
            android.graphics.Typeface r2 = r12.A0h
        L_0x002c:
            r5 = 1
            r9 = 0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            float r0 = r12.A0F
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            boolean r11 = X.AnonymousClass000.A1S(r0)
            float r0 = r12.A0B
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r10 = X.AnonymousClass000.A1S(r0)
            android.graphics.Typeface r0 = r12.A0k
            boolean r7 = X.C18300x5.A1W(r0, r2)
            android.text.StaticLayout r0 = r12.A0o
            if (r0 == 0) goto L_0x0056
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 1
            if (r1 != 0) goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r11 != 0) goto L_0x0064
            if (r10 != 0) goto L_0x0064
            if (r0 != 0) goto L_0x0064
            if (r7 != 0) goto L_0x0064
            boolean r0 = r12.A0w
            r7 = 0
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r7 = 1
        L_0x0065:
            r12.A0F = r6
            r12.A0B = r3
            r12.A0k = r2
            r12.A0w = r9
            android.text.TextPaint r1 = r12.A14
            float r0 = r12.A0T
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            r9 = 1
        L_0x0076:
            r1.setLinearText(r9)
            r9 = r7
        L_0x007a:
            java.lang.CharSequence r0 = r12.A0u
            if (r0 == 0) goto L_0x0080
            if (r9 == 0) goto L_0x0155
        L_0x0080:
            android.text.TextPaint r7 = r12.A14
            float r0 = r12.A0F
            r7.setTextSize(r0)
            android.graphics.Typeface r0 = r12.A0k
            r7.setTypeface(r0)
            float r0 = r12.A0B
            r7.setLetterSpacing(r0)
            java.lang.CharSequence r3 = r12.A0t
            android.view.View r0 = r12.A16
            boolean r6 = X.AnonymousClass0YH.A08(r0)
            boolean r0 = r12.A0z
            if (r0 == 0) goto L_0x00aa
            if (r6 == 0) goto L_0x00b9
            X.0ru r2 = X.AnonymousClass0K7.A02
        L_0x00a1:
            int r1 = r3.length()
            r0 = 0
            boolean r6 = r2.BIl(r3, r0, r1)
        L_0x00aa:
            r12.A0y = r6
            int r1 = r12.A0a
            if (r1 <= r5) goto L_0x0114
            if (r6 == 0) goto L_0x00b6
            boolean r0 = r12.A0x
            if (r0 == 0) goto L_0x0114
        L_0x00b6:
            r5 = r1
            r1 = 1
            goto L_0x00f9
        L_0x00b9:
            X.0ru r2 = X.AnonymousClass0K7.A01
            goto L_0x00a1
        L_0x00bc:
            float r6 = r12.A0O
            r9 = r6
            float r3 = r12.A0J
            android.graphics.Typeface r2 = r12.A0l
            float r1 = X.AnonymousClass002.A00(r13, r7)
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e2
            r12.A0T = r8
        L_0x00d0:
            float r1 = r12.A07
            float r1 = r1 / r9
            float r0 = r5 * r1
            if (r14 != 0) goto L_0x00f6
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f6
            float r4 = r4 / r1
            float r4 = java.lang.Math.min(r4, r5)
            goto L_0x002c
        L_0x00e2:
            float r1 = r12.A07
            android.animation.TimeInterpolator r0 = r12.A0c
            if (r0 == 0) goto L_0x00ec
            float r13 = r0.getInterpolation(r13)
        L_0x00ec:
            float r0 = X.AnonymousClass001.A00(r1, r6, r13)
            float r9 = r12.A0O
            float r0 = r0 / r9
            r12.A0T = r0
            goto L_0x00d0
        L_0x00f6:
            r4 = r5
            goto L_0x002c
        L_0x00f9:
            int r0 = r12.A0Y     // Catch:{ 6yc -> 0x013f }
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r6)     // Catch:{ 6yc -> 0x013f }
            r2 = r0 & 7
            if (r2 == r1) goto L_0x0111
            r1 = 5
            boolean r0 = r12.A0y     // Catch:{ 6yc -> 0x013f }
            if (r2 == r1) goto L_0x010b
            if (r0 == 0) goto L_0x0117
            goto L_0x010e
        L_0x010b:
            if (r0 == 0) goto L_0x010e
            goto L_0x0117
        L_0x010e:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ 6yc -> 0x013f }
            goto L_0x0119
        L_0x0111:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ 6yc -> 0x013f }
            goto L_0x0119
        L_0x0114:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ 6yc -> 0x013f }
            goto L_0x0119
        L_0x0117:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ 6yc -> 0x013f }
        L_0x0119:
            java.lang.CharSequence r1 = r12.A0t     // Catch:{ 6yc -> 0x013f }
            int r0 = (int) r4     // Catch:{ 6yc -> 0x013f }
            X.7io r2 = new X.7io     // Catch:{ 6yc -> 0x013f }
            r2.<init>(r7, r1, r0)     // Catch:{ 6yc -> 0x013f }
            android.text.TextUtils$TruncateAt r0 = r12.A0p     // Catch:{ 6yc -> 0x013f }
            r2.A06 = r0     // Catch:{ 6yc -> 0x013f }
            r2.A09 = r6     // Catch:{ 6yc -> 0x013f }
            r2.A05 = r3     // Catch:{ 6yc -> 0x013f }
            r0 = 0
            r2.A08 = r0     // Catch:{ 6yc -> 0x013f }
            r2.A04 = r5     // Catch:{ 6yc -> 0x013f }
            float r1 = r12.A0R     // Catch:{ 6yc -> 0x013f }
            float r0 = r12.A0S     // Catch:{ 6yc -> 0x013f }
            r2.A00 = r1     // Catch:{ 6yc -> 0x013f }
            r2.A01 = r0     // Catch:{ 6yc -> 0x013f }
            int r0 = r12.A0Z     // Catch:{ 6yc -> 0x013f }
            r2.A03 = r0     // Catch:{ 6yc -> 0x013f }
            android.text.StaticLayout r0 = r2.A00()     // Catch:{ 6yc -> 0x013f }
            goto L_0x014a
        L_0x013f:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass6CA.A0U(r2)
            java.lang.String r0 = "CollapsingTextHelper"
            android.util.Log.e(r0, r1, r2)
            r0 = 0
        L_0x014a:
            r0.getClass()
            r12.A0o = r0
            java.lang.CharSequence r0 = r0.getText()
            r12.A0u = r0
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159177lI.A05(float, boolean):void");
    }

    public void A06(int i) {
        View view = this.A16;
        C153517bS r4 = new C153517bS(view.getContext(), i);
        ColorStateList colorStateList = r4.A01;
        if (colorStateList != null) {
            this.A0e = colorStateList;
        }
        float f = r4.A00;
        if (f != 0.0f) {
            this.A07 = f;
        }
        ColorStateList colorStateList2 = r4.A0B;
        if (colorStateList2 != null) {
            this.A0d = colorStateList2;
        }
        this.A03 = r4.A05;
        this.A04 = r4.A06;
        this.A05 = r4.A07;
        this.A02 = r4.A04;
        AnonymousClass6Z8 r1 = this.A0r;
        if (r1 != null) {
            r1.A00 = true;
        }
        AnonymousClass90G r2 = new AnonymousClass90G(this, 0);
        r4.A01();
        this.A0r = new AnonymousClass6Z8(r4.A02, r2);
        r4.A05(view.getContext(), this.A0r);
        A0B(false);
    }

    public void A07(int i) {
        if (this.A0U != i) {
            this.A0U = i;
            A0B(false);
        }
    }

    public void A08(int i) {
        View view = this.A16;
        C153517bS r3 = new C153517bS(view.getContext(), i);
        ColorStateList colorStateList = r3.A01;
        if (colorStateList != null) {
            this.A0g = colorStateList;
        }
        float f = r3.A00;
        if (f != 0.0f) {
            this.A0O = f;
        }
        ColorStateList colorStateList2 = r3.A0B;
        if (colorStateList2 != null) {
            this.A0f = colorStateList2;
        }
        this.A0K = r3.A05;
        this.A0L = r3.A06;
        this.A0M = r3.A07;
        this.A0J = r3.A04;
        AnonymousClass6Z8 r1 = this.A0s;
        if (r1 != null) {
            r1.A00 = true;
        }
        AnonymousClass90G r2 = new AnonymousClass90G(this, 1);
        r3.A01();
        this.A0s = new AnonymousClass6Z8(r3.A02, r2);
        r3.A05(view.getContext(), this.A0s);
        A0B(false);
    }

    public void A09(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.A0j;
            if (typeface != null) {
                this.A0i = C1446572k.A00(configuration, typeface);
            }
            Typeface typeface2 = this.A0n;
            if (typeface2 != null) {
                this.A0m = C1446572k.A00(configuration, typeface2);
            }
            Typeface typeface3 = this.A0i;
            if (typeface3 == null) {
                typeface3 = this.A0j;
            }
            this.A0h = typeface3;
            Typeface typeface4 = this.A0m;
            if (typeface4 == null) {
                typeface4 = this.A0n;
            }
            this.A0l = typeface4;
            A0B(true);
        }
    }

    public void A0A(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        if (this.A0u != null) {
            RectF rectF = this.A13;
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                TextPaint textPaint = this.A14;
                textPaint.setTextSize(this.A0F);
                float f = this.A09;
                float f2 = this.A0A;
                float f3 = this.A0T;
                if (f3 != 1.0f && !this.A0x) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if (this.A0a <= 1 || ((this.A0y && !this.A0x) || (this.A0x && this.A0I <= this.A0Q))) {
                    canvas2.translate(f, f2);
                    this.A0o.draw(canvas2);
                } else {
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(this.A09 - ((float) this.A0o.getLineStart(0)), f2);
                    float f4 = (float) alpha;
                    textPaint.setAlpha((int) (this.A0N * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = this.A0E;
                        float f6 = this.A0C;
                        float f7 = this.A0D;
                        int i2 = this.A0W;
                        textPaint.setShadowLayer(f5, f6, f7, AnonymousClass0YI.A06(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                    }
                    this.A0o.draw(canvas2);
                    textPaint.setAlpha((int) (this.A06 * f4));
                    if (i >= 31) {
                        float f8 = this.A0E;
                        float f9 = this.A0C;
                        float f10 = this.A0D;
                        int i3 = this.A0W;
                        textPaint.setShadowLayer(f8, f9, f10, AnonymousClass0YI.A06(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = this.A0o.getLineBaseline(0);
                    CharSequence charSequence = this.A0v;
                    float f11 = (float) lineBaseline;
                    TextPaint textPaint2 = textPaint;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint2);
                    if (i >= 31) {
                        textPaint.setShadowLayer(this.A0E, this.A0C, this.A0D, this.A0W);
                    }
                    if (!this.A0x) {
                        String trim = this.A0v.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        textPaint.setAlpha(alpha);
                        canvas2.drawText(trim, 0, Math.min(this.A0o.getLineEnd(0), trim.length()), 0.0f, f11, textPaint2);
                    }
                }
                canvas2.restoreToCount(save);
            }
        }
    }

    public void A0B(boolean z) {
        Rect rect;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        Rect rect2;
        float f6;
        float f7;
        float descent;
        StaticLayout staticLayout;
        View view = this.A16;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z) {
            A05(1.0f, z);
            CharSequence charSequence = this.A0u;
            if (!(charSequence == null || (staticLayout = this.A0o) == null)) {
                this.A0v = TextUtils.ellipsize(charSequence, this.A14, (float) staticLayout.getWidth(), this.A0p);
            }
            CharSequence charSequence2 = this.A0v;
            float f8 = 0.0f;
            if (charSequence2 != null) {
                this.A08 = this.A14.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.A08 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.A0U, this.A0y ? 1 : 0);
            int i2 = absoluteGravity & 112;
            if (i2 == 48) {
                rect = this.A11;
                f = (float) rect.top;
                this.A01 = f;
            } else if (i2 != 80) {
                TextPaint textPaint = this.A14;
                rect = this.A11;
                this.A01 = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                rect = this.A11;
                f = ((float) rect.bottom) + this.A14.ascent();
                this.A01 = f;
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 == 1) {
                f2 = (float) rect.centerX();
                f3 = this.A08 / 2.0f;
                f4 = f2 - f3;
            } else if (i3 != 5) {
                f4 = (float) rect.left;
            } else {
                f2 = (float) rect.right;
                f3 = this.A08;
                f4 = f2 - f3;
            }
            this.A00 = f4;
            A05(0.0f, z);
            StaticLayout staticLayout2 = this.A0o;
            if (staticLayout2 != null) {
                f5 = (float) staticLayout2.getHeight();
            } else {
                f5 = 0.0f;
            }
            StaticLayout staticLayout3 = this.A0o;
            if (staticLayout3 == null || this.A0a <= 1) {
                CharSequence charSequence3 = this.A0u;
                if (charSequence3 != null) {
                    f8 = this.A14.measureText(charSequence3, 0, charSequence3.length());
                }
            } else {
                f8 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.A0o;
            if (staticLayout4 != null) {
                i = staticLayout4.getLineCount();
            } else {
                i = 0;
            }
            this.A0X = i;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.A0Y, this.A0y ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            if (i4 != 48) {
                if (i4 != 80) {
                    rect2 = this.A12;
                    descent = ((float) rect2.centerY()) - (f5 / 2.0f);
                } else {
                    rect2 = this.A12;
                    descent = (((float) rect2.bottom) - f5) + this.A14.descent();
                }
                this.A0H = descent;
            } else {
                rect2 = this.A12;
                this.A0H = (float) rect2.top;
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 == 1) {
                f6 = (float) rect2.centerX();
                f8 /= 2.0f;
                f7 = f6 - f8;
            } else if (i5 != 5) {
                f7 = (float) rect2.left;
            } else {
                f6 = (float) rect2.right;
                f7 = f6 - f8;
            }
            this.A0G = f7;
            A05(this.A0I, false);
            AnonymousClass0YY.A05(view);
            A03();
        }
    }

    public final boolean A0C(Typeface typeface) {
        AnonymousClass6Z8 r1 = this.A0r;
        if (r1 != null) {
            r1.A00 = true;
        }
        if (this.A0j == typeface) {
            return false;
        }
        this.A0j = typeface;
        Typeface A002 = C1446572k.A00(C18290x4.A0G(this.A16).getConfiguration(), typeface);
        this.A0i = A002;
        if (A002 == null) {
            A002 = this.A0j;
        }
        this.A0h = A002;
        return true;
    }

    public final boolean A0D(Typeface typeface) {
        AnonymousClass6Z8 r1 = this.A0s;
        if (r1 != null) {
            r1.A00 = true;
        }
        if (this.A0n == typeface) {
            return false;
        }
        this.A0n = typeface;
        Typeface A002 = C1446572k.A00(C18290x4.A0G(this.A16).getConfiguration(), typeface);
        this.A0m = A002;
        if (A002 == null) {
            A002 = this.A0n;
        }
        this.A0l = A002;
        return true;
    }

    public C159177lI(View view) {
        this.A16 = view;
        TextPaint textPaint = new TextPaint(129);
        this.A14 = textPaint;
        this.A15 = new TextPaint(textPaint);
        this.A11 = AnonymousClass001.A0N();
        this.A12 = AnonymousClass001.A0N();
        this.A13 = AnonymousClass002.A07();
        float f = this.A0P;
        this.A0Q = f + ((1.0f - f) * 0.5f);
        A09(C18290x4.A0G(view).getConfiguration());
    }
}
