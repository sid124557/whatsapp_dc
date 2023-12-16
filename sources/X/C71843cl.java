package X;

import java.util.Comparator;

/* renamed from: X.3cl  reason: invalid class name and case insensitive filesystem */
public final class C71843cl implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C50612iT r4 = (C50612iT) obj;
        C50612iT r5 = (C50612iT) obj2;
        if (r4 == null || r5 == null) {
            return 0;
        }
        boolean z = r4.A0S;
        if (!(r5.A0S ^ z)) {
            return r5.A00 - r4.A00;
        }
        if (z) {
            return -1;
        }
        return 1;
    }
}
