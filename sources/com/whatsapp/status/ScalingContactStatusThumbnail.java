package com.whatsapp.status;

import X.C162457s7;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public final class ScalingContactStatusThumbnail extends ContactStatusThumbnail {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A05();
    }

    public void A07(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
    }

    public void A08(int i, int i2) {
        if (i2 == 0) {
            requestLayout();
        }
        super.A08(i, i2);
    }

    public int getBorderSizeAdjustment() {
        return (int) this.A01;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 > 0) {
            this.A01 = ((float) getMeasuredWidth()) * 0.04f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A05();
    }

    public ScalingContactStatusThumbnail(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScalingContactStatusThumbnail(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A05();
    }
}
