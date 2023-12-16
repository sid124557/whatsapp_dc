package com.whatsapp.pushtorecordmedia;

import X.C162457s7;
import X.C185508tn;
import X.C378924l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class PushToRecordIconAnimation extends FrameLayout implements C185508tn {
    public C185508tn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushToRecordIconAnimation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
    }

    public void BJU(int i) {
        C185508tn r0 = this.A00;
        C162457s7.A0H(r0);
        r0.BJU(i);
    }

    public void Bgt(int i) {
        C185508tn r0 = this.A00;
        C162457s7.A0H(r0);
        r0.Bgt(i);
    }

    public int getTint() {
        C185508tn r0 = this.A00;
        C162457s7.A0H(r0);
        return r0.getTint();
    }

    public void setTint(int i) {
        C185508tn r0 = this.A00;
        C162457s7.A0H(r0);
        r0.setTint(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PushToRecordIconAnimation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PushToRecordIconAnimation(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
