package com.whatsapp;

import X.AnonymousClass0Y8;
import X.AnonymousClass0YG;
import X.AnonymousClass0YH;
import X.AnonymousClass4RF;
import X.C06130Wj;
import X.C100905Cs;
import X.C107555bV;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaLinearLayout extends AnonymousClass4RF {
    public int A00 = 0;

    public final void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0T);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            Drawable background = getBackground();
            if (!(background == null || this.A00 == 0)) {
                setBackground(background);
            }
            obtainStyledAttributes.recycle();
            if (z) {
                AnonymousClass0YH.A06(this, 0);
                setTag(R.id.bidilayout_ignore, C107555bV.A00);
            }
        }
    }

    public void setBackground(Drawable drawable) {
        if (!(this.A00 == 0 || drawable == null)) {
            drawable = C06130Wj.A01(drawable);
            AnonymousClass0YG.A06(drawable, AnonymousClass0Y8.A04(getContext(), this.A00));
        }
        super.setBackground(drawable);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02(context, attributeSet);
    }

    public WaLinearLayout(Context context) {
        super(context);
    }
}
