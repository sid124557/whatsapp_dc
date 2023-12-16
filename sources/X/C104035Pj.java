package X;

import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;

/* renamed from: X.5Pj  reason: invalid class name and case insensitive filesystem */
public class C104035Pj {
    public final /* synthetic */ AnonymousClass51x A00;
    public final /* synthetic */ AnonymousClass51w A01;

    public C104035Pj(AnonymousClass51w r1) {
        this.A01 = r1;
        this.A00 = r1;
    }

    public void A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onPlaybackContentFinished page=", this);
        AnonymousClass51x r3 = this.A00;
        C18260x0.A0o(r3.A0T.A01, A0o);
        StatusPlaybackProgressView statusPlaybackProgressView = r3.A02;
        if (statusPlaybackProgressView.A03 == r3.A0U) {
            statusPlaybackProgressView.A03 = null;
        }
        statusPlaybackProgressView.invalidate();
        if (!r3.A05) {
            C117635sF.A00(r3.A09, this, 15);
        }
    }

    public void A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C86604Kt.A1W(A0o, "playbackPage/onPlaybackContentStarted page=", this);
        AnonymousClass51x r1 = this.A00;
        C18260x0.A0o(r1.A0T.A01, A0o);
        r1.A0A();
    }
}
