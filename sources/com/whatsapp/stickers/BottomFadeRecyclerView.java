package com.whatsapp.stickers;

import X.AnonymousClass4GJ;
import X.C116855qy;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public class BottomFadeRecyclerView extends RecyclerView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public BottomFadeRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
