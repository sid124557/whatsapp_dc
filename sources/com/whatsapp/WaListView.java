package com.whatsapp;

import X.AnonymousClass4GJ;
import X.C116855qy;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListView;

public class WaListView extends ListView implements AbsListView.OnScrollListener, AnonymousClass4GJ {
    public int A00;
    public AbsListView.OnScrollListener A01;
    public C116855qy A02;
    public boolean A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public int getScrollState() {
        return this.A00;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AbsListView.OnScrollListener onScrollListener = this.A01;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.A00 = i;
        AbsListView.OnScrollListener onScrollListener = this.A01;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
    }

    public WaListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 0;
        super.setOnScrollListener(this);
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A01 = onScrollListener;
    }

    public WaListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 0;
        super.setOnScrollListener(this);
    }

    public WaListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public WaListView(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 0;
        super.setOnScrollListener(this);
    }
}
