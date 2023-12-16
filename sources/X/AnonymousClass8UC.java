package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8UC  reason: invalid class name */
public final class AnonymousClass8UC<E> extends AnonymousClass8TN<E> implements Set<E>, C85394Gb {
    public final AnonymousClass8OR A00;

    public boolean removeAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.A00.A02();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.A00.A02();
        return super.retainAll(collection);
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new AnonymousClass8UI(this.A00);
    }

    public boolean remove(Object obj) {
        AnonymousClass8OR r1 = this.A00;
        r1.A02();
        int A01 = r1.A01(obj);
        if (A01 < 0) {
            return false;
        }
        r1.A05(A01);
        return true;
    }

    public AnonymousClass8UC(AnonymousClass8OR r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw C18320x8.A0m();
    }

    public boolean addAll(Collection collection) {
        throw C18320x8.A0m();
    }
}
