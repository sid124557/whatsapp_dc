package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.ArrayList;

/* renamed from: X.0va  reason: invalid class name and case insensitive filesystem */
public class C17440va extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public C17440va(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C17440va r1) {
        AnonymousClass003 r12 = (AnonymousClass003) r1.A00;
        r12.A02(new AnonymousClass0pB(r12));
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A00;
                actionBarOverlayLayout.A05 = null;
                actionBarOverlayLayout.A0F = false;
                return;
            case 4:
                C16320sp r0 = ((AnonymousClass03E) this.A00).A07;
                if (r0 != null) {
                    r0.BbW();
                    return;
                }
                return;
            case 5:
                C16310so r02 = ((AnonymousClass03E) this.A00).A06;
                if (r02 != null) {
                    r02.BRN();
                    return;
                }
                return;
            case 7:
                AnonymousClass00G.A01((AnonymousClass00G) this.A00);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator;
        switch (this.A01) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A00;
                actionBarOverlayLayout.A05 = null;
                actionBarOverlayLayout.A0F = false;
                return;
            case 1:
                ((C10560i8) this.A00).A0H();
                animator.removeListener(this);
                return;
            case 2:
                AnonymousClass0AR r4 = (AnonymousClass0AR) this.A00;
                ArrayList A0J = AnonymousClass002.A0J(r4.A04);
                int size = A0J.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass0P5) A0J.get(i)).A02(r4);
                }
                return;
            case 3:
                AnonymousClass03H r1 = (AnonymousClass03H) this.A00;
                if (r1.getChildCount() <= 0) {
                    return;
                }
                if (animator != r1.A04 || (objectAnimator = r1.A03) == null || !objectAnimator.isStarted()) {
                    r1.A01(r1.getChildAt(0));
                    return;
                }
                return;
            case 4:
                C16320sp r0 = ((AnonymousClass03E) this.A00).A07;
                if (r0 != null) {
                    r0.BbW();
                    return;
                }
                return;
            case 5:
                C16310so r02 = ((AnonymousClass03E) this.A00).A06;
                if (r02 != null) {
                    r02.BRN();
                    return;
                }
                return;
            case 6:
                A00(this);
                return;
            default:
                AnonymousClass00G.A01((AnonymousClass00G) this.A00);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (2 - this.A01 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        AnonymousClass0AR r4 = (AnonymousClass0AR) this.A00;
        ArrayList A0J = AnonymousClass002.A0J(r4.A04);
        int size = A0J.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass0P5) A0J.get(i)).A01(r4);
        }
    }
}
