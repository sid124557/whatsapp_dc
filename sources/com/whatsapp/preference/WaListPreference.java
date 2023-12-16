package com.whatsapp.preference;

import X.C011409i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.ListPreference;
import com.whatsapp.R;

public class WaListPreference extends ListPreference {
    public WaListPreference(Context context) {
        super(context, (AttributeSet) null);
    }

    public void A0T(C011409i r3) {
        super.A0T(r3);
        this.A04 = this.A05.getString(R.string.f11nameremoved);
        View view = r3.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
    }

    public WaListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
