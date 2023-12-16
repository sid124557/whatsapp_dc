package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.identity.IdentityVerificationActivity;

/* renamed from: X.4Gv  reason: invalid class name and case insensitive filesystem */
public class C85584Gv extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public C85584Gv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A01 != 0) {
            super.onAnimationEnd(animator);
            return;
        }
        View view = (View) this.A00;
        view.setVisibility(8);
        view.animate().setListener((Animator.AnimatorListener) null);
    }

    public void onAnimationRepeat(Animator animator) {
        if (1 - this.A01 != 0) {
            super.onAnimationRepeat(animator);
            return;
        }
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
        identityVerificationActivity.A0O.A00.setVisibility(8);
        identityVerificationActivity.A0O.A01.setVisibility(0);
        identityVerificationActivity.A0O.A01.A01();
    }
}
