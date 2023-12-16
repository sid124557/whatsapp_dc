package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;

/* renamed from: X.6fO  reason: invalid class name and case insensitive filesystem */
public class C132476fO extends AnonymousClass6J5 {
    public void A08() {
        View view = this.A0H;
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.f0nameremoved);
        loadAnimation.setStartOffset((loadAnimation.getDuration() / 4) * (((long) A01()) % 4));
        view.startAnimation(loadAnimation);
    }

    public C132476fO(View view) {
        super(view);
    }
}
