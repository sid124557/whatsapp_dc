package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.67F  reason: invalid class name */
public class AnonymousClass67F extends AnimatorListenerAdapter {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass67F(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public static void A00(AnonymousClass67F r8) {
        C159097l7 r0 = (C159097l7) r8.A01;
        C178908iI r82 = r0.A0K;
        int i = r0.A0B;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) r82;
        snackbarContentLayout.A02.setAlpha(1.0f);
        long j = (long) i;
        ViewPropertyAnimator duration = snackbarContentLayout.A02.animate().alpha(0.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.A03;
        long j2 = (long) 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (snackbarContentLayout.A01.getVisibility() == 0) {
            snackbarContentLayout.A01.setAlpha(1.0f);
            snackbarContentLayout.A01.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A02) {
            case 0:
                ((C159097l7) this.A01).A09(this.A00);
                return;
            case 1:
                C92314mS r2 = (C92314mS) this.A01;
                FrameLayout.LayoutParams A0r = C86664Kz.A0r(r2);
                int i = this.A00;
                A0r.height = i;
                r2.setLayoutParams(A0r);
                if (i == 0) {
                    r2.setVisibility(8);
                    r2.A09(false);
                    return;
                }
                return;
            case 3:
                ((MessageReplyActivity) this.A01).A07.setBackgroundColor(this.A00);
                return;
            case 4:
                super.onAnimationEnd(animator);
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) this.A01;
                textStatusComposerActivity.A09.clearAnimation();
                ViewGroup viewGroup = textStatusComposerActivity.A09;
                int i2 = this.A00;
                viewGroup.setVisibility(i2);
                if (i2 == 0) {
                    textStatusComposerActivity.A0B.post(new C117635sF(this, 45));
                    return;
                }
                ViewGroup.LayoutParams layoutParams = textStatusComposerActivity.A09.getLayoutParams();
                if (layoutParams.height != -2) {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    textStatusComposerActivity.A09.setLayoutParams(layoutParams);
                    textStatusComposerActivity.A09.requestLayout();
                    return;
                }
                return;
            default:
                View view = (View) this.A01;
                int i3 = this.A00;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i3;
                    view.setLayoutParams(layoutParams2);
                }
                view.setAlpha(1.0f);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A02) {
            case 0:
                A00(this);
                return;
            case 1:
                C92314mS r1 = (C92314mS) this.A01;
                if (r1.getVisibility() != 0) {
                    r1.A06();
                    r1.setVisibility(0);
                    r1.A09(true);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
