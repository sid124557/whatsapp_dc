package com.whatsapp;

import X.AnonymousClass4GJ;
import X.C06440Xs;
import X.C100905Cs;
import X.C111685iW;
import X.C116855qy;
import X.C620733j;
import X.C86654Ky;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AutoFitGridRecyclerView extends RecyclerView implements AnonymousClass4GJ {
    public int A00;
    public C620733j A01;
    public C116855qy A02;
    public boolean A03;

    public final void A15(Context context, AttributeSet attributeSet) {
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A00);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        C86654Ky.A1I(this, this.A01, i);
        setLayoutManager(new GridLayoutManager(1));
        this.A0h = true;
    }

    public void A14() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A14();
        A15(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0) {
            C06440Xs layoutManager = getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) layoutManager).A1o(Math.max(1, getMeasuredWidth() / this.A00));
            }
        }
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A14();
        A15(context, attributeSet);
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A14();
    }

    public AutoFitGridRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        A14();
        A15(context, (AttributeSet) null);
    }
}
