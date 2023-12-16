package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3ch  reason: invalid class name and case insensitive filesystem */
public final class C71803ch<T> implements Collection<T>, C834348j {
    public final boolean A00;
    public final Object[] A01;

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        return AnonymousClass323.A01(this, objArr);
    }

    public boolean contains(Object obj) {
        return AnonymousClass001.A1U(C73703fw.A00(obj, this.A01));
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(this.A01.length);
    }

    public Iterator iterator() {
        return new C71973cy(this.A01);
    }

    public final /* bridge */ int size() {
        return this.A01.length;
    }

    public C71803ch(Object[] objArr, boolean z) {
        this.A01 = objArr;
        this.A00 = z;
    }

    public boolean add(Object obj) {
        throw C18290x4.A0x();
    }

    public boolean addAll(Collection collection) {
        throw C18290x4.A0x();
    }

    public void clear() {
        throw C18290x4.A0x();
    }

    public boolean containsAll(Collection collection) {
        if (AnonymousClass0x7.A1T(collection)) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
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

    public final Object[] toArray() {
        Object[] objArr = this.A01;
        Class<Object[]> cls = Object[].class;
        if (this.A00 && C162457s7.A0P(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        C162457s7.A0D(copyOf);
        return copyOf;
    }
}
