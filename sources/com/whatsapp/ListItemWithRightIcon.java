package com.whatsapp;

import X.C89284cD;
import android.content.Context;
import android.util.AttributeSet;

public class ListItemWithRightIcon extends C89284cD {
    public void setDescriptionVisibility(int i) {
        if (this.A00.getVisibility() != i) {
            this.A00.setVisibility(i);
        }
    }

    public int getRootLayoutID() {
        return R.layout.f8nameremoved;
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListItemWithRightIcon(Context context) {
        super(context);
    }
}
