package com.whatsapp.preference;

import X.C011409i;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;

public class WaCheckBoxPreference extends CheckBoxPreference {
    public void A0T(C011409i r3) {
        super.A0T(r3);
        View view = r3.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            TextView textView = (TextView) findViewById;
            C86654Ky.A1F(textView);
            C86664Kz.A1S(textView);
        }
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaCheckBoxPreference(Context context) {
        super(context, (AttributeSet) null);
    }
}
