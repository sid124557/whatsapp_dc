package com.whatsapp.settings;

import X.AnonymousClass6F0;
import X.C124526Cv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class SettingsRowPrivacyLinearLayout extends LinearLayout {
    public float A00;
    public final View A01;

    public void A00() {
        this.A01.setBackgroundDrawable(new C124526Cv(this));
        AnonymousClass6F0 r2 = new AnonymousClass6F0(this);
        r2.setDuration(900);
        r2.setInterpolator(new AccelerateInterpolator());
        startAnimation(r2);
    }

    public SettingsRowPrivacyLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = View.inflate(context, R.layout.f8nameremoved, this);
    }

    public SettingsRowPrivacyLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
