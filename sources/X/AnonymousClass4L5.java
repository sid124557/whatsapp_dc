package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;

/* renamed from: X.4L5  reason: invalid class name */
public class AnonymousClass4L5 extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VoipInCallNotifBanner A01;

    public AnonymousClass4L5(VoipInCallNotifBanner voipInCallNotifBanner, long j) {
        this.A01 = voipInCallNotifBanner;
        this.A00 = j;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        Handler handler = this.A01.A0F;
        handler.removeMessages(0);
        handler.sendEmptyMessageDelayed(0, this.A00);
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        InCallBannerViewModel inCallBannerViewModel = this.A01.A05;
        if (inCallBannerViewModel != null) {
            C18320x8.A18(inCallBannerViewModel.A0E, true);
        }
    }
}
