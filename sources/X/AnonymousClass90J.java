package X;

import android.animation.Animator;
import java.util.Timer;

/* renamed from: X.90J  reason: invalid class name */
public class AnonymousClass90J implements Animator.AnimatorListener {
    public Object A00;
    public final int A01;

    public AnonymousClass90J(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A01) {
            case 0:
                AnonymousClass7FG r2 = (AnonymousClass7FG) this.A00;
                C159147lC r4 = r2.A00;
                if (!r4.A07.A01 || r4.A05) {
                    r4.A02(C142566xP.AUTOGEN_FINISHED);
                    new Timer("onSuccessTimer", false).schedule(new C174328Tv(r4, r2.A01), 1000);
                    return;
                }
                return;
            case 1:
                ((AnonymousClass5KV) this.A00).A03.setVisibility(0);
                return;
            case 2:
                return;
            default:
                C92914nZ r1 = (C92914nZ) this.A00;
                r1.A0B = false;
                C92914nZ.A01(r1, false);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A01) {
            case 0:
                return;
            case 3:
                C92914nZ r1 = (C92914nZ) this.A00;
                r1.A0B = true;
                C92914nZ.A01(r1, false);
                return;
            default:
                ((AnonymousClass5KV) this.A00).A03.setVisibility(8);
                return;
        }
    }
}
