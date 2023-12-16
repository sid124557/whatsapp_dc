package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* renamed from: X.7kN  reason: invalid class name and case insensitive filesystem */
public abstract class C158677kN {
    public static final int[] A00 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] A01 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    public void A01() {
        EGLDisplay eGLDisplay = ((C177508fz) this).A02;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            C177508fz.A00("detachCurrent");
            throw AnonymousClass002.A0E("eglMakeCurrent failed");
        }
    }

    public void A02() {
        C177508fz r3 = (C177508fz) this;
        r3.A05();
        EGLSurface eGLSurface = r3.A03;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass002.A0E("No EGLSurface - can't make current");
        } else if (!EGL14.eglMakeCurrent(r3.A02, eGLSurface, eGLSurface, r3.A01)) {
            C177508fz.A00("makeCurrent");
            throw AnonymousClass002.A0E("eglMakeCurrent failed");
        }
    }

    public void A03() {
        C177508fz r2 = (C177508fz) this;
        r2.A05();
        r2.A04();
        r2.A01();
        EGL14.eglDestroyContext(r2.A02, r2.A01);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(r2.A02);
        r2.A01 = EGL14.EGL_NO_CONTEXT;
        r2.A02 = EGL14.EGL_NO_DISPLAY;
        r2.A00 = null;
    }

    public void A04() {
        C177508fz r2 = (C177508fz) this;
        EGLSurface eGLSurface = r2.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(r2.A02, eGLSurface);
            r2.A03 = EGL14.EGL_NO_SURFACE;
        }
    }
}
