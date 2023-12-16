package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.90r  reason: invalid class name and case insensitive filesystem */
public class C1892790r implements MediaPlayer.OnCompletionListener {
    public Object A00;
    public final int A01;

    public C1892790r(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer.OnCompletionListener onCompletionListener;
        MediaPlayer mediaPlayer2;
        switch (this.A01) {
            case 2:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
                videoSurfaceView.A02 = 5;
                videoSurfaceView.A06 = 5;
                onCompletionListener = videoSurfaceView.A09;
                if (onCompletionListener != null) {
                    mediaPlayer2 = videoSurfaceView.A0C;
                    break;
                } else {
                    return;
                }
            case 3:
                C138346qC r1 = (C138346qC) this.A00;
                r1.A00 = 5;
                r1.A03 = 5;
                onCompletionListener = r1.A06;
                if (onCompletionListener != null) {
                    mediaPlayer2 = r1.A09;
                    break;
                } else {
                    return;
                }
            default:
                ((AnonymousClass5YG) this.A00).A0H();
                return;
        }
        onCompletionListener.onCompletion(mediaPlayer2);
    }
}
