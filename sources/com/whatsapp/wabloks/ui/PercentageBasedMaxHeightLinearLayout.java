package com.whatsapp.wabloks.ui;

import X.C162457s7;
import X.C86614Ku;
import X.C86634Kw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public final class PercentageBasedMaxHeightLinearLayout extends LinearLayout {
    public int A00 = 100;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PercentageBasedMaxHeightLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        C162457s7.A0J(context, 1);
        int i2 = C86634Kw.A0J().heightPixels;
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = C86614Ku.A05(this, identifier);
        } else {
            i = 0;
        }
        this.A01 = i2 - i;
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.A00;
        if (1 <= i3 && i3 < 100) {
            i2 = View.MeasureSpec.makeMeasureSpec(size - ((int) (((float) (this.A01 * (100 - i3))) / 100.0f)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxHeightPercent(int i) {
        this.A00 = i;
    }
}
