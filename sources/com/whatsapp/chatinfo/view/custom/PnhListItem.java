package com.whatsapp.chatinfo.view.custom;

import X.C106905aM;
import X.C162457s7;
import X.C378924l;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class PnhListItem extends ListItemWithLeftIcon {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A03();
    }

    public void A05(AttributeSet attributeSet) {
        super.A05(attributeSet);
        WaTextView waTextView = this.A02;
        waTextView.setTextSize(0, (float) C86614Ku.A05(this, R.dimen.f6nameremoved));
        C106905aM.A04(waTextView);
        waTextView.setLineHeight(C86614Ku.A05(this, R.dimen.f6nameremoved));
        waTextView.setMaxLines(2);
        waTextView.setSingleLine(false);
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setTextSize(0, (float) C86614Ku.A05(this, R.dimen.f6nameremoved));
        textEmojiLabel.setLineHeight(C86614Ku.A05(this, R.dimen.f6nameremoved));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ PnhListItem(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
