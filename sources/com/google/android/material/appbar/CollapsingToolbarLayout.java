package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0RP;
import X.AnonymousClass0V0;
import X.AnonymousClass0XY;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.AnonymousClass6FB;
import X.AnonymousClass7TO;
import X.C06130Wj;
import X.C06560Yg;
import X.C157567iW;
import X.C159177lI;
import X.C169948Bg;
import X.C187868xw;
import X.C187878xx;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.List;

public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public ValueAnimator A0C;
    public Drawable A0D;
    public Drawable A0E;
    public View A0F;
    public View A0G;
    public ViewGroup A0H;
    public AnonymousClass0XY A0I;
    public C187868xw A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final TimeInterpolator A0Q;
    public final TimeInterpolator A0R;
    public final Rect A0S;
    public final C157567iW A0T;
    public final C159177lI A0U;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4;
        super.onLayout(z, i, i2, i3, i5);
        AnonymousClass0XY r0 = this.A0I;
        if (r0 != null) {
            int A052 = r0.A05();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!AnonymousClass0YY.A0B(childAt) && childAt.getTop() < A052) {
                    C06560Yg.A0J(childAt, A052);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            AnonymousClass7TO A002 = A00(getChildAt(i7));
            View view = A002.A03;
            A002.A01 = view.getTop();
            A002.A00 = view.getLeft();
        }
        A05(i, i2, i3, i5, false);
        A04();
        A03();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            A00(getChildAt(i8)).A00();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight2;
        A01();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        AnonymousClass0XY r0 = this.A0I;
        if (r0 != null) {
            i3 = r0.A05();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.A0N) && i3 > 0) {
            this.A0A = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.A0M) {
            C159177lI r1 = this.A0U;
            if (r1.A0a > 1) {
                A04();
                A05(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i4 = r1.A0X;
                if (i4 > 1) {
                    TextPaint textPaint = r1.A15;
                    textPaint.setTextSize(r1.A0O);
                    textPaint.setTypeface(r1.A0l);
                    textPaint.setLetterSpacing(r1.A0J);
                    this.A05 = Math.round((-textPaint.ascent()) + textPaint.descent()) * (i4 - 1);
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.A05, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.A0H;
        if (viewGroup != null) {
            View view = this.A0G;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = viewGroup.getMeasuredHeight();
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                    setMinimumHeight(measuredHeight);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    measuredHeight2 = view.getMeasuredHeight();
                } else {
                    measuredHeight = view.getMeasuredHeight();
                    setMinimumHeight(measuredHeight);
                }
            }
            measuredHeight = measuredHeight2 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            setMinimumHeight(measuredHeight);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r6 = this;
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x0053
            r5 = 0
            r6.A0H = r5
            r6.A0G = r5
            int r1 = r6.A09
            r0 = -1
            if (r1 == r0) goto L_0x002e
            android.view.View r2 = r6.findViewById(r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6.A0H = r2
            if (r2 == 0) goto L_0x002e
            android.view.ViewParent r1 = r2.getParent()
        L_0x001c:
            if (r1 == r6) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0027
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x0027:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x001c
        L_0x002c:
            r6.A0G = r2
        L_0x002e:
            android.view.ViewGroup r0 = r6.A0H
            r4 = 0
            if (r0 != 0) goto L_0x004e
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x0038:
            if (r2 >= r3) goto L_0x004c
            android.view.View r1 = r6.getChildAt(r2)
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1 instanceof android.widget.Toolbar
            if (r0 != 0) goto L_0x0049
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0049:
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x004c:
            r6.A0H = r5
        L_0x004e:
            r6.A02()
            r6.A0O = r4
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A01():void");
    }

    public final void A02() {
        View view;
        if (!this.A0K && (view = this.A0F) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A0F);
            }
        }
        if (this.A0K && this.A0H != null) {
            View view2 = this.A0F;
            if (view2 == null) {
                view2 = new View(getContext());
                this.A0F = view2;
            }
            if (view2.getParent() == null) {
                this.A0H.addView(this.A0F, -1, -1);
            }
        }
    }

    public final void A03() {
        if (this.A0D != null || this.A0E != null) {
            setScrimsShown(AnonymousClass001.A1Y(getHeight() + this.A00, getScrimVisibleHeightTrigger()));
        }
    }

    public final void A04() {
        CharSequence charSequence;
        if (this.A0H != null && this.A0K && TextUtils.isEmpty(this.A0U.A0t)) {
            ViewGroup viewGroup = this.A0H;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).A0V;
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r15.A0F.getVisibility() != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            boolean r0 = r15.A0K
            if (r0 == 0) goto L_0x00b2
            android.view.View r0 = r15.A0F
            if (r0 == 0) goto L_0x00b2
            boolean r0 = X.C06360Xi.A04(r0)
            r14 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0019
            android.view.View r0 = r15.A0F
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r15.A0L = r0
            r2 = r20
            if (r0 != 0) goto L_0x0022
            if (r20 == 0) goto L_0x00b2
        L_0x0022:
            int r0 = X.AnonymousClass0YH.A01(r15)
            if (r0 != r7) goto L_0x0029
            r14 = 1
        L_0x0029:
            android.view.View r5 = r15.A0G
            if (r5 != 0) goto L_0x002f
            android.view.ViewGroup r5 = r15.A0H
        L_0x002f:
            X.7TO r0 = A00(r5)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r13 = r15.getHeight()
            int r0 = r0.A01
            int r13 = r13 - r0
            int r0 = r5.getHeight()
            int r13 = r13 - r0
            int r0 = r1.bottomMargin
            int r13 = r13 - r0
            android.view.View r0 = r15.A0F
            android.graphics.Rect r8 = r15.A0S
            X.C106295Yk.A01(r8, r0, r15)
            android.view.ViewGroup r6 = r15.A0H
            boolean r0 = r6 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L_0x00c6
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            int r12 = r6.A09
            int r5 = r6.A08
            int r9 = r6.A0A
            int r1 = r6.A07
        L_0x005f:
            X.7lI r6 = r15.A0U
            int r11 = r8.left
            r0 = r12
            if (r14 == 0) goto L_0x0067
            r0 = r5
        L_0x0067:
            int r11 = r11 + r0
            int r10 = r8.top
            int r10 = r10 + r13
            int r10 = r10 + r9
            int r9 = r8.right
            if (r14 != 0) goto L_0x0071
            r12 = r5
        L_0x0071:
            int r9 = r9 - r12
            int r5 = r8.bottom
            int r5 = r5 + r13
            int r5 = r5 - r1
            android.graphics.Rect r1 = r6.A11
            int r0 = r1.left
            if (r0 != r11) goto L_0x00c0
            int r0 = r1.top
            if (r0 != r10) goto L_0x00c0
            int r0 = r1.right
            if (r0 != r9) goto L_0x00c0
            int r0 = r1.bottom
            if (r0 != r5) goto L_0x00c0
        L_0x0088:
            if (r14 == 0) goto L_0x00bd
            int r7 = r15.A02
        L_0x008c:
            int r5 = r8.top
            int r0 = r15.A04
            int r5 = r5 + r0
            int r4 = r18 - r16
            if (r14 == 0) goto L_0x00ba
            int r0 = r15.A03
        L_0x0097:
            int r4 = r4 - r0
            int r3 = r19 - r17
            int r0 = r15.A01
            int r3 = r3 - r0
            android.graphics.Rect r1 = r6.A12
            int r0 = r1.left
            if (r0 != r7) goto L_0x00b3
            int r0 = r1.top
            if (r0 != r5) goto L_0x00b3
            int r0 = r1.right
            if (r0 != r4) goto L_0x00b3
            int r0 = r1.bottom
            if (r0 != r3) goto L_0x00b3
        L_0x00af:
            r6.A0B(r2)
        L_0x00b2:
            return
        L_0x00b3:
            r1.set(r7, r5, r4, r3)
            r0 = 1
            r6.A0w = r0
            goto L_0x00af
        L_0x00ba:
            int r0 = r15.A02
            goto L_0x0097
        L_0x00bd:
            int r7 = r15.A03
            goto L_0x008c
        L_0x00c0:
            r1.set(r11, r10, r9, r5)
            r6.A0w = r7
            goto L_0x0088
        L_0x00c6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x00e4
            boolean r0 = r6 instanceof android.widget.Toolbar
            if (r0 == 0) goto L_0x00e4
            android.widget.Toolbar r6 = (android.widget.Toolbar) r6
            int r12 = r6.getTitleMarginStart()
            int r5 = r6.getTitleMarginEnd()
            int r9 = r6.getTitleMarginTop()
            int r1 = r6.getTitleMarginBottom()
            goto L_0x005f
        L_0x00e4:
            r12 = 0
            r1 = 0
            r5 = 0
            r9 = 0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A05(int, int, int, int, boolean):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass6FB;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        Drawable drawable = this.A0D;
        if (drawable != null && this.A06 > 0) {
            View view2 = this.A0G;
            if (view2 == null || view2 == this) {
                view2 = this.A0H;
            }
            if (view == view2) {
                int width = getWidth();
                int height = getHeight();
                if (this.A08 == 1 && view != null && this.A0K) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width, height);
                this.A0D.mutate().setAlpha(this.A06);
                this.A0D.draw(canvas);
                z = true;
                if (super.drawChild(canvas, view, j) && !z) {
                    return false;
                }
            }
        }
        z = false;
        return super.drawChild(canvas, view, j) ? true : true;
    }

    public int getCollapsedTitleGravity() {
        return this.A0U.A0U;
    }

    public float getCollapsedTitleTextSize() {
        return this.A0U.A07;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0U.A0h;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public Drawable getContentScrim() {
        return this.A0D;
    }

    public int getExpandedTitleGravity() {
        return this.A0U.A0Y;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A01;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A02;
    }

    public int getExpandedTitleMarginStart() {
        return this.A03;
    }

    public int getExpandedTitleMarginTop() {
        return this.A04;
    }

    public float getExpandedTitleTextSize() {
        return this.A0U.A0O;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0U.A0l;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.A0U.A0Z;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.A0U.A0o;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.A0U.A0o.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.A0U.A0o.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.A0U.A0a;
    }

    public int getScrimAlpha() {
        return this.A06;
    }

    public long getScrimAnimationDuration() {
        return this.A0B;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.A07;
        if (i2 >= 0) {
            return i2 + this.A0A + this.A05;
        }
        AnonymousClass0XY r0 = this.A0I;
        if (r0 != null) {
            i = r0.A05();
        } else {
            i = 0;
        }
        int A012 = AnonymousClass0YY.A01(this);
        if (A012 > 0) {
            return Math.min((A012 * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.A0E;
    }

    public CharSequence getTitle() {
        if (this.A0K) {
            return this.A0U.A0t;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.A08;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.A0U.A0b;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.A0U.A0p;
    }

    public void setCollapsedTitleGravity(int i) {
        this.A0U.A07(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A0U.A06(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C159177lI r1 = this.A0U;
        if (r1.A0e != colorStateList) {
            r1.A0e = colorStateList;
            r1.A0B(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        C159177lI r1 = this.A0U;
        if (r1.A07 != f) {
            r1.A07 = f;
            r1.A0B(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C159177lI r1 = this.A0U;
        if (r1.A0C(typeface)) {
            r1.A0B(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0D;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0D = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.A0H;
                if (this.A08 == 1 && viewGroup != null && this.A0K) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.A0D.setCallback(this);
                this.A0D.setAlpha(this.A06);
            }
            AnonymousClass0YY.A05(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setExpandedTitleGravity(int i) {
        C159177lI r1 = this.A0U;
        if (r1.A0Y != i) {
            r1.A0Y = i;
            r1.A0B(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.A02 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.A03 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.A04 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A0U.A08(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C159177lI r1 = this.A0U;
        if (r1.A0g != colorStateList) {
            r1.A0g = colorStateList;
            r1.A0B(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        C159177lI r1 = this.A0U;
        if (r1.A0O != f) {
            r1.A0O = f;
            r1.A0B(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C159177lI r1 = this.A0U;
        if (r1.A0D(typeface)) {
            r1.A0B(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.A0M = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.A0N = z;
    }

    public void setHyphenationFrequency(int i) {
        this.A0U.A0Z = i;
    }

    public void setLineSpacingAdd(float f) {
        this.A0U.A0R = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.A0U.A0S = f;
    }

    public void setMaxLines(int i) {
        C159177lI r1 = this.A0U;
        if (i != r1.A0a) {
            r1.A0a = i;
            r1.A0B(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.A0U.A0z = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.A06) {
            if (!(this.A0D == null || (viewGroup = this.A0H) == null)) {
                AnonymousClass0YY.A05(viewGroup);
            }
            this.A06 = i;
            AnonymousClass0YY.A05(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.A0B = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            A03();
        }
    }

    public void setStaticLayoutBuilderConfigurer(C187878xx r3) {
        C159177lI r1 = this.A0U;
        if (null != r3) {
            r1.A0q = r3;
            r1.A0B(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A0E;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0E = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A0E.setState(getDrawableState());
                }
                C06130Wj.A03(AnonymousClass0YH.A01(this), this.A0E);
                this.A0E.setVisible(AnonymousClass000.A1T(getVisibility()), false);
                this.A0E.setCallback(this);
                this.A0E.setAlpha(this.A06);
            }
            AnonymousClass0YY.A05(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        C159177lI r1 = this.A0U;
        if (charSequence == null || !TextUtils.equals(r1.A0t, charSequence)) {
            r1.A0t = charSequence;
            r1.A0u = null;
            r1.A0B(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.A08 = i;
        boolean A1T = AnonymousClass001.A1T(i);
        this.A0U.A0x = A1T;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A08 == 1) {
                appBarLayout.A0E = false;
            }
        }
        if (A1T && this.A0D == null) {
            float dimension = getResources().getDimension(R.dimen.f6nameremoved);
            C157567iW r1 = this.A0T;
            setContentScrimColor(r1.A00(r1.A01, dimension));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        C159177lI r1 = this.A0U;
        r1.A0p = truncateAt;
        r1.A0B(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0K) {
            this.A0K = z;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        C159177lI r1 = this.A0U;
        r1.A0b = timeInterpolator;
        r1.A0B(false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r12 = 2132084320(0x7f150660, float:1.9808807E38)
            r8 = r15
            r11 = r16
            android.content.Context r0 = X.C105515Vh.A00(r14, r15, r11, r12)
            r13.<init>(r0, r15, r11)
            r1 = 1
            r13.A0O = r1
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r13.A0S = r0
            r6 = -1
            r13.A07 = r6
            r2 = 0
            r13.A0A = r2
            r13.A05 = r2
            android.content.Context r7 = r13.getContext()
            X.7lI r4 = new X.7lI
            r4.<init>(r13)
            r13.A0U = r4
            android.animation.TimeInterpolator r0 = X.C159917mg.A00
            r4.A0c = r0
            r4.A0B(r2)
            r4.A0z = r2
            X.7iW r0 = new X.7iW
            r0.<init>(r7)
            r13.A0T = r0
            int[] r9 = X.C1463179t.A09
            int[] r10 = new int[r2]
            android.content.res.TypedArray r5 = X.C161837qd.A00(r7, r8, r9, r10, r11, r12)
            r3 = 4
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r3 = r5.getInt(r3, r0)
            int r0 = r4.A0Y
            if (r0 == r3) goto L_0x0052
            r4.A0Y = r3
            r4.A0B(r2)
        L_0x0052:
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r0 = r5.getInt(r2, r0)
            r4.A07(r0)
            r0 = 5
            int r0 = r5.getDimensionPixelSize(r0, r2)
            r13.A01 = r0
            r13.A02 = r0
            r13.A04 = r0
            r13.A03 = r0
            r3 = 8
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x0077
            int r0 = r5.getDimensionPixelSize(r3, r2)
            r13.A03 = r0
        L_0x0077:
            r3 = 7
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x0084
            int r0 = r5.getDimensionPixelSize(r3, r2)
            r13.A02 = r0
        L_0x0084:
            r3 = 9
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x0092
            int r0 = r5.getDimensionPixelSize(r3, r2)
            r13.A04 = r0
        L_0x0092:
            r3 = 6
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x009f
            int r0 = r5.getDimensionPixelSize(r3, r2)
            r13.A01 = r0
        L_0x009f:
            r0 = 20
            boolean r0 = r5.getBoolean(r0, r1)
            r13.A0K = r0
            r0 = 18
            java.lang.CharSequence r0 = r5.getText(r0)
            r13.setTitle(r0)
            r0 = 2132083679(0x7f1503df, float:1.9807507E38)
            r4.A08(r0)
            r0 = 2132083650(0x7f1503c2, float:1.9807448E38)
            r4.A06(r0)
            r3 = 10
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x00cb
            int r0 = r5.getResourceId(r3, r2)
            r4.A08(r0)
        L_0x00cb:
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L_0x00d8
            int r0 = r5.getResourceId(r1, r2)
            r4.A06(r0)
        L_0x00d8:
            r3 = 22
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x00f0
            int r3 = r5.getInt(r3, r6)
            if (r3 == 0) goto L_0x01b2
            if (r3 == r1) goto L_0x01ae
            r0 = 3
            if (r3 == r0) goto L_0x01aa
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x00ed:
            r13.setTitleEllipsize(r0)
        L_0x00f0:
            r3 = 11
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x0105
            android.content.res.ColorStateList r3 = X.C160917of.A00(r7, r5, r3)
            android.content.res.ColorStateList r0 = r4.A0g
            if (r0 == r3) goto L_0x0105
            r4.A0g = r3
            r4.A0B(r2)
        L_0x0105:
            r3 = 2
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x0119
            android.content.res.ColorStateList r3 = X.C160917of.A00(r7, r5, r3)
            android.content.res.ColorStateList r0 = r4.A0e
            if (r0 == r3) goto L_0x0119
            r4.A0e = r3
            r4.A0B(r2)
        L_0x0119:
            r0 = 16
            int r0 = r5.getDimensionPixelSize(r0, r6)
            r13.A07 = r0
            r3 = 14
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x0136
            int r3 = r5.getInt(r3, r1)
            int r0 = r4.A0a
            if (r3 == r0) goto L_0x0136
            r4.A0a = r3
            r4.A0B(r2)
        L_0x0136:
            r3 = 21
            boolean r0 = r5.hasValue(r3)
            if (r0 == 0) goto L_0x014b
            int r0 = r5.getResourceId(r3, r2)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r7, r0)
            r4.A0b = r0
            r4.A0B(r2)
        L_0x014b:
            r3 = 15
            r0 = 600(0x258, float:8.41E-43)
            int r0 = r5.getInt(r3, r0)
            long r3 = (long) r0
            r13.A0B = r3
            r3 = 2130970162(0x7f040632, float:1.7549026E38)
            android.animation.TimeInterpolator r0 = X.C159917mg.A01
            android.animation.TimeInterpolator r0 = X.AnonymousClass5YH.A01(r0, r7, r3)
            r13.A0Q = r0
            android.animation.TimeInterpolator r0 = X.C159917mg.A04
            android.animation.TimeInterpolator r0 = X.AnonymousClass5YH.A01(r0, r7, r3)
            r13.A0R = r0
            r0 = 3
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r13.setContentScrim(r0)
            r0 = 17
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r13.setStatusBarScrim(r0)
            r0 = 19
            int r0 = r5.getInt(r0, r2)
            r13.setTitleCollapseMode(r0)
            r0 = 23
            int r0 = r5.getResourceId(r0, r6)
            r13.A09 = r0
            r0 = 13
            boolean r0 = r5.getBoolean(r0, r2)
            r13.A0N = r0
            r0 = 12
            boolean r0 = r5.getBoolean(r0, r2)
            r13.A0M = r0
            r5.recycle()
            r13.setWillNotDraw(r2)
            X.92E r0 = new X.92E
            r0.<init>(r13, r1)
            X.AnonymousClass0YZ.A0E(r13, r0)
            return
        L_0x01aa:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            goto L_0x00ed
        L_0x01ae:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00ed
        L_0x01b2:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static AnonymousClass7TO A00(View view) {
        AnonymousClass7TO r0 = (AnonymousClass7TO) view.getTag(R.id.view_offset_helper);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass7TO r02 = new AnonymousClass7TO(view);
        view.setTag(R.id.view_offset_helper, r02);
        return r02;
    }

    public void draw(Canvas canvas) {
        AnonymousClass0XY r0;
        int A052;
        Drawable drawable;
        super.draw(canvas);
        A01();
        if (this.A0H == null && (drawable = this.A0D) != null && this.A06 > 0) {
            drawable.mutate().setAlpha(this.A06);
            this.A0D.draw(canvas);
        }
        if (this.A0K && this.A0L) {
            if (this.A0H != null && this.A0D != null && this.A06 > 0 && this.A08 == 1) {
                C159177lI r3 = this.A0U;
                if (r3.A0I < r3.A0Q) {
                    int save = canvas.save();
                    canvas.clipRect(this.A0D.getBounds(), Region.Op.DIFFERENCE);
                    r3.A0A(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.A0U.A0A(canvas);
        }
        if (this.A0E != null && this.A06 > 0 && (r0 = this.A0I) != null && (A052 = r0.A05()) > 0) {
            this.A0E.setBounds(0, -this.A00, getWidth(), A052 - this.A00);
            this.A0E.mutate().setAlpha(this.A06);
            this.A0E.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0E;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0D;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        C159177lI r1 = this.A0U;
        if (r1 != null) {
            r1.A10 = drawableState;
            ColorStateList colorStateList2 = r1.A0e;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = r1.A0g) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                r1.A0B(false);
                z = true;
            }
            z2 |= z;
        }
        if (z2) {
            invalidate();
        }
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass6FB(getContext(), attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A08 == 1) {
                appBarLayout.A0E = false;
            }
            setFitsSystemWindows(AnonymousClass0YY.A0B(appBarLayout));
            C187868xw r0 = this.A0J;
            if (r0 == null) {
                r0 = new C169948Bg(this);
                this.A0J = r0;
            }
            appBarLayout.A02(r0);
            AnonymousClass0V0.A02(this);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0U.A09(configuration);
    }

    public void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        C187868xw r1 = this.A0J;
        if (!(r1 == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).A0C) == null)) {
            list.remove(r1);
        }
        super.onDetachedFromWindow();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0D;
        if (drawable != null) {
            ViewGroup viewGroup = this.A0H;
            if (this.A08 == 1 && viewGroup != null && this.A0K) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setContentScrimResource(int i) {
        setContentScrim(AnonymousClass0RP.A00(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (isInEditMode() != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrimsShown(boolean r6) {
        /*
            r5 = this;
            boolean r0 = X.C06360Xi.A05(r5)
            if (r0 == 0) goto L_0x000d
            boolean r0 = r5.isInEditMode()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r5.A0P
            if (r0 == r6) goto L_0x0055
            r4 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0065
            if (r6 != 0) goto L_0x0019
            r4 = 0
        L_0x0019:
            r5.A01()
            android.animation.ValueAnimator r0 = r5.A0C
            if (r0 != 0) goto L_0x0059
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.A0C = r1
            int r0 = r5.A06
            if (r4 <= r0) goto L_0x0056
            android.animation.TimeInterpolator r0 = r5.A0Q
        L_0x002d:
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r5.A0C
            r0 = 1
            X.C86604Kt.A0w(r1, r5, r0)
        L_0x0036:
            android.animation.ValueAnimator r2 = r5.A0C
            long r0 = r5.A0B
            r2.setDuration(r0)
            android.animation.ValueAnimator r3 = r5.A0C
            int[] r2 = X.C86664Kz.A1Z()
            r1 = 0
            int r0 = r5.A06
            r2[r1] = r0
            r0 = 1
            r2[r0] = r4
            r3.setIntValues(r2)
            android.animation.ValueAnimator r0 = r5.A0C
            r0.start()
        L_0x0053:
            r5.A0P = r6
        L_0x0055:
            return
        L_0x0056:
            android.animation.TimeInterpolator r0 = r5.A0R
            goto L_0x002d
        L_0x0059:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0036
            android.animation.ValueAnimator r0 = r5.A0C
            r0.cancel()
            goto L_0x0036
        L_0x0065:
            if (r6 != 0) goto L_0x0068
            r4 = 0
        L_0x0068:
            r5.setScrimAlpha(r4)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.setScrimsShown(boolean):void");
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(AnonymousClass0RP.A00(getContext(), i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1T = AnonymousClass000.A1T(i);
        Drawable drawable = this.A0E;
        if (!(drawable == null || drawable.isVisible() == A1T)) {
            this.A0E.setVisible(A1T, false);
        }
        Drawable drawable2 = this.A0D;
        if (drawable2 != null && drawable2.isVisible() != A1T) {
            this.A0D.setVisible(A1T, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0D || drawable == this.A0E) {
            return true;
        }
        return false;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass6FB(layoutParams);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
