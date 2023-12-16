package com.whatsapp;

import X.AnonymousClass4GJ;
import X.C111685iW;
import X.C116855qy;
import X.C162457s7;
import X.C18270x1;
import X.C187958y5;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class HoverAwareRecyclerView extends RecyclerView implements AnonymousClass4GJ {
    public C187958y5 A00;
    public C116855qy A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A14();
    }

    public final void setSystemFeatures(C187958y5 r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public void A14() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C187958y5) ((C88864av) ((C111685iW) generatedComponent())).A0K.ASM.get();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C187958y5 getSystemFeatures() {
        C187958y5 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemFeatures");
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        getSystemFeatures();
        return super.onInterceptHoverEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A14();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
        A14();
    }

    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A14();
    }
}
