package com.whatsapp.components;

import X.AnonymousClass4GJ;
import X.C100905Cs;
import X.C116855qy;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class MainChildCoordinatorLayout extends CoordinatorLayout implements AnonymousClass4GJ {
    public int A00;
    public C116855qy A01;
    public boolean A02;

    public boolean A0F(View view, int i, int i2) {
        if ((view == null || view.getId() != this.A00) && !super.A0F(view, i, i2)) {
            return false;
        }
        return true;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public MainChildCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0C);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public MainChildCoordinatorLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public MainChildCoordinatorLayout(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public MainChildCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0C);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
    }
}
