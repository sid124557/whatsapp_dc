package X;

import com.facebook.android.exoplayer2.Timeline;
import com.whatsapp.util.Log;

/* renamed from: X.85G  reason: invalid class name */
public class AnonymousClass85G implements C186008ub {
    public final /* synthetic */ C138046pg A00;

    public AnonymousClass85G(C138046pg r1) {
        this.A00 = r1;
    }

    public void BYB() {
    }

    public void BYS(int i) {
    }

    public void Bfi(C142846xt r5, String str) {
        if (C142846xt.A03 == r5) {
            C55682qk r3 = this.A00.A02;
            if (r3 != null) {
                r3.A0A("exoaudioplayer/audio-track-not-playable", false, (String) null);
            }
            Log.e("exoaudioplayer/onTracksChanged: Media includes audio tracks, but none are playable by this device");
        }
    }

    public void BYL(C143946zk r3, C142846xt r4) {
        C18260x0.A1O(AnonymousClass001.A0o(), "exoaudioplayer/onPlayerError: ", r3);
    }

    public void BeR(C166607yy r1, AnonymousClass7VV r2) {
    }

    public void BYN(int i, boolean z, boolean z2) {
    }

    public void Be4(Timeline timeline, Object obj, int i) {
    }
}
