package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.7sz  reason: invalid class name and case insensitive filesystem */
public class C162927sz implements MediaPlayer.OnBufferingUpdateListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public C162927sz(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.A00.A01 = i;
    }
}
