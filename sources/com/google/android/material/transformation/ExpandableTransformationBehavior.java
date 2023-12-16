package com.google.android.material.transformation;

import X.AnonymousClass001;
import X.AnonymousClass6CA;
import X.AnonymousClass6CE;
import X.C1446272h;
import X.C158807ka;
import X.C86614Ku;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet A00;

    public AnimatorSet A0L(View view, View view2, boolean z, boolean z2) {
        C158807ka r4;
        Property property;
        float[] fArr;
        FabTransformationScrimBehavior fabTransformationScrimBehavior = (FabTransformationScrimBehavior) this;
        ArrayList A0s = AnonymousClass001.A0s();
        if (z) {
            r4 = fabTransformationScrimBehavior.A01;
        } else {
            r4 = fabTransformationScrimBehavior.A00;
        }
        float f = 0.0f;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            property = View.ALPHA;
            fArr = new float[1];
            f = 1.0f;
        } else {
            property = View.ALPHA;
            fArr = new float[1];
        }
        ObjectAnimator A0H = AnonymousClass6CA.A0H(property, view2, fArr, f, 0);
        r4.A00(A0H);
        A0s.add(A0H);
        AnimatorSet animatorSet = new AnimatorSet();
        C1446272h.A00(animatorSet, A0s);
        animatorSet.addListener(new AnonymousClass6CE(view2, fabTransformationScrimBehavior, z));
        return animatorSet;
    }

    public boolean A0K(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.A00;
        boolean z3 = false;
        if (animatorSet != null) {
            z3 = true;
            animatorSet.cancel();
        }
        AnimatorSet A0L = A0L(view, view2, z, z3);
        this.A00 = A0L;
        C86614Ku.A0z(A0L, this, 6);
        this.A00.start();
        if (!z2) {
            this.A00.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandableTransformationBehavior() {
    }
}
