package com.whatsapp.components;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C86614Ku;
import X.C86664Kz;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class AnimatingArrowsLayout extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public List A01;
    public boolean A02;
    public final AnimatorSet A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.start();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.A03;
        animatorSet.removeAllListeners();
        animatorSet.end();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View[] viewArr = new View[4];
        int i = 0;
        viewArr[0] = getChildAt(3);
        viewArr[1] = getChildAt(2);
        viewArr[2] = getChildAt(1);
        this.A01 = AnonymousClass0x9.A1A(getChildAt(0), viewArr, 3);
        ArrayList A0I = AnonymousClass002.A0I(4);
        do {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A01.get(i), "alpha", new float[]{0.0f, 0.6f, 0.0f});
            ofFloat.setDuration(750);
            ofFloat.setStartDelay((long) (i * 100));
            A0I.add(ofFloat);
            i++;
        } while (i < 4);
        AnimatorSet animatorSet = this.A03;
        animatorSet.playTogether(A0I);
        C86614Ku.A0z(animatorSet, this, 14);
        animatorSet.start();
    }

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A03 = C86664Kz.A0O();
    }

    public AnimatingArrowsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
