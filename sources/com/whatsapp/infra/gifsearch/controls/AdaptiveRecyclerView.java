package com.whatsapp.infra.gifsearch.controls;

import X.AnonymousClass001;
import X.AnonymousClass0UY;
import X.C06440Xs;
import X.C107065ad;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class AdaptiveRecyclerView extends RecyclerView {
    public StaggeredGridLayoutManager A00;
    public final Rect A01 = AnonymousClass001.A0N();

    private int getSpanCount() {
        Rect rect = this.A01;
        getHitRect(rect);
        switch (C107065ad.A02(getContext(), (float) rect.width())) {
            case 360:
            case 480:
                return 2;
            case 600:
            case 720:
                return 3;
            case 840:
            case 960:
                return 4;
            case 1280:
            case 1440:
                return 5;
            case 1600:
            case 1920:
                return 6;
            case 2240:
                return 7;
            default:
                return 1;
        }
    }

    public void A0Y(int i) {
        if (i == 0) {
            A0P();
        }
    }

    public final void A14() {
        if (this.A00 == null) {
            this.A00 = new StaggeredGridLayoutManager(1, 1);
            setItemAnimator((AnonymousClass0UY) null);
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.A00;
            staggeredGridLayoutManager.A16((String) null);
            if (0 != staggeredGridLayoutManager.A01) {
                staggeredGridLayoutManager.A01 = 0;
                staggeredGridLayoutManager.A0V();
            }
            setLayoutManager(this.A00);
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A00;
        if (staggeredGridLayoutManager2 != null) {
            staggeredGridLayoutManager2.A1R(getSpanCount());
        }
    }

    public void setLayoutManager(C06440Xs r2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A00;
        if (staggeredGridLayoutManager == null || r2 == staggeredGridLayoutManager) {
            super.setLayoutManager(r2);
            return;
        }
        throw AnonymousClass001.A0c("LayoutManager cannot be replaced for this RecyclerView");
    }

    public AdaptiveRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A14();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != i && (staggeredGridLayoutManager = this.A00) != null) {
            staggeredGridLayoutManager.A1R(getSpanCount());
        }
    }

    public AdaptiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A14();
    }

    public StaggeredGridLayoutManager getLayoutManager() {
        return this.A00;
    }

    public AdaptiveRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        A14();
    }
}
