package com.whatsapp.calling.views;

import X.AnonymousClass002;
import X.C100855Cn;
import X.C86624Kv;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class DialpadButton extends LinearLayout {
    /* JADX INFO: finally extract failed */
    public DialpadButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.LayoutParams A0C = C86624Kv.A0C();
        A0C.gravity = 17;
        setLayoutParams(A0C);
        setGravity(17);
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C100855Cn.A01, 0, i);
        try {
            String string = obtainStyledAttributes.getString(1);
            String string2 = obtainStyledAttributes.getString(0);
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            View.inflate(getContext(), R.layout.f8nameremoved, this);
            C86624Kv.A17(this, string, R.id.dialpad_button_number);
            TextView A09 = AnonymousClass002.A09(this, R.id.dialpad_button_letters);
            if (z || !TextUtils.isEmpty(string2)) {
                A09.setText(string2);
            } else {
                A09.setVisibility(8);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public DialpadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialpadButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
