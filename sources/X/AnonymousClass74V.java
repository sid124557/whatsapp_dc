package X;

import java.util.Iterator;

/* renamed from: X.74V  reason: invalid class name */
public final class AnonymousClass74V {
    public static final C17330vM A00(AnonymousClass0P8 r2) {
        C17330vM r1;
        C162457s7.A0J(r2, 0);
        Iterator it = r2.A00.iterator();
        while (true) {
            r1 = null;
            if (!it.hasNext()) {
                break;
            }
            C15310r8 r12 = (C15310r8) it.next();
            if ((r12 instanceof C17330vM) && (r1 = (C17330vM) r12) != null) {
                break;
            }
        }
        return r1;
    }
}
