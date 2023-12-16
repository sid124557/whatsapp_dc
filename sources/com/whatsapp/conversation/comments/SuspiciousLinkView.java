package com.whatsapp.conversation.comments;

import X.C106905aM;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class SuspiciousLinkView extends WaTextView {
    public boolean A00;

    public SuspiciousLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A08();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspiciousLinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A08();
        C106905aM.A04(this);
    }

    public /* synthetic */ SuspiciousLinkView(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
