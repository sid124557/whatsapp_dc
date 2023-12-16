package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.7zC  reason: invalid class name and case insensitive filesystem */
public final class C166747zC implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AnonymousClass5TM A00;

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C162457s7.A0J(surfaceTexture, 0);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionHeroPlayer - onSurfaceTextureDestroyed() - playerId: ");
        AnonymousClass5TM r2 = this.A00;
        C18260x0.A1F(A0o, r2.A09);
        C162997t6 r1 = r2.A02;
        if (r1 != null) {
            r1.A0D((Surface) null);
        }
        Surface surface = r2.A01;
        if (surface != null) {
            surface.release();
        }
        surfaceTexture.release();
        return false;
    }

    public C166747zC(AnonymousClass5TM r1) {
        this.A00 = r1;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder A0X = C18270x1.A0X(surfaceTexture);
        A0X.append("TransitionHeroPlayer - onSurfaceTextureAvailable() - playerId: ");
        AnonymousClass5TM r2 = this.A00;
        C18260x0.A1F(A0X, r2.A09);
        Surface surface = new Surface(surfaceTexture);
        r2.A01 = surface;
        C162997t6 r0 = r2.A02;
        if (r0 != null) {
            r0.A0D(surface);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
