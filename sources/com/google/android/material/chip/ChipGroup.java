package com.google.android.material.chip;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0KO;
import X.AnonymousClass0YY;
import X.AnonymousClass4Nw;
import X.C05650Ui;
import X.C105515Vh;
import X.C124946Eo;
import X.C1463179t;
import X.C152997aV;
import X.C161837qd;
import X.C166957zX;
import X.C170008Bm;
import X.C170038Bp;
import X.C178798i7;
import X.C178808i8;
import X.C18280x3;
import X.C187378x7;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChipGroup extends AnonymousClass4Nw {
    public int A00;
    public int A01;
    public C178808i8 A02;
    public final int A03;
    public final C166957zX A04;
    public final C152997aV A05;

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C124946Eo();
    }

    public int getCheckedChipId() {
        C152997aV r1 = this.A05;
        if (!r1.A02) {
            return -1;
        }
        Set set = r1.A04;
        if (!set.isEmpty()) {
            return C18280x3.A05(set.iterator());
        }
        return -1;
    }

    public List getCheckedChipIds() {
        return this.A05.A00(this);
    }

    public int getChipSpacingHorizontal() {
        return this.A00;
    }

    public int getChipSpacingVertical() {
        return this.A01;
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A00 = i;
            requestLayout();
        }
    }

    public void setChipSpacingVertical(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            this.A01 = i;
            requestLayout();
        }
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw AnonymousClass002.A0G("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw AnonymousClass002.A0G("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw AnonymousClass002.A0G("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(C178798i7 r2) {
        C170008Bm r0;
        if (r2 == null) {
            r0 = null;
        } else {
            r0 = new C170008Bm(r2, this);
        }
        this.A02 = r0;
    }

    public void setOnCheckedStateChangeListener(C178808i8 r1) {
        this.A02 = r1;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A04.A00 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.A05.A01 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw AnonymousClass002.A0G("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw AnonymousClass002.A0G("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleSelection(boolean z) {
        C152997aV r4 = this.A05;
        if (r4.A02 != z) {
            r4.A02 = z;
            boolean z2 = !r4.A04.isEmpty();
            Iterator A0v = AnonymousClass001.A0v(r4.A03);
            while (A0v.hasNext()) {
                r4.A03((C187378x7) A0v.next(), false);
            }
            if (z2) {
                r4.A01();
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(context, attributeSet, i, R.style.f12nameremoved), attributeSet, i);
        C152997aV r2 = new C152997aV();
        this.A05 = r2;
        C166957zX r1 = new C166957zX(this);
        this.A04 = r1;
        TypedArray A002 = C161837qd.A00(getContext(), attributeSet, C1463179t.A06, new int[0], i, R.style.f12nameremoved);
        int dimensionPixelOffset = A002.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(A002.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(A002.getDimensionPixelOffset(3, dimensionPixelOffset));
        this.A03 = A002.getBoolean(5, false);
        setSingleSelection(A002.getBoolean(6, false));
        setSelectionRequired(A002.getBoolean(4, false));
        this.A03 = A002.getResourceId(0, -1);
        A002.recycle();
        r2.A00 = new C170038Bp(this);
        super.setOnHierarchyChangeListener(r1);
        AnonymousClass0YY.A06(this, 1);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof C124946Eo)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C124946Eo(getContext(), attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A03;
        if (i != -1) {
            C152997aV r1 = this.A05;
            C187378x7 r0 = (C187378x7) AnonymousClass001.A0i(r1.A03, i);
            if (r0 != null && r1.A02(r0)) {
                r1.A01();
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C05650Ui r4 = new C05650Ui(accessibilityNodeInfo);
        if (this.A03) {
            i = getVisibleChipCount();
        } else {
            i = -1;
        }
        r4.A0F(new AnonymousClass0KO(AccessibilityNodeInfo.CollectionInfo.obtain(this.A02, i, false, C18280x3.A01(this.A05.A02 ? 1 : 0))));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setSingleLine(int i) {
        this.A03 = getResources().getBoolean(i);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C124946Eo(layoutParams);
    }

    public void setSingleLine(boolean z) {
        this.A03 = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }
}
