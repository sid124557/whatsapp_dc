package com.whatsapp;

import X.AnonymousClass0YG;
import X.AnonymousClass4Pj;
import X.C06130Wj;
import X.C100905Cs;
import X.C86624Kv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaFrameLayout extends AnonymousClass4Pj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    public final void A04(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.A04 = isPressed();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0S);
            this.A01 = obtainStyledAttributes.getResourceId(1, 0);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            if (!(getBackground() == null || this.A01 == 0)) {
                setBackgroundDrawable(getBackground());
            }
            this.A03 = obtainStyledAttributes.getResourceId(3, 0);
            this.A02 = obtainStyledAttributes.getResourceId(2, 0);
            if (!(getForeground() == null || this.A03 == 0)) {
                setForeground(getForeground());
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        int i;
        if (!(this.A01 == 0 || drawable == null)) {
            drawable = C06130Wj.A01(drawable);
            if (!isPressed() || (i = this.A00) == 0) {
                i = this.A01;
            }
            AnonymousClass0YG.A06(drawable, C86624Kv.A02(this, i));
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setForeground(Drawable drawable) {
        int i;
        if (!(this.A03 == 0 || drawable == null)) {
            drawable = C06130Wj.A01(drawable);
            if (!isPressed() || (i = this.A02) == 0) {
                i = this.A03;
            }
            AnonymousClass0YG.A06(drawable, C86624Kv.A02(this, i));
        }
        super.setForeground(drawable);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass4Pj.A00(this);
        A04(context, attributeSet);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() != this.A04) {
            this.A04 = isPressed();
            setBackgroundDrawable(getBackground());
            setForeground(getForeground());
        }
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass4Pj.A00(this);
        A04(context, attributeSet);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass4Pj.A00(this);
    }

    public WaFrameLayout(Context context) {
        super(context);
        AnonymousClass4Pj.A00(this);
    }
}
