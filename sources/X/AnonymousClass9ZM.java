package X;

import android.view.Surface;
import java.util.Map;

/* renamed from: X.9ZM  reason: invalid class name */
public final class AnonymousClass9ZM implements C180438l4 {
    public final C185558ts A00;
    public final C194699Ud A01 = new C194699Ud(this);

    public C151087Tj B0h(Surface surface, int i) {
        AnonymousClass96W r0;
        AnonymousClass9ZC r4 = (AnonymousClass9ZC) this.A00;
        int i2 = i & 32;
        C159067l3 r3 = r4.A02;
        if (i2 != (r3.A00 & 32)) {
            C159067l3 r1 = r4.A00;
            if (r1 == null) {
                C194729Ug r12 = r4.A05;
                AnonymousClass9LF r02 = C194729Ug.A02;
                Object obj = C194849Us.A05;
                Map map = r12.A00;
                Object obj2 = map.get(r02);
                if (obj2 != null) {
                    obj = obj2;
                }
                Object obj3 = map.get(C194729Ug.A06);
                obj3.getClass();
                r1 = C161027oq.A01(obj, AnonymousClass001.A0K(obj3));
                C162457s7.A0K(r1, "null cannot be cast to non-null type com.facebook.gl.EGLCore<android.opengl.EGLContext>");
                r1.A05(r3, 5);
                r4.A00 = r1;
            }
            r3 = r1;
        }
        synchronized (r3.A07) {
            r0 = new AnonymousClass96W(surface, r3, i);
        }
        return r0;
    }

    public AnonymousClass9ZM(C185558ts r2) {
        this.A00 = r2;
    }
}
