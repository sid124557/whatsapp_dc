package com.whatsapp.preference;

import X.AnonymousClass0x2;
import X.C011409i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import com.whatsapp.R;

public class WaPreferenceCategory extends PreferenceCategory {
    public void A0T(C011409i r4) {
        super.A0T(r4);
        View findViewById = r4.A0H.findViewById(16908310);
        if (findViewById != null && (findViewById instanceof TextView)) {
            AnonymousClass0x2.A0q(this.A05, (TextView) findViewById, R.color.f5nameremoved);
        }
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaPreferenceCategory(Context context) {
        super(context, (AttributeSet) null);
    }
}
