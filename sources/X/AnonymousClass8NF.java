package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8NF  reason: invalid class name */
public final class AnonymousClass8NF implements Collection<C172438Lc>, C834348j {
    public final long[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r3 < 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsAll(java.util.Collection r11) {
        /*
            r10 = this;
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            long[] r9 = r10.A00
            boolean r0 = r11.isEmpty()
            r8 = 1
            if (r0 != 0) goto L_0x0034
            java.util.Iterator r7 = r11.iterator()
        L_0x0011:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r7.next()
            boolean r0 = r1 instanceof X.C172438Lc
            if (r0 == 0) goto L_0x0033
            X.8Lc r1 = (X.C172438Lc) r1
            long r5 = r1.A00
            int r4 = r9.length
            r3 = 0
        L_0x0025:
            if (r3 >= r4) goto L_0x0033
            r1 = r9[r3]
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            if (r3 < 0) goto L_0x0033
            goto L_0x0011
        L_0x0030:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0033:
            r8 = 0
        L_0x0034:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8NF.containsAll(java.util.Collection):boolean");
    }

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        return AnonymousClass323.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C172438Lc) {
            long j = ((C172438Lc) obj).A00;
            long[] jArr = this.A00;
            int length = jArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (j != jArr[i]) {
                    i++;
                } else if (i < 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        long[] jArr = this.A00;
        if (!(obj instanceof AnonymousClass8NF) || !C162457s7.A0P(jArr, ((AnonymousClass8NF) obj).A00)) {
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
        return new AnonymousClass8OB(this.A00);
    }

    public /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public String toString() {
        long[] jArr = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ULongArray(storage=");
        return C18260x0.A07(Arrays.toString(jArr), A0o);
    }

    public /* synthetic */ AnonymousClass8NF(long[] jArr) {
        this.A00 = jArr;
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
