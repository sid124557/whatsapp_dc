package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.3g0  reason: invalid class name and case insensitive filesystem */
public class C73743g0 extends C73753g1 {
    public static final void A0W(Iterable iterable, Collection collection) {
        C162457s7.A0J(iterable, 1);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static final void A0X(Iterable iterable, AnonymousClass4GQ r4) {
        C162457s7.A0J(iterable, 0);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (AnonymousClass001.A1Z(r4.invoke(it.next()))) {
                it.remove();
            }
        }
    }

    public static final void A0Y(Collection collection, Object[] objArr) {
        C162457s7.A0J(objArr, 1);
        List asList = Arrays.asList(objArr);
        C162457s7.A0D(asList);
        collection.addAll(asList);
    }

    public static final void A0Z(List list, AnonymousClass4GQ r6, boolean z) {
        int A03;
        if (list instanceof RandomAccess) {
            C72013d2 A00 = new C175698Zj(0, AnonymousClass002.A03(list)).iterator();
            int i = 0;
            while (A00.hasNext()) {
                int A002 = A00.A00();
                Object obj = list.get(A002);
                if (AnonymousClass001.A1Z(r6.invoke(obj)) != z) {
                    if (i != A002) {
                        list.set(i, obj);
                    }
                    i++;
                }
            }
            if (i < list.size() && i <= (A03 = AnonymousClass002.A03(list))) {
                while (true) {
                    list.remove(A03);
                    if (A03 != i) {
                        A03--;
                    } else {
                        return;
                    }
                }
            }
        } else if (!(list instanceof C834348j) || (list instanceof C85414Gd)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass001.A1Z(r6.invoke(it.next())) == z) {
                    it.remove();
                }
            }
        } else {
            AnonymousClass360.A04(list, "kotlin.collections.MutableIterable");
            throw AnonymousClass000.A0L();
        }
    }
}
