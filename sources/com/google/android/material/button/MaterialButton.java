package com.google.android.material.button;

import X.AnonymousClass001;
import X.AnonymousClass035;
import X.AnonymousClass0VX;
import X.AnonymousClass0X3;
import X.AnonymousClass0YG;
import X.AnonymousClass0YH;
import X.AnonymousClass0x9;
import X.AnonymousClass5Y2;
import X.AnonymousClass6GU;
import X.C105515Vh;
import X.C106925aO;
import X.C1463179t;
import X.C159337lf;
import X.C160917of;
import X.C160927og;
import X.C161837qd;
import X.C161877ql;
import X.C169988Bk;
import X.C178778i5;
import X.C181238mQ;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AnonymousClass035 implements Checkable, C181238mQ {
    public static final int[] A0D = {16842911};
    public static final int[] A0E = {16842912};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public PorterDuff.Mode A06;
    public Drawable A07;
    public C178778i5 A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass5Y2 A0B;
    public final LinkedHashSet A0C;

    private String getA11yClassName() {
        Class cls;
        AnonymousClass5Y2 r0 = this.A0B;
        if (r0 == null || !r0.A0F) {
            cls = Button.class;
        } else {
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    public final void A00(int i, int i2) {
        if (this.A07 != null && getLayout() != null) {
            int i3 = this.A00;
            boolean z = true;
            if (!(i3 == 1 || i3 == 2)) {
                z = false;
            }
            if (z || i3 == 3 || i3 == 4) {
                this.A04 = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i4 = this.A00;
                boolean z2 = true;
                if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.A01 = 0;
                } else {
                    int i5 = this.A03;
                    if (i5 == 0) {
                        i5 = this.A07.getIntrinsicWidth();
                    }
                    int textLayoutWidth = ((((i - getTextLayoutWidth()) - AnonymousClass0YH.A02(this)) - i5) - this.A02) - AnonymousClass0YH.A03(this);
                    if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                        textLayoutWidth /= 2;
                    }
                    boolean z3 = true;
                    if (AnonymousClass0YH.A01(this) != 1) {
                        z3 = false;
                    }
                    if (this.A00 != 4) {
                        z2 = false;
                    }
                    if (z3 != z2) {
                        textLayoutWidth = -textLayoutWidth;
                    }
                    if (this.A01 != textLayoutWidth) {
                        this.A01 = textLayoutWidth;
                    } else {
                        return;
                    }
                }
            } else if (i3 == 16 || i3 == 32) {
                this.A01 = 0;
                if (i3 == 16) {
                    this.A04 = 0;
                } else {
                    int i6 = this.A03;
                    if (i6 == 0) {
                        i6 = this.A07.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i6) - this.A02) - getPaddingBottom()) / 2);
                    if (this.A04 != max) {
                        this.A04 = max;
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
            A01(false);
        }
    }

    public final void A01(boolean z) {
        Drawable drawable = this.A07;
        if (drawable != null) {
            Drawable A0G = C86634Kw.A0G(drawable);
            this.A07 = A0G;
            AnonymousClass0YG.A01(this.A05, A0G);
            PorterDuff.Mode mode = this.A06;
            if (mode != null) {
                AnonymousClass0YG.A04(mode, this.A07);
            }
            int i = this.A03;
            if (i == 0) {
                i = this.A07.getIntrinsicWidth();
            }
            int i2 = this.A03;
            if (i2 == 0) {
                i2 = this.A07.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A07;
            int i3 = this.A01;
            int i4 = this.A04;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.A07.setVisible(true, z);
        }
        if (!z) {
            Drawable[] A042 = AnonymousClass0X3.A04(this);
            Drawable drawable3 = A042[0];
            Drawable drawable4 = A042[1];
            Drawable drawable5 = A042[2];
            int i5 = this.A00;
            if (i5 == 1 || i5 == 2) {
                if (drawable3 == this.A07) {
                    return;
                }
            } else if (i5 == 3 || i5 == 4) {
                if (drawable5 == this.A07) {
                    return;
                }
            } else if (!(i5 == 16 || i5 == 32) || drawable4 == this.A07) {
                return;
            }
        }
        int i6 = this.A00;
        boolean z2 = true;
        if (!(i6 == 1 || i6 == 2)) {
            z2 = false;
        }
        if (z2) {
            AnonymousClass0X3.A02(this.A07, (Drawable) null, (Drawable) null, (Drawable) null, this);
        } else if (i6 == 3 || i6 == 4) {
            AnonymousClass0X3.A02((Drawable) null, (Drawable) null, this.A07, (Drawable) null, this);
        } else if (i6 == 16 || i6 == 32) {
            AnonymousClass0X3.A02((Drawable) null, this.A07, (Drawable) null, (Drawable) null, this);
        }
    }

    public final boolean A02() {
        AnonymousClass5Y2 r0 = this.A0B;
        if (r0 == null || r0.A0E) {
            return false;
        }
        return true;
    }

    public Drawable getIcon() {
        return this.A07;
    }

    public int getIconGravity() {
        return this.A00;
    }

    public int getIconPadding() {
        return this.A02;
    }

    public int getIconSize() {
        return this.A03;
    }

    public ColorStateList getIconTint() {
        return this.A05;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A06;
    }

    public int getInsetBottom() {
        return this.A0B.A02;
    }

    public int getInsetTop() {
        return this.A0B.A05;
    }

    public boolean isChecked() {
        return this.A0A;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        AnonymousClass5Y2 r0 = this.A0B;
        if (r0 != null && r0.A0F) {
            View.mergeDrawableStates(onCreateDrawableState, A0D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass6GU)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass6GU r2 = (AnonymousClass6GU) parcelable;
        super.onRestoreInstanceState(r2.A00);
        setChecked(r2.A00);
    }

    public boolean performClick() {
        if (this.A0B.A0I) {
            toggle();
        }
        return super.performClick();
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass0VX.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setChecked(boolean z) {
        AnonymousClass5Y2 r0 = this.A0B;
        if (r0 != null && r0.A0F && isEnabled() && this.A0A != z) {
            this.A0A = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.A0A;
                if (!materialButtonToggleGroup.A03) {
                    materialButtonToggleGroup.A02(getId(), z2);
                }
            }
            if (!this.A09) {
                this.A09 = true;
                Iterator it = this.A0C.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("onCheckedChanged");
                } else {
                    this.A09 = false;
                }
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A07 != drawable) {
            this.A07 = drawable;
            A01(true);
            C86644Kx.A1H(this);
        }
    }

    public void setIconGravity(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            C86644Kx.A1H(this);
        }
    }

    public void setIconPadding(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass0VX.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw AnonymousClass001.A0c("iconSize cannot be less than 0");
        } else if (this.A03 != i) {
            this.A03 = i;
            A01(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A05 != colorStateList) {
            this.A05 = colorStateList;
            A01(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A06 != mode) {
            this.A06 = mode;
            A01(false);
        }
    }

    public void setInsetBottom(int i) {
        AnonymousClass5Y2 r1 = this.A0B;
        r1.A05(r1.A05, i);
    }

    public void setInsetTop(int i) {
        AnonymousClass5Y2 r1 = this.A0B;
        r1.A05(i, r1.A02);
    }

    public void setPressed(boolean z) {
        C178778i5 r0 = this.A08;
        if (r0 != null) {
            ((C169988Bk) r0).A00.invalidate();
        }
        super.setPressed(z);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.A0B.A0I = z;
    }

    public void toggle() {
        setChecked(!this.A0A);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(context, attributeSet, i, R.style.f12nameremoved), attributeSet, i);
        this.A0C = AnonymousClass0x9.A17();
        boolean z = false;
        this.A0A = false;
        this.A09 = false;
        Context context2 = getContext();
        TypedArray A002 = C161837qd.A00(context2, attributeSet, C1463179t.A0I, new int[0], i, R.style.f12nameremoved);
        this.A02 = A002.getDimensionPixelSize(12, 0);
        this.A06 = C159337lf.A01(PorterDuff.Mode.SRC_IN, A002.getInt(15, -1));
        this.A05 = C160917of.A00(getContext(), A002, 14);
        this.A07 = C160917of.A02(getContext(), A002, 10);
        this.A00 = A002.getInteger(11, 1);
        this.A03 = A002.getDimensionPixelSize(13, 0);
        AnonymousClass5Y2 r8 = new AnonymousClass5Y2(this, new C161877ql(C161877ql.A01(context2, attributeSet, i, R.style.f12nameremoved)));
        this.A0B = r8;
        r8.A03 = A002.getDimensionPixelOffset(1, 0);
        r8.A04 = A002.getDimensionPixelOffset(2, 0);
        r8.A05 = A002.getDimensionPixelOffset(3, 0);
        r8.A02 = A002.getDimensionPixelOffset(4, 0);
        if (A002.hasValue(8)) {
            int dimensionPixelSize = A002.getDimensionPixelSize(8, -1);
            r8.A00 = dimensionPixelSize;
            r8.A06(C86624Kv.A0I(r8.A0D, (float) dimensionPixelSize));
            r8.A0G = true;
        }
        r8.A06 = A002.getDimensionPixelSize(20, 0);
        r8.A0A = C159337lf.A01(PorterDuff.Mode.SRC_IN, A002.getInt(7, -1));
        MaterialButton materialButton = r8.A0J;
        r8.A07 = C160917of.A00(materialButton.getContext(), A002, 6);
        r8.A09 = C160917of.A00(materialButton.getContext(), A002, 19);
        r8.A08 = C160917of.A00(materialButton.getContext(), A002, 16);
        r8.A0F = A002.getBoolean(5, false);
        r8.A01 = A002.getDimensionPixelSize(9, 0);
        r8.A0I = A002.getBoolean(21, true);
        int A032 = AnonymousClass0YH.A03(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int A022 = AnonymousClass0YH.A02(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        if (A002.hasValue(0)) {
            r8.A0E = true;
            materialButton.setSupportBackgroundTintList(r8.A07);
            materialButton.setSupportBackgroundTintMode(r8.A0A);
        } else {
            r8.A03();
        }
        AnonymousClass0YH.A07(materialButton, A032 + r8.A03, paddingTop + r8.A05, A022 + r8.A04, paddingBottom + r8.A02);
        A002.recycle();
        setCompoundDrawablePadding(this.A02);
        A01(this.A07 != null ? true : z);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String A0u = C86614Ku.A0u(this);
        if (getTransformationMethod() != null) {
            A0u = getTransformationMethod().getTransformation(A0u, this).toString();
        }
        Rect A0N = AnonymousClass001.A0N();
        paint.getTextBounds(A0u, 0, A0u.length(), A0N);
        return Math.min(A0N.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil((double) f);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (A02()) {
            return this.A0B.A00;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (A02()) {
            return this.A0B.A08;
        }
        return null;
    }

    public C161877ql getShapeAppearanceModel() {
        if (A02()) {
            return this.A0B.A0D;
        }
        throw AnonymousClass001.A0e("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (A02()) {
            return this.A0B.A09;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (A02()) {
            return this.A0B.A06;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (A02()) {
            return this.A0B.A07;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (A02()) {
            return this.A0B.A0A;
        }
        return super.getSupportBackgroundTintMode();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (A02()) {
            C160927og.A03(this, AnonymousClass5Y2.A00(this.A0B));
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = r2.getA11yClassName()
            r3.setClassName(r0)
            X.5Y2 r0 = r2.A0B
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.setCheckable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass5Y2 r4;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (r4 = this.A0B) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = r4.A0B;
            if (drawable != null) {
                drawable.setBounds(r4.A03, r4.A05, i6 - r4.A04, i5 - r4.A02);
            }
        }
        C86644Kx.A1H(this);
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass6GU r1 = new AnonymousClass6GU(super.onSaveInstanceState());
        r1.A00 = this.A0A;
        return r1;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C86644Kx.A1H(this);
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.A07 != null) {
            if (this.A07.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (A02()) {
            AnonymousClass5Y2 r1 = this.A0B;
            if (AnonymousClass5Y2.A00(r1) != null) {
                AnonymousClass5Y2.A00(r1).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (A02()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                AnonymousClass5Y2 r2 = this.A0B;
                r2.A0E = true;
                MaterialButton materialButton = r2.A0J;
                materialButton.setSupportBackgroundTintList(r2.A07);
                materialButton.setSupportBackgroundTintMode(r2.A0A);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (A02()) {
            this.A0B.A0F = z;
        }
    }

    public void setCornerRadius(int i) {
        if (A02()) {
            AnonymousClass5Y2 r2 = this.A0B;
            if (!r2.A0G || r2.A00 != i) {
                r2.A00 = i;
                r2.A0G = true;
                r2.A06(C86624Kv.A0I(r2.A0D, (float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (A02()) {
            setCornerRadius(C86614Ku.A05(this, i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (A02()) {
            AnonymousClass5Y2.A00(this.A0B).A04(f);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AnonymousClass0VX.A00(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C178778i5 r1) {
        this.A08 = r1;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (A02()) {
            AnonymousClass5Y2 r1 = this.A0B;
            if (r1.A08 != colorStateList) {
                r1.A08 = colorStateList;
                MaterialButton materialButton = r1.A0J;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C106925aO.A02(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (A02()) {
            setRippleColor(AnonymousClass0VX.A00(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C161877ql r2) {
        if (A02()) {
            this.A0B.A06(r2);
            return;
        }
        throw AnonymousClass001.A0e("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (A02()) {
            AnonymousClass5Y2 r0 = this.A0B;
            r0.A0H = z;
            r0.A04();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (A02()) {
            AnonymousClass5Y2 r1 = this.A0B;
            if (r1.A09 != colorStateList) {
                r1.A09 = colorStateList;
                r1.A04();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (A02()) {
            setStrokeColor(AnonymousClass0VX.A00(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (A02()) {
            AnonymousClass5Y2 r1 = this.A0B;
            if (r1.A06 != i) {
                r1.A06 = i;
                r1.A04();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (A02()) {
            setStrokeWidth(C86614Ku.A05(this, i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (A02()) {
            AnonymousClass5Y2 r2 = this.A0B;
            if (r2.A07 != colorStateList) {
                r2.A07 = colorStateList;
                if (AnonymousClass5Y2.A00(r2) != null) {
                    AnonymousClass0YG.A01(r2.A07, AnonymousClass5Y2.A00(r2));
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (A02()) {
            AnonymousClass5Y2 r2 = this.A0B;
            if (r2.A0A != mode) {
                r2.A0A = mode;
                if (AnonymousClass5Y2.A00(r2) != null && r2.A0A != null) {
                    AnonymousClass0YG.A04(r2.A0A, AnonymousClass5Y2.A00(r2));
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        C86644Kx.A1H(this);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
