package X;

import android.view.animation.Animation;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.Queue;

/* renamed from: X.9Y5  reason: invalid class name */
public class AnonymousClass9Y5 implements Animation.AnimationListener {
    public final /* synthetic */ BkFcsPreloadingScreenFragment A00;

    public AnonymousClass9Y5(BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment) {
        this.A00 = bkFcsPreloadingScreenFragment;
    }

    public void onAnimationEnd(Animation animation) {
        AnonymousClass9RA r2 = this.A00.A03;
        r2.A00 = false;
        while (true) {
            Queue queue = r2.A01;
            if (!queue.isEmpty()) {
                ((Runnable) queue.remove()).run();
            } else {
                return;
            }
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
