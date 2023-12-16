package com.whatsapp.settings;

import X.AnonymousClass0VX;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.C100835Cl;
import X.C107335b8;
import X.C131666dx;
import X.C19270z7;
import X.C620733j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class SettingsRowIconText extends C19270z7 {
    public WaImageView A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public C620733j A04;

    public SettingsRowIconText(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setBadgeIcon(Drawable drawable) {
        WaImageView waImageView = this.A00;
        int i = 8;
        if (drawable != null) {
            i = 0;
        }
        if (waImageView.getVisibility() != i) {
            waImageView.setVisibility(i);
        }
        waImageView.setImageDrawable(drawable);
    }

    public void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A01;
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        waImageView.setVisibility(i);
        waImageView.setImageDrawable(drawable);
    }

    public void setSubText(CharSequence charSequence) {
        WaTextView waTextView = this.A02;
        int i = 0;
        if (charSequence == null) {
            i = 8;
        }
        waTextView.setVisibility(i);
        waTextView.setText(charSequence);
    }

    public void setText(int i) {
        WaTextView waTextView = this.A03;
        int i2 = 0;
        if (i == 0) {
            i2 = 8;
        }
        waTextView.setVisibility(i2);
        waTextView.setText(i);
    }

    public WaImageView getIcon() {
        return this.A01;
    }

    public int getLayout() {
        return R.layout.f8nameremoved;
    }

    public SettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        View inflate = View.inflate(context, getLayout(), this);
        this.A01 = AnonymousClass0x9.A0L(inflate, R.id.settings_row_icon);
        this.A03 = AnonymousClass0x7.A0L(inflate, R.id.settings_row_text);
        this.A02 = AnonymousClass0x7.A0L(inflate, R.id.settings_row_subtext);
        this.A00 = AnonymousClass0x9.A0L(inflate, R.id.settings_row_badge);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100835Cl.A01);
        try {
            boolean z = obtainStyledAttributes.getBoolean(4, false);
            if (obtainStyledAttributes.hasValue(3)) {
                Drawable A012 = AnonymousClass0VX.A01(context, obtainStyledAttributes.getResourceId(3, -1));
                WaImageView waImageView = this.A01;
                if (A012 == null) {
                    waImageView.setVisibility(8);
                } else {
                    waImageView.setVisibility(0);
                    if (z) {
                        A012 = new C131666dx(A012, this.A04);
                    }
                }
                this.A01.setImageDrawable(A012);
            }
            int color = obtainStyledAttributes.getColor(1, -1);
            if (color != -1) {
                C107335b8.A0E(this.A01, color);
            }
            setText((CharSequence) this.A04.A0G(obtainStyledAttributes, 6));
            setSubText(this.A04.A0G(obtainStyledAttributes, 5));
            if (obtainStyledAttributes.hasValue(2)) {
                Drawable A013 = AnonymousClass0VX.A01(context, obtainStyledAttributes.getResourceId(2, -1));
                WaImageView waImageView2 = this.A00;
                int i = A013 != null ? 0 : 8;
                if (waImageView2.getVisibility() != i) {
                    waImageView2.setVisibility(i);
                }
                if (A013 != null && z) {
                    A013 = new C131666dx(A013, this.A04);
                }
                this.A00.setImageDrawable(A013);
            }
            int color2 = obtainStyledAttributes.getColor(0, -1);
            if (color2 != -1) {
                C107335b8.A0E(this.A00, color2);
            }
            int color3 = obtainStyledAttributes.getColor(8, -1);
            if (color3 != -1) {
                this.A03.setTextColor(color3);
            }
            if (obtainStyledAttributes.hasValue(7)) {
                this.A02.setMaxLines(obtainStyledAttributes.getInt(7, 0));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setIcon(int i) {
        this.A01.setImageResource(i);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A03;
        int i = 0;
        if (charSequence == null) {
            i = 8;
        }
        waTextView.setVisibility(i);
        waTextView.setText(charSequence);
    }
}
