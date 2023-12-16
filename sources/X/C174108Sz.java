package X;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractMutableCollection;

/* renamed from: X.8Sz  reason: invalid class name and case insensitive filesystem */
public final class C174108Sz<V> extends AbstractMutableCollection<V> implements Collection<V>, C85404Gc {
    public final AnonymousClass8OR A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.8Sz] */
    public boolean removeAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.A00.A02();
        return C174108Sz.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.8Sz] */
    public boolean retainAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.A00.A02();
        return C174108Sz.super.retainAll(collection);
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new AnonymousClass8UJ(this.A00);
    }

    public boolean remove(Object obj) {
        AnonymousClass8OR r2 = this.A00;
        r2.A02();
        int i = r2.length;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            if (r2.presenceArray[i] >= 0) {
                Object[] objArr = r2.valuesArray;
                C162457s7.A0H(objArr);
                if (C162457s7.A0P(objArr[i], obj)) {
                    r2.A05(i);
                    return true;
                }
            }
        }
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public C174108Sz(AnonymousClass8OR r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw C18320x8.A0m();
    }

    public boolean addAll(Collection collection) {
        throw C18320x8.A0m();
    }

    public C174108Sz() {
    }
}
