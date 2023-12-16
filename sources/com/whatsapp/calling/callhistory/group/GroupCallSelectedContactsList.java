package com.whatsapp.calling.callhistory.group;

import X.C187958y5;
import X.C620733j;
import X.C86614Ku;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.contact.picker.SelectedContactsList;

public class GroupCallSelectedContactsList extends SelectedContactsList {
    public WaImageButton A00;
    public WaImageButton A01;
    public C620733j A02;
    public C187958y5 A03;
    public boolean A04;

    public GroupCallSelectedContactsList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public int getSelectedContactsListLeftPadding() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public final void setUpSelectedButtonAnimatorSet(Animator animator, AnimatorSet animatorSet) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int i = this.A00;
        int i2 = dimensionPixelSize + i;
        int i3 = -1;
        int i4 = 1;
        if (C620733j.A04(this.A02)) {
            i4 = -1;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A00, "translationX", new float[]{(float) (i2 * i4)});
        C86614Ku.A0y(ofFloat.setDuration(240));
        ofFloat.setStartDelay(50);
        int i5 = dimensionPixelSize2 + i;
        if (!C620733j.A04(this.A02)) {
            i3 = 1;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A01, "translationX", new float[]{(float) (i5 * i3)});
        C86614Ku.A0y(ofFloat2.setDuration(240));
        AnimatorSet.Builder play = animatorSet.play(ofFloat);
        if (animator == null) {
            play.with(ofFloat2);
        } else {
            play.with(ofFloat2).after(animator);
        }
    }

    public int getSelectedContactsLayout() {
        return R.layout.f8nameremoved;
    }

    public GroupCallSelectedContactsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public GroupCallSelectedContactsList(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public GroupCallSelectedContactsList(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }
}
