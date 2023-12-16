package X;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.53p  reason: invalid class name and case insensitive filesystem */
public final class C988853p extends AnonymousClass5ZQ {
    public C183238pi A00;
    public final MediaPlayer A01;
    public final Handler A02;

    public boolean A0G(C55682qk r7, float f) {
        try {
            MediaPlayer mediaPlayer = this.A01;
            PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
            playbackParams.allowDefaults();
            if (AnonymousClass002.A00(playbackParams.getSpeed(), f) >= 0.1f) {
                mediaPlayer.setPlaybackParams(playbackParams.setSpeed(f));
            }
            return true;
        } catch (IllegalArgumentException | IllegalStateException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("audioplayer/setPlaybackSpeed failed: currSpeed: ");
            A0o.append(-1.0f);
            A0o.append(" newSpeed: ");
            A0o.append(f);
            C18260x0.A1K(A0o, C18300x5.A0k(e, " ", A0o));
            return false;
        }
    }

    public C988853p(Looper looper, int i) {
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        this.A02 = new Handler(looper);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A01 = mediaPlayer;
        mediaPlayer.setAudioStreamType(i);
    }
}
