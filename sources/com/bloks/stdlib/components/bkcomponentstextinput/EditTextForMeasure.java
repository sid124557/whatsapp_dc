package com.bloks.stdlib.components.bkcomponentstextinput;

import X.C162457s7;
import X.C378924l;
import android.content.Context;
import android.util.AttributeSet;

public final class EditTextForMeasure extends BloksEditText {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditTextForMeasure(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public void invalidate() {
    }

    public void requestLayout() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextForMeasure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
    }
}
