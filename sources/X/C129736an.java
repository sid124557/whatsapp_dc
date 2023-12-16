package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: X.6an  reason: invalid class name and case insensitive filesystem */
public abstract class C129736an<E> extends C129676ah<E> implements NavigableSet<E>, C188128yM<E> {
    public final transient Comparator comparator;
    public transient C129736an descendingSet;

    public abstract Object ceiling(Object obj);

    public abstract C129736an createDescendingSet();

    public abstract /* bridge */ /* synthetic */ Iterator descendingIterator();

    public abstract Object first();

    public abstract Object floor(Object obj);

    public abstract C129736an headSetImpl(Object obj, boolean z);

    public abstract Object higher(Object obj);

    public abstract C172878Nf iterator();

    public abstract Object last();

    public abstract Object lower(Object obj);

    public C129736an subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract C129736an subSetImpl(Object obj, boolean z, Object obj2, boolean z2);

    public abstract C129736an tailSetImpl(Object obj, boolean z);

    public static C129736an construct(Comparator comparator2, int i, Object... objArr) {
        if (i == 0) {
            return emptySet(comparator2);
        }
        C161507po.checkElementsNotNull(objArr, i);
        Arrays.sort(objArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator2.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new C129726am(C129586aY.asImmutableList(objArr, i2), comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public Comparator comparator() {
        return this.comparator;
    }

    public C129736an descendingSet() {
        C129736an r0 = this.descendingSet;
        if (r0 != null) {
            return r0;
        }
        C129736an createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    public Object writeReplace() {
        return new AnonymousClass8L4(this.comparator, toArray());
    }

    public C129736an(Comparator comparator2) {
        this.comparator = comparator2;
    }

    public static C129726am emptySet(Comparator comparator2) {
        if (AnonymousClass8NS.natural().equals(comparator2)) {
            return C129726am.NATURAL_EMPTY_SET;
        }
        return new C129726am(C129586aY.of(), comparator2);
    }

    public static int unsafeCompare(Comparator comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    public C129736an headSet(Object obj, boolean z) {
        obj.getClass();
        return headSetImpl(obj, z);
    }

    @Deprecated
    public final Object pollFirst() {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final Object pollLast() {
        throw C18320x8.A0m();
    }

    public C129736an tailSet(Object obj, boolean z) {
        obj.getClass();
        return tailSetImpl(obj, z);
    }

    public C129736an subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C162187rP.A06(AnonymousClass0x7.A1P(this.comparator.compare(obj, obj2)));
        return subSetImpl(obj, z, obj2, z2);
    }

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    public C129736an headSet(Object obj) {
        return headSet(obj, false);
    }

    public C129736an tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
