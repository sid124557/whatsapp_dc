package X;

import android.view.animation.Animation;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.7zh  reason: invalid class name and case insensitive filesystem */
public class C167057zh implements Animation.AnimationListener {
    public final /* synthetic */ CircularRevealView A00;

    public C167057zh(CircularRevealView circularRevealView) {
        this.A00 = circularRevealView;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.A09 = false;
    }

    public void onAnimationRepeat(Animation animation) {
        this.A00.A09 = true;
    }

    public void onAnimationStart(Animation animation) {
        this.A00.A09 = true;
    }
}
