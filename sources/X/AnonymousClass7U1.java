package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.7U1  reason: invalid class name */
public class AnonymousClass7U1 {
    public final SurfaceTexture.OnFrameAvailableListener A00 = new AnonymousClass90M(this, 0);
    public final Object A01 = AnonymousClass002.A0D();
    public final boolean A02 = true;
    public volatile int A03;
    public volatile SurfaceTexture A04;
    public volatile AnonymousClass7EZ A05;

    public final SurfaceTexture A00() {
        SurfaceTexture surfaceTexture;
        SurfaceTexture surfaceTexture2 = this.A04;
        if (surfaceTexture2 != null) {
            return surfaceTexture2;
        }
        synchronized (this.A01) {
            surfaceTexture = this.A04;
            int i = this.A03;
            if (surfaceTexture == null) {
                surfaceTexture = new SurfaceTexture(i);
                this.A04 = surfaceTexture;
            }
            if (i != 0 && this.A02) {
                surfaceTexture.setOnFrameAvailableListener(this.A00);
            }
        }
        return surfaceTexture;
    }
}
