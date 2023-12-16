package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* renamed from: X.0OZ  reason: invalid class name */
public class AnonymousClass0OZ {
    public EGLSurface A00;
    public Surface A01;
    public AnonymousClass0W2 A02;
    public boolean A03;

    public void A00() {
        AnonymousClass0W2 r3 = this.A02;
        EGLSurface eGLSurface = this.A00;
        if (r3.A02 == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(r3.A02, eGLSurface, eGLSurface, r3.A01)) {
            throw AnonymousClass002.A0E("eglMakeCurrent failed");
        }
    }

    public void A01() {
        AnonymousClass0W2 r0 = this.A02;
        EGL14.eglDestroySurface(r0.A02, this.A00);
        this.A00 = EGL14.EGL_NO_SURFACE;
        Surface surface = this.A01;
        if (surface != null) {
            if (this.A03) {
                surface.release();
            }
            this.A01 = null;
        }
    }

    public AnonymousClass0OZ(Surface surface, AnonymousClass0W2 r6, boolean z) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.A00 = eGLSurface;
        this.A02 = r6;
        if (eGLSurface != eGLSurface) {
            throw AnonymousClass001.A0e("surface already created");
        } else if (surface == null) {
            throw AnonymousClass002.A0E(AnonymousClass000.A0P(surface, "invalid surface: ", AnonymousClass001.A0o()));
        } else {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r6.A02, r6.A00, surface, new int[]{12344}, 0);
            int eglGetError = EGL14.eglGetError();
            if (eglGetError != 12288) {
                StringBuilder A0l = AnonymousClass000.A0l("eglCreateWindowSurface");
                AnonymousClass000.A1G(": EGL error: 0x", A0l, eglGetError);
                throw AnonymousClass002.A0E(A0l.toString());
            } else if (eglCreateWindowSurface != null) {
                this.A00 = eglCreateWindowSurface;
                this.A01 = surface;
                this.A03 = z;
            } else {
                throw AnonymousClass002.A0E("surface was null");
            }
        }
    }
}
