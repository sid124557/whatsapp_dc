package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;

/* renamed from: X.6qM  reason: invalid class name and case insensitive filesystem */
public final class C138436qM extends AnonymousClass562 {
    public Surface A00;
    public SurfaceHolder A01;
    public TextureView A02;
    public C162997t6 A03;
    public boolean A04;
    public boolean A05;
    public final C69263Wi A06;
    public final AnonymousClass85I A07 = new AnonymousClass85I(this);

    public void A00() {
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public final void A02() {
        TextureView textureView = this.A02;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A07) {
                Log.d("HeroPlayerView", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.A02.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.A02 = null;
        }
        SurfaceHolder surfaceHolder = this.A01;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A07);
            this.A01 = null;
        }
    }

    public final void A03(Surface surface, boolean z) {
        C162997t6 r0 = this.A03;
        if (r0 != null) {
            r0.A0D(surface);
        }
        Surface surface2 = this.A00;
        if (!(surface2 == null || surface2 == surface || !this.A05)) {
            surface2.release();
        }
        this.A00 = surface;
        this.A05 = z;
    }

    public void setPlayer(C162997t6 r5) {
        C162997t6 r0 = this.A03;
        if (r0 != null) {
            AnonymousClass6C7.A10(r0.A0C, this.A07, 45);
            this.A03.A0D((Surface) null);
        }
        this.A03 = r5;
        if (r5 != null) {
            boolean z = this.A09;
            View view = this.A07;
            if (z) {
                setVideoSurfaceView((SurfaceView) view);
            } else {
                setVideoTextureView((TextureView) view);
            }
            AnonymousClass6C7.A10(r5.A0C, this.A07, 44);
            AnonymousClass561 r02 = this.A02;
            if (r02 != null) {
                r02.setPlayer(r5);
            }
        } else {
            this.A06.setVisibility(0);
        }
        this.A05 = false;
    }

    public void setVideoSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        setVideoSurfaceHolder(holder);
    }

    public C138436qM(Context context, C69263Wi r3, boolean z) {
        super(context, z);
        A00();
        this.A06 = r3;
    }

    public void A01(AnonymousClass561 r3, boolean z) {
        C162997t6 r0;
        super.A01(r3, z);
        AnonymousClass561 r1 = this.A02;
        if (r1 != null && (r0 = this.A03) != null) {
            r1.setPlayer(r0);
        }
    }

    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        A02();
        this.A01 = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.A07);
            Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                A03(surface, false);
                return;
            }
        }
        A03((Surface) null, false);
    }

    public void setVideoTextureView(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        A02();
        this.A02 = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w("HeroPlayerView", "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.A07);
            if (textureView.isAvailable() && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        A03(surface, true);
    }
}
