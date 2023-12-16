package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3ci  reason: invalid class name and case insensitive filesystem */
public abstract class C71813ci<E> implements Collection<E>, C834348j {
    public int A01() {
        return ((C73613fn) this).A00.A01.groupCount() + 1;
    }

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        return AnonymousClass323.A01(this, objArr);
    }

    public boolean isEmpty() {
        if (this instanceof C73613fn) {
            return false;
        }
        return AnonymousClass000.A1T(size());
    }

    public Iterator iterator() {
        if (this instanceof C73613fn) {
            C73613fn r3 = (C73613fn) this;
            return new C71983cz(new C72623e1(new AnonymousClass43S(r3), new C626335w(new C175698Zj(0, r3.size() - 1), 1)));
        }
        C73683fu r1 = (C73683fu) this;
        if (r1 instanceof C73673ft) {
            return new C73623fo((C73673ft) r1);
        }
        return new C71953cw(r1);
    }

    public String toString() {
        return C73723fy.A07(", ", "[", "]", "...", this, new AnonymousClass43P(this), -1);
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

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            if (C162457s7.A0P(it.next(), obj)) {
                return true;
            }
        }
        return false;
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

    public final /* bridge */ int size() {
        return A01();
    }

    public Object[] toArray() {
        return AnonymousClass323.A00(this);
    }
}
