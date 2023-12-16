package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8NE  reason: invalid class name */
public final class AnonymousClass8NE implements Collection<C172498Lj>, C834348j {
    public final int[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r1 < 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsAll(java.util.Collection r8) {
        /*
            r7 = this;
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            int[] r6 = r7.A00
            boolean r0 = r8.isEmpty()
            r5 = 1
            if (r0 != 0) goto L_0x0032
            java.util.Iterator r4 = r8.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C172498Lj
            if (r0 == 0) goto L_0x0031
            X.8Lj r1 = (X.C172498Lj) r1
            int r3 = r1.A00
            int r2 = r6.length
            r1 = 0
        L_0x0025:
            if (r1 >= r2) goto L_0x0031
            r0 = r6[r1]
            if (r3 != r0) goto L_0x002e
            if (r1 < 0) goto L_0x0031
            goto L_0x0011
        L_0x002e:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x0031:
            r5 = 0
        L_0x0032:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8NE.containsAll(java.util.Collection):boolean");
    }

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        return AnonymousClass323.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C172498Lj) {
            int i = ((C172498Lj) obj).A00;
            int[] iArr = this.A00;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (i != iArr[i2]) {
                    i2++;
                } else if (i2 < 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        int[] iArr = this.A00;
        if (!(obj instanceof AnonymousClass8NE) || !C162457s7.A0P(iArr, ((AnonymousClass8NE) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(this.A00.length);
    }

    public Iterator iterator() {
        return new AnonymousClass8OA(this.A00);
    }

    public /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public String toString() {
        int[] iArr = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UIntArray(storage=");
        return C18260x0.A07(Arrays.toString(iArr), A0o);
    }

    public /* synthetic */ AnonymousClass8NE(int[] iArr) {
        this.A00 = iArr;
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

    public boolean remove(Object obj) {
        throw C18290x4.A0x();
    }

    public boolean removeAll(Collection collection) {
        throw C18290x4.A0x();
    }

    public boolean retainAll(Collection collection) {
        throw C18290x4.A0x();
    }

    public Object[] toArray() {
        return AnonymousClass323.A00(this);
    }
}
