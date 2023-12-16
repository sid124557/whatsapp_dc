package com.whatsapp.emoji;

import X.AnonymousClass4GJ;
import X.C06560Yg;
import X.C116855qy;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiPopupFooter extends FrameLayout implements AnonymousClass4GJ {
    public int A00;
    public C116855qy A01;
    public boolean A02;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public int getTopOffset() {
        return this.A00;
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C06560Yg.A0J(this, this.A00);
    }

    public void setTopOffset(int i) {
        C06560Yg.A0J(this, Math.max(Math.min(getHeight(), i), 0) - getTop());
        this.A00 = getTop();
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public EmojiPopupFooter(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
