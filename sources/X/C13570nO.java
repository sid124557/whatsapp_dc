package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0nO  reason: invalid class name and case insensitive filesystem */
public final class C13570nO<E> implements Collection<E>, Set<E> {
    public static int A04;
    public static int A05;
    public static Object[] A06;
    public static Object[] A07;
    public static final int[] A08 = new int[0];
    public static final Object[] A09 = new Object[0];
    public int A00;
    public AnonymousClass0UU A01;
    public int[] A02;
    public Object[] A03;

    public static void A00(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (C13570nO.class) {
                int i2 = A05;
                if (i2 < 10) {
                    objArr[0] = A07;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A07 = objArr;
                    A05 = i2 + 1;
                }
            }
        } else if (length == 4) {
            synchronized (C13570nO.class) {
                int i4 = A04;
                if (i4 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i5 = i - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    A06 = objArr;
                    A04 = i4 + 1;
                }
            }
        }
    }

    public boolean add(Object obj) {
        int hashCode;
        int A022;
        if (obj == null) {
            A022 = A01();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A022 = A02(obj, hashCode);
        }
        if (A022 >= 0) {
            return false;
        }
        int i = ~A022;
        int i2 = this.A00;
        int[] iArr = this.A02;
        if (i2 >= iArr.length) {
            int i3 = 8;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i3 = 4;
            }
            Object[] objArr = this.A03;
            A04(i3);
            int[] iArr2 = this.A02;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.A03, 0, objArr.length);
            }
            A00(iArr, objArr, this.A00);
        }
        int i4 = this.A00;
        if (i < i4) {
            int[] iArr3 = this.A02;
            int i5 = i + 1;
            System.arraycopy(iArr3, i, iArr3, i5, i4 - i);
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, i, objArr2, i5, this.A00 - i);
        }
        this.A02[i] = hashCode;
        this.A03[i] = obj;
        this.A00++;
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    int i = 0;
                    while (i < this.A00) {
                        try {
                            if (set.contains(this.A03[i])) {
                                i++;
                            }
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.A00) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.A00);
        }
        System.arraycopy(this.A03, 0, objArr, 0, this.A00);
        int length = objArr.length;
        int i = this.A00;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final int A01() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int[] iArr = this.A02;
        int A002 = AnonymousClass0VY.A00(iArr, i, 0);
        if (A002 >= 0) {
            Object[] objArr = this.A03;
            if (objArr[A002] != null) {
                int i2 = A002 + 1;
                while (i2 < i && iArr[i2] == 0) {
                    if (objArr[i2] == null) {
                        return i2;
                    }
                    i2++;
                }
                do {
                    A002--;
                    if (A002 < 0 || iArr[A002] != 0) {
                        return ~i2;
                    }
                } while (objArr[A002] != null);
                return A002;
            }
        }
        return A002;
    }

    public final int A02(Object obj, int i) {
        int i2 = this.A00;
        if (i2 == 0) {
            return -1;
        }
        int A002 = AnonymousClass0VY.A00(this.A02, i2, i);
        if (A002 < 0 || obj.equals(this.A03[A002])) {
            return A002;
        }
        int i3 = A002 + 1;
        while (i3 < i2 && this.A02[i3] == i) {
            if (obj.equals(this.A03[i3])) {
                return i3;
            }
            i3++;
        }
        do {
            A002--;
            if (A002 < 0 || this.A02[A002] != i) {
                return ~i3;
            }
        } while (!obj.equals(this.A03[A002]));
        return A002;
    }

    public void A03(int i) {
        Object[] objArr = this.A03;
        int i2 = this.A00;
        if (i2 <= 1) {
            A00(this.A02, objArr, i2);
            this.A02 = A08;
            this.A03 = A09;
            this.A00 = 0;
            return;
        }
        int[] iArr = this.A02;
        int length = iArr.length;
        int i3 = 8;
        if (length <= 8 || i2 >= length / 3) {
            int i4 = i2 - 1;
            this.A00 = i4;
            if (i < i4) {
                int i5 = i + 1;
                System.arraycopy(iArr, i5, iArr, i, i4 - i);
                Object[] objArr2 = this.A03;
                System.arraycopy(objArr2, i5, objArr2, i, this.A00 - i);
            }
            this.A03[this.A00] = null;
            return;
        }
        if (i2 > 8) {
            i3 = i2 + (i2 >> 1);
        }
        A04(i3);
        this.A00--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.A02, 0, i);
            System.arraycopy(objArr, 0, this.A03, 0, i);
        }
        int i6 = this.A00;
        if (i < i6) {
            int i7 = i + 1;
            System.arraycopy(iArr, i7, this.A02, i, i6 - i);
            System.arraycopy(objArr, i7, this.A03, i, this.A00 - i);
        }
    }

    public final void A04(int i) {
        if (i == 8) {
            synchronized (C13570nO.class) {
                Object[] objArr = A07;
                if (objArr != null) {
                    this.A03 = objArr;
                    A07 = (Object[]) objArr[0];
                    this.A02 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A05--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C13570nO.class) {
                Object[] objArr2 = A06;
                if (objArr2 != null) {
                    this.A03 = objArr2;
                    A06 = (Object[]) objArr2[0];
                    this.A02 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A04--;
                    return;
                }
            }
        }
        this.A02 = new int[i];
        this.A03 = new Object[i];
    }

    public boolean addAll(Collection collection) {
        int size = this.A00 + collection.size();
        int[] iArr = this.A02;
        if (iArr.length < size) {
            Object[] objArr = this.A03;
            A04(size);
            int i = this.A00;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.A02, 0, i);
                System.arraycopy(objArr, 0, this.A03, 0, this.A00);
            }
            A00(iArr, objArr, this.A00);
        }
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.A00;
        if (i != 0) {
            A00(this.A02, this.A03, i);
            this.A02 = A08;
            this.A03 = A09;
            this.A00 = 0;
        }
    }

    public boolean contains(Object obj) {
        int A022;
        if (obj == null) {
            A022 = A01();
        } else {
            A022 = A02(obj, obj.hashCode());
        }
        return AnonymousClass001.A1U(A022);
    }

    public int hashCode() {
        int[] iArr = this.A02;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public boolean isEmpty() {
        if (this.A00 <= 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        AnonymousClass0UU r1 = this.A01;
        if (r1 == null) {
            r1 = new C17540vk(this, 1);
            this.A01 = r1;
        }
        C13560nN r0 = r1.A01;
        if (r0 == null) {
            r0 = new C13560nN(r1);
            r1.A01 = r0;
        }
        return r0.iterator();
    }

    public boolean remove(Object obj) {
        int A022;
        if (obj == null) {
            A022 = A01();
        } else {
            A022 = A02(obj, obj.hashCode());
        }
        if (A022 < 0) {
            return false;
        }
        A03(A022);
        return true;
    }

    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.A00 - 1; i >= 0; i--) {
            if (!collection.contains(this.A03[i])) {
                A03(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.A00;
    }

    public C13570nO(int i) {
        if (i == 0) {
            this.A02 = A08;
            this.A03 = A09;
        } else {
            A04(i);
        }
        this.A00 = 0;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 14);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                AnonymousClass001.A1M(sb);
            }
            Object obj = this.A03[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        return AnonymousClass000.A0d(sb);
    }

    public C13570nO() {
        this(0);
    }

    public Object[] toArray() {
        int i = this.A00;
        Object[] objArr = new Object[i];
        System.arraycopy(this.A03, 0, objArr, 0, i);
        return objArr;
    }
}
