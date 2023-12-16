package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.00F  reason: invalid class name */
public class AnonymousClass00F extends AnimatorListenerAdapter implements C16980uL {
    public boolean A00 = false;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public final boolean A05;

    public AnonymousClass00F(View view, int i) {
        this.A03 = view;
        this.A02 = i;
        this.A04 = (ViewGroup) view.getParent();
        this.A05 = true;
        A00(true);
    }

    public void Beg(C10560i8 r2) {
        A00(false);
    }

    public void Beh(C10560i8 r2) {
        A00(true);
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public final void A00(boolean z) {
        ViewGroup viewGroup;
        if (this.A05 && this.A01 != z && (viewGroup = this.A04) != null) {
            this.A01 = z;
            C05180Si.A01(viewGroup, z);
        }
    }

    public void Bef(C10560i8 r4) {
        if (!this.A00) {
            AnonymousClass0VZ.A02.A05(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
        r4.A0C(this);
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            AnonymousClass0VZ.A02.A05(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    public void onAnimationPause(Animator animator) {
        if (!this.A00) {
            AnonymousClass0VZ.A02.A05(this.A03, this.A02);
        }
    }

    public void onAnimationResume(Animator animator) {
        if (!this.A00) {
            AnonymousClass0VZ.A02.A05(this.A03, 0);
        }
    }

    public void Bee(C10560i8 r1) {
    }

    public void Bei(C10560i8 r1) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
