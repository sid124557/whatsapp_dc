package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: X.7jP  reason: invalid class name and case insensitive filesystem */
public final class C158087jP {
    public EGLConfig A00 = null;
    public EGLContext A01;
    public EGLDisplay A02;

    public C158087jP() {
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.A02 = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        if (eGLDisplay == eGLDisplay) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A02 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLContext eGLContext2 = this.A01;
                    if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                        int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12352, 4, 12344, 0, 12344};
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (!EGL14.eglChooseConfig(this.A02, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("unable to find RGB8888 / ");
                            A0o.append(2);
                            Log.w("MsqrdEglCore", AnonymousClass000.A0X(" EGLConfig", A0o));
                        } else {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            if (eGLConfig != null) {
                                eGLContext2 = EGL14.eglCreateContext(this.A02, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
                                int eglGetError = EGL14.eglGetError();
                                if (eglGetError == 12288) {
                                    this.A00 = eGLConfig;
                                    this.A01 = eGLContext2;
                                } else {
                                    StringBuilder A0l = AnonymousClass000.A0l("eglCreateContext");
                                    AnonymousClass000.A1G(": EGL error: 0x", A0l, eglGetError);
                                    throw AnonymousClass6C7.A0e(A0l);
                                }
                            }
                        }
                        throw AnonymousClass002.A0E("Unable to find a suitable EGLConfig");
                    }
                    int[] iArr3 = new int[1];
                    EGL14.eglQueryContext(this.A02, eGLContext2, 12440, iArr3, 0);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("EGLContext created, client version ");
                    Log.i("MsqrdEglCore", AnonymousClass000.A0h(A0o2, iArr3[0]));
                    return;
                }
                this.A02 = null;
                throw AnonymousClass002.A0E("unable to initialize EGL14");
            }
            throw AnonymousClass002.A0E("unable to get EGL14 display");
        }
        throw AnonymousClass002.A0E("EGL already set up");
    }

    public void A00() {
        EGLDisplay eGLDisplay = this.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.A02, this.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A02);
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
    }

    public void finalize() {
        try {
            if (this.A02 != EGL14.EGL_NO_DISPLAY) {
                Log.w("MsqrdEglCore", "WARNING: EglCore was not explicitly released -- state may be leaked");
                A00();
            }
        } finally {
            super.finalize();
        }
    }
}
