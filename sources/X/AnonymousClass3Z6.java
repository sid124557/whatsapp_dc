package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: X.3Z6  reason: invalid class name */
public final class AnonymousClass3Z6 implements Serializable {
    public final Object first;
    public final Object second;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Z6) {
                AnonymousClass3Z6 r5 = (AnonymousClass3Z6) obj;
                if (!C162457s7.A0P(this.first, r5.first) || !C162457s7.A0P(this.second, r5.second)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static int A00(AnonymousClass3Z6 r0) {
        return ((Number) r0.first).intValue();
    }

    public static AnonymousClass3Z6 A02(Object obj, Object obj2) {
        return new AnonymousClass3Z6(obj, obj2);
    }

    public static void A03(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass3Z6(obj, obj2));
    }

    public static void A04(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = new AnonymousClass3Z6(obj, obj2);
    }

    public static void A05(Object obj, Object obj2, Object[] objArr) {
        objArr[1] = new AnonymousClass3Z6(obj, obj2);
    }

    public static void A06(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = new AnonymousClass3Z6(obj, obj2);
    }

    public static void A07(Object obj, Object obj2, Object[] objArr) {
        objArr[3] = new AnonymousClass3Z6(obj, obj2);
    }

    public static void A08(Object obj, Object obj2, Object[] objArr) {
        objArr[4] = new AnonymousClass3Z6(obj, obj2);
    }

    public static void A09(Object obj, Object obj2, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass3Z6(obj, obj2);
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.first) * 31) + C18310x6.A07(this.second);
    }

    public AnonymousClass3Z6(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public static AnonymousClass3Z6 A01(Object obj, int i) {
        return new AnonymousClass3Z6(obj, Integer.valueOf(i));
    }

    public static void A0A(AbstractMap abstractMap, Iterator it) {
        AnonymousClass3Z6 r0 = (AnonymousClass3Z6) it.next();
        abstractMap.put(r0.first, r0.second);
    }

    public final Object A0B() {
        return this.first;
    }

    public final Object A0C() {
        return this.second;
    }

    public final Object A0D() {
        return this.first;
    }

    public final Object A0E() {
        return this.second;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('(');
        A0o.append(this.first);
        AnonymousClass001.A1M(A0o);
        return C18260x0.A04(this.second, A0o);
    }
}
