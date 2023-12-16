package X;

import java.util.Iterator;

/* renamed from: X.8DX  reason: invalid class name */
public class AnonymousClass8DX implements C181478mp {
    public boolean B2l(C159187lJ r7, C159187lJ r8, AnonymousClass7MS r9) {
        boolean z;
        if (r8 instanceof C131476de) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r8 = C131476de.A00(r8);
            if (r8 instanceof C131406dX) {
                return false;
            }
        }
        C131496dg A06 = r8.A06();
        if (r7 instanceof C131476de) {
            r7 = C131476de.A00(r7);
            if (r7 instanceof C131406dX) {
                return false;
            }
        }
        Iterator it = r7.A06().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Iterator it2 = A06.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (next.equals(it2.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
