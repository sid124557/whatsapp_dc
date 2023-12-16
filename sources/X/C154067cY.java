package X;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: X.7cY  reason: invalid class name and case insensitive filesystem */
public final class C154067cY {
    public static Comparator comparator(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        if (comparator == null) {
            return AnonymousClass8NS.natural();
        }
        return comparator;
    }

    public static boolean hasSameComparator(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else if (!(iterable instanceof C188128yM)) {
            return false;
        } else {
            comparator2 = ((C188128yM) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
