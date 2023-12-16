package com.google.android.material.chip;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass01J;
import X.AnonymousClass0VX;
import X.AnonymousClass0WH;
import X.AnonymousClass0XH;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x9;
import X.AnonymousClass4TM;
import X.C06130Wj;
import X.C06560Yg;
import X.C105515Vh;
import X.C106925aO;
import X.C1463179t;
import X.C151417Ur;
import X.C151957Wy;
import X.C153517bS;
import X.C15750rs;
import X.C159337lf;
import X.C160917of;
import X.C160927og;
import X.C161407pZ;
import X.C161837qd;
import X.C161877ql;
import X.C178788i6;
import X.C178848iC;
import X.C181238mQ;
import X.C187378x7;
import X.C188738zP;
import X.C188908zg;
import X.C1891890i;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import X.C88654aX;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import java.util.Arrays;

public class Chip extends AppCompatCheckBox implements C187378x7, C181238mQ, C178788i6 {
    public static final Rect A0J = AnonymousClass001.A0N();
    public static final int[] A0K = {16842911};
    public static final int[] A0L = {16842913};
    public int A00;
    public int A01;
    public InsetDrawable A02;
    public RippleDrawable A03;
    public View.OnClickListener A04;
    public CompoundButton.OnCheckedChangeListener A05;
    public C88654aX A06;
    public C178848iC A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Rect A0F;
    public final RectF A0G;
    public final AnonymousClass4TM A0H;
    public final C151417Ur A0I;

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw AnonymousClass002.A0G("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw AnonymousClass002.A0G("Chip does not support multi-line text");
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw AnonymousClass002.A0G("Chip does not support multi-line text");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.A0G;
        rectF.setEmpty();
        if (A07() && this.A04 != null) {
            C88654aX r4 = this.A06;
            Rect bounds = r4.getBounds();
            rectF.setEmpty();
            if (r4.A0f()) {
                float f = r4.A01 + r4.A06 + r4.A07 + r4.A08 + r4.A0B;
                if (C06130Wj.A00(r4) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    private C153517bS getTextAppearance() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0v.A01;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.A0B != z) {
            this.A0B = z;
            refreshDrawableState();
        }
    }

    public final void A03() {
        ColorStateList A022 = C106925aO.A02(this.A06.A0R);
        Drawable drawable = this.A02;
        if (drawable == null) {
            drawable = this.A06;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(A022, drawable, (Drawable) null);
        this.A03 = rippleDrawable;
        AnonymousClass0YY.A04(rippleDrawable, this);
        A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r1.right == r2) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r1 > 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(int r7) {
        /*
            r6 = this;
            r6.A01 = r7
            boolean r0 = r6.A0D
            r3 = 0
            if (r0 == 0) goto L_0x0063
            X.4aX r2 = r6.A06
            float r0 = r2.A03
            int r0 = (int) r0
            int r1 = X.AnonymousClass001.A0C(r7, r0, r3)
            int r0 = r2.getIntrinsicWidth()
            int r0 = X.AnonymousClass001.A0C(r7, r0, r3)
            if (r0 > 0) goto L_0x005e
            if (r1 <= 0) goto L_0x0063
            r2 = 0
        L_0x001d:
            int r3 = r1 / 2
        L_0x001f:
            android.graphics.drawable.InsetDrawable r0 = r6.A02
            if (r0 == 0) goto L_0x0040
            android.graphics.Rect r1 = X.AnonymousClass001.A0N()
            android.graphics.drawable.InsetDrawable r0 = r6.A02
            r0.getPadding(r1)
            int r0 = r1.top
            if (r0 != r3) goto L_0x0040
            int r0 = r1.bottom
            if (r0 != r3) goto L_0x0040
            int r0 = r1.left
            if (r0 != r2) goto L_0x0040
            int r0 = r1.right
            if (r0 != r2) goto L_0x0040
        L_0x003c:
            r6.A03()
            return
        L_0x0040:
            int r0 = r6.getMinHeight()
            if (r0 == r7) goto L_0x0049
            r6.setMinHeight(r7)
        L_0x0049:
            int r0 = r6.getMinWidth()
            if (r0 == r7) goto L_0x0052
            r6.setMinWidth(r7)
        L_0x0052:
            X.4aX r1 = r6.A06
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r4 = r2
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A02 = r0
            goto L_0x003c
        L_0x005e:
            int r2 = r0 / 2
            if (r1 <= 0) goto L_0x001f
            goto L_0x001d
        L_0x0063:
            android.graphics.drawable.InsetDrawable r0 = r6.A02
            if (r0 == 0) goto L_0x003c
            r0 = 0
            r6.A02 = r0
            r6.setMinWidth(r3)
            float r0 = r6.getChipMinHeight()
            int r0 = (int) r0
            r6.setMinHeight(r0)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.A06(int):void");
    }

    public final boolean A07() {
        Drawable drawable;
        C88654aX r0 = this.A06;
        if (r0 == null || (drawable = r0.A0Y) == null) {
            return false;
        }
        if (!(drawable instanceof C15750rs) || ((AnonymousClass01J) ((C15750rs) drawable)).A02 != null) {
            return true;
        }
        return false;
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.A0E) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.A0H.A0S(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A0E) {
            AnonymousClass4TM r1 = this.A0H;
            if (r1.A0R(keyEvent) && r1.A02 != Integer.MIN_VALUE) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getAccessibilityClassName() {
        /*
            r3 = this;
            java.lang.CharSequence r0 = r3.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.CharSequence r0 = r3.A08
            return r0
        L_0x000b:
            X.4aX r0 = r3.A06
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.A0g
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            java.lang.String r2 = "android.widget.Button"
            if (r0 == 0) goto L_0x002c
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L_0x0035
            com.google.android.material.chip.ChipGroup r1 = (com.google.android.material.chip.ChipGroup) r1
            X.7aV r0 = r1.A05
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "android.widget.RadioButton"
            return r0
        L_0x002c:
            boolean r0 = r3.isClickable()
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "android.view.View"
            return r0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.getAccessibilityClassName():java.lang.CharSequence");
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.A02;
        if (insetDrawable == null) {
            return this.A06;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0W;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0L;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return Math.max(0.0f, r0.A0G());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.A06;
    }

    public float getChipEndPadding() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A01;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C88654aX r0 = this.A06;
        if (r0 == null || (drawable = r0.A0X) == null) {
            return null;
        }
        if (drawable instanceof C15750rs) {
            return ((AnonymousClass01J) ((C15750rs) drawable)).A02;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A02;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0N;
        }
        return null;
    }

    public float getChipMinHeight() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A03;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A04;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0O;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A05;
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C88654aX r0 = this.A06;
        if (r0 == null || (drawable = r0.A0Y) == null) {
            return null;
        }
        if (drawable instanceof C15750rs) {
            return ((AnonymousClass01J) ((C15750rs) drawable)).A02;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0d;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A06;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A07;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A08;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0Q;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0a;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.A0E) {
            AnonymousClass4TM r2 = this.A0H;
            if (r2.A02 == 1 || r2.A00 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C161407pZ getHideMotionSpec() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0b;
        }
        return null;
    }

    public float getIconEndPadding() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A09;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0A;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0R;
        }
        return null;
    }

    public C161877ql getShapeAppearanceModel() {
        return this.A06.A03.A0K;
    }

    public C161407pZ getShowMotionSpec() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0c;
        }
        return null;
    }

    public float getTextEndPadding() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0B;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            return r0.A0C;
        }
        return 0.0f;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0L);
        }
        C88654aX r0 = this.A06;
        if (r0 != null && r0.A0g) {
            View.mergeDrawableStates(onCreateDrawableState, A0K);
        }
        return onCreateDrawableState;
    }

    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.A02;
        if (drawable2 == null) {
            drawable2 = this.A06;
        }
        if (drawable == drawable2 || drawable == this.A03) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.A02;
        if (drawable2 == null) {
            drawable2 = this.A06;
        }
        if (drawable == drawable2 || drawable == this.A03) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0Z(z);
        }
    }

    public void setCheckableResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0Z(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        C88654aX r0 = this.A06;
        if (r0 == null) {
            this.A0C = z;
        } else if (r0.A0g) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0V(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0V(AnonymousClass0VX.A01(r1.A0p, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0Q(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0Q(AnonymousClass0VX.A00(r1.A0p, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0a(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C88654aX r1 = this.A06;
        if (r1 != null && r1.A0M != colorStateList) {
            r1.A0M = colorStateList;
            C86634Kw.A1O(r1);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A002;
        C88654aX r2 = this.A06;
        if (r2 != null && r2.A0M != (A002 = AnonymousClass0VX.A00(r2.A0p, i))) {
            r2.A0M = A002;
            C86634Kw.A1O(r2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0I(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0I(C86614Ku.A00(r1, i));
        }
    }

    public void setChipDrawable(C88654aX r3) {
        C88654aX r1 = this.A06;
        if (r1 != r3) {
            if (r1 != null) {
                r1.A0f = AnonymousClass0x9.A14((Object) null);
            }
            this.A06 = r3;
            r3.A0n = false;
            r3.A0f = AnonymousClass0x9.A14(this);
            A06(this.A01);
        }
    }

    public void setChipEndPadding(float f) {
        C88654aX r1 = this.A06;
        if (r1 != null && r1.A01 != f) {
            r1.A01 = f;
            r1.invalidateSelf();
            r1.A0H();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C88654aX r2 = this.A06;
        if (r2 != null) {
            float A002 = C86614Ku.A00(r2, i);
            if (r2.A01 != A002) {
                r2.A01 = A002;
                r2.invalidateSelf();
                r2.A0H();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0W(drawable);
        }
    }

    public void setChipIconResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0W(AnonymousClass0VX.A01(r1.A0p, i));
        }
    }

    public void setChipIconSize(float f) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0J(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0J(C86614Ku.A00(r1, i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0R(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0R(AnonymousClass0VX.A00(r1.A0p, i));
        }
    }

    public void setChipIconVisible(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0b(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C88654aX r1 = this.A06;
        if (r1 != null && r1.A03 != f) {
            r1.A03 = f;
            r1.invalidateSelf();
            r1.A0H();
        }
    }

    public void setChipMinHeightResource(int i) {
        C88654aX r2 = this.A06;
        if (r2 != null) {
            float A002 = C86614Ku.A00(r2, i);
            if (r2.A03 != A002) {
                r2.A03 = A002;
                r2.invalidateSelf();
                r2.A0H();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C88654aX r1 = this.A06;
        if (r1 != null && r1.A04 != f) {
            r1.A04 = f;
            r1.invalidateSelf();
            r1.A0H();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C88654aX r2 = this.A06;
        if (r2 != null) {
            float A002 = C86614Ku.A00(r2, i);
            if (r2.A04 != A002) {
                r2.A04 = A002;
                r2.invalidateSelf();
                r2.A0H();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0S(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0S(AnonymousClass0VX.A00(r1.A0p, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0K(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0K(C86614Ku.A00(r1, i));
        }
    }

    public void setCloseIcon(Drawable drawable) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0X(drawable);
        }
        A02();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C88654aX r2 = this.A06;
        if (r2 != null && r2.A0d != charSequence) {
            AnonymousClass0XH A022 = AnonymousClass0XH.A02();
            r2.A0d = A022.A03(A022.A00, charSequence);
            r2.invalidateSelf();
        }
    }

    public void setCloseIconEndPadding(float f) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0L(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0L(C86614Ku.A00(r1, i));
        }
    }

    public void setCloseIconResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0X(AnonymousClass0VX.A01(r1.A0p, i));
        }
        A02();
    }

    public void setCloseIconSize(float f) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0M(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0M(C86614Ku.A00(r1, i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0N(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0N(C86614Ku.A00(r1, i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0T(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0T(AnonymousClass0VX.A00(r1.A0p, i));
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass002.A0G("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw AnonymousClass002.A0G("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass002.A0G("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw AnonymousClass002.A0G("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw AnonymousClass002.A0G("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw AnonymousClass002.A0G("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw AnonymousClass002.A0G("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw AnonymousClass002.A0G("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A06 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C88654aX r0 = this.A06;
            if (r0 != null) {
                r0.A0a = truncateAt;
                return;
            }
            return;
        }
        throw AnonymousClass002.A0G("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.A0D = z;
        A06(this.A01);
    }

    public void setHideMotionSpec(C161407pZ r2) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0b = r2;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0b = C161407pZ.A00(r1.A0p, i);
        }
    }

    public void setIconEndPadding(float f) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0O(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0O(C86614Ku.A00(r1, i));
        }
    }

    public void setIconStartPadding(float f) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0P(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0P(C86614Ku.A00(r1, i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.A06 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A04 = onClickListener;
        A02();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C88654aX r1 = this.A06;
        if (!(r1 == null || r1.A0R == colorStateList)) {
            r1.A0R = colorStateList;
            C86634Kw.A1O(r1);
        }
        A03();
    }

    public void setRippleColorResource(int i) {
        C88654aX r2 = this.A06;
        if (r2 != null) {
            ColorStateList A002 = AnonymousClass0VX.A00(r2.A0p, i);
            if (r2.A0R != A002) {
                r2.A0R = A002;
                C86634Kw.A1O(r2);
            }
            A03();
        }
    }

    public void setShapeAppearanceModel(C161877ql r2) {
        this.A06.setShapeAppearanceModel(r2);
    }

    public void setShowMotionSpec(C161407pZ r2) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0c = r2;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C88654aX r1 = this.A06;
        if (r1 != null) {
            r1.A0c = C161407pZ.A00(r1.A0p, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw AnonymousClass002.A0G("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = r0.A0n;
            CharSequence charSequence2 = charSequence;
            if (z) {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            C88654aX r2 = this.A06;
            if (r2 != null) {
                if (charSequence == null) {
                    charSequence = "";
                }
                if (!TextUtils.equals(r2.A0e, charSequence)) {
                    r2.A0e = charSequence;
                    r2.A0v.A03 = true;
                    r2.invalidateSelf();
                    r2.A0H();
                }
            }
        }
    }

    public void setTextEndPadding(float f) {
        C88654aX r1 = this.A06;
        if (r1 != null && r1.A0B != f) {
            r1.A0B = f;
            r1.invalidateSelf();
            r1.A0H();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C88654aX r2 = this.A06;
        if (r2 != null) {
            float A002 = C86614Ku.A00(r2, i);
            if (r2.A0B != A002) {
                r2.A0B = A002;
                r2.invalidateSelf();
                r2.A0H();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C88654aX r1 = this.A06;
        if (r1 != null && r1.A0C != f) {
            r1.A0C = f;
            r1.invalidateSelf();
            r1.A0H();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C88654aX r2 = this.A06;
        if (r2 != null) {
            float A002 = C86614Ku.A00(r2, i);
            if (r2.A0C != A002) {
                r2.A0C = A002;
                r2.invalidateSelf();
                r2.A0H();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(context, attributeSet, i, R.style.f12nameremoved), attributeSet, i);
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.A0F = AnonymousClass001.A0N();
        this.A0G = AnonymousClass002.A07();
        this.A0I = new C188908zg(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw AnonymousClass002.A0G("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw AnonymousClass002.A0G("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw AnonymousClass002.A0G("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw AnonymousClass002.A0G("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw AnonymousClass002.A0G("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C88654aX A002 = C88654aX.A00(context2, attributeSet, i);
        int[] iArr = C1463179t.A05;
        TypedArray A003 = C161837qd.A00(context2, attributeSet2, iArr, new int[0], i2, R.style.f12nameremoved);
        this.A0D = A003.getBoolean(32, false);
        this.A01 = (int) Math.ceil((double) A003.getDimension(20, (float) Math.ceil((double) C159337lf.A00(getContext(), 48))));
        A003.recycle();
        setChipDrawable(A002);
        A002.A04(AnonymousClass0YZ.A00(this));
        TypedArray A004 = C161837qd.A00(context2, attributeSet2, iArr, new int[0], i2, R.style.f12nameremoved);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C160917of.A00(context2, A004, 2));
        }
        boolean hasValue = A004.hasValue(37);
        A004.recycle();
        this.A0H = new AnonymousClass4TM(this, this);
        A02();
        if (!hasValue) {
            setOutlineProvider(new C188738zP(this, 0));
        }
        setChecked(this.A0C);
        setText(A002.A0e);
        setEllipsize(A002.A0a);
        A05();
        if (!this.A06.A0n) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A04();
        if (this.A0D) {
            setMinHeight(this.A01);
        }
        this.A00 = AnonymousClass0YH.A01(this);
        super.setOnCheckedChangeListener(new C1891890i(this, 0));
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.A0F;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    public final void A02() {
        boolean z;
        C88654aX r0;
        if (!A07() || (r0 = this.A06) == null || !r0.A0j || this.A04 == null) {
            C06560Yg.A0O(this, (AnonymousClass0WH) null);
            z = false;
        } else {
            C06560Yg.A0O(this, this.A0H);
            z = true;
        }
        this.A0E = z;
    }

    public final void A04() {
        C88654aX r2;
        if (!C86664Kz.A1V(this) && (r2 = this.A06) != null) {
            int A0F2 = (int) (r2.A01 + r2.A0B + r2.A0F());
            int A0E2 = (int) (r2.A04 + r2.A0C + r2.A0E());
            if (this.A02 != null) {
                Rect A0N = AnonymousClass001.A0N();
                this.A02.getPadding(A0N);
                A0E2 += A0N.left;
                A0F2 += A0N.right;
            }
            AnonymousClass0YH.A07(this, A0E2, getPaddingTop(), A0F2, getPaddingBottom());
        }
    }

    public final void A05() {
        TextPaint paint = getPaint();
        C88654aX r0 = this.A06;
        if (r0 != null) {
            paint.drawableState = r0.getState();
        }
        C153517bS textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A03(getContext(), paint, this.A0I);
        }
    }

    public void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        C88654aX r0 = this.A06;
        if (r0 != null && (drawable = r0.A0Y) != null && drawable.isStateful()) {
            C88654aX r2 = this.A06;
            int isEnabled = isEnabled();
            if (this.A09) {
                isEnabled++;
            }
            if (this.A0A) {
                isEnabled++;
            }
            if (this.A0B) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            int i = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.A09) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.A0A) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.A0B) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(r2.A0o, iArr)) {
                r2.A0o = iArr;
                if (r2.A0f() && r2.A0g(r2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C160927og.A03(this, this.A06);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.A0E) {
            AnonymousClass4TM r2 = this.A0H;
            int i2 = r2.A02;
            if (i2 != Integer.MIN_VALUE) {
                r2.A0N(i2);
            }
            if (z) {
                r2.A0Q(i, rect);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        /*
            r9 = this;
            super.onInitializeAccessibilityNodeInfo(r10)
            java.lang.CharSequence r0 = r9.getAccessibilityClassName()
            r10.setClassName(r0)
            X.4aX r0 = r9.A06
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A0g
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r10.setCheckable(r0)
            boolean r0 = r9.isClickable()
            r10.setClickable(r0)
            android.view.ViewParent r0 = r9.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L_0x0076
            android.view.ViewParent r4 = r9.getParent()
            X.4Nw r4 = (X.AnonymousClass4Nw) r4
            X.0Ui r2 = new X.0Ui
            r2.<init>(r10)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0056
            r3 = 0
            r5 = 0
        L_0x0037:
            int r0 = r4.getChildCount()
            if (r3 >= r0) goto L_0x0056
            android.view.View r1 = r4.getChildAt(r3)
            boolean r0 = r1 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L_0x0053
            android.view.View r0 = r4.getChildAt(r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0053
            if (r1 == r9) goto L_0x0057
            int r5 = r5 + 1
        L_0x0053:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0056:
            r5 = -1
        L_0x0057:
            r0 = 2131433191(0x7f0b16e7, float:1.848816E38)
            java.lang.Object r1 = r9.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0077
            r3 = -1
        L_0x0063:
            boolean r8 = r9.isChecked()
            r4 = 1
            r7 = 0
            r6 = r4
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r3, r4, r5, r6, r7, r8)
            X.0KP r0 = new X.0KP
            r0.<init>(r1)
            r2.A0G(r0)
        L_0x0076:
            return
        L_0x0077:
            int r3 = X.AnonymousClass001.A0K(r1)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.A00 != i) {
            this.A00 = i;
            A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r4 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r4 = r6.getActionMasked()
            android.graphics.RectF r2 = r5.getCloseIconTouchBounds()
            float r1 = r6.getX()
            float r0 = r6.getY()
            boolean r3 = r2.contains(r1, r0)
            r2 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0052
            if (r4 == r2) goto L_0x0032
            r0 = 2
            if (r4 == r0) goto L_0x0028
            r0 = 3
            if (r4 == r0) goto L_0x0050
        L_0x0020:
            boolean r0 = super.onTouchEvent(r6)
            if (r0 != 0) goto L_0x0027
            r2 = 0
        L_0x0027:
            return r2
        L_0x0028:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0020
            if (r3 != 0) goto L_0x0027
            r5.setCloseIconPressed(r1)
            return r2
        L_0x0032:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0050
            r5.playSoundEffect(r1)
            android.view.View$OnClickListener r0 = r5.A04
            if (r0 == 0) goto L_0x0040
            r0.onClick(r5)
        L_0x0040:
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0049
            X.4TM r0 = r5.A0H
            r0.A0I(r2, r2)
        L_0x0049:
            r0 = 1
        L_0x004a:
            r5.setCloseIconPressed(r1)
            if (r0 != 0) goto L_0x0027
            goto L_0x0020
        L_0x0050:
            r0 = 0
            goto L_0x004a
        L_0x0052:
            if (r3 == 0) goto L_0x0020
            r5.setCloseIconPressed(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.A08 = charSequence;
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A04(f);
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setInternalOnCheckedChangeListener(C178848iC r1) {
        this.A07 = r1;
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0K = i;
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A05 = onCheckedChangeListener;
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C88654aX r0 = this.A06;
        if (r0 != null) {
            Context context = r0.A0p;
            r0.A0v.A01(context, new C153517bS(context, i));
        }
        A05();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C88654aX r3 = this.A06;
        if (r3 != null) {
            float applyDimension = TypedValue.applyDimension(i, f, C86614Ku.A0E(this));
            C151957Wy r1 = r3.A0v;
            C153517bS r0 = r1.A01;
            if (r0 != null) {
                r0.A00 = applyDimension;
                r1.A04.setTextSize(applyDimension);
                r3.Bdz();
            }
        }
        A05();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public void setCheckedIconVisible(boolean z) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0a(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0b(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0c(z);
        }
        A02();
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass002.A0G("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw AnonymousClass002.A0G("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass002.A0G("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw AnonymousClass002.A0G("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C88654aX r0 = this.A06;
        if (r0 != null) {
            Context context2 = r0.A0p;
            r0.A0v.A01(context2, new C153517bS(context2, i));
        }
        A05();
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setTextAppearance(C153517bS r3) {
        C88654aX r0 = this.A06;
        if (r0 != null) {
            r0.A0v.A01(r0.A0p, r3);
        }
        A05();
    }
}
