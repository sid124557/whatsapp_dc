package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.3d3  reason: invalid class name and case insensitive filesystem */
public final class C72023d3 implements List, Serializable, RandomAccess, C834348j {
    public static final C72023d3 A00 = new C72023d3();
    public static final long serialVersionUID = -7390468764508069838L;

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        return AnonymousClass323.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ int indexOf(Object obj) {
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        return -1;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C72033d4.A00;
        }
        throw new IndexOutOfBoundsException(AnonymousClass000.A0Y("Index: ", AnonymousClass001.A0o(), i));
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fromIndex: ");
        A0o.append(i);
        throw new IndexOutOfBoundsException(AnonymousClass000.A0Y(", toIndex: ", A0o, i2));
    }

    private final Object readResolve() {
        return A00;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C18290x4.A0x();
    }

    public boolean addAll(Collection collection) {
        throw C18290x4.A0x();
    }

    public void clear() {
        throw C18290x4.A0x();
    }

    public boolean containsAll(Collection collection) {
        return AnonymousClass0x7.A1T(collection);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Empty list doesn't contain element at index ");
        A0o.append(i);
        throw new IndexOutOfBoundsException(AnonymousClass001.A0j(A0o, '.'));
    }

    public int hashCode() {
        return 1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C72033d4.A00;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw C18290x4.A0x();
    }

    public boolean removeAll(Collection collection) {
        throw C18290x4.A0x();
    }

    public boolean retainAll(Collection collection) {
        throw C18290x4.A0x();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw C18290x4.A0x();
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "[]";
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw C18290x4.A0x();
    }

    public boolean addAll(int i, Collection collection) {
        throw C18290x4.A0x();
    }

    public ListIterator listIterator() {
        return C72033d4.A00;
    }

    public boolean remove(Object obj) {
        throw C18290x4.A0x();
    }

    public Object[] toArray() {
        return AnonymousClass323.A00(this);
    }
}
