package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: X.6aS  reason: invalid class name and case insensitive filesystem */
public abstract class C129526aS<E> extends C174098Sy<E> implements Set<E> {
    public transient C129586aY asList;

    public static int chooseTableSize(int i) {
        int i2;
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1) << 1;
            while (((double) i2) * 0.7d < ((double) max)) {
                i2 <<= 1;
            }
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                z = false;
            }
            if (!z) {
                throw AnonymousClass6C7.A0U("collection too large");
            }
        }
        return i2;
    }

    public static C129526aS construct(int i, Object... objArr) {
        Object[] objArr2 = objArr;
        if (i == 0) {
            return of();
        }
        if (i != 1) {
            int chooseTableSize = chooseTableSize(i);
            Object[] objArr3 = new Object[chooseTableSize];
            int i2 = chooseTableSize - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                C161507po.checkElementNotNull(obj, i5);
                int hashCode = obj.hashCode();
                int smear = C159347lg.smear(hashCode);
                while (true) {
                    int i6 = smear & i2;
                    Object obj2 = objArr3[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        smear++;
                    } else {
                        objArr[i4] = obj;
                        objArr3[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new C129696aj(obj3);
            } else if (chooseTableSize(i4) < chooseTableSize / 2) {
                return construct(i4, objArr);
            } else {
                if (shouldTrim(i4, objArr.length)) {
                    objArr2 = Arrays.copyOf(objArr, i4);
                }
                return new C129706ak(objArr2, i3, objArr3, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return of(obj4);
        }
    }

    public static C129526aS copyOf(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct(length, (Object[]) objArr.clone());
        }
        return of(objArr[0]);
    }

    public static C129526aS of(Object obj, Object obj2, Object obj3) {
        Object[] objArr = new Object[3];
        C18260x0.A0i(obj, obj2, obj3, objArr);
        return construct(3, objArr);
    }

    public abstract C172878Nf iterator();

    public static C129496aP builder() {
        return new C129496aP();
    }

    public static C129496aP builderWithExpectedSize(int i) {
        C160937oh.checkNonnegative(i, "expectedSize");
        return new C129496aP(i);
    }

    public static boolean shouldTrim(int i, int i2) {
        return AnonymousClass001.A1Y(i, (i2 >> 1) + (i2 >> 2));
    }

    public C129586aY asList() {
        C129586aY r0 = this.asList;
        if (r0 != null) {
            return r0;
        }
        C129586aY createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C129526aS) || !isHashCodeFast() || !((C129526aS) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return C162207rR.equalsImpl(this, obj);
        }
        return false;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public C129586aY createAsList() {
        return C129586aY.asImmutableList(toArray());
    }

    public int hashCode() {
        return C162207rR.hashCodeImpl(this);
    }

    public Object writeReplace() {
        return new AnonymousClass8L3(toArray());
    }

    public static C129526aS copyOf(Collection collection) {
        if ((collection instanceof C129526aS) && !(collection instanceof SortedSet)) {
            C129526aS r1 = (C129526aS) collection;
            if (!r1.isPartialView()) {
                return r1;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static C129526aS of(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = new Object[4];
        C18260x0.A0i(obj, obj2, obj3, objArr);
        objArr[3] = obj4;
        return construct(4, objArr);
    }

    public static C129526aS of(Object obj) {
        return new C129696aj(obj);
    }

    public static C129526aS of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        if (AnonymousClass6C8.A1P(length, 2147483641)) {
            int i = length + 6;
            Object[] A0V = AnonymousClass4L0.A0V(obj, obj2, i);
            AnonymousClass6C7.A19(obj3, obj4, obj5, A0V);
            A0V[5] = obj6;
            System.arraycopy(objArr, 0, A0V, 6, length);
            return construct(i, A0V);
        }
        throw AnonymousClass6C7.A0U("the total number of elements must fit in an int");
    }

    public static C129526aS of() {
        return C129706ak.EMPTY;
    }

    public static C129526aS of(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        AnonymousClass000.A16(obj, obj2, objArr);
        return construct(2, objArr);
    }
}
