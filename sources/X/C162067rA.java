package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7rA  reason: invalid class name and case insensitive filesystem */
public final class C162067rA {
    public static boolean equalsImpl(C188168yS r6, Object obj) {
        if (obj != r6) {
            if (obj instanceof C188168yS) {
                C188168yS r7 = (C188168yS) obj;
                if (r6.size() == r7.size() && r6.entrySet().size() == r7.entrySet().size()) {
                    for (C153177an r2 : r7.entrySet()) {
                        if (r6.count(r2.getElement()) != r2.getCount()) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean addAllImpl(C188168yS r3, C188168yS r4) {
        if (r4 instanceof C129376aD) {
            return addAllImpl(r3, (C129376aD) r4);
        }
        if (r4.isEmpty()) {
            return false;
        }
        for (C153177an r0 : r4.entrySet()) {
            r3.add(r0.getElement(), r0.getCount());
        }
        return true;
    }

    public static C188168yS cast(Iterable iterable) {
        return (C188168yS) iterable;
    }

    public static boolean removeAllImpl(C188168yS r1, Collection collection) {
        if (collection instanceof C188168yS) {
            collection = ((C188168yS) collection).elementSet();
        }
        return r1.elementSet().removeAll(collection);
    }

    public static Iterator iteratorImpl(C188168yS r2) {
        return new C172988Nt(r2, r2.entrySet().iterator());
    }

    public static boolean retainAllImpl(C188168yS r1, Collection collection) {
        collection.getClass();
        if (collection instanceof C188168yS) {
            collection = ((C188168yS) collection).elementSet();
        }
        return r1.elementSet().retainAll(collection);
    }

    public static boolean addAllImpl(C188168yS r1, Collection collection) {
        collection.getClass();
        if (collection instanceof C188168yS) {
            return addAllImpl(r1, cast(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C162467s8.addAll(r1, collection.iterator());
    }

    public static boolean addAllImpl(C188168yS r1, C129376aD r2) {
        if (r2.isEmpty()) {
            return false;
        }
        r2.addTo(r1);
        return true;
    }
}
