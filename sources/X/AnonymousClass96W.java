package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: X.96W  reason: invalid class name */
public class AnonymousClass96W extends C151087Tj {
    public AnonymousClass96W(Surface surface, C159067l3 r7, int i) {
        super(r7);
        C159067l3 r4 = this.A01;
        EGLConfig eGLConfig = r4.A02;
        try {
            eGLConfig = r4.A01(i);
        } catch (RuntimeException unused) {
        }
        int[] iArr = {12344};
        if (surface.isValid()) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r4.A04, eGLConfig, surface, iArr, 0);
            C159217lP.A01("eglCreateWindowSurface");
            eglCreateWindowSurface.getClass();
            this.A00 = eglCreateWindowSurface;
            return;
        }
        throw new AnonymousClass8RP(-1, "Surface is invalid while createWindowSurface");
    }
}
