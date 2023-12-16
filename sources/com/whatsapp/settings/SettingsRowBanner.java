package com.whatsapp.settings;

import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass4Sz;
import X.AnonymousClass5Yj;
import X.C06560Yg;
import X.C100835Cl;
import X.C107335b8;
import X.C107575bX;
import X.C620733j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class SettingsRowBanner extends AnonymousClass4Sz {
    public C620733j A00;
    public final View A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public SettingsRowBanner(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setDescription(Context context, String str) {
        if (str == null) {
            this.A03.setVisibility(8);
            return;
        }
        WaTextView waTextView = this.A03;
        waTextView.setVisibility(0);
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = C107575bX.A04(context, AnonymousClass5Yj.A02(waTextView.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        waTextView.setText(C107575bX.A02(str, A0L));
    }

    public void setIcon(int i) {
        this.A02.setImageResource(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        C06560Yg.A02(this.A01, R.id.banner_container).setOnClickListener(onClickListener);
    }

    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        C06560Yg.A02(this.A01, R.id.close).setOnClickListener(onClickListener);
    }

    public void setTitle(String str) {
        WaTextView waTextView = this.A04;
        if (str == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        waTextView.setText(str);
    }

    public SettingsRowBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        this.A01 = inflate;
        this.A02 = AnonymousClass0x9.A0L(inflate, R.id.banner_image);
        this.A04 = AnonymousClass0x7.A0L(inflate, R.id.banner_title);
        this.A03 = AnonymousClass0x7.A0L(inflate, R.id.banner_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100835Cl.A00);
        try {
            if (obtainStyledAttributes.hasValue(1)) {
                setIcon(obtainStyledAttributes.getResourceId(1, -1));
            }
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                C107335b8.A0E(this.A02, color);
            }
            setTitle(this.A00.A0G(obtainStyledAttributes, 3));
            setDescription(context, this.A00.A0G(obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
