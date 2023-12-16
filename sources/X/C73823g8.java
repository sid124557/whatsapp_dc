package X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3g8  reason: invalid class name and case insensitive filesystem */
public final class C73823g8 extends C73833g9 {
    public static final Set A00(Iterable iterable, Set set) {
        C162457s7.A0J(iterable, 1);
        if (!(iterable instanceof Collection)) {
            iterable = C73723fy.A0F(iterable);
        }
        Collection collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return C73723fy.A0P(set);
        }
        if (collection instanceof Set) {
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            for (Object next : set) {
                if (!collection.contains(next)) {
                    A17.add(next);
                }
            }
            return A17;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        linkedHashSet.removeAll(collection);
        return linkedHashSet;
    }

    public static final Set A01(Iterable iterable, Set set) {
        int size;
        C18260x0.A0O(set, iterable);
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (Integer.valueOf(size2) != null) {
                size = set.size() + size2;
                LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass8UG.A0I(size));
                linkedHashSet.addAll(set);
                C73743g0.A0W(iterable, linkedHashSet);
                return linkedHashSet;
            }
        }
        size = set.size() * 2;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AnonymousClass8UG.A0I(size));
        linkedHashSet2.addAll(set);
        C73743g0.A0W(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static final Set A02(Object obj, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass8UG.A0I(set.size()));
        boolean z = false;
        for (Object next : set) {
            if (z || !C162457s7.A0P(next, obj)) {
                linkedHashSet.add(next);
            } else {
                z = true;
            }
        }
        return linkedHashSet;
    }
}
