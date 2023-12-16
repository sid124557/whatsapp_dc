package X;

import android.media.MediaPlayer;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.92x  reason: invalid class name and case insensitive filesystem */
public class C1898592x implements MediaPlayer.OnPreparedListener {
    public Object A00;
    public final int A01;

    public C1898592x(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        switch (this.A01) {
            case 0:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A00;
                messageGifVideoPlayer.A0C = true;
                messageGifVideoPlayer.A02();
                return;
            case 1:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
                videoSurfaceView.A02 = 2;
                videoSurfaceView.A0I = true;
                videoSurfaceView.A0H = true;
                videoSurfaceView.A0G = true;
                MediaPlayer.OnPreparedListener onPreparedListener = videoSurfaceView.A0B;
                if (onPreparedListener != null) {
                    onPreparedListener.onPrepared(videoSurfaceView.A0C);
                }
                videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                videoSurfaceView.A07 = videoHeight;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("videoview/onPrepare: ");
                A0o.append(videoSurfaceView.A08);
                C18260x0.A0y("x", A0o, videoHeight);
                int i = videoSurfaceView.A03;
                if (i >= 0) {
                    videoSurfaceView.seekTo(i);
                }
                if (!(videoSurfaceView.A08 == 0 || videoSurfaceView.A07 == 0)) {
                    videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
                    if (!(videoSurfaceView.A05 == videoSurfaceView.A08 && videoSurfaceView.A04 == videoSurfaceView.A07)) {
                        return;
                    }
                }
                if (videoSurfaceView.A06 == 3) {
                    videoSurfaceView.start();
                    return;
                }
                return;
            default:
                C138346qC r2 = (C138346qC) this.A00;
                r2.A00 = 2;
                if (r2.A0G) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                }
                if (r2.A0F) {
                    mediaPlayer.setLooping(true);
                }
                r2.A0E = true;
                r2.A0D = true;
                r2.A0C = true;
                int i2 = r2.A02;
                if (i2 >= 0) {
                    r2.seekTo(i2);
                }
                if (r2.A03 == 3) {
                    r2.start();
                }
                MediaPlayer.OnPreparedListener onPreparedListener2 = r2.A08;
                if (onPreparedListener2 != null) {
                    onPreparedListener2.onPrepared(mediaPlayer);
                    return;
                }
                return;
        }
    }
}
