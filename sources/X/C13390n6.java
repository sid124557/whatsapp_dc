package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0n6  reason: invalid class name and case insensitive filesystem */
public final class C13390n6 implements Collection<V> {
    public final /* synthetic */ AnonymousClass0UU A00;

    public C13390n6(AnonymousClass0UU r1) {
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
        return AnonymousClass001.A1U(((C06290Wz) ((C17540vk) this.A00).A00).A05(obj));
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(this.A00.A01());
    }

    public Iterator iterator() {
        return new C13490nG(this.A00, 1);
    }

    public boolean remove(Object obj) {
        AnonymousClass0UU r1 = this.A00;
        int A05 = ((C06290Wz) ((C17540vk) r1).A00).A05(obj);
        if (A05 < 0) {
            return false;
        }
        r1.A05(A05);
        return true;
    }

    public boolean removeAll(Collection collection) {
        AnonymousClass0UU r4 = this.A00;
        int A01 = r4.A01();
        int i = 0;
        boolean z = false;
        while (i < A01) {
            if (collection.contains(r4.A03(i, 1))) {
                r4.A05(i);
                i--;
                A01--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        AnonymousClass0UU r4 = this.A00;
        int A01 = r4.A01();
        int i = 0;
        boolean z = false;
        while (i < A01) {
            if (!collection.contains(r4.A03(i, 1))) {
                r4.A05(i);
                i--;
                A01--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public int size() {
        return this.A00.A01();
    }

    public Object[] toArray(Object[] objArr) {
        return this.A00.A06(objArr, 1);
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
        AnonymousClass0UU r5 = this.A00;
        int A01 = r5.A01();
        Object[] objArr = new Object[A01];
        for (int i = 0; i < A01; i++) {
            objArr[i] = r5.A03(i, 1);
        }
        return objArr;
    }
}
