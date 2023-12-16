package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.whatsapp.R;

/* renamed from: X.6Z3  reason: invalid class name */
public class AnonymousClass6Z3 extends C125066Fa implements C181238mQ, C15720rp, C15000qc, C15020qe, C178828iA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public PorterDuff.Mode A09;
    public C160787oJ A0A;
    public boolean A0B;
    public final Rect A0C;
    public final Rect A0D;
    public final AnonymousClass0PO A0E;
    public final AnonymousClass7WF A0F;

    public void setSize(int i) {
        this.A01 = 0;
        if (i != this.A04) {
            this.A04 = i;
            requestLayout();
        }
    }

    private C160787oJ getImpl() {
        C160787oJ r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C129046Yz r02 = new C129046Yz(this, new C170078Bu(this));
        this.A0A = r02;
        return r02;
    }

    public final int A02(int i) {
        int i2 = this.A01;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            int i3 = R.dimen.f6nameremoved;
            if (i != 1) {
                i3 = R.dimen.f6nameremoved;
            }
            return resources.getDimensionPixelSize(i3);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return A02(1);
        } else {
            return A02(0);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.A05;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.A08;
    }

    public C05630Ug getBehavior() {
        return new FloatingActionButton$Behavior();
    }

    public int getCustomSize() {
        return this.A01;
    }

    public int getExpandedComponentIdHint() {
        return this.A0F.A00;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.A07;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.A07;
    }

    public int getSize() {
        return this.A04;
    }

    public int getSizeDimension() {
        return A02(this.A04);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.A05;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.A08;
    }

    public ColorStateList getSupportImageTintList() {
        return this.A06;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.A09;
    }

    public boolean getUseCompatPadding() {
        return this.A0B;
    }

    public void onMeasure(int i, int i2) {
        int A022 = A02(this.A04);
        this.A02 = (A022 - this.A03) / 2;
        getImpl().A03();
        int min = Math.min(View.resolveSize(A022, i), View.resolveSize(A022, i2));
        Rect rect = this.A0C;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C125166Ga)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C125166Ga r4 = (C125166Ga) parcelable;
        super.onRestoreInstanceState(r4.A00);
        AnonymousClass7WF r2 = this.A0F;
        Object obj = r4.A00.get("expandableWidgetHelper");
        obj.getClass();
        r2.A01((Bundle) obj);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A05 != colorStateList) {
            this.A05 = colorStateList;
            C160787oJ impl = getImpl();
            AnonymousClass6D7 r0 = impl.A0D;
            if (r0 != null) {
                r0.setTintList(colorStateList);
            }
            AnonymousClass6D0 r2 = impl.A0C;
            if (r2 != null) {
                if (colorStateList != null) {
                    r2.A03 = colorStateList.getColorForState(r2.getState(), r2.A03);
                }
                r2.A06 = colorStateList;
                r2.A08 = true;
                r2.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            AnonymousClass6D7 r0 = getImpl().A0D;
            if (r0 != null) {
                r0.setTintMode(mode);
            }
        }
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw AnonymousClass001.A0c("Custom size must be non-negative");
        } else if (i != this.A01) {
            this.A01 = i;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.A0F.A00 = i;
    }

    public void setImageResource(int i) {
        this.A0E.A01(i);
        A03();
    }

    public void setMaxImageSize(int i) {
        this.A03 = i;
        C160787oJ impl = getImpl();
        if (impl.A05 != i) {
            impl.A05 = i;
            float f = impl.A02;
            impl.A02 = f;
            Matrix matrix = impl.A0H;
            impl.A06(matrix, f);
            impl.A0L.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            getImpl().A05(this.A07);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.A06 != colorStateList) {
            this.A06 = colorStateList;
            A03();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.A09 != mode) {
            this.A09 = mode;
            A03();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A0B != z) {
            this.A0B = z;
            getImpl().A03();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6Z3(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r1 = 2132084321(0x7f150661, float:1.980881E38)
            r0 = r20
            r14 = r21
            r2 = r22
            android.content.Context r0 = X.C105515Vh.A00(r0, r14, r2, r1)
            r3 = r19
            r3.<init>(r0, r14, r2)
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r3.A0C = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r3.A0D = r0
            android.content.Context r13 = r3.getContext()
            int[] r15 = X.C1463179t.A0C
            r10 = 0
            int[] r0 = new int[r10]
            r16 = r0
            r17 = r2
            r18 = r1
            android.content.res.TypedArray r9 = X.C161837qd.A00(r13, r14, r15, r16, r17, r18)
            r0 = 2
            android.content.res.ColorStateList r0 = X.C160917of.A00(r13, r9, r0)
            r3.A05 = r0
            r0 = 3
            r5 = -1
            int r4 = r9.getInt(r0, r5)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C159337lf.A01(r0, r4)
            r3.A08 = r0
            r0 = 13
            android.content.res.ColorStateList r0 = X.C160917of.A00(r13, r9, r0)
            r3.A07 = r0
            r0 = 8
            int r0 = r9.getInt(r0, r5)
            r3.A04 = r0
            r0 = 7
            int r0 = r9.getDimensionPixelSize(r0, r10)
            r3.A01 = r0
            r0 = 4
            int r0 = r9.getDimensionPixelSize(r0, r10)
            r3.A00 = r0
            r0 = 5
            r4 = 0
            float r8 = r9.getDimension(r0, r4)
            r0 = 10
            float r7 = r9.getDimension(r0, r4)
            r0 = 12
            float r6 = r9.getDimension(r0, r4)
            r0 = 17
            boolean r0 = r9.getBoolean(r0, r10)
            r3.A0B = r0
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131167461(0x7f0708e5, float:1.7949196E38)
            int r17 = r4.getDimensionPixelSize(r0)
            r0 = 11
            int r0 = r9.getDimensionPixelSize(r0, r10)
            r3.setMaxImageSize(r0)
            r0 = 16
            X.7pZ r16 = X.C161407pZ.A01(r13, r9, r0)
            r0 = 9
            X.7pZ r5 = X.C161407pZ.A01(r13, r9, r0)
            X.8mP r12 = X.C161877ql.A0C
            int[] r0 = X.C1463179t.A0P
            android.content.res.TypedArray r4 = r13.obtainStyledAttributes(r14, r0, r2, r1)
            int r1 = r4.getResourceId(r10, r10)
            r11 = 1
            int r0 = r4.getResourceId(r11, r10)
            r4.recycle()
            X.7jd r0 = X.C161877ql.A02(r13, r12, r1, r0)
            X.7ql r1 = new X.7ql
            r1.<init>(r0)
            r0 = 6
            boolean r4 = r9.getBoolean(r0, r10)
            boolean r0 = r9.getBoolean(r10, r11)
            r3.setEnabled(r0)
            r9.recycle()
            X.0PO r0 = new X.0PO
            r0.<init>(r3)
            r3.A0E = r0
            r0.A02(r14, r2)
            X.7WF r0 = new X.7WF
            r0.<init>(r3)
            r3.A0F = r0
            X.7oJ r0 = r3.getImpl()
            r0.A08(r1)
            X.7oJ r9 = r3.getImpl()
            android.content.res.ColorStateList r2 = r3.A05
            android.graphics.PorterDuff$Mode r10 = r3.A08
            android.content.res.ColorStateList r0 = r3.A07
            r18 = r0
            int r14 = r3.A00
            X.7ql r1 = r9.A0E
            r1.getClass()
            X.6ZC r0 = new X.6ZC
            r0.<init>(r1)
            r9.A0D = r0
            r0.setTintList(r2)
            if (r10 == 0) goto L_0x0105
            X.6D7 r0 = r9.A0D
            r0.setTintMode(r10)
        L_0x0105:
            X.6D7 r10 = r9.A0D
            X.6Z3 r1 = r9.A0L
            android.content.Context r0 = r1.getContext()
            r10.A05(r0)
            r10 = 0
            if (r14 <= 0) goto L_0x01ef
            android.content.Context r15 = r1.getContext()
            X.7ql r0 = r9.A0E
            r0.getClass()
            X.6D0 r11 = new X.6D0
            r11.<init>(r0)
            r0 = 2131100293(0x7f060285, float:1.7812963E38)
            int r13 = X.AnonymousClass0Y8.A04(r15, r0)
            r0 = 2131100292(0x7f060284, float:1.7812961E38)
            int r12 = X.AnonymousClass0Y8.A04(r15, r0)
            r0 = 2131100290(0x7f060282, float:1.7812957E38)
            int r1 = X.AnonymousClass0Y8.A04(r15, r0)
            r0 = 2131100291(0x7f060283, float:1.781296E38)
            int r0 = X.AnonymousClass0Y8.A04(r15, r0)
            r11.A05 = r13
            r11.A04 = r12
            r11.A02 = r1
            r11.A01 = r0
            float r12 = (float) r14
            float r0 = r11.A00
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x015d
            r11.A00 = r12
            android.graphics.Paint r1 = r11.A09
            r0 = 1068149139(0x3faaa993, float:1.3333)
            float r12 = r12 * r0
            r1.setStrokeWidth(r12)
            r0 = 1
            r11.A08 = r0
            r11.invalidateSelf()
        L_0x015d:
            if (r2 == 0) goto L_0x016b
            int[] r1 = r11.getState()
            int r0 = r11.A03
            int r0 = r2.getColorForState(r1, r0)
            r11.A03 = r0
        L_0x016b:
            r11.A06 = r2
            r2 = 1
            r11.A08 = r2
            r11.invalidateSelf()
            r9.A0C = r11
            r0 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r0]
            r0 = 0
            r1[r0] = r11
            X.6D7 r0 = r9.A0D
            r0.getClass()
            r1[r2] = r0
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r1)
        L_0x0187:
            android.content.res.ColorStateList r1 = X.C106925aO.A02(r18)
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r1, r2, r10)
            r9.A09 = r0
            r9.A08 = r0
            X.7oJ r1 = r3.getImpl()
            r0 = r17
            r1.A06 = r0
            X.7oJ r2 = r3.getImpl()
            float r0 = r2.A00
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01af
            r2.A00 = r8
            float r1 = r2.A01
            float r0 = r2.A03
            r2.A04(r8, r1, r0)
        L_0x01af:
            X.7oJ r2 = r3.getImpl()
            float r0 = r2.A01
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x01c2
            r2.A01 = r7
            float r1 = r2.A00
            float r0 = r2.A03
            r2.A04(r1, r7, r0)
        L_0x01c2:
            X.7oJ r2 = r3.getImpl()
            float r0 = r2.A03
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01d5
            r2.A03 = r6
            float r1 = r2.A00
            float r0 = r2.A01
            r2.A04(r1, r0, r6)
        L_0x01d5:
            X.7oJ r1 = r3.getImpl()
            r0 = r16
            r1.A0B = r0
            X.7oJ r0 = r3.getImpl()
            r0.A0A = r5
            X.7oJ r0 = r3.getImpl()
            r0.A0F = r4
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r3.setScaleType(r0)
            return
        L_0x01ef:
            r9.A0C = r10
            X.6D7 r2 = r9.A0D
            goto L_0x0187
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z3.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void A03() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.A06;
            if (colorStateList == null) {
                C06130Wj.A02(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.A09;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(AnonymousClass0XJ.A00(mode, colorForState));
        }
    }

    public void A04(boolean z) {
        AnimatorSet A012;
        C160787oJ impl = getImpl();
        AnonymousClass6Z3 r3 = impl.A0L;
        int visibility = r3.getVisibility();
        int i = impl.A04;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.A07;
        if (animator != null) {
            animator.cancel();
        }
        if (!C06360Xi.A05(r3) || r3.isInEditMode()) {
            int i2 = 4;
            if (z) {
                i2 = 8;
            }
            r3.A01(i2, z);
            return;
        }
        C161407pZ r1 = impl.A0A;
        if (r1 != null) {
            A012 = impl.A02(r1, 0.0f, 0.0f, 0.0f);
        } else {
            A012 = impl.A01(0.0f, 0.4f, 0.4f, R.attr.f3nameremoved, R.attr.f3nameremoved);
        }
        A012.addListener(new C188638zF(impl, z));
        A012.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r4.isInEditMode() != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(boolean r12) {
        /*
            r11 = this;
            X.7oJ r5 = r11.getImpl()
            X.6Z3 r4 = r5.A0L
            int r2 = r4.getVisibility()
            r0 = 1
            int r1 = r5.A04
            if (r2 == 0) goto L_0x0013
            r0 = 2
            if (r1 != r0) goto L_0x0016
            return
        L_0x0013:
            if (r1 == r0) goto L_0x0016
            return
        L_0x0016:
            android.animation.Animator r0 = r5.A07
            if (r0 == 0) goto L_0x001d
            r0.cancel()
        L_0x001d:
            X.7pZ r0 = r5.A0B
            r2 = 0
            boolean r3 = X.AnonymousClass000.A1X(r0)
            boolean r0 = X.C06360Xi.A05(r4)
            if (r0 == 0) goto L_0x0031
            boolean r1 = r4.isInEditMode()
            r0 = 1
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0082
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L_0x0061
            r1 = 0
            r4.setAlpha(r1)
            r0 = 0
            if (r3 == 0) goto L_0x0046
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0046:
            r4.setScaleY(r0)
            r0 = 0
            if (r3 == 0) goto L_0x004f
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x004f:
            r4.setScaleX(r0)
            if (r3 == 0) goto L_0x0057
            r1 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0057:
            r5.A02 = r1
            android.graphics.Matrix r0 = r5.A0H
            r5.A06(r0, r1)
            r4.setImageMatrix(r0)
        L_0x0061:
            X.7pZ r0 = r5.A0B
            if (r0 == 0) goto L_0x0075
            android.animation.AnimatorSet r1 = r5.A02(r0, r6, r6, r6)
        L_0x0069:
            X.8zG r0 = new X.8zG
            r0.<init>(r2, r5, r12)
            r1.addListener(r0)
            r1.start()
            return
        L_0x0075:
            r9 = 2130970140(0x7f04061c, float:1.7548982E38)
            r10 = 2130970156(0x7f04062c, float:1.7549014E38)
            r8 = r6
            r7 = r6
            android.animation.AnimatorSet r1 = r5.A01(r6, r7, r8, r9, r10)
            goto L_0x0069
        L_0x0082:
            r4.A01(r2, r12)
            r4.setAlpha(r6)
            r4.setScaleY(r6)
            r4.setScaleX(r6)
            r5.A02 = r6
            android.graphics.Matrix r0 = r5.A0H
            r5.A06(r0, r6)
            r4.setImageMatrix(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z3.A05(boolean):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A09(getDrawableState());
    }

    public float getCompatElevation() {
        return getImpl().A0L.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().A01;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().A03;
    }

    public Drawable getContentBackground() {
        return getImpl().A08;
    }

    public C161407pZ getHideMotionSpec() {
        return getImpl().A0A;
    }

    public C161877ql getShapeAppearanceModel() {
        C161877ql r0 = getImpl().A0E;
        r0.getClass();
        return r0;
    }

    public C161407pZ getShowMotionSpec() {
        return getImpl().A0B;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C160787oJ impl = getImpl();
        AnonymousClass6D7 r1 = impl.A0D;
        if (r1 != null) {
            C160927og.A03(impl.A0L, r1);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().A0L.getViewTreeObserver();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = AnonymousClass002.A08();
        }
        C125166Ga r3 = new C125166Ga(onSaveInstanceState);
        r3.A00.put("expandableWidgetHelper", this.A0F.A00());
        return r3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.A0D;
            if (C06360Xi.A05(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                int i = rect.left;
                Rect rect2 = this.A0C;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCompatElevation(float f) {
        C160787oJ impl = getImpl();
        if (impl.A00 != f) {
            impl.A00 = f;
            impl.A04(f, impl.A01, impl.A03);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C160787oJ impl = getImpl();
        if (impl.A01 != f) {
            impl.A01 = f;
            impl.A04(impl.A00, f, impl.A03);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C160787oJ impl = getImpl();
        if (impl.A03 != f) {
            impl.A03 = f;
            impl.A04(impl.A00, impl.A01, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        AnonymousClass6D7 r0 = getImpl().A0D;
        if (r0 != null) {
            r0.A04(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().A0F) {
            getImpl().A0F = z;
            requestLayout();
        }
    }

    public void setHideMotionSpec(C161407pZ r2) {
        getImpl().A0A = r2;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C161407pZ.A00(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C160787oJ impl = getImpl();
            float f = impl.A02;
            impl.A02 = f;
            Matrix matrix = impl.A0H;
            impl.A06(matrix, f);
            impl.A0L.setImageMatrix(matrix);
            if (this.A06 != null) {
                A03();
            }
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl();
    }

    public void setShadowPaddingEnabled(boolean z) {
        C160787oJ impl = getImpl();
        impl.A0G = z;
        impl.A03();
    }

    public void setShapeAppearanceModel(C161877ql r2) {
        getImpl().A08(r2);
    }

    public void setShowMotionSpec(C161407pZ r2) {
        getImpl().A0B = r2;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C161407pZ.A00(getContext(), i));
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public AnonymousClass6Z3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }
}
