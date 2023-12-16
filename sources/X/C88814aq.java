package X;

import android.view.animation.Animation;
import com.whatsapp.R;

/* renamed from: X.4aq  reason: invalid class name and case insensitive filesystem */
public class C88814aq extends C167047zg {
    public final /* synthetic */ Animation A00;
    public final /* synthetic */ C116635qb A01;
    public final /* synthetic */ boolean A02;

    public C88814aq(Animation animation, C116635qb r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = animation;
    }

    public void onAnimationEnd(Animation animation) {
        boolean z = this.A02;
        C116635qb r1 = this.A01;
        int i = R.drawable.ic_pause_draft_preview;
        if (z) {
            i = R.drawable.ic_resume_draft_preview;
        }
        r1.A01(i);
        r1.A0D.startAnimation(this.A00);
    }

    public void onAnimationStart(Animation animation) {
        this.A01.A0D.setClickable(false);
    }
}
