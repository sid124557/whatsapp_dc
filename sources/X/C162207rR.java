package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7rR  reason: invalid class name and case insensitive filesystem */
public final class C162207rR {
    public static boolean equalsImpl(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static HashSet newHashSet(Object... objArr) {
        HashSet newHashSetWithExpectedSize = newHashSetWithExpectedSize(objArr.length);
        Collections.addAll(newHashSetWithExpectedSize, objArr);
        return newHashSetWithExpectedSize;
    }

    public static AnonymousClass8TL intersection(Set set, Set set2) {
        C162187rP.A04(set, "set1");
        C162187rP.A04(set2, "set2");
        return new C129906b4(set, set2);
    }

    public static int hashCodeImpl(Set set) {
        int i = 0;
        for (Object A04 : set) {
            i = ~(~(i + C18280x3.A04(A04)));
        }
        return i;
    }

    public static Set newConcurrentHashSet() {
        return Collections.newSetFromMap(AnonymousClass0x9.A1D());
    }

    public static HashSet newHashSetWithExpectedSize(int i) {
        return new HashSet(C162057r9.capacity(i));
    }

    public static boolean removeAllImpl(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof C188168yS) {
            collection = ((C188168yS) collection).elementSet();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return removeAllImpl(set, collection.iterator());
        }
        return C162467s8.removeAll(set.iterator(), collection);
    }

    public static HashSet newHashSet() {
        return AnonymousClass002.A0K();
    }

    public static boolean removeAllImpl(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
