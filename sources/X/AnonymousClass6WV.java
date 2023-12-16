package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.6WV  reason: invalid class name */
public abstract class AnonymousClass6WV extends C174088Sx implements Set {
    public transient AnonymousClass6WS A00;

    public static int A00(int i) {
        int i2;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (((double) i2) * 0.7d < ((double) max));
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw AnonymousClass001.A0c("collection too large");
            }
        }
        return i2;
    }

    public static AnonymousClass6WV A01(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        if (i == 0) {
            return AnonymousClass6WU.A05;
        }
        if (i != 1) {
            int A002 = A00(i);
            Object[] objArr3 = new Object[A002];
            int i2 = A002 - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr2[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int A06 = AnonymousClass6C8.A06(hashCode);
                    while (true) {
                        int i6 = A06 & i2;
                        Object obj2 = objArr3[i6];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            A06++;
                        } else {
                            objArr2[i5] = obj;
                            objArr3[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        }
                    }
                    i3++;
                } else {
                    throw AnonymousClass001.A0g(AnonymousClass000.A0Y("at index ", AnonymousClass001.A0o(), i3));
                }
            }
            Arrays.fill(objArr2, i5, i, (Object) null);
            if (i5 != 1) {
                if (A00(i5) < A002 / 2) {
                    return A01(objArr2, i5);
                }
                if (i5 <= 0) {
                    objArr2 = Arrays.copyOf(objArr2, i5);
                }
                return new AnonymousClass6WU(objArr2, i4, objArr3, i2, i5);
            }
        }
        Object obj3 = objArr2[0];
        obj3.getClass();
        return new AnonymousClass6WT(obj3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AnonymousClass6WV) && (this instanceof AnonymousClass6WU) && (((AnonymousClass6WV) obj) instanceof AnonymousClass6WU) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }
}
