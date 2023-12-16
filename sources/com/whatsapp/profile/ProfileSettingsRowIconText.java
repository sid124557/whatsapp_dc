package com.whatsapp.profile;

import X.AnonymousClass4GJ;
import X.C100895Cr;
import X.C107335b8;
import X.C111685iW;
import X.C116855qy;
import X.C620733j;
import X.C86644Kx;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

public class ProfileSettingsRowIconText extends LinearLayout implements AnonymousClass4GJ {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public C620733j A06;
    public C116855qy A07;
    public boolean A08;

    public final void A00() {
        WaImageView waImageView;
        int i;
        if (this.A01.getVisibility() == 0 && this.A04.getVisibility() == 0) {
            waImageView = this.A02;
            i = 4;
        } else {
            waImageView = this.A02;
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A07;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDescription(CharSequence charSequence) {
        WaTextView waTextView = this.A04;
        waTextView.setVisibility(C86644Kx.A08(charSequence));
        A00();
        waTextView.setText(charSequence);
    }

    public void setPrimaryIcon(int i) {
        WaImageView waImageView = this.A01;
        waImageView.setVisibility(C86664Kz.A03(i));
        A00();
        waImageView.setImageResource(i);
        this.A02.setImageResource(i);
    }

    public void setSecondaryIcon(int i) {
        WaImageView waImageView = this.A03;
        waImageView.setVisibility(C86664Kz.A03(i));
        waImageView.setImageResource(i);
    }

    public void setSubText(CharSequence charSequence) {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setVisibility(C86644Kx.A08(charSequence));
        textEmojiLabel.A0K((List) null, charSequence);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A05;
        waTextView.setVisibility(C86644Kx.A08(charSequence));
        waTextView.setText(charSequence);
    }

    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A08) {
            this.A08 = true;
            this.A06 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A08) {
            this.A08 = true;
            this.A06 = C88864av.A02((C111685iW) generatedComponent());
        }
        setOrientation(1);
        setGravity(8388627);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A01 = C86664Kz.A11(this, R.id.profile_settings_row_icon);
        this.A02 = C86664Kz.A11(this, R.id.profile_settings_row_icon_placeholder);
        this.A03 = C86664Kz.A11(this, R.id.profile_settings_row_secondary_icon);
        this.A05 = C86644Kx.A0O(this, R.id.profile_settings_row_text);
        this.A00 = C86644Kx.A0M(this, R.id.profile_settings_row_subtext);
        this.A04 = C86644Kx.A0O(this, R.id.profile_settings_row_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100895Cr.A05);
        try {
            setPrimaryIcon(obtainStyledAttributes.getResourceId(1, 0));
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                C107335b8.A0E(this.A01, color);
            }
            setSecondaryIcon(obtainStyledAttributes.getResourceId(3, 0));
            int color2 = obtainStyledAttributes.getColor(4, -1);
            if (color2 != -1) {
                C107335b8.A0E(this.A03, color2);
            }
            setText(this.A06.A0G(obtainStyledAttributes, 6));
            setSubText(this.A06.A0G(obtainStyledAttributes, 5));
            setDescription(this.A06.A0G(obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ProfileSettingsRowIconText(Context context) {
        this(context, (AttributeSet) null);
    }
}
