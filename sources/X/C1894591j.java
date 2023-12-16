package X;

import android.media.MediaPlayer;

/* renamed from: X.91j  reason: invalid class name and case insensitive filesystem */
public class C1894591j implements MediaPlayer.OnErrorListener {
    public final int A00;

    public C1894591j(int i) {
        this.A00 = i;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.A00 != 0) {
            return false;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaViewFragment/prepareAudioPlayback/error: what:");
        A0o.append(i);
        C18260x0.A0x("  extra:", A0o, i2);
        return false;
    }
}
