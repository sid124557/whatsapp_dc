package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8UB  reason: invalid class name */
public final class AnonymousClass8UB<E> extends AnonymousClass8TN<E> implements Set<E>, Serializable, C85394Gb {
    public static final AnonymousClass8UB A00 = new AnonymousClass8UB(AnonymousClass8OR.A00);
    public final AnonymousClass8OR backing;

    public boolean addAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.backing.A02();
        return super.addAll(collection);
    }

    public boolean removeAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.backing.A02();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.backing.A02();
        return super.retainAll(collection);
    }

    private final Object writeReplace() {
        if (this.backing.isReadOnly) {
            return new C172328Ko(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(Object obj) {
        return AnonymousClass001.A1U(this.backing.A00(obj));
    }

    public void clear() {
        this.backing.clear();
    }

    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public Iterator iterator() {
        return new AnonymousClass8UI(this.backing);
    }

    public boolean remove(Object obj) {
        AnonymousClass8OR r1 = this.backing;
        r1.A02();
        int A01 = r1.A01(obj);
        if (A01 < 0) {
            return false;
        }
        r1.A05(A01);
        return true;
    }

    public AnonymousClass8UB(AnonymousClass8OR r1) {
        this.backing = r1;
    }

    public AnonymousClass8UB() {
        this(new AnonymousClass8OR());
    }
}
