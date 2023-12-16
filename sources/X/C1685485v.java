package X;

import com.google.android.exoplayer2.Timeline;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.85v  reason: invalid class name and case insensitive filesystem */
public class C1685485v implements C186488vR {
    public final /* synthetic */ C138036pf A00;

    public void BYM(boolean z, int i) {
        if (i == 3) {
            C138036pf r3 = this.A00;
            if (!r3.A06) {
                int B7A = (int) r3.A08.B7A();
                r3.A00 = B7A;
                C147237Di r1 = r3.A04;
                if (r1 != null) {
                    r3.A06 = true;
                    r1.A00.A03 = B7A;
                }
            }
        }
    }

    public C1685485v(C138036pf r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void BSZ(boolean z) {
    }

    public /* synthetic */ void BUm(boolean z) {
    }

    public /* synthetic */ void BUn(boolean z) {
    }

    public /* synthetic */ void BYE(C158477k2 r1) {
    }

    public /* synthetic */ void BYI(int i) {
    }

    public /* synthetic */ void BYJ(int i) {
    }

    public /* synthetic */ void BYS(int i) {
    }

    public /* synthetic */ void Bb4() {
    }

    public /* synthetic */ void BcO(List list) {
    }

    public void BeS(C166387yb r6, C151537Ve r7) {
        C138036pf r4 = this.A00;
        if (r6 != r4.A01) {
            AnonymousClass7UF r0 = r4.A09.A00;
            if (r0 != null && r0.A00(1) == 1) {
                C55682qk r3 = r4.A03;
                if (r3 != null) {
                    r3.A0A("exoaudioplayer/audio-track-not-playable", false, (String) null);
                }
                Log.e("exoaudioplayer/onTracksChanged: Media includes audio tracks, but none are playable by this device");
            }
            r4.A01 = r6;
        }
    }

    public /* synthetic */ void BW7(C151877Wq r1, int i) {
    }

    public /* synthetic */ void BYA(boolean z, int i) {
    }

    public void BYK(C143886zd r3) {
        C18260x0.A1O(AnonymousClass001.A0o(), "exoaudioplayer/onPlayerError: ", r3);
    }

    public /* synthetic */ void Be5(Timeline timeline, int i) {
        AnonymousClass727.A00(this, timeline, i);
    }

    public /* synthetic */ void Be6(Timeline timeline, Object obj, int i) {
    }
}
