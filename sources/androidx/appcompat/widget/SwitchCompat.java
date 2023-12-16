package androidx.appcompat.widget;

import X.AnonymousClass001;
import X.AnonymousClass0WJ;
import X.AnonymousClass0XA;
import X.AnonymousClass0XW;
import X.AnonymousClass0Y9;
import X.AnonymousClass0YG;
import X.AnonymousClass0YH;
import X.C06130Wj;
import X.C06560Yg;
import X.C17510vh;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.whatsapp.R;

public class SwitchCompat extends CompoundButton {
    public static final Property A0b = new C17510vh(0);
    public static final int[] A0c = {16842912};
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public ObjectAnimator A0E;
    public ColorStateList A0F;
    public ColorStateList A0G;
    public ColorStateList A0H;
    public PorterDuff.Mode A0I;
    public PorterDuff.Mode A0J;
    public Drawable A0K;
    public Drawable A0L;
    public Layout A0M;
    public Layout A0N;
    public TransformationMethod A0O;
    public VelocityTracker A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public final Rect A0Y;
    public final TextPaint A0Z;
    public final AnonymousClass0WJ A0a;
    public int mSwitchWidth;
    public float mThumbPosition;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r11 = r14
            r8 = r15
            r10 = r16
            r13 = r17
            r14.<init>(r15, r10, r13)
            r1 = 0
            r14.A0G = r1
            r14.A0I = r1
            r4 = 0
            r14.A0S = r4
            r14.A0T = r4
            r14.A0H = r1
            r14.A0J = r1
            r14.A0U = r4
            r14.A0V = r4
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r14.A0P = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r14.A0Y = r0
            X.AnonymousClass0XB.A04(r14)
            r5 = 1
            android.text.TextPaint r2 = new android.text.TextPaint
            r2.<init>(r5)
            r14.A0Z = r2
            android.content.res.Resources r0 = r14.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r2.density = r0
            int[] r12 = X.AnonymousClass0KC.A0L
            X.0UD r3 = X.AnonymousClass0UD.A00(r15, r10, r12, r13, r4)
            android.content.res.TypedArray r9 = r3.A02
            X.C06560Yg.A0B(r8, r9, r10, r11, r12, r13)
            r0 = 2
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            r14.A0K = r0
            if (r0 == 0) goto L_0x0055
            r0.setCallback(r14)
        L_0x0055:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            r14.A0L = r0
            if (r0 == 0) goto L_0x0062
            r0.setCallback(r14)
        L_0x0062:
            java.lang.CharSequence r0 = r9.getText(r4)
            r14.A0R = r0
            java.lang.CharSequence r0 = r9.getText(r5)
            r14.A0Q = r0
            r0 = 3
            boolean r0 = r9.getBoolean(r0, r5)
            r14.A0W = r0
            r0 = 8
            int r0 = r9.getDimensionPixelSize(r0, r4)
            r14.A0A = r0
            r0 = 5
            int r0 = r9.getDimensionPixelSize(r0, r4)
            r14.A06 = r0
            r0 = 6
            int r0 = r9.getDimensionPixelSize(r0, r4)
            r14.A07 = r0
            r0 = 4
            boolean r0 = r9.getBoolean(r0, r4)
            r14.A0X = r0
            r0 = 9
            android.content.res.ColorStateList r0 = r3.A01(r0)
            if (r0 == 0) goto L_0x009e
            r14.A0G = r0
            r14.A0S = r5
        L_0x009e:
            r0 = 10
            r6 = -1
            int r0 = r9.getInt(r0, r6)
            android.graphics.PorterDuff$Mode r2 = X.AnonymousClass0XA.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r14.A0I
            if (r0 == r2) goto L_0x00b1
            r14.A0I = r2
            r14.A0T = r5
        L_0x00b1:
            boolean r0 = r14.A0S
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r14.A0T
            if (r0 == 0) goto L_0x00bc
        L_0x00b9:
            r14.A01()
        L_0x00bc:
            r0 = 12
            android.content.res.ColorStateList r0 = r3.A01(r0)
            if (r0 == 0) goto L_0x00c8
            r14.A0H = r0
            r14.A0U = r5
        L_0x00c8:
            r0 = 13
            int r0 = r9.getInt(r0, r6)
            android.graphics.PorterDuff$Mode r1 = X.AnonymousClass0XA.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r14.A0J
            if (r0 == r1) goto L_0x00da
            r14.A0J = r1
            r14.A0V = r5
        L_0x00da:
            boolean r0 = r14.A0U
            if (r0 != 0) goto L_0x00e2
            boolean r0 = r14.A0V
            if (r0 == 0) goto L_0x00e5
        L_0x00e2:
            r14.A02()
        L_0x00e5:
            r0 = 7
            int r1 = r9.getResourceId(r0, r4)
            if (r1 == 0) goto L_0x016c
            int[] r0 = X.AnonymousClass0KC.A0M
            android.content.res.TypedArray r0 = r15.obtainStyledAttributes(r1, r0)
            X.0UD r1 = new X.0UD
            r1.<init>(r15, r0)
            r0 = 3
            android.content.res.ColorStateList r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0102
            android.content.res.ColorStateList r0 = r14.getTextColors()
        L_0x0102:
            r14.A0F = r0
            android.content.res.TypedArray r3 = r1.A02
            int r0 = r3.getDimensionPixelSize(r4, r4)
            if (r0 == 0) goto L_0x011d
            float r2 = (float) r0
            android.text.TextPaint r1 = r14.A0Z
            float r0 = r1.getTextSize()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x011d
            r1.setTextSize(r2)
            r14.requestLayout()
        L_0x011d:
            int r1 = r3.getInt(r5, r6)
            r0 = 2
            int r7 = r3.getInt(r0, r6)
            if (r1 == r5) goto L_0x01af
            if (r1 == r0) goto L_0x01ac
            r0 = 3
            if (r1 == r0) goto L_0x01a9
            r1 = 0
        L_0x012e:
            r6 = 0
            r5 = 0
            if (r7 <= 0) goto L_0x019d
            if (r1 != 0) goto L_0x0198
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r7)
        L_0x0138:
            r14.setSwitchTypeface(r0)
            if (r0 == 0) goto L_0x0196
            int r0 = r0.getStyle()
        L_0x0141:
            int r2 = ~r0
            r2 = r2 & r7
            android.text.TextPaint r1 = r14.A0Z
            r0 = r2 & 1
            if (r0 == 0) goto L_0x014a
            r5 = 1
        L_0x014a:
            r1.setFakeBoldText(r5)
            r0 = r2 & 2
            if (r0 == 0) goto L_0x0153
            r6 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0153:
            r1.setTextSkewX(r6)
        L_0x0156:
            r0 = 14
            boolean r0 = r3.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x0194
            android.content.Context r1 = r14.getContext()
            X.0Zu r0 = new X.0Zu
            r0.<init>(r1)
        L_0x0167:
            r14.A0O = r0
            r3.recycle()
        L_0x016c:
            X.0WJ r0 = new X.0WJ
            r0.<init>(r14)
            r14.A0a = r0
            r0.A0B(r10, r13)
            r9.recycle()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r15)
            int r0 = r1.getScaledTouchSlop()
            r14.A0D = r0
            int r0 = r1.getScaledMinimumFlingVelocity()
            r14.A02 = r0
            r14.refreshDrawableState()
            boolean r0 = r14.isChecked()
            r14.setChecked(r0)
            return
        L_0x0194:
            r0 = 0
            goto L_0x0167
        L_0x0196:
            r0 = 0
            goto L_0x0141
        L_0x0198:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r7)
            goto L_0x0138
        L_0x019d:
            android.text.TextPaint r0 = r14.A0Z
            r0.setFakeBoldText(r4)
            r0.setTextSkewX(r6)
            r14.setSwitchTypeface(r1)
            goto L_0x0156
        L_0x01a9:
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            goto L_0x012e
        L_0x01ac:
            android.graphics.Typeface r1 = android.graphics.Typeface.SERIF
            goto L_0x012e
        L_0x01af:
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final Layout A00(CharSequence charSequence) {
        int i;
        CharSequence charSequence2 = charSequence;
        TransformationMethod transformationMethod = this.A0O;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.A0Z;
        if (charSequence2 != null) {
            i = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence2, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private boolean getTargetCheckedState() {
        return AnonymousClass001.A1W((this.mThumbPosition > 0.5f ? 1 : (this.mThumbPosition == 0.5f ? 0 : -1)));
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.A0L;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.A0Y;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.A0K;
        if (drawable2 != null) {
            rect = AnonymousClass0XA.A01(drawable2);
        } else {
            rect = AnonymousClass0XA.A01;
        }
        return ((((this.mSwitchWidth - this.A0B) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public final void A01() {
        Drawable drawable = this.A0K;
        if (drawable == null) {
            return;
        }
        if (this.A0S || this.A0T) {
            Drawable mutate = C06130Wj.A01(drawable).mutate();
            this.A0K = mutate;
            if (this.A0S) {
                AnonymousClass0YG.A01(this.A0G, mutate);
            }
            if (this.A0T) {
                AnonymousClass0YG.A04(this.A0I, this.A0K);
            }
            if (this.A0K.isStateful()) {
                AnonymousClass001.A13(this.A0K, this);
            }
        }
    }

    public final void A02() {
        Drawable drawable = this.A0L;
        if (drawable == null) {
            return;
        }
        if (this.A0U || this.A0V) {
            Drawable mutate = C06130Wj.A01(drawable).mutate();
            this.A0L = mutate;
            if (this.A0U) {
                AnonymousClass0YG.A01(this.A0H, mutate);
            }
            if (this.A0V) {
                AnonymousClass0YG.A04(this.A0J, this.A0L);
            }
            if (this.A0L.isStateful()) {
                AnonymousClass001.A13(this.A0L, this);
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect rect;
        Rect rect2 = this.A0Y;
        int i = this.A05;
        int i2 = this.A09;
        int i3 = this.A08;
        int i4 = this.A03;
        int thumbOffset = getThumbOffset() + i;
        Drawable drawable = this.A0K;
        if (drawable != null) {
            rect = AnonymousClass0XA.A01(drawable);
        } else {
            rect = AnonymousClass0XA.A01;
        }
        Drawable drawable2 = this.A0L;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i5 = rect2.left;
            thumbOffset += i5;
            int i6 = rect.left;
            if (i6 > i5) {
                i += i6 - i5;
            }
            int i7 = rect.top;
            int i8 = rect2.top;
            int i9 = (i7 - i8) + i2;
            if (i7 <= i8) {
                i9 = i2;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 > i11) {
                i3 -= i10 - i11;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            int i14 = i4 - (i12 - i13);
            if (i12 <= i13) {
                i14 = i4;
            }
            this.A0L.setBounds(i, i9, i3, i14);
        }
        Drawable drawable3 = this.A0K;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.A0B + rect2.right;
            this.A0K.setBounds(i15, i2, i16, i4);
            Drawable background = getBackground();
            if (background != null) {
                AnonymousClass0YG.A07(background, i15, i2, i16, i4);
            }
        }
        super.draw(canvas);
    }

    public boolean getShowText() {
        return this.A0W;
    }

    public boolean getSplitTrack() {
        return this.A0X;
    }

    public int getSwitchMinWidth() {
        return this.A06;
    }

    public int getSwitchPadding() {
        return this.A07;
    }

    public CharSequence getTextOff() {
        return this.A0Q;
    }

    public CharSequence getTextOn() {
        return this.A0R;
    }

    public Drawable getThumbDrawable() {
        return this.A0K;
    }

    public int getThumbTextPadding() {
        return this.A0A;
    }

    public ColorStateList getThumbTintList() {
        return this.A0G;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.A0I;
    }

    public Drawable getTrackDrawable() {
        return this.A0L;
    }

    public ColorStateList getTrackTintList() {
        return this.A0H;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.A0J;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0c);
        }
        return onCreateDrawableState;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.A0W) {
            if (this.A0N == null) {
                this.A0N = A00(this.A0R);
            }
            if (this.A0M == null) {
                this.A0M = A00(this.A0Q);
            }
        }
        Rect rect = this.A0Y;
        Drawable drawable = this.A0K;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.A0K.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.A0K.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.A0W) {
            i5 = Math.max(this.A0N.getWidth(), this.A0M.getWidth()) + (this.A0A * 2);
        } else {
            i5 = 0;
        }
        this.A0B = Math.max(i5, i3);
        Drawable drawable2 = this.A0L;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.A0L.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.A0K;
        if (drawable3 != null) {
            Rect A012 = AnonymousClass0XA.A01(drawable3);
            i7 = Math.max(i7, A012.left);
            i8 = Math.max(i8, A012.right);
        }
        int A0B2 = AnonymousClass001.A0B((this.A0B * 2) + i7, i8, this.A06);
        int max = Math.max(i6, i4);
        this.mSwitchWidth = A0B2;
        this.A04 = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (isEnabled() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r2 = r9.A0P
            r2.addMovement(r10)
            int r1 = r10.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x00f8
            r6 = 2
            if (r1 == r4) goto L_0x0089
            if (r1 == r6) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x0089
        L_0x0014:
            boolean r0 = super.onTouchEvent(r10)
            return r0
        L_0x0019:
            int r0 = r9.A0C
            if (r0 == r4) goto L_0x005c
            if (r0 != r6) goto L_0x0014
            float r6 = r10.getX()
            int r2 = r9.getThumbScrollRange()
            float r0 = r9.A00
            float r1 = r6 - r0
            r5 = 0
            if (r2 == 0) goto L_0x0053
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x0030:
            int r0 = X.AnonymousClass0YH.A01(r9)
            if (r0 != r4) goto L_0x0037
            float r1 = -r1
        L_0x0037:
            float r3 = r9.mThumbPosition
            float r2 = r3 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            r2 = 0
        L_0x0042:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004b
            r9.A00 = r6
            r9.setThumbPosition(r2)
        L_0x004b:
            return r4
        L_0x004c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0053:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 <= 0) goto L_0x0030
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0030
        L_0x005c:
            float r5 = r10.getX()
            float r3 = r10.getY()
            float r0 = r9.A00
            float r2 = X.AnonymousClass002.A00(r5, r0)
            int r0 = r9.A0D
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007b
            float r0 = r9.A01
            float r0 = X.AnonymousClass002.A00(r3, r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
        L_0x007b:
            r9.A0C = r6
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            r9.A00 = r5
            r9.A01 = r3
            return r4
        L_0x0089:
            int r0 = r9.A0C
            if (r0 != r6) goto L_0x00f0
            r6 = 0
            r9.A0C = r6
            int r0 = r10.getAction()
            r5 = 1
            if (r0 != r4) goto L_0x009e
            boolean r1 = r9.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            boolean r3 = r9.isChecked()
            if (r0 == 0) goto L_0x00ee
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r0)
            float r2 = r2.getXVelocity()
            float r1 = java.lang.Math.abs(r2)
            int r0 = r9.A02
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            int r0 = X.AnonymousClass0YH.A01(r9)
            r1 = 1
            if (r0 == r4) goto L_0x00c1
            r1 = 0
        L_0x00c1:
            r0 = 0
            if (r1 == 0) goto L_0x00e2
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e7
        L_0x00c8:
            if (r5 == r3) goto L_0x00cd
            r9.playSoundEffect(r6)
        L_0x00cd:
            r9.setChecked(r5)
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r10)
            r0 = 3
            r1.setAction(r0)
            super.onTouchEvent(r1)
            r1.recycle()
            super.onTouchEvent(r10)
            return r4
        L_0x00e2:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e7
            goto L_0x00c8
        L_0x00e7:
            r5 = 0
            goto L_0x00c8
        L_0x00e9:
            boolean r5 = r9.getTargetCheckedState()
            goto L_0x00c8
        L_0x00ee:
            r5 = r3
            goto L_0x00c8
        L_0x00f0:
            r0 = 0
            r9.A0C = r0
            r2.clear()
            goto L_0x0014
        L_0x00f8:
            float r3 = r10.getX()
            float r2 = r10.getY()
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = r9.A0K
            if (r0 == 0) goto L_0x0014
            int r5 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r0 = r9.A0K
            android.graphics.Rect r1 = r9.A0Y
            r0.getPadding(r1)
            int r8 = r9.A09
            int r7 = r9.A0D
            int r8 = r8 - r7
            int r6 = r9.A05
            int r6 = r6 + r5
            int r6 = r6 - r7
            int r5 = r9.A0B
            int r5 = r5 + r6
            int r0 = r1.left
            int r5 = r5 + r0
            int r0 = r1.right
            int r5 = r5 + r0
            int r5 = r5 + r7
            int r1 = r9.A03
            int r1 = r1 + r7
            float r0 = (float) r6
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = (float) r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            float r0 = (float) r8
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            r9.A0C = r4
            r9.A00 = r3
            r9.A01 = r2
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setShowText(boolean z) {
        if (this.A0W != z) {
            this.A0W = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.A0X = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.A06 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.A07 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.A0Z;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.A0Q = charSequence;
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0Q;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(R.string.f11nameremoved);
            }
            C06560Yg.A0S(this, charSequence2);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.A0R = charSequence;
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0R;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(R.string.f11nameremoved);
            }
            C06560Yg.A0S(this, charSequence2);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0K;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A0K = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    public void setThumbTextPadding(int i) {
        this.A0A = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A0G = colorStateList;
        this.A0S = true;
        A01();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.A0I = mode;
        this.A0T = true;
        A01();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0L;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A0L = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A0H = colorStateList;
        this.A0U = true;
        A02();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.A0J = mode;
        this.A0V = true;
        A02();
    }

    private int getThumbOffset() {
        float f;
        if (AnonymousClass0YH.A01(this) == 1) {
            f = 1.0f - this.mThumbPosition;
        } else {
            f = this.mThumbPosition;
        }
        return AnonymousClass001.A06(f, (float) getThumbScrollRange());
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A0K;
        if (drawable != null) {
            AnonymousClass0YG.A05(drawable, f, f2);
        }
        Drawable drawable2 = this.A0L;
        if (drawable2 != null) {
            AnonymousClass0YG.A05(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0K;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0L;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        boolean A082 = AnonymousClass0YH.A08(this);
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (!A082) {
            return compoundPaddingLeft;
        }
        int i = compoundPaddingLeft + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return i + this.A07;
        }
        return i;
    }

    public int getCompoundPaddingRight() {
        boolean A082 = AnonymousClass0YH.A08(this);
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (A082) {
            return compoundPaddingRight;
        }
        int i = compoundPaddingRight + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return i + this.A07;
        }
        return i;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0K;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0L;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.A0E;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.A0E.end();
            this.A0E = null;
        }
    }

    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.A0Y;
        Drawable drawable = this.A0L;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.A09;
        int i2 = this.A03;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A0K;
        if (drawable != null) {
            if (!this.A0X || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect A012 = AnonymousClass0XA.A01(drawable2);
                drawable2.copyBounds(rect);
                rect.left += A012.left;
                rect.right -= A012.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.A0N;
        } else {
            layout = this.A0M;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A0F;
            if (colorStateList != null) {
                this.A0Z.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0Z.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((float) ((width / 2) - (layout.getWidth() / 2)), (float) (((i3 + i4) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.A0R;
            } else {
                charSequence = this.A0Q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(text);
                A0o.append(' ');
                A0o.append(charSequence);
                accessibilityNodeInfo.setText(A0o);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A0I2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.A0K != null) {
            Rect rect = this.A0Y;
            Drawable drawable = this.A0L;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect A012 = AnonymousClass0XA.A01(this.A0K);
            i5 = AnonymousClass001.A0C(A012.left, rect.left, 0);
            i9 = AnonymousClass001.A0C(A012.right, rect.right, 0);
        } else {
            i5 = 0;
        }
        if (AnonymousClass0YH.A01(this) == 1) {
            i6 = getPaddingLeft() + i5;
            A0I2 = ((this.mSwitchWidth + i6) - i5) - i9;
        } else {
            A0I2 = AnonymousClass001.A0I(this) - i9;
            i6 = (A0I2 - this.mSwitchWidth) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.A04;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.A04;
        } else {
            i8 = AnonymousClass001.A0H(this);
            paddingTop = i8 - this.A04;
            this.A05 = i6;
            this.A09 = paddingTop;
            this.A03 = i8;
            this.A08 = A0I2;
        }
        i8 = i7 + paddingTop;
        this.A05 = i6;
        this.A09 = paddingTop;
        this.A03 = i8;
        this.A08 = A0I2;
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.A0R;
        } else {
            charSequence = this.A0Q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r6) {
        /*
            r5 = this;
            super.setChecked(r6)
            boolean r2 = r5.isChecked()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r2 == 0) goto L_0x0050
            if (r1 < r0) goto L_0x0021
            java.lang.CharSequence r0 = r5.A0R
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131895618(0x7f122542, float:1.9426074E38)
        L_0x001a:
            java.lang.String r0 = r1.getString(r0)
        L_0x001e:
            X.C06560Yg.A0S(r5, r0)
        L_0x0021:
            android.os.IBinder r0 = r5.getWindowToken()
            if (r0 == 0) goto L_0x005e
            boolean r0 = X.C06360Xi.A05(r5)
            if (r0 == 0) goto L_0x005e
            r4 = 0
            if (r2 == 0) goto L_0x0032
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0032:
            android.util.Property r2 = A0b
            r3 = 1
            float[] r1 = new float[r3]
            r0 = 0
            r1[r0] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r2, r1)
            r5.A0E = r2
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            android.animation.ObjectAnimator r0 = r5.A0E
            r0.setAutoCancel(r3)
            android.animation.ObjectAnimator r0 = r5.A0E
            r0.start()
            return
        L_0x0050:
            if (r1 < r0) goto L_0x0021
            java.lang.CharSequence r0 = r5.A0Q
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131895617(0x7f122541, float:1.9426072E38)
            goto L_0x001a
        L_0x005e:
            android.animation.ObjectAnimator r0 = r5.A0E
            if (r0 == 0) goto L_0x0065
            r0.cancel()
        L_0x0065:
            r0 = 0
            if (r2 == 0) goto L_0x006a
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x006a:
            r5.setThumbPosition(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.setChecked(boolean):void");
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0Y9.A00(callback, this));
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AnonymousClass0XW.A02(this, i));
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AnonymousClass0XW.A02(this, i));
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0K || drawable == this.A0L) {
            return true;
        }
        return false;
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
