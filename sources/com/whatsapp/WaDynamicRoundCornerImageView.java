package com.whatsapp;

import X.C100905Cs;
import X.C107235av;
import X.C86614Ku;
import X.C89794ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewOutlineProvider;

public class WaDynamicRoundCornerImageView extends C89794ew {
    public float A00;

    private void A03(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0R);
            try {
                setRadius(obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, C86614Ku.A0E(this))));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setRadius(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            if (f == 0.0f) {
                if (getClipToOutline()) {
                    setClipToOutline(false);
                }
                setOutlineProvider((ViewOutlineProvider) null);
            } else {
                C107235av.A03(this, f);
            }
            invalidateOutline();
        }
    }

    public WaDynamicRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(context, attributeSet);
    }

    public WaDynamicRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context, attributeSet);
    }

    public WaDynamicRoundCornerImageView(Context context) {
        super(context);
    }
}
