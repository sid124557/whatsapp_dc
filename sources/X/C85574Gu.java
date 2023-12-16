package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.R;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Gu  reason: invalid class name and case insensitive filesystem */
public class C85574Gu extends AnimatorListenerAdapter {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public C85574Gu(IdentityVerificationActivity identityVerificationActivity, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = identityVerificationActivity;
        this.A02 = str;
        this.A01 = str2;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A03 != 0) {
            IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
            identityVerificationActivity.A0O.A05.setText(this.A02);
            identityVerificationActivity.A0O.A04.setText(this.A01);
            C18320x8.A11(identityVerificationActivity.getResources(), identityVerificationActivity.A0O.A05, AnonymousClass5Yj.A02(identityVerificationActivity.A0O.A05.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            identityVerificationActivity.A0O.A05.animate().alpha(1.0f).setDuration(150).setListener((Animator.AnimatorListener) null);
            identityVerificationActivity.A0O.A04.setAlpha(0.0f);
            identityVerificationActivity.A0O.A04.animate().alpha(1.0f).setDuration(150).setListener((Animator.AnimatorListener) null);
            C48952fk r10 = identityVerificationActivity.A0F;
            UserJid userJid = identityVerificationActivity.A0Q;
            if (userJid != null && r10.A02.A00.A0Y(C58422vE.A02, 4871) && r10.A01(userJid)) {
                identityVerificationActivity.A0O.A03.setText(R.string.f11nameremoved);
                identityVerificationActivity.A0O.A03.setVisibility(0);
                identityVerificationActivity.A0O.A03.setAlpha(0.0f);
                identityVerificationActivity.A0O.A03.animate().alpha(1.0f).setDuration(150).setListener((Animator.AnimatorListener) null);
                return;
            }
            return;
        }
        ((IdentityVerificationActivity) this.A00).A7C(this.A02, this.A01);
    }
}
