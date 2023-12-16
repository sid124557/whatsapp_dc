package com.whatsapp.ui.media;

import X.AnonymousClass52g;
import X.C162457s7;
import X.C18270x1;
import X.C86654Ky;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class MediaCard extends AnonymousClass52g {
    public LinearLayout A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
    }

    public void A06(int i, int i2) {
        super.A06(i, i2);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            if (i < 0) {
                i = linearLayout.getPaddingLeft();
            }
            int paddingTop = linearLayout.getPaddingTop();
            if (i2 < 0) {
                i2 = linearLayout.getPaddingRight();
            }
            C86654Ky.A15(linearLayout, i, paddingTop, i2);
        }
    }

    public void A07(AttributeSet attributeSet) {
        super.A07(attributeSet);
        this.A00 = C86654Ky.A0N(this, R.id.media_card_thumbs);
    }

    public String getError() {
        return super.getError();
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void setError(String str) {
        super.setError(str);
        C18270x1.A0p(this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context) {
        super(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
