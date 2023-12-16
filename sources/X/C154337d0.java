package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.7d0  reason: invalid class name and case insensitive filesystem */
public class C154337d0 implements TextureView.SurfaceTextureListener {
    public Object A00;
    public final int A01;

    public C154337d0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A01) {
            case 0:
                C152857aH r2 = (C152857aH) this.A00;
                AnonymousClass8KC r0 = r2.A01;
                if (r0 != null) {
                    r0.A0B(surfaceTexture);
                    r2.A01.A0D(surfaceTexture, i, i2);
                    r2.A01.setCornerRadius(r2.A00);
                    return;
                }
                return;
            case 1:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A00;
                messageGifVideoPlayer.A03 = new Surface(surfaceTexture);
                MessageGifVideoPlayer.A00(messageGifVideoPlayer);
                MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
                if (mediaPlayer != null) {
                    mediaPlayer.setSurface(messageGifVideoPlayer.A03);
                    return;
                }
                return;
            default:
                C138346qC r3 = (C138346qC) this.A00;
                if (r3.A09 != null) {
                    Surface surface = new Surface(surfaceTexture);
                    r3.A0A = surface;
                    r3.A09.setSurface(surface);
                    if (r3.A00 == 0) {
                        try {
                            r3.A09.setDataSource(r3.A0B);
                            r3.A09.prepareAsync();
                            r3.A00 = 1;
                            return;
                        } catch (IOException e) {
                            r3.A00 = -1;
                            r3.A03 = -1;
                            if (r3.A07 != null) {
                                r3.post(new C117095rN(this, 44));
                            }
                            Log.e("mediaview/unable-to-play", e);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.A01) {
            case 0:
                AnonymousClass8KC r0 = ((C152857aH) this.A00).A01;
                if (r0 == null) {
                    return true;
                }
                r0.A0C(surfaceTexture);
                return true;
            case 1:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A00;
                MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
                if (mediaPlayer != null) {
                    mediaPlayer.setSurface((Surface) null);
                    messageGifVideoPlayer.A04();
                }
                C626936e.A06(messageGifVideoPlayer.A03);
                messageGifVideoPlayer.A03.release();
                messageGifVideoPlayer.A03 = null;
                return true;
            default:
                C138346qC r2 = (C138346qC) this.A00;
                MediaPlayer mediaPlayer2 = r2.A09;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setSurface((Surface) null);
                }
                Surface surface = r2.A0A;
                if (surface != null) {
                    surface.release();
                    r2.A0A = null;
                }
                r2.A0H = false;
                return false;
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A01) {
            case 0:
                AnonymousClass8KC r0 = ((C152857aH) this.A00).A01;
                if (r0 != null) {
                    r0.A0D(surfaceTexture, i, i2);
                    return;
                }
                return;
            case 1:
                MessageGifVideoPlayer.A00((MessageGifVideoPlayer) this.A00);
                return;
            default:
                return;
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (2 - this.A01 == 0) {
            C138346qC r5 = (C138346qC) this.A00;
            if (!r5.A0H) {
                r5.A0H = AnonymousClass001.A1W((surfaceTexture.getTimestamp() > 0 ? 1 : (surfaceTexture.getTimestamp() == 0 ? 0 : -1)));
            }
        }
    }
}
