package com.whatsapp.text;

import X.AnonymousClass03n;
import X.AnonymousClass4GJ;
import X.C100905Cs;
import X.C116855qy;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class ShadowDimsTextView extends AnonymousClass03n implements AnonymousClass4GJ {
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

    public ShadowDimsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public ShadowDimsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0M);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(1, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(2, 0.0f);
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            setShadowLayer(dimension, dimension2, dimension3, color);
        } else {
            getPaint().clearShadowLayer();
        }
        obtainStyledAttributes.recycle();
    }
}
