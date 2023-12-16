package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

/* renamed from: X.7Tj  reason: invalid class name and case insensitive filesystem */
public abstract class C151087Tj {
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public C159067l3 A01;
    public final C159067l3 A02;
    public final int[] A03 = new int[1];
    public final int[] A04 = new int[1];

    public void A00() {
        C159067l3 r12 = this.A01;
        EGLSurface eGLSurface = this.A00;
        synchronized (r12.A07) {
            boolean equals = r12.A03.equals(EGL14.eglGetCurrentContext());
            boolean equals2 = r12.A04.equals(EGL14.EGL_NO_DISPLAY);
            boolean equals3 = eGLSurface.equals(EGL14.eglGetCurrentSurface(12377));
            boolean equals4 = eGLSurface.equals(EGL14.eglGetCurrentSurface(12378));
            if (!equals || !equals3 || !equals4) {
                if (!EGL14.eglMakeCurrent(r12.A04, eGLSurface, eGLSurface, r12.A03)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("eglMakeCurrent, contextWasAlreadyCurrent=");
                    A0o.append(equals);
                    A0o.append(" isDisplayNoDisplay=");
                    A0o.append(equals2);
                    A0o.append(" drawSurfaceWasAlreadyCurrent=");
                    A0o.append(equals3);
                    C159217lP.A01(AnonymousClass000.A0b(" readSurfaceWasAlreadyCurrent=", A0o, equals4));
                    if (!EGL14.eglMakeCurrent(r12.A04, eGLSurface, eGLSurface, r12.A03)) {
                        StringBuilder A0l = AnonymousClass000.A0l("eglMakeCurrent, contextWasAlreadyCurrent=");
                        A0l.append(equals);
                        A0l.append(" isDisplayNoDisplay=");
                        A0l.append(equals2);
                        A0l.append(" drawSurfaceWasAlreadyCurrent=");
                        A0l.append(equals3);
                        C159217lP.A01(AnonymousClass000.A0b(" readSurfaceWasAlreadyCurrent=", A0l, equals4));
                    }
                }
            }
        }
    }

    public C151087Tj(C159067l3 r3) {
        this.A01 = r3;
        this.A02 = r3;
    }
}
