package com.whatsapp.dmsetting;

import X.AnonymousClass97D;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class EphemeralSettingListItem extends AnonymousClass97D {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EphemeralSettingListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
    }

    public void A05(AttributeSet attributeSet) {
        super.A05(attributeSet);
        WaTextView waTextView = this.A02;
        waTextView.setMaxLines(2);
        waTextView.setSingleLine(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EphemeralSettingListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ EphemeralSettingListItem(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EphemeralSettingListItem(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
