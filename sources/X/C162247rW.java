package X;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.7rW  reason: invalid class name and case insensitive filesystem */
public final class C162247rW {
    public static boolean removeIfFromRandomAccessList(List list, C181308mY r7) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!r7.AxD(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException | UnsupportedOperationException unused) {
                        slowRemoveIfForRemainingElements(list, r7, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static boolean addAll(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        return C162467s8.addAll(collection, iterable.iterator());
    }

    public static Object getLast(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return C162467s8.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return getLastInNonemptyList(list);
        }
        throw AnonymousClass6CA.A0c();
    }

    public static boolean removeIf(Iterable iterable, C181308mY r2) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return C162467s8.removeIf(iterable.iterator(), r2);
        }
        r2.getClass();
        return removeIfFromRandomAccessList((List) iterable, r2);
    }

    public static boolean any(Iterable iterable, C181308mY r1) {
        return C162467s8.any(iterable.iterator(), r1);
    }

    public static Object getFirst(Iterable iterable, Object obj) {
        return C162467s8.getNext(iterable.iterator(), obj);
    }

    public static Object getLastInNonemptyList(List list) {
        return C18300x5.A0c(list);
    }

    public static Iterable skip(Iterable iterable, int i) {
        if (AnonymousClass001.A1U(i)) {
            return new C129416aH(iterable, i);
        }
        throw AnonymousClass6C7.A0U("number to skip cannot be negative");
    }

    public static void slowRemoveIfForRemainingElements(List list, C181308mY r3, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (r3.AxD(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    public static String toString(Iterable iterable) {
        return C162467s8.toString(iterable.iterator());
    }
}
