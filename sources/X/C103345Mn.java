package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5Mn  reason: invalid class name and case insensitive filesystem */
public final class C103345Mn {
    public final C54592oy A00;

    public C103345Mn(C54592oy r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(Collection collection) {
        Integer A002;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            long A02 = C18270x1.A02(it);
            C54592oy r1 = this.A00;
            if (r1.A03(A02) && ((A002 = r1.A00(A02)) == null || 4 != A002.intValue())) {
                return false;
            }
        }
        return true;
    }
}
