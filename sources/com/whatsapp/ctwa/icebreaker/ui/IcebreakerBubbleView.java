package com.whatsapp.ctwa.icebreaker.ui;

import X.AnonymousClass4L0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class IcebreakerBubbleView extends FrameLayout {
    public IcebreakerBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public final void A00() {
        setBackgroundResource(R.drawable.floating_spam_banner_background);
        int A01 = AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved);
        setPadding(A01, A01, A01, 0);
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public IcebreakerBubbleView(Context context) {
        super(context);
    }
}
