package com.whatsapp;

import X.AnonymousClass4GJ;
import X.C116855qy;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

public class EnhancedConstraintLayoutGroup extends Group implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public void A06(ConstraintLayout constraintLayout) {
        super.A06(constraintLayout);
        for (int findViewById : getReferencedIds()) {
            constraintLayout.findViewById(findViewById).setAlpha(getAlpha());
        }
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        A01();
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public EnhancedConstraintLayoutGroup(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
