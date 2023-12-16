package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.6Yz  reason: invalid class name and case insensitive filesystem */
public class C129046Yz extends C160787oJ {
    public StateListAnimator A00;

    public void A04(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        AnonymousClass6Z3 r4 = this.A0L;
        if (i == 21) {
            r4.refreshDrawableState();
        } else if (r4.getStateListAnimator() == this.A00) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C160787oJ.A0U, A0A(f, f3));
            stateListAnimator.addState(C160787oJ.A0T, A0A(f, f2));
            stateListAnimator.addState(C160787oJ.A0R, A0A(f, f2));
            stateListAnimator.addState(C160787oJ.A0S, A0A(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(ObjectAnimator.ofFloat(r4, "elevation", new float[]{f}).setDuration(0));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 24) {
                A0s.add(AnonymousClass6CA.A0H(View.TRANSLATION_Z, r4, new float[1], r4.getTranslationZ(), 0).setDuration(100));
            }
            A0s.add(AnonymousClass6CA.A0H(View.TRANSLATION_Z, r4, new float[1], 0.0f, 0).setDuration(100));
            animatorSet.playSequentially((Animator[]) A0s.toArray(new Animator[0]));
            animatorSet.setInterpolator(C160787oJ.A0O);
            stateListAnimator.addState(C160787oJ.A0Q, animatorSet);
            stateListAnimator.addState(C160787oJ.A0P, A0A(0.0f, 0.0f));
            this.A00 = stateListAnimator;
            r4.setStateListAnimator(stateListAnimator);
        }
        if (((C170078Bu) this.A0N).A00.A0B || (this.A0F && r4.A02(r4.A04) < this.A06)) {
            A03();
        }
    }

    public void A05(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C106925aO.A02(colorStateList));
        } else {
            super.A05(colorStateList);
        }
    }

    public void A07(Rect rect) {
        int i;
        if (((C170078Bu) this.A0N).A00.A0B) {
            super.A07(rect);
            return;
        }
        if (this.A0F) {
            AnonymousClass6Z3 r2 = this.A0L;
            int A02 = r2.A02(r2.A04);
            int i2 = this.A06;
            if (A02 < i2) {
                i = (i2 - r2.A02(r2.A04)) / 2;
                rect.set(i, i, i, i);
            }
        }
        i = 0;
        rect.set(i, i, i, i);
    }

    public void A09(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            AnonymousClass6Z3 r2 = this.A0L;
            float f = 0.0f;
            if (r2.isEnabled()) {
                r2.setElevation(this.A00);
                if (r2.isPressed()) {
                    f = this.A03;
                } else if (r2.isFocused() || r2.isHovered()) {
                    f = this.A01;
                }
            } else {
                r2.setElevation(0.0f);
            }
            r2.setTranslationZ(f);
        }
    }

    public final Animator A0A(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnonymousClass6Z3 r7 = this.A0L;
        animatorSet.play(ObjectAnimator.ofFloat(r7, "elevation", new float[]{f}).setDuration(0)).with(AnonymousClass6CA.A0H(View.TRANSLATION_Z, r7, new float[1], f2, 0).setDuration(100));
        animatorSet.setInterpolator(C160787oJ.A0O);
        return animatorSet;
    }

    public C129046Yz(AnonymousClass6Z3 r1, C178888iG r2) {
        super(r1, r2);
    }
}
