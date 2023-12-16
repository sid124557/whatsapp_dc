package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5kz  reason: invalid class name and case insensitive filesystem */
public abstract class C113165kz implements C1229266j {
    public boolean B7f() {
        return true;
    }

    public boolean BoM(Collection collection) {
        AnonymousClass33C r1;
        if (AnonymousClass0x7.A1T(collection)) {
            return true;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return true;
        }
        C624134x A0T = C18300x5.A0T(it);
        if (!(A0T instanceof C30471mV) || ((r1 = ((C30471mV) A0T).A01) != null && r1.A0Q && !r1.A0c && r1.A0R)) {
            return !C627636p.A0l(A0T);
        }
        return false;
    }
}
