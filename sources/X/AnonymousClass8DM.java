package X;

import java.util.Iterator;

/* renamed from: X.8DM  reason: invalid class name */
public class AnonymousClass8DM implements C181478mp {
    public boolean B2l(C159187lJ r6, C159187lJ r7, AnonymousClass7MS r8) {
        boolean z;
        C131496dg A06 = r7.A06();
        if (r6 instanceof C131476de) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C159187lJ A00 = C131476de.A00(r6);
            if (!(A00 instanceof C131496dg)) {
                return true;
            }
            C131496dg A062 = A00.A06();
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                if (!A062.A00.contains(it.next())) {
                }
            }
            return true;
        }
        return false;
    }
}
