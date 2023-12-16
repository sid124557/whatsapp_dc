package com.whatsapp.components;

import X.C111685iW;
import X.C88864av;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;

public class RoundCornerProgressBarV2 extends RoundCornerProgressBar {
    public ValueAnimator A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            this.A05 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public RoundCornerProgressBarV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public RoundCornerProgressBarV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public RoundCornerProgressBarV2(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public RoundCornerProgressBarV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
