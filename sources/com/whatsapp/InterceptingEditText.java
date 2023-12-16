package com.whatsapp;

import X.C181558mx;
import X.C89724en;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class InterceptingEditText extends C89724en {
    public C181558mx A00;

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C181558mx r0;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (r0 = this.A00) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        r0.BNC();
        return true;
    }

    public void setOnBackButtonListener(C181558mx r1) {
        this.A00 = r1;
    }

    public InterceptingEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InterceptingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptingEditText(Context context) {
        super(context);
    }
}
