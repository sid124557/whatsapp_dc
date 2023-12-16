package com.google.android.material.bottomnavigation;

import X.AnonymousClass000;
import X.AnonymousClass4P2;
import X.AnonymousClass92G;
import X.C1463179t;
import X.C159337lf;
import X.C161837qd;
import X.C187888xy;
import X.C187898xz;
import X.C88644aU;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class BottomNavigationView extends AnonymousClass4P2 {
    public int getMaxItemCount() {
        return 5;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C88644aU r1 = (C88644aU) this.A04;
        if (r1.A00 != z) {
            r1.A00 = z;
            this.A05.Brl(false);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.f12nameremoved);
    }

    public void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + AnonymousClass000.A03(this)), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(C187888xy r1) {
        this.A01 = r1;
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C187898xz r1) {
        this.A02 = r1;
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArray = C161837qd.A01(getContext(), attributeSet, C1463179t.A03, new int[0], i, i2).A02;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        typedArray.recycle();
        C159337lf.A02(this, new AnonymousClass92G(this, 0));
    }

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }
}
