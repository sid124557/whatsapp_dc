package com.whatsapp;

import X.AnonymousClass6Fj;
import X.C162517sJ;
import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class HomePagerSlidingTabStrip extends PagerSlidingTabStrip {
    public boolean A00;

    public void A01() {
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
    }

    public LinearLayout A02(Context context) {
        return new AnonymousClass6Fj(context);
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public void A04(View view, int i) {
        LayoutTransition layoutTransition;
        super.A04(view, i);
        if (view instanceof ViewGroup) {
            View childAt = ((ViewGroup) view).getChildAt(0);
            if ((childAt instanceof ViewGroup) && (layoutTransition = ((ViewGroup) childAt).getLayoutTransition()) != null) {
                layoutTransition.addTransitionListener(new C162517sJ(this));
            }
        }
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public HomePagerSlidingTabStrip(Context context) {
        super(context, (AttributeSet) null);
        A01();
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
