package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.4aF  reason: invalid class name and case insensitive filesystem */
public class C88594aF extends AnonymousClass7XV {
    public boolean A00;
    public final /* synthetic */ AnonymousClass5LV A01;
    public final /* synthetic */ AnonymousClass51x A02;

    public void A03(View view, int i) {
        if (i == 4) {
            AnonymousClass5SJ r2 = this.A02.A0T;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("playbackFragment/onPlaybackExit ");
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = r2.A01;
            C18260x0.A0o(statusPlaybackBaseFragment, A0o);
            C1226465e r1 = (C1226465e) statusPlaybackBaseFragment.A0Q();
            if (r1 != null) {
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) r1;
                statusPlaybackActivity.A03 = 1;
                C86624Kv.A0f(statusPlaybackActivity);
            }
        } else if (i == 3) {
            AnonymousClass51x r22 = this.A02;
            if (r22.A00.A0O != 3) {
                r22.A08().A09(false);
                this.A00 = false;
                r22.A0C();
            }
        }
    }

    public C88594aF(AnonymousClass5LV r1, AnonymousClass51x r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void A02(View view, float f) {
        int i = (f > 0.95f ? 1 : (f == 0.95f ? 0 : -1));
        AnonymousClass51x r2 = this.A02;
        if (i > 0) {
            r2.A0F();
        } else {
            r2.A0M(false, false);
        }
        View view2 = this.A01.A03;
        float f2 = 1.0f;
        if (f < 0.5f) {
            f2 = 2.0f * f;
        }
        view2.setAlpha(f2);
        C1226465e r4 = (C1226465e) r2.A0T.A01.A0Q();
        if (r4 != null) {
            C009707r r42 = (C009707r) r4;
            float f3 = 0.0f;
            if (f >= 0.9f) {
                f3 = 1.0f - ((1.0f - f) * 10.0f);
            }
            View findViewById = r42.findViewById(R.id.video_playback_container_overlay);
            findViewById.setVisibility(0);
            findViewById.setBackgroundColor(((int) (f3 * 255.0f)) << 24);
            r42.findViewById(R.id.video_playback_container).setVisibility(4);
        }
        if (!this.A00) {
            r2.A08().A09(true);
            this.A00 = true;
        }
    }
}
