package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0nN  reason: invalid class name and case insensitive filesystem */
public final class C13560nN implements Set {
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

    public C13560nN(AnonymousClass0UU r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.A00.A04();
    }

    public boolean contains(Object obj) {
        return AnonymousClass001.A1U(this.A00.A02(obj));
    }

    public boolean containsAll(Collection collection) {
        C17540vk r1 = (C17540vk) this.A00;
        if (r1.A01 != 0) {
            throw AnonymousClass002.A0G("not a map");
        }
        AnonymousClass05C r2 = (AnonymousClass05C) r1.A00;
        for (Object containsKey : collection) {
            if (!r2.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass0UU r4 = this.A00;
        int i = 0;
        for (int A01 = r4.A01() - 1; A01 >= 0; A01--) {
            i += AnonymousClass000.A07(r4.A03(A01, 0));
        }
        return i;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(this.A00.A01());
    }

    public Iterator iterator() {
        return new C13490nG(this.A00, 0);
    }

    public boolean remove(Object obj) {
        AnonymousClass0UU r1 = this.A00;
        int A02 = r1.A02(obj);
        if (A02 < 0) {
            return false;
        }
        r1.A05(A02);
        return true;
    }

    public boolean removeAll(Collection collection) {
        C17540vk r1 = (C17540vk) this.A00;
        if (r1.A01 != 0) {
            throw AnonymousClass002.A0G("not a map");
        }
        AnonymousClass05C r3 = (AnonymousClass05C) r1.A00;
        int size = r3.size();
        for (Object remove : collection) {
            r3.remove(remove);
        }
        return AnonymousClass001.A1X(size, r3.size());
    }

    public boolean retainAll(Collection collection) {
        C17540vk r1 = (C17540vk) this.A00;
        if (r1.A01 == 0) {
            return AnonymousClass0UU.A00(collection, (AnonymousClass05C) r1.A00);
        }
        throw AnonymousClass002.A0G("not a map");
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray(Object[] objArr) {
        return this.A00.A06(objArr, 0);
    }

    public Object[] toArray() {
        AnonymousClass0UU r5 = this.A00;
        int A01 = r5.A01();
        Object[] objArr = new Object[A01];
        for (int i = 0; i < A01; i++) {
            objArr[i] = r5.A03(i, 0);
        }
        return objArr;
    }
}
