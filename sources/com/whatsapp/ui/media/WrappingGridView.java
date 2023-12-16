package com.whatsapp.ui.media;

import X.C378924l;
import X.C86624Kv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

public final class WrappingGridView extends GridView {
    public void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public WrappingGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WrappingGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WrappingGridView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WrappingGridView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }
}
