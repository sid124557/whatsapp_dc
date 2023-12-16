package com.whatsapp.biz.profile;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0RP;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass5Yj;
import X.C100895Cr;
import X.C108775dX;
import X.C18290x4;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.text.NumberFormat;

public class TrustSignalItem extends LinearLayout {
    public int A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaTextView A03;
    public WaTextView A04;

    private void setAccountInfo(String str) {
        this.A03.setText(str);
    }

    private void setAccountName(String str) {
        if (this.A00 == 1) {
            str = AnonymousClass000.A0V("@", str, AnonymousClass001.A0o());
        }
        this.A04.setText(str);
    }

    private void setEditable(boolean z) {
        WaImageView waImageView;
        int i;
        WaTextView waTextView = this.A04;
        Context context = getContext();
        Context context2 = getContext();
        if (z) {
            AnonymousClass5Yj.A08(context2, context, waTextView, R.attr.f3nameremoved, R.color.f5nameremoved);
            waImageView = this.A01;
            i = 0;
        } else {
            AnonymousClass5Yj.A08(context2, context, waTextView, R.attr.f3nameremoved, R.color.f5nameremoved);
            waImageView = this.A01;
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    private void setIcon(Drawable drawable) {
        this.A02.setImageDrawable(drawable);
    }

    public String getAccountName() {
        return C86614Ku.A0u(this.A04);
    }

    public int getAccountType() {
        return this.A00;
    }

    public void setUpFromAccount(C108775dX r6) {
        String string;
        int i;
        if (r6 == null) {
            i = 8;
        } else {
            setAccountName(r6.A01);
            int i2 = r6.A00;
            if (i2 > 0) {
                int i3 = this.A00;
                int i4 = R.plurals.f9nameremoved;
                if (i3 == 0) {
                    i4 = R.plurals.f9nameremoved;
                }
                string = C18290x4.A0G(this).getQuantityString(i4, i2, AnonymousClass000.A1b(NumberFormat.getIntegerInstance().format((long) i2)));
            } else {
                Resources resources = getResources();
                int i5 = this.A00;
                int i6 = R.string.f11nameremoved;
                if (i5 == 0) {
                    i6 = R.string.f11nameremoved;
                }
                string = resources.getString(i6);
            }
            setAccountInfo(string);
            i = 0;
        }
        setVisibility(i);
    }

    public TrustSignalItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
        setClickable(true);
        setFocusable(true);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A02 = AnonymousClass0x9.A0L(this, R.id.linked_account_icon);
        this.A04 = AnonymousClass0x7.A0L(this, R.id.linked_account_name);
        this.A03 = AnonymousClass0x7.A0L(this, R.id.linked_account_info);
        this.A01 = AnonymousClass0x9.A0L(this, R.id.linked_account_edit_button);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100895Cr.A0A);
        try {
            int integer = obtainStyledAttributes.getInteger(0, 0);
            this.A00 = integer;
            if (integer == 0) {
                setIcon(AnonymousClass0RP.A00(getContext(), R.drawable.ic_settings_fb));
                C86634Kw.A14(getContext(), this.A02, R.color.f5nameremoved);
            } else if (integer == 1) {
                setIcon(AnonymousClass0RP.A00(getContext(), R.drawable.ic_business_instagram));
            }
            setEditable(obtainStyledAttributes.getBoolean(2, false));
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                this.A01.setColorFilter(C86624Kv.A02(this, resourceId));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public TrustSignalItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrustSignalItem(Context context) {
        this(context, (AttributeSet) null);
    }
}
