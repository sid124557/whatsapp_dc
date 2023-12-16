package X;

import android.transition.Transition;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.67v  reason: invalid class name and case insensitive filesystem */
public class C1232867v extends C166717z9 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1232867v(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onTransitionEnd(Transition transition) {
        if (this.A02 != 0) {
            super.onTransitionEnd(transition);
            return;
        }
        MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
        C003203q A0Q = mediaViewBaseFragment.A0Q();
        if (A0Q != null && !mediaViewBaseFragment.A0i && !A0Q.isFinishing()) {
            mediaViewBaseFragment.A02.setVisibility(0);
            AlphaAnimation A0H = C86604Kt.A0H();
            A0H.setDuration(600);
            mediaViewBaseFragment.A02.startAnimation(A0H);
            mediaViewBaseFragment.A1W(true, true);
            PhotoView A1J = mediaViewBaseFragment.A1J(mediaViewBaseFragment.A1M(mediaViewBaseFragment.A09.getCurrentItem()));
            if (A1J != null) {
                A1J.A09(true);
            }
            ((C182718os) this.A01).Bed(true);
        }
    }

    public void onTransitionStart(Transition transition) {
        if (1 - this.A02 != 0) {
            super.onTransitionStart(transition);
            return;
        }
        C162457s7.A0J(transition, 0);
        super.onTransitionStart(transition);
        C009707r r1 = (C009707r) this.A00;
        View findViewById = r1.findViewById(R.id.picture);
        View findViewById2 = r1.findViewById(R.id.picture_animation);
        findViewById.setVisibility(4);
        findViewById2.setVisibility(0);
    }
}
