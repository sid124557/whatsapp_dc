package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.6aY  reason: invalid class name and case insensitive filesystem */
public abstract class C129586aY<E> extends C174098Sy<E> implements List<E>, RandomAccess {
    public static final C129996bD EMPTY_ITR = new AnonymousClass6Zu(C129566aW.EMPTY, 0);

    public C129586aY subListUnchecked(int i, int i2) {
        return new C129556aV(this, i, i2 - i);
    }

    public static C129586aY asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return of();
        }
        return new C129566aW(objArr, i);
    }

    public static C129486aO builder() {
        return new C129486aO();
    }

    public static C129586aY copyOf(Collection collection) {
        if (!(collection instanceof C174098Sy)) {
            return construct(collection.toArray());
        }
        C129586aY asList = ((C174098Sy) collection).asList();
        if (asList.isPartialView()) {
            return asImmutableList(asList.toArray());
        }
        return asList;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final C129586aY asList() {
        return this;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C162197rQ.indexOfImpl(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C162197rQ.lastIndexOfImpl(this, obj);
    }

    public static C129586aY construct(Object... objArr) {
        C161507po.checkElementsNotNull(objArr);
        return asImmutableList(objArr);
    }

    public static C129586aY of(Object obj, Object obj2) {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A16(obj, obj2, A0M);
        return construct(A0M);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw C18320x8.A0m();
    }

    public boolean contains(Object obj) {
        return AnonymousClass001.A1U(indexOf(obj));
    }

    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        return C162197rQ.equalsImpl(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~AnonymousClass002.A02(get(i2), i * 31));
        }
        return i;
    }

    public C172878Nf iterator() {
        return listIterator();
    }

    public C129996bD listIterator(int i) {
        C162187rP.A02(i, size());
        if (isEmpty()) {
            return EMPTY_ITR;
        }
        return new AnonymousClass6Zu(this, i);
    }

    @Deprecated
    public final Object remove(int i) {
        throw C18320x8.A0m();
    }

    public C129586aY reverse() {
        if (size() <= 1) {
            return this;
        }
        return new C129576aX(this);
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw C18320x8.A0m();
    }

    public C129586aY subList(int i, int i2) {
        C162187rP.A03(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return subListUnchecked(i, i2);
    }

    public Object writeReplace() {
        return new AnonymousClass8L2(toArray());
    }

    public static C129586aY asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static C129586aY copyOf(Object[] objArr) {
        if (objArr.length == 0) {
            return of();
        }
        return construct((Object[]) objArr.clone());
    }

    public static C129586aY of(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = new Object[4];
        C18260x0.A0i(obj, obj2, obj3, objArr);
        objArr[3] = obj4;
        return construct(objArr);
    }

    public C129996bD listIterator() {
        return listIterator(0);
    }

    public static C129586aY of(Object obj) {
        return construct(AnonymousClass000.A1b(obj));
    }

    public static C129586aY of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] A1Z = AnonymousClass6C9.A1Z(obj, 5);
        AnonymousClass000.A11(obj2, obj3, obj4, obj5, A1Z);
        return construct(A1Z);
    }

    public static C129586aY of() {
        return C129566aW.EMPTY;
    }
}
