package com.whatsapp.settings.view.custom;

import X.AnonymousClass001;
import X.AnonymousClass0VX;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass5Yj;
import X.C100775Cf;
import X.C107635bd;
import X.C86614Ku;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class SettingsMeTabActionIcon extends LinearLayout {
    public int A00;
    public int A01;
    public WaImageView A02;
    public WaTextView A03;

    public void setActionTitleWidth(int i) {
        LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(this.A03);
        A0U.width = (int) TypedValue.applyDimension(1, (float) i, C86614Ku.A0E(this));
        A0U.height = -2;
        this.A03.setLayoutParams(A0U);
    }

    public SettingsMeTabActionIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A02 = AnonymousClass0x9.A0L(this, R.id.action_icon);
        this.A03 = AnonymousClass0x7.A0L(this, R.id.action_title);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100775Cf.A00);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            Context context2 = getContext();
            if (resourceId == 0) {
                resourceId = AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
            }
            this.A01 = AnonymousClass0Y8.A04(context2, resourceId);
            this.A00 = AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
            this.A03.setTextColor(this.A01);
            int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
            this.A02.setImageDrawable(AnonymousClass0VX.A01(context, resourceId2));
            setTitle(resourceId3);
            obtainStyledAttributes.recycle();
        }
    }

    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        this.A02.setEnabled(z);
        WaTextView waTextView = this.A03;
        if (z) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        waTextView.setTextColor(i);
    }

    public void setTitle(int i) {
        C86664Kz.A1T(this.A03, C107635bd.A01(getContext().getString(i)));
    }

    public SettingsMeTabActionIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public SettingsMeTabActionIcon(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }
}
