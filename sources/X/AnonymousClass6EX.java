package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.6EX  reason: invalid class name */
public abstract class AnonymousClass6EX extends SurfaceView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static AnonymousClass916 A00(VideoSurfaceView videoSurfaceView) {
        videoSurfaceView.A02 = 0;
        videoSurfaceView.A06 = 0;
        videoSurfaceView.A0E = null;
        videoSurfaceView.A0C = null;
        videoSurfaceView.A03 = -1;
        return new AnonymousClass916(videoSurfaceView, 0);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass6EX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AnonymousClass6EX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AnonymousClass6EX(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
