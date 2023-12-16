package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: X.0W2  reason: invalid class name */
public final class AnonymousClass0W2 {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;

    public final EGLConfig A00(int i, int i2) {
        int i3 = 4;
        if (i2 >= 3) {
            i3 = 68;
        }
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i3, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.A02, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("unable to find RGB8888 / ");
        A0o.append(i2);
        Log.w("Grafika", AnonymousClass000.A0X(" EGLConfig", A0o));
        return null;
    }

    public void A01() {
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
                Log.w("Grafika", "WARNING: EglCore was not explicitly released -- state may be leaked");
                A01();
            }
        } finally {
            super.finalize();
        }
    }

    public AnonymousClass0W2(int i) {
        EGLConfig A002;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.A02 = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        this.A00 = null;
        if (eGLDisplay == eGLDisplay) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A02 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    if (!((i & 2) == 0 || (A002 = A00(i, 3)) == null)) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.A02, A002, eGLContext, new int[]{12440, 3, 12344}, 0);
                        if (EGL14.eglGetError() == 12288) {
                            this.A00 = A002;
                            this.A01 = eglCreateContext;
                        }
                    }
                    EGLContext eGLContext2 = this.A01;
                    if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig A003 = A00(i, 2);
                        if (A003 != null) {
                            eGLContext2 = EGL14.eglCreateContext(this.A02, A003, eGLContext, new int[]{12440, 2, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError == 12288) {
                                this.A00 = A003;
                                this.A01 = eGLContext2;
                            } else {
                                StringBuilder A0l = AnonymousClass000.A0l("eglCreateContext");
                                AnonymousClass000.A1G(": EGL error: 0x", A0l, eglGetError);
                                throw AnonymousClass002.A0E(A0l.toString());
                            }
                        } else {
                            throw AnonymousClass002.A0E("Unable to find a suitable EGLConfig");
                        }
                    }
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.A02, eGLContext2, 12440, iArr2, 0);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("EGLContext created, client version ");
                    Log.d("Grafika", AnonymousClass000.A0h(A0o, iArr2[0]));
                    return;
                }
                this.A02 = null;
                throw AnonymousClass002.A0E("unable to initialize EGL14");
            }
            throw AnonymousClass002.A0E("unable to get EGL14 display");
        }
        throw AnonymousClass002.A0E("EGL already set up");
    }

    public AnonymousClass0W2() {
        this(0);
    }
}
