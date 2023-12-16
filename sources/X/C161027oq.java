package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7oq  reason: invalid class name and case insensitive filesystem */
public class C161027oq {
    public static final List A00 = AnonymousClass001.A0s();

    public static synchronized C159067l3 A00() {
        synchronized (C161027oq.class) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                C159067l3 r2 = (C159067l3) ((WeakReference) it.next()).get();
                if (r2 == null) {
                    it.remove();
                } else {
                    EGLContext eGLContext = r2.A03;
                    if (eGLContext != EGL14.EGL_NO_CONTEXT && eGLContext.equals(EGL14.eglGetCurrentContext())) {
                        return r2;
                    }
                }
            }
            return null;
        }
    }

    public static synchronized C159067l3 A01(Object obj, int i) {
        C159067l3 r2;
        synchronized (C161027oq.class) {
            r2 = new C159067l3(obj, i);
            A00.add(AnonymousClass0x9.A14(r2));
        }
        return r2;
    }
}
