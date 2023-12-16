package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.util.Locale;

/* renamed from: X.6E4  reason: invalid class name */
public class AnonymousClass6E4 extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public C172718Ml A01;
    public AnonymousClass6EV A02;
    public Error A03;
    public RuntimeException A04;

    public AnonymousClass6E4() {
        super("dummySurface");
    }

    public boolean handleMessage(Message message) {
        AnonymousClass8RA r1;
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        C172718Ml r4;
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                int i2 = message2.arg1;
                this.A01.getClass();
                C172718Ml r3 = this.A01;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    int[] A1Z = C86664Kz.A1Z();
                    if (EGL14.eglInitialize(eglGetDisplay, A1Z, 0, A1Z, 1)) {
                        r3.A02 = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr3 = new int[1];
                        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, C172718Ml.A06, 0, eGLConfigArr, 0, 1, iArr3, 0);
                        if (!eglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                            Object[] A1X = AnonymousClass0x9.A1X();
                            AnonymousClass6C7.A1V(A1X, 0, eglChooseConfig);
                            AnonymousClass000.A1P(A1X, iArr3[0], 1);
                            A1X[2] = eGLConfigArr[0];
                            r1 = new AnonymousClass8RA(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", A1X));
                        } else {
                            EGLDisplay eGLDisplay = r3.A02;
                            if (i2 == 0) {
                                iArr = new int[]{12440, 2, 12344};
                            } else {
                                iArr = new int[]{12440, 2, 12992, 1, 12344};
                            }
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                            if (eglCreateContext != null) {
                                r3.A01 = eglCreateContext;
                                EGLDisplay eGLDisplay2 = r3.A02;
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
                                        r1 = new AnonymousClass8RA("eglCreatePbufferSurface failed");
                                    }
                                }
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                    r3.A03 = eglCreatePbufferSurface;
                                    int[] iArr4 = r3.A05;
                                    GLES20.glGenTextures(1, iArr4, 0);
                                    int glGetError = GLES20.glGetError();
                                    if (glGetError == 0) {
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr4[0]);
                                        r3.A00 = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(r3);
                                        SurfaceTexture surfaceTexture2 = this.A01.A00;
                                        surfaceTexture2.getClass();
                                        this.A02 = new AnonymousClass6EV(surfaceTexture2, this);
                                        synchronized (this) {
                                            notify();
                                        }
                                        return true;
                                    }
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    AnonymousClass000.A1G("glGenTextures failed. Error: ", A0o, glGetError);
                                    r1 = new AnonymousClass8RA(A0o.toString());
                                } else {
                                    r1 = new AnonymousClass8RA("eglMakeCurrent failed");
                                }
                            } else {
                                r1 = new AnonymousClass8RA("eglCreateContext failed");
                            }
                        }
                    } else {
                        r1 = new AnonymousClass8RA("eglInitialize failed");
                    }
                } else {
                    r1 = new AnonymousClass8RA("eglGetDisplay failed");
                }
                throw r1;
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.A04 = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
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
                r4 = this.A01;
                r4.A04.removeCallbacks(r4);
                SurfaceTexture surfaceTexture3 = r4.A00;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                    GLES20.glDeleteTextures(1, r4.A05, 0);
                }
                EGLSurface eGLSurface = r4.A03;
                if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(r4.A02, r4.A03);
                }
                EGLContext eGLContext = r4.A01;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(r4.A02, eGLContext);
                }
                r4.A02 = null;
                r4.A01 = null;
                r4.A03 = null;
                r4.A00 = null;
            } catch (Throwable th3) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th3);
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
