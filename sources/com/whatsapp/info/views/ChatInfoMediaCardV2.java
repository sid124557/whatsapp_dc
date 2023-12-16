package com.whatsapp.info.views;

import X.C102805Ki;
import X.C149947On;
import X.C86664Kz;
import X.C91794l6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.ui.media.MediaCard;

public class ChatInfoMediaCardV2 extends MediaCard {
    public boolean A00;

    public int getThumbnailIconGravity() {
        return C86664Kz.A04(C102805Ki.A00(this.A0B) ? 1 : 0);
    }

    public int getThumbnailTextGravity() {
        if (C102805Ki.A00(this.A0B)) {
            return 3;
        }
        return 5;
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public C91794l6 A03(ViewGroup.LayoutParams layoutParams, C149947On r5, int i) {
        C91794l6 A03 = super.A03(layoutParams, r5, i);
        A03.A02 = getResources().getDimension(R.dimen.f6nameremoved);
        return A03;
    }

    public void A07(AttributeSet attributeSet) {
        super.A07(attributeSet);
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = getThumbnailPixelSize();
        this.A00.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.A06.getLayoutParams();
        layoutParams2.height = getThumbnailPixelSize();
        this.A06.setLayoutParams(layoutParams2);
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public ChatInfoMediaCardV2(Context context) {
        super(context);
        A01();
    }
}
