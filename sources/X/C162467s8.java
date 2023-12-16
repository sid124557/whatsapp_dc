package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7s8  reason: invalid class name and case insensitive filesystem */
public final class C162467s8 {
    public static boolean removeAll(Iterator it, Collection collection) {
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static Iterator consumingForArray(Iterator... itArr) {
        return new C129966bA(itArr);
    }

    public static C129996bD emptyListIterator() {
        return AnonymousClass6Zv.EMPTY;
    }

    public static Iterator emptyModifiableIterator() {
        return C143056yG.INSTANCE;
    }

    public static int indexOf(Iterator it, C181308mY r3) {
        C162187rP.A04(r3, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (r3.AxD(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static C172878Nf singletonIterator(Object obj) {
        return new C129946b8(obj);
    }

    public static C172878Nf unmodifiableIterator(Iterator it) {
        return new C129936b7(it);
    }

    public static boolean addAll(Collection collection, Iterator it) {
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static int advance(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        if (!AnonymousClass001.A1U(i)) {
            throw AnonymousClass6C7.A0U("numberToAdvance must be nonnegative");
        }
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static boolean any(Iterator it, C181308mY r1) {
        return AnonymousClass001.A1X(indexOf(it, r1), -1);
    }

    public static void clear(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Iterator concat(Iterator it, Iterator it2) {
        it.getClass();
        it2.getClass();
        Iterator[] itArr = new Iterator[2];
        AnonymousClass000.A16(it, it2, itArr);
        return concat(consumingForArray(itArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean elementsEqual(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L_0x0000:
            boolean r1 = r3.hasNext()
            boolean r0 = r4.hasNext()
            if (r1 == 0) goto L_0x001c
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r3.next()
            java.lang.Object r0 = r4.next()
            boolean r0 = X.C1447372t.A00(r1, r0)
            if (r0 != 0) goto L_0x0000
        L_0x001b:
            return r2
        L_0x001c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162467s8.elementsEqual(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static C172878Nf emptyIterator() {
        return emptyListIterator();
    }

    public static C172878Nf filter(Iterator it, C181308mY r3) {
        it.getClass();
        r3.getClass();
        return new C188918zh(it, r3, 0);
    }

    public static Object getLast(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object getNext(Iterator it, Object obj) {
        if (it.hasNext()) {
            return it.next();
        }
        return obj;
    }

    public static Object pollNext(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean removeIf(Iterator it, C181308mY r3) {
        r3.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (r3.AxD(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static String toString(Iterator it) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                AnonymousClass001.A1M(A0o);
            }
            A0o.append(it.next());
            z = false;
        }
        return AnonymousClass0x2.A0f(A0o);
    }

    public static Iterator transform(Iterator it, C181298mX r2) {
        r2.getClass();
        return new C129916b5(it, r2);
    }

    public static Iterator concat(Iterator it) {
        return new AnonymousClass8Ny(it);
    }
}
