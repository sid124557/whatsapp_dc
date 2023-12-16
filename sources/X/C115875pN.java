package X;

import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.widget.AudioVolumeView;

/* renamed from: X.5pN  reason: invalid class name and case insensitive filesystem */
public class C115875pN implements AnonymousClass66H {
    public final /* synthetic */ StatusPlaybackBaseFragment A00;

    public C115875pN(StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A00 = statusPlaybackBaseFragment;
    }

    public void BMv(int i, int i2, int i3) {
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A00;
        if (statusPlaybackBaseFragment.A00 && i3 != 0) {
            int i4 = i2 + 1;
            if (i2 == 0) {
                i4 = 0;
            }
            AudioVolumeView audioVolumeView = C86654Ky.A0c(statusPlaybackBaseFragment).A0E;
            audioVolumeView.setVolume((((float) i4) * 1.0f) / ((float) (i3 + 1)));
            audioVolumeView.setVisibility(0);
            Runnable runnable = statusPlaybackBaseFragment.A08;
            audioVolumeView.removeCallbacks(runnable);
            audioVolumeView.postDelayed(runnable, 1500);
        }
    }

    public void BMr(boolean z) {
    }
}
