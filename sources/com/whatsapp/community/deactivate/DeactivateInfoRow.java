package com.whatsapp.community.deactivate;

import X.AnonymousClass0VX;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass5CZ;
import X.C162457s7;
import X.C18270x1;
import X.C626936e;
import X.C86604Kt;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public final class DeactivateInfoRow extends LinearLayout {
    public ImageView A00;
    public TextView A01;
    public TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A00(context, attributeSet);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        RuntimeException A0S;
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        this.A00 = C86604Kt.A0J(this, R.id.cdir_icon);
        this.A02 = AnonymousClass0x2.A0I(this, R.id.cdir_row_title);
        this.A01 = AnonymousClass0x2.A0I(this, R.id.cdir_description);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass5CZ.A00);
        C162457s7.A0D(obtainStyledAttributes);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                TextView textView = this.A02;
                if (textView == null) {
                    A0S = C18270x1.A0S("rowTitleView");
                    throw A0S;
                }
                String string = context.getString(resourceId);
                C626936e.A06(string);
                textView.setText(string);
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId2 != 0) {
                TextView textView2 = this.A01;
                if (textView2 == null) {
                    A0S = C18270x1.A0S("rowDescriptionView");
                    throw A0S;
                }
                String string2 = context.getString(resourceId2);
                C626936e.A06(string2);
                textView2.setText(string2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(1, -1);
            if (resourceId3 != -1) {
                ImageView imageView = this.A00;
                if (imageView == null) {
                    A0S = C18270x1.A0S("rowIconView");
                    throw A0S;
                }
                imageView.setImageDrawable(AnonymousClass0VX.A01(context, resourceId3));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                int resourceId4 = obtainStyledAttributes.getResourceId(2, -1);
                ImageView imageView2 = this.A00;
                if (imageView2 == null) {
                    A0S = C18270x1.A0S("rowIconView");
                    throw A0S;
                }
                imageView2.setColorFilter(AnonymousClass0Y8.A04(context, resourceId4), PorterDuff.Mode.SRC_ATOP);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
