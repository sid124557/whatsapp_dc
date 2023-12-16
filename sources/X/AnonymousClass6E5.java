package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.util.Locale;

/* renamed from: X.6E5  reason: invalid class name */
public class AnonymousClass6E5 extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public C172728Mm A01;
    public AnonymousClass6EU A02;
    public Error A03;
    public RuntimeException A04;

    public AnonymousClass6E5() {
        super("ExoPlayer:DummySurface");
    }

    public boolean handleMessage(Message message) {
        AnonymousClass8RH r1;
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        C172728Mm r3;
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                int i2 = message2.arg1;
                this.A01.getClass();
                C172728Mm r2 = this.A01;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    int[] A1Z = C86664Kz.A1Z();
                    if (EGL14.eglInitialize(eglGetDisplay, A1Z, 0, A1Z, 1)) {
                        r2.A02 = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr3 = new int[1];
                        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, C172728Mm.A06, 0, eGLConfigArr, 0, 1, iArr3, 0);
                        if (!eglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                            Object[] A1X = AnonymousClass0x9.A1X();
                            AnonymousClass6C7.A1V(A1X, 0, eglChooseConfig);
                            AnonymousClass000.A1P(A1X, iArr3[0], 1);
                            A1X[2] = eGLConfigArr[0];
                            r1 = new AnonymousClass8RH(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", A1X));
                        } else {
                            EGLDisplay eGLDisplay = r2.A02;
                            if (i2 == 0) {
                                iArr = new int[]{12440, 2, 12344};
                            } else {
                                iArr = new int[]{12440, 2, 12992, 1, 12344};
                            }
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                            if (eglCreateContext != null) {
                                r2.A01 = eglCreateContext;
                                EGLDisplay eGLDisplay2 = r2.A02;
                                if (i2 == 1) {
                                    eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                                } else {
                                    if (i2 == 2) {
                                        iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                                    } else {
                                        iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                                    }
                                    eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                                    if (eglCreatePbufferSurface == null) {
                                        r1 = new AnonymousClass8RH("eglCreatePbufferSurface failed");
                                    }
                                }
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                    r2.A03 = eglCreatePbufferSurface;
                                    int[] iArr4 = r2.A05;
                                    GLES20.glGenTextures(1, iArr4, 0);
                                    while (true) {
                                        int glGetError = GLES20.glGetError();
                                        if (glGetError != 0) {
                                            StringBuilder A0o = AnonymousClass001.A0o();
                                            A0o.append("glError ");
                                            Log.e("GlUtil", AnonymousClass000.A0X(GLU.gluErrorString(glGetError), A0o));
                                        } else {
                                            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr4[0]);
                                            r2.A00 = surfaceTexture;
                                            surfaceTexture.setOnFrameAvailableListener(r2);
                                            SurfaceTexture surfaceTexture2 = this.A01.A00;
                                            surfaceTexture2.getClass();
                                            this.A02 = new AnonymousClass6EU(surfaceTexture2, this);
                                            synchronized (this) {
                                                notify();
                                            }
                                            return true;
                                        }
                                    }
                                } else {
                                    r1 = new AnonymousClass8RH("eglMakeCurrent failed");
                                }
                            } else {
                                r1 = new AnonymousClass8RH("eglCreateContext failed");
                            }
                        }
                    } else {
                        r1 = new AnonymousClass8RH("eglInitialize failed");
                    }
                } else {
                    r1 = new AnonymousClass8RH("eglGetDisplay failed");
                }
                throw r1;
            } catch (RuntimeException e) {
                C159307lc.A02("DummySurface", "Failed to initialize dummy surface", e);
                this.A04 = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                C159307lc.A02("DummySurface", "Failed to initialize dummy surface", e2);
                this.A03 = e2;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                synchronized (this) {
                    try {
                        notify();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    throw th;
                }
            }
        } else if (i == 2) {
            try {
                this.A01.getClass();
                r3 = this.A01;
                r3.A04.removeCallbacks(r3);
                SurfaceTexture surfaceTexture3 = r3.A00;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                    GLES20.glDeleteTextures(1, r3.A05, 0);
                }
                EGLDisplay eGLDisplay3 = r3.A02;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay4 = r3.A02;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay4, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = r3.A03;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(r3.A02, r3.A03);
                }
                EGLContext eGLContext = r3.A01;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(r3.A02, eGLContext);
                }
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay5 = r3.A02;
                if (eGLDisplay5 != null && !eGLDisplay5.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(r3.A02);
                }
                r3.A02 = null;
                r3.A01 = null;
                r3.A03 = null;
                r3.A00 = null;
            } catch (Throwable th3) {
                try {
                    C159307lc.A02("DummySurface", "Failed to release dummy surface", th3);
                } catch (Throwable th4) {
                    quit();
                    throw th4;
                }
            }
            quit();
            return true;
        }
        return true;
    }
}
