package X;

import android.media.MediaCodec;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.87P  reason: invalid class name */
public final class AnonymousClass87P implements C183878qo {
    public final MediaCodec A00;

    public void Bmi(Handler handler, C180668lR r4) {
        this.A00.setOnFrameRenderedListener(new C162907sx(r4, this), handler);
    }

    public void Bmo(Surface surface) {
        this.A00.setOutputSurface(surface);
    }

    public AnonymousClass87P(MediaCodec mediaCodec) {
        this.A00 = mediaCodec;
    }
}
