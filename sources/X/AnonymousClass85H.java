package X;

import com.facebook.android.exoplayer2.Timeline;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.85H  reason: invalid class name */
public class AnonymousClass85H implements C186008ub {
    public final /* synthetic */ AnonymousClass567 A00;

    public AnonymousClass85H(AnonymousClass567 r1) {
        this.A00 = r1;
    }

    public void BYB() {
    }

    public void BYN(int i, boolean z, boolean z2) {
        this.A00.A0T.A0S(new C117655sH(this, i, 4, z));
    }

    public void BYS(int i) {
    }

    public void Bfi(C142846xt r8, String str) {
        AnonymousClass567 r6;
        String string;
        Integer A0b;
        String str2;
        if (C142846xt.A04 == r8) {
            Log.i("Heroplayer/unplayable video track");
            r6 = this.A00;
            string = r6.A02.getString(R.string.f11nameremoved);
            A0b = C18290x4.A0a();
            str2 = "unplayable_video_track";
        } else if (C142846xt.A03 == r8) {
            Log.i("Heroplayer/unplayable audio track");
            r6 = this.A00;
            string = r6.A02.getString(R.string.f11nameremoved);
            A0b = C18290x4.A0b();
            str2 = "unplayable_audio_track";
        } else {
            return;
        }
        C18260x0.A0r("ExoPlayerVideoPlayer/onError=", string, AnonymousClass001.A0o());
        r6.A0Y(string, true, str2);
        C153387bE r0 = r6.A0B;
        if (r0 != null) {
            r0.A04(A0b, true);
        }
    }

    public void BYL(C143946zk r1, C142846xt r2) {
    }

    public void BeR(C166607yy r3, AnonymousClass7VV r4) {
        C86604Kt.A1V(AnonymousClass001.A0o(), "HeroPlayerVideoPlayer/track selection changed  playerid=", this);
    }

    public void Be4(Timeline timeline, Object obj, int i) {
    }
}
