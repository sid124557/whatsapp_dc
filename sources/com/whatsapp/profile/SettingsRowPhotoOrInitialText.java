package com.whatsapp.profile;

import X.C162457s7;
import X.C18290x4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsRowIconText;

public final class SettingsRowPhotoOrInitialText extends SettingsRowIconText {
    public boolean A00;
    public final WaTextView A01;

    public SettingsRowPhotoOrInitialText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    public int getLayout() {
        return R.layout.f8nameremoved;
    }

    public final void setName(String str) {
        String substring;
        setText((CharSequence) str);
        if (str != null) {
            this.A01.setVisibility(8);
            WaTextView waTextView = this.A01;
            if (str.length() == 0) {
                substring = "?";
            } else {
                substring = str.substring(0, 1);
                C162457s7.A0D(substring);
            }
            waTextView.setText(substring);
            waTextView.setVisibility(0);
        }
    }

    public SettingsRowPhotoOrInitialText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        WaTextView waTextView = (WaTextView) C18290x4.A0M(this, R.id.settings_row_initial);
        this.A01 = waTextView;
        Drawable background = waTextView.getBackground();
        C162457s7.A0K(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(getResources().getColor(R.color.f5nameremoved));
    }

    public SettingsRowPhotoOrInitialText(Context context) {
        super(context, (AttributeSet) null);
        A00();
        WaTextView waTextView = (WaTextView) C18290x4.A0M(this, R.id.settings_row_initial);
        this.A01 = waTextView;
        Drawable background = waTextView.getBackground();
        C162457s7.A0K(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(getResources().getColor(R.color.f5nameremoved));
    }
}
