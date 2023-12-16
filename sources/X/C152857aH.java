package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;

/* renamed from: X.7aH  reason: invalid class name and case insensitive filesystem */
public abstract class C152857aH {
    public float A00;
    public AnonymousClass8KC A01;

    public Object A00() {
        if (this instanceof C132896gB) {
            return ((C132896gB) this).A01.getSurfaceTexture();
        }
        return ((C132886gA) this).A01.getHolder().getSurface();
    }

    public void A01() {
        AnonymousClass8KC r0;
        if (this instanceof C132896gB) {
            C132896gB r02 = (C132896gB) this;
            TextureView textureView = r02.A01;
            TextureView.SurfaceTextureListener surfaceTextureListener = r02.A00;
            textureView.setSurfaceTextureListener(surfaceTextureListener);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture != null && r02.A01 != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, textureView.getWidth(), textureView.getHeight());
                return;
            }
            return;
        }
        C132886gA r2 = (C132886gA) this;
        SurfaceView surfaceView = r2.A01;
        surfaceView.getHolder().addCallback(r2.A00);
        Surface surface = surfaceView.getHolder().getSurface();
        if (surface != null && surface.isValid() && (r0 = r2.A01) != null) {
            C626936e.A06(surface);
            r0.A0B(surface);
            r2.A01.setCornerRadius(r2.A00);
            r2.A01.A0D(surface, surfaceView.getWidth(), surfaceView.getHeight());
        }
    }

    public void A02() {
        if (this instanceof C132896gB) {
            AnonymousClass8KC r1 = this.A01;
            if (r1 != null) {
                r1.setCornerRadius(this.A00);
                return;
            }
            return;
        }
        C132886gA r2 = (C132886gA) this;
        AnonymousClass8KC r12 = r2.A01;
        if (r12 != null) {
            r12.setCornerRadius(r2.A00);
            C107235av.A03(r2.A01, r2.A00);
        }
    }

    public void A03() {
        if (this instanceof C132896gB) {
            ((C132896gB) this).A01.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            return;
        }
        C132886gA r2 = (C132886gA) this;
        r2.A01.getHolder().removeCallback(r2.A00);
    }
}
