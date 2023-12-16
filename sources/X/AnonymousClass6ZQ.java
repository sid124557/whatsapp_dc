package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.R;

/* renamed from: X.6ZQ  reason: invalid class name */
public class AnonymousClass6ZQ extends C153787c0 {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public EditText A02;
    public final int A03;
    public final int A04;
    public final TimeInterpolator A05;
    public final TimeInterpolator A06;
    public final View.OnClickListener A07 = new C109415ea(this, 5);
    public final View.OnFocusChangeListener A08 = new C1892090k(this, 0);

    public final void A09(boolean z) {
        Animator animator;
        boolean A062 = this.A02.A06();
        boolean A1U = AnonymousClass000.A1U(A062 ? 1 : 0, z ? 1 : 0);
        AnimatorSet animatorSet = this.A00;
        if (!z) {
            animatorSet.cancel();
            this.A01.start();
            if (A1U) {
                animator = this.A01;
            } else {
                return;
            }
        } else if (!animatorSet.isRunning()) {
            this.A01.cancel();
            this.A00.start();
            if (A1U) {
                animator = this.A00;
            } else {
                return;
            }
        } else {
            return;
        }
        animator.end();
    }

    public final boolean A0A() {
        EditText editText = this.A02;
        if (editText == null || ((!editText.hasFocus() && !this.A01.hasFocus()) || C86624Kv.A03(this.A02) <= 0)) {
            return false;
        }
        return true;
    }

    public AnonymousClass6ZQ(AnonymousClass6Ff r4) {
        super(r4);
        this.A03 = C160907oe.A00(r4.getContext(), R.attr.f3nameremoved, 100);
        this.A04 = C160907oe.A00(r4.getContext(), R.attr.f3nameremoved, 150);
        this.A05 = AnonymousClass5YH.A01(C159917mg.A03, r4.getContext(), R.attr.f3nameremoved);
        this.A06 = AnonymousClass5YH.A01(C159917mg.A04, r4.getContext(), R.attr.f3nameremoved);
    }
}
