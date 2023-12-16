package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.916  reason: invalid class name */
public class AnonymousClass916 implements MediaPlayer.OnVideoSizeChangedListener {
    public Object A00;
    public final int A01;

    public AnonymousClass916(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.A01 != 0) {
            C138346qC r6 = (C138346qC) this.A00;
            r6.A05 = i;
            r6.A04 = i2;
            if (!(i == 0 || i2 == 0)) {
                int width = r6.getWidth();
                int height = r6.getHeight();
                int i3 = r6.A05;
                int i4 = i3 * height;
                int i5 = r6.A04;
                int i6 = i5 * width;
                if (i4 > i6) {
                    height = i6 / i3;
                } else {
                    width = i4 / i5;
                }
                int width2 = r6.getWidth();
                r6.setTop((r6.getHeight() - height) / 2);
                r6.setBottom(r6.getTop() + height);
                r6.setLeft((width2 - width) / 2);
                r6.setRight(r6.getLeft() + width);
            }
            r6.requestLayout();
            return;
        }
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
        videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        videoSurfaceView.A07 = videoHeight;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("videoview/onVideoSizeChanged: ");
        A0o.append(videoSurfaceView.A08);
        C18260x0.A0y("x", A0o, videoHeight);
        if (videoSurfaceView.A08 != 0 && videoSurfaceView.A07 != 0) {
            videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
            videoSurfaceView.requestLayout();
        }
    }
}
