package X;

import android.view.animation.Animation;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.3A6  reason: invalid class name */
public final class AnonymousClass3A6 implements Animation.AnimationListener {
    public final /* synthetic */ TitleBarView A00;

    public AnonymousClass3A6(TitleBarView titleBarView) {
        this.A00 = titleBarView;
    }

    public void onAnimationEnd(Animation animation) {
        TitleBarView titleBarView = this.A00;
        WaTextView waTextView = titleBarView.A0B;
        if (waTextView == null) {
            throw C18270x1.A0S("mediaQualityToolTip");
        }
        waTextView.setAlpha(0.0f);
        WaTextView waTextView2 = titleBarView.A0B;
        if (waTextView2 == null) {
            throw C18270x1.A0S("mediaQualityToolTip");
        }
        waTextView2.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
