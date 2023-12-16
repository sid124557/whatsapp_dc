package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3d7  reason: invalid class name and case insensitive filesystem */
public final class C72063d7 implements Set, Serializable, C834348j {
    public static final C72063d7 A00 = new C72063d7();
    public static final long serialVersionUID = 3406603774387020532L;

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        return AnonymousClass323.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
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

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C72033d4.A00;
    }

    public boolean remove(Object obj) {
        throw C18290x4.A0x();
    }

    public boolean removeAll(Collection collection) {
        throw C18290x4.A0x();
    }

    public boolean retainAll(Collection collection) {
        throw C18290x4.A0x();
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "[]";
    }

    public Object[] toArray() {
        return AnonymousClass323.A00(this);
    }
}
