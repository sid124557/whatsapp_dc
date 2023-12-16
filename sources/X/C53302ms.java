package X;

import android.os.Handler;
import android.widget.FrameLayout;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;

/* renamed from: X.2ms  reason: invalid class name and case insensitive filesystem */
public final class C53302ms {
    public C71373c0 A00;
    public final Handler A01 = new Handler();
    public final ExoPlayerErrorFrame A02;
    public final AnonymousClass561 A03;
    public final boolean A04;

    public final void A00() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A02;
        exoPlayerErrorFrame.setLoadingViewVisibility(8);
        C71373c0 r1 = this.A00;
        if (r1 != null) {
            this.A01.removeCallbacks(r1);
        }
        if (exoPlayerErrorFrame.getErrorScreenVisibility() == 0) {
            AnonymousClass561 r12 = this.A03;
            if (r12 != null) {
                r12.setPlayControlVisibility(0);
            }
            FrameLayout frameLayout = exoPlayerErrorFrame.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
    }

    public final void A01() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A02;
        exoPlayerErrorFrame.setLoadingViewVisibility(0);
        C18270x1.A0p(exoPlayerErrorFrame.A02);
    }

    public final void A02(String str) {
        this.A02.setLoadingViewVisibility(0);
        if (this.A04) {
            C71373c0 r1 = this.A00;
            if (r1 != null) {
                this.A01.removeCallbacks(r1);
            } else {
                this.A00 = new C71373c0(17, str, this);
            }
            C71373c0 r3 = this.A00;
            if (r3 != null) {
                this.A01.postDelayed(r3, 5000);
            }
        }
    }

    public C53302ms(ExoPlayerErrorFrame exoPlayerErrorFrame, AnonymousClass561 r3, boolean z) {
        this.A02 = exoPlayerErrorFrame;
        this.A03 = r3;
        this.A04 = z;
    }
}
