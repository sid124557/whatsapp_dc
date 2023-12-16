package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.8Gj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C171258Gj implements AnonymousClass4EM {
    public final /* synthetic */ VideoComposerFragment A00;
    public final /* synthetic */ VideoSurfaceView A01;

    public /* synthetic */ void Axi() {
    }

    public /* synthetic */ void BSk() {
    }

    public final void Bd0(Bitmap bitmap, boolean z) {
        VideoComposerFragment videoComposerFragment = this.A00;
        VideoSurfaceView videoSurfaceView = this.A01;
        videoSurfaceView.A03(bitmap.getWidth(), bitmap.getHeight());
        videoSurfaceView.setBackground(new BitmapDrawable(C08310eF.A09(videoComposerFragment), bitmap));
    }

    public /* synthetic */ C171258Gj(VideoComposerFragment videoComposerFragment, VideoSurfaceView videoSurfaceView) {
        this.A00 = videoComposerFragment;
        this.A01 = videoSurfaceView;
    }
}
