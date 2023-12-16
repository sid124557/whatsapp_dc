package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.85I  reason: invalid class name */
public final class AnonymousClass85I implements C186008ub, TextureView.SurfaceTextureListener, SurfaceHolder.Callback {
    public final /* synthetic */ C138436qM A00;

    public AnonymousClass85I(C138436qM r1) {
        this.A00 = r1;
    }

    public void BYB() {
    }

    public void BYN(int i, boolean z, boolean z2) {
        this.A00.A06.A0S(new C117655sH(this, i, 3, z));
    }

    public void BYS(int i) {
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A03(new Surface(surfaceTexture), true);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A03((Surface) null, true);
        return true;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A03(surfaceHolder.getSurface(), false);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A03((Surface) null, false);
    }

    public void BYL(C143946zk r1, C142846xt r2) {
    }

    public void BeR(C166607yy r1, AnonymousClass7VV r2) {
    }

    public void Bfi(C142846xt r1, String str) {
    }

    public void Be4(Timeline timeline, Object obj, int i) {
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
