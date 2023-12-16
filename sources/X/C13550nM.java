package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0nM  reason: invalid class name and case insensitive filesystem */
public final class C13550nM implements Set {
    public final /* synthetic */ AnonymousClass0UU A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public C13550nM(AnonymousClass0UU r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        AnonymousClass0UU r5 = this.A00;
        int A01 = r5.A01();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            ((C06290Wz) ((C17540vk) r5).A00).put(A0w.getKey(), A0w.getValue());
        }
        return AnonymousClass001.A1X(A01, r5.A01());
    }

    public void clear() {
        this.A00.A04();
    }

    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            AnonymousClass0UU r2 = this.A00;
            int A02 = r2.A02(entry.getKey());
            if (A02 >= 0) {
                Object A03 = r2.A03(A02, 1);
                Object value = entry.getValue();
                if (A03 == value) {
                    return true;
                }
                if (A03 == null || !A03.equals(value)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AnonymousClass0UU r6 = this.A00;
        int i = 0;
        for (int A01 = r6.A01() - 1; A01 >= 0; A01--) {
            i += AnonymousClass000.A07(r6.A03(A01, 0)) ^ AnonymousClass000.A07(r6.A03(A01, 1));
        }
        return i;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(this.A00.A01());
    }

    public Iterator iterator() {
        return new C13520nJ(this.A00);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }
}
