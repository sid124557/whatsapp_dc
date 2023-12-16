package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.view.Surface;

/* renamed from: X.8fz  reason: invalid class name and case insensitive filesystem */
public final class C177508fz extends C158677kN {
    public static final int A04 = Build.VERSION.SDK_INT;
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03 = EGL14.EGL_NO_SURFACE;

    public final void A05() {
        if (this.A02 == EGL14.EGL_NO_DISPLAY || this.A01 == EGL14.EGL_NO_CONTEXT || this.A00 == null) {
            throw AnonymousClass002.A0E("This object has been released");
        }
    }

    public final void A06(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            A05();
            if (this.A03 == EGL14.EGL_NO_SURFACE) {
                int[] A0E = C18330xA.A0E();
                A0E[0] = 12344;
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.A02, this.A00, obj, A0E, 0);
                this.A03 = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    A00("eglCreateWindowSurface");
                    throw AnonymousClass002.A0E("Failed to create window surface");
                }
                return;
            }
            throw AnonymousClass002.A0E("Already has an EGLSurface");
        }
        throw AnonymousClass001.A0e("Input must be either a Surface or SurfaceTexture");
    }

    public C177508fz(C1440970a r11, int[] iArr) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] A1Z = C86664Kz.A1Z();
            if (EGL14.eglInitialize(eglGetDisplay, A1Z, 0, A1Z, 1)) {
                this.A02 = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(eglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.A00 = eGLConfig;
                    EGLDisplay eGLDisplay = this.A02;
                    if (r11 != null) {
                        throw AnonymousClass001.A0g("egl14Context");
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        this.A01 = eglCreateContext;
                    } else {
                        A00("eglCreateContext");
                        throw AnonymousClass002.A0E("Failed to create EGL context");
                    }
                } else {
                    A00("eglChooseConfig");
                    throw AnonymousClass002.A0E("Unable to find any matching EGL config");
                }
            } else {
                A00("eglInitialize");
                throw AnonymousClass002.A0E("Unable to initialize EGL14");
            }
        } else {
            throw AnonymousClass002.A0E("Unable to get EGL14 display");
        }
    }

    public static void A00(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C18260x0.A0x(": glError ", AnonymousClass000.A0l(str), glGetError);
            } else {
                return;
            }
        }
    }
}
