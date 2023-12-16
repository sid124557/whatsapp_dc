package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.7rQ  reason: invalid class name and case insensitive filesystem */
public final class C162197rQ {
    public static boolean equalsImpl(List list, Object obj) {
        if (obj != list) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                int size = list.size();
                if (size == list2.size()) {
                    if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
                        return C162467s8.elementsEqual(list.iterator(), list2.iterator());
                    }
                    int i = 0;
                    while (i < size) {
                        if (C1447372t.A00(list.get(i), list2.get(i))) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static ArrayList newArrayList(Object... objArr) {
        ArrayList A0I = AnonymousClass002.A0I(computeArrayListCapacity(objArr.length));
        Collections.addAll(A0I, objArr);
        return A0I;
    }

    public static int computeArrayListCapacity(int i) {
        C160937oh.checkNonnegative(i, "arraySize");
        return C159357lh.A01(((long) i) + 5 + ((long) (i / 10)));
    }

    public static int indexOfImpl(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C1447372t.A00(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int lastIndexOfImpl(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C1447372t.A00(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int indexOfRandomAccess(List list, Object obj) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (AnonymousClass6C9.A1O(obj, list, i)) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOfRandomAccess(List list, Object obj) {
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (!AnonymousClass6C9.A1O(obj, list, size));
        return size;
    }

    public static ArrayList newArrayList() {
        return AnonymousClass001.A0s();
    }

    public static ArrayList newArrayList(Iterator it) {
        ArrayList newArrayList = newArrayList();
        C162467s8.addAll(newArrayList, it);
        return newArrayList;
    }
}
