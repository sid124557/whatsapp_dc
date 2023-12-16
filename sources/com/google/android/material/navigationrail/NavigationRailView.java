package com.google.android.material.navigationrail;

import X.AnonymousClass000;
import X.AnonymousClass4L0;
import X.AnonymousClass4P2;
import X.AnonymousClass6Z7;
import X.AnonymousClass92G;
import X.C1463179t;
import X.C159337lf;
import X.C161837qd;
import X.C18280x3;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class NavigationRailView extends AnonymousClass4P2 {
    public View A00;
    public Boolean A01;
    public Boolean A02;
    public final int A03;

    private AnonymousClass6Z7 getNavigationRailMenuView() {
        return (AnonymousClass6Z7) this.A04;
    }

    public void A00(View view) {
        View view2 = this.A00;
        if (view2 != null) {
            removeView(view2);
            this.A00 = null;
        }
        this.A00 = view;
        FrameLayout.LayoutParams A0p = C86664Kz.A0p();
        A0p.gravity = 49;
        A0p.topMargin = this.A03;
        addView(view, 0, A0p);
    }

    public View getHeaderView() {
        return this.A00;
    }

    public int getItemMinimumHeight() {
        return ((AnonymousClass6Z7) this.A04).A00;
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return ((AnonymousClass6Z7) this.A04).A01.gravity;
    }

    public void setItemMinimumHeight(int i) {
        ((AnonymousClass6Z7) this.A04).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        ((AnonymousClass6Z7) this.A04).setMenuGravity(i);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.f12nameremoved);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass6Z7 r5 = (AnonymousClass6Z7) this.A04;
        View view = this.A00;
        if (view != null && view.getVisibility() != 8) {
            int bottom = this.A00.getBottom() + this.A03;
            int top = r5.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            } else {
                return;
            }
        } else if ((r5.A01.gravity & 112) == 48) {
            i5 = this.A03;
        } else {
            return;
        }
        if (i5 > 0) {
            r5.layout(r5.getLeft(), r5.getTop() + i5, r5.getRight(), r5.getBottom() + i5);
        }
    }

    public void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + AnonymousClass000.A02(this)), 1073741824);
        }
        super.onMeasure(i, i2);
        View view = this.A00;
        if (view != null && view.getVisibility() != 8) {
            measureChild(this.A04, i, View.MeasureSpec.makeMeasureSpec(AnonymousClass4L0.A05(this.A00, getMeasuredHeight()) - this.A03, Integer.MIN_VALUE));
        }
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = null;
        this.A01 = null;
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        TypedArray typedArray = C161837qd.A01(getContext(), attributeSet, C1463179t.A0V, new int[0], i, i2).A02;
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            A00(C18280x3.A0D(this).inflate(resourceId, this, false));
        }
        setMenuGravity(typedArray.getInt(2, 49));
        if (typedArray.hasValue(1)) {
            setItemMinimumHeight(typedArray.getDimensionPixelSize(1, -1));
        }
        if (typedArray.hasValue(4)) {
            this.A02 = Boolean.valueOf(typedArray.getBoolean(4, false));
        }
        if (typedArray.hasValue(3)) {
            this.A01 = Boolean.valueOf(typedArray.getBoolean(3, false));
        }
        typedArray.recycle();
        C159337lf.A02(this, new AnonymousClass92G(this, 1));
    }

    public NavigationRailView(Context context) {
        this(context, (AttributeSet) null);
    }
}
