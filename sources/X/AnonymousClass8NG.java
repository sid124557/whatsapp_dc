package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8NG  reason: invalid class name */
public final class AnonymousClass8NG implements Collection<C172448Ld>, C834348j {
    public final short[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r1 < 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsAll(java.util.Collection r8) {
        /*
            r7 = this;
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            short[] r6 = r7.A00
            boolean r0 = r8.isEmpty()
            r5 = 1
            if (r0 != 0) goto L_0x0032
            java.util.Iterator r4 = r8.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C172448Ld
            if (r0 == 0) goto L_0x0031
            X.8Ld r1 = (X.C172448Ld) r1
            short r3 = r1.A00
            int r2 = r6.length
            r1 = 0
        L_0x0025:
            if (r1 >= r2) goto L_0x0031
            short r0 = r6[r1]
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8NG.containsAll(java.util.Collection):boolean");
    }

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        return AnonymousClass323.A01(this, objArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C172448Ld) {
            short s = ((C172448Ld) obj).A00;
            short[] sArr = this.A00;
            int length = sArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (s != sArr[i]) {
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
        short[] sArr = this.A00;
        if (!(obj instanceof AnonymousClass8NG) || !C162457s7.A0P(sArr, ((AnonymousClass8NG) obj).A00)) {
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
        return new AnonymousClass8OC(this.A00);
    }

    public /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    public String toString() {
        short[] sArr = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UShortArray(storage=");
        return C18260x0.A07(Arrays.toString(sArr), A0o);
    }

    public /* synthetic */ AnonymousClass8NG(short[] sArr) {
        this.A00 = sArr;
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
