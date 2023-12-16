package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.C06560Yg;
import X.C18270x1;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C89364cO;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ListItemWithLeftIcon extends C89364cO {
    public View A00;
    public View A01;

    public void setDescriptionVisibility(int i) {
        int i2;
        if (this.A00.getVisibility() != i) {
            this.A00.setVisibility(i);
            boolean A1T = AnonymousClass000.A1T(i);
            Resources resources = getResources();
            int i3 = R.dimen.f6nameremoved;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            Resources resources2 = getResources();
            if (A1T) {
                i3 = R.dimen.f6nameremoved;
            }
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(i3);
            this.A00.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(this.A01);
            int i4 = 3;
            if (A1T) {
                i4 = 51;
            }
            A0U.gravity = i4;
            this.A01.setLayoutParams(A0U);
            WaImageView waImageView = this.A01;
            if (A1T) {
                i2 = C86634Kw.A07(this);
            } else {
                i2 = 0;
            }
            waImageView.setPadding(0, i2, 0, 0);
        }
    }

    public void setTitleTextColor(int i) {
        this.A02.setTextColor(i);
    }

    public void A05(AttributeSet attributeSet) {
        super.A05(attributeSet);
        this.A00 = C06560Yg.A02(this, R.id.list_item_with_left_icon);
        this.A01 = C06560Yg.A02(this, R.id.list_item_text_container);
        if (C86664Kz.A1V(this.A00)) {
            this.A00.setVisibility(8);
        }
    }

    public void A06(Spanned spanned, boolean z) {
        if (TextUtils.isEmpty(spanned)) {
            setDescriptionVisibility(8);
            return;
        }
        setDescriptionVisibility(0);
        this.A00.setText(spanned);
        if (z) {
            C18270x1.A0q(this.A00, this.A05);
            AnonymousClass0x2.A12(this.A00, this.A03);
        }
    }

    public void A07(View view) {
        C86644Kx.A0I(this, R.id.right_view_container).addView(view);
    }

    public void setDescription(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setDescriptionVisibility(8);
            return;
        }
        setDescriptionVisibility(0);
        super.setDescription(charSequence);
    }

    public int getRootLayoutID() {
        return R.layout.f8nameremoved;
    }

    public ListItemWithLeftIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ListItemWithLeftIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListItemWithLeftIcon(Context context) {
        super(context, (AttributeSet) null);
    }
}
