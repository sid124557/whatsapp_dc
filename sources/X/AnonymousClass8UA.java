package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.AbstractMapBuilderEntrySet;

/* renamed from: X.8UA  reason: invalid class name */
public final class AnonymousClass8UA<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {
    public final AnonymousClass8OR A00;

    public boolean containsAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        AnonymousClass8OR r2 = this.A00;
        for (Object next : collection) {
            if (next == null) {
                return false;
            }
            try {
                if (!r2.A06((Map.Entry) next)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8UA, java.util.AbstractSet] */
    public boolean removeAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.A00.A02();
        return AnonymousClass8UA.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.8UA] */
    public boolean retainAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        this.A00.A02();
        return AnonymousClass8UA.super.retainAll(collection);
    }

    public void clear() {
        this.A00.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C162457s7.A0J(entry, 0);
        return this.A00.A06(entry);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new AnonymousClass8UH(this.A00);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C162457s7.A0J(entry, 0);
        AnonymousClass8OR r3 = this.A00;
        r3.A02();
        int A01 = r3.A01(entry.getKey());
        if (A01 < 0) {
            return false;
        }
        Object[] objArr = r3.valuesArray;
        C162457s7.A0H(objArr);
        if (!C162457s7.A0P(objArr[A01], entry.getValue())) {
            return false;
        }
        r3.A05(A01);
        return true;
    }

    public AnonymousClass8UA(AnonymousClass8OR r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C18320x8.A0m();
    }

    public boolean addAll(Collection collection) {
        throw C18320x8.A0m();
    }

    public AnonymousClass8UA() {
    }
}
