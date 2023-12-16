package com.whatsapp.conversation.comments;

import X.C162457s7;
import X.C18270x1;
import X.C378924l;
import X.C56612sH;
import X.C86624Kv;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class MessageDate extends WaTextView {
    public C56612sH A00;
    public boolean A01;

    public final void setTime(C56612sH r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C56612sH getTime() {
        C56612sH r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("time");
    }

    public MessageDate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A08();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A08();
    }

    public /* synthetic */ MessageDate(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
