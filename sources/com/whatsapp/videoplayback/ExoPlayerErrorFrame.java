package com.whatsapp.videoplayback;

import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C162457s7;
import X.C18290x4;
import X.C378924l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

public final class ExoPlayerErrorFrame extends FrameLayout implements AnonymousClass4GJ {
    public View.OnClickListener A00;
    public View A01;
    public FrameLayout A02;
    public TextView A03;
    public C116855qy A04;
    public boolean A05;
    public final FrameLayout A06;
    public final CircularProgressBar A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.A06 = (FrameLayout) inflate;
        this.A07 = (CircularProgressBar) C18290x4.A0M(this, R.id.loading);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final int getErrorScreenVisibility() {
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return 8;
    }

    public final void setLoadingViewVisibility(int i) {
        this.A07.setVisibility(i);
    }

    public final void setOnRetryListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExoPlayerErrorFrame(Context context, AttributeSet attributeSet, int i, int i2, C378924l r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
