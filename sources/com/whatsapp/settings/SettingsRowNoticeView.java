package com.whatsapp.settings;

import X.AnonymousClass0RP;
import X.AnonymousClass65U;
import X.AnonymousClass7NA;
import X.C60222yC;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whatsapp.R;

public class SettingsRowNoticeView extends SettingsRowIconText implements AnonymousClass65U {
    public int A00;
    public Drawable A01;
    public boolean A02;

    public void setNotice(C60222yC r3) {
        AnonymousClass7NA r1 = r3.A05;
        this.A00 = r1.A00;
        setText((CharSequence) r1.A03);
        this.A01.setVisibility(4);
    }

    public SettingsRowNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    public int getNoticeId() {
        return this.A00;
    }

    public SettingsRowNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A01 = AnonymousClass0RP.A00(context, R.drawable.ic_settings_row_badge);
    }

    public SettingsRowNoticeView(Context context) {
        this(context, (AttributeSet) null);
    }
}
