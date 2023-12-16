package com.whatsapp.search.views;

import X.AnonymousClass4GJ;
import X.AnonymousClass5YI;
import X.C06560Yg;
import X.C116855qy;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

public class ProgressView extends FrameLayout implements AnonymousClass4GJ {
    public AnimatorSet A00;
    public C116855qy A01;
    public boolean A02;
    public final int A03;
    public final CircularProgressBar A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A04 = (CircularProgressBar) C06560Yg.A02(this, R.id.progress_bar);
        this.A03 = AnonymousClass5YI.A04(getContext(), 40.0f);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ProgressView(Context context) {
        this(context, (AttributeSet) null);
    }
}
