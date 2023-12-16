package com.bloks.stdlib.components.bkcomponentstextinput;

import X.AnonymousClass001;
import X.C04080Ms;
import X.C09690gb;
import X.C15470rO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import com.whatsapp.R;

public class BloksEditText extends EditText {
    public C15470rO A00;
    public final int A01;

    public static BloksEditText A00(Context context) {
        try {
            BloksEditText bloksEditText = new BloksEditText(context, (AttributeSet) null);
            bloksEditText.setBackgroundResource(17170445);
            return bloksEditText;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message != null && message.contains("ConstantState.newDrawable")) {
                return (BloksEditText) AnonymousClass001.A0R(LayoutInflater.from(context), (ViewGroup) null, R.layout.f8nameremoved);
            }
            throw e;
        }
    }

    public int getDefaultShadowColor() {
        return this.A01;
    }

    public BloksEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = getShadowColor();
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C15470rO r0 = this.A00;
        if (r0 != null) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            C04080Ms r02 = ((C09690gb) r0).A00;
            r02.A07 = selectionStart;
            r02.A06 = selectionEnd;
        }
    }

    public void setOnSelectionChangedListener(C15470rO r1) {
        this.A00 = r1;
    }

    public BloksEditText(Context context) {
        this(context, (AttributeSet) null);
    }
}
