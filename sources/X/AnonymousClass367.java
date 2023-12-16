package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.367  reason: invalid class name */
public class AnonymousClass367 {
    public static int A00(Object obj, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean A03(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
            if (obj != null && obj2 != null && obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A04(List list, List list2) {
        if (list != null) {
            if (list2 == null) {
                return list.isEmpty();
            }
            if (!list.isEmpty() && !list2.isEmpty()) {
                return AnonymousClass0x9.A15(list).equals(AnonymousClass0x9.A15(list2));
            }
            if (!list.isEmpty()) {
                return false;
            }
        } else if (list2 == null) {
            return true;
        }
        return list2.isEmpty();
    }

    public static boolean A05(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void A01(C15800rx r2, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (r2.Bqd(it.next())) {
                it.remove();
            }
        }
    }

    public static boolean A02(C15800rx r2, Collection collection) {
        for (Object Bqd : collection) {
            if (r2.Bqd(Bqd)) {
                return true;
            }
        }
        return false;
    }
}
