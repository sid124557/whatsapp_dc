package X;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.67w  reason: invalid class name and case insensitive filesystem */
public class C1232967w extends C166717z9 {
    public Object A00;
    public final int A01;

    public C1232967w(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onTransitionEnd(Transition transition) {
        ViewGroup A0m;
        switch (this.A01) {
            case 0:
                C91484k4 r5 = (C91484k4) this.A00;
                r5.A0c = false;
                if (r5.A01 == null && (A0m = C86664Kz.A0m(r5, R.id.call_notification_holder)) != null) {
                    View B0k = r5.A0H.B0k(r5, r5.A01, r5.A0D, (C95814uZ) null);
                    r5.A01 = B0k;
                    C86624Kv.A15(B0k, A0m);
                    C112715kB.A00(new AnonymousClass69O(r5, 1), r5.A0H);
                    return;
                }
                return;
            case 1:
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
                if (mediaComposerActivity.A06.getVisibility() != 8) {
                    mediaComposerActivity.A06.setVisibility(8);
                    AlphaAnimation A0G = C86604Kt.A0G();
                    A0G.setDuration(200);
                    mediaComposerActivity.A06.startAnimation(A0G);
                }
                MediaComposerFragment A76 = mediaComposerActivity.A76();
                if (A76 != null) {
                    A76.A1K();
                    return;
                }
                return;
            case 2:
                C86634Kw.A0P(((ProfileInfoActivity) this.A00).A02.animate(), 1.0f).setDuration(125);
                return;
            default:
                super.onTransitionEnd(transition);
                return;
        }
    }

    public void onTransitionStart(Transition transition) {
        ViewPropertyAnimator viewPropertyAnimator;
        float f;
        switch (this.A01) {
            case 0:
                ((C91484k4) this.A00).A0c = true;
                return;
            case 1:
                MediaComposerFragment A76 = ((MediaComposerActivity) this.A00).A76();
                if (A76 != null) {
                    A76.A1L();
                    return;
                }
                return;
            case 3:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
                profileInfoActivity.A02.setScaleX(1.0f);
                profileInfoActivity.A02.setScaleY(1.0f);
                viewPropertyAnimator = profileInfoActivity.A02.animate();
                f = 0.0f;
                break;
            case 4:
                ProfileInfoActivity profileInfoActivity2 = (ProfileInfoActivity) this.A00;
                profileInfoActivity2.A02.setScaleX(0.0f);
                profileInfoActivity2.A02.setScaleY(0.0f);
                viewPropertyAnimator = profileInfoActivity2.A02.animate();
                f = 1.0f;
                break;
            default:
                super.onTransitionStart(transition);
                return;
        }
        C86634Kw.A0P(viewPropertyAnimator, f).setDuration(125);
    }
}
