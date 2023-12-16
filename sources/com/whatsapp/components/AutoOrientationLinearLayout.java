package com.whatsapp.components;

import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C69963Zi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public final class AutoOrientationLinearLayout extends LinearLayout implements AnonymousClass4GJ {
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

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        post(new C69963Zi(this, 42));
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AutoOrientationLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
