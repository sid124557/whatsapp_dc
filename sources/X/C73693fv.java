package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3fv  reason: invalid class name and case insensitive filesystem */
public final class C73693fv<E> extends AnonymousClass8T9<E> {
    public static final Object[] A03 = new Object[0];
    public int A00;
    public int A01;
    public Object[] A02 = A03;

    public boolean addAll(Collection collection) {
        C162457s7.A0J(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        A05(size() + collection.size());
        int A002 = A00(this);
        int length = this.A02.length;
        if (A002 >= length) {
            A002 -= length;
        }
        A07(collection, A002);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [int] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r11) {
        /*
            r10 = this;
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            boolean r0 = r10.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x0095
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            if (r0 == 0) goto L_0x0095
            int r6 = A00(r10)
            java.lang.Object[] r0 = r10.A02
            int r9 = r0.length
            if (r6 < r9) goto L_0x001a
            int r6 = r6 - r9
        L_0x001a:
            int r7 = r10.A00
            r5 = 0
            r3 = r7
            if (r7 < r6) goto L_0x0063
            r8 = 0
        L_0x0021:
            java.lang.Object[] r0 = r10.A02
            if (r7 >= r9) goto L_0x003d
            r2 = r0[r7]
            r0[r7] = r5
            boolean r0 = r11.contains(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003b
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0038:
            int r7 = r7 + 1
            goto L_0x0021
        L_0x003b:
            r8 = 1
            goto L_0x0038
        L_0x003d:
            int r0 = r0.length
            if (r3 < r0) goto L_0x0041
            int r3 = r3 - r0
        L_0x0041:
            if (r4 >= r6) goto L_0x0087
            java.lang.Object[] r0 = r10.A02
            r1 = r0[r4]
            r0[r4] = r5
            boolean r0 = r11.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0061
            java.lang.Object[] r0 = r10.A02
            r0[r3] = r1
            int r0 = r0.length
            int r1 = r0 + -1
            r0 = r3
            int r3 = r3 + 1
            if (r0 != r1) goto L_0x005e
            r3 = 0
        L_0x005e:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x0061:
            r8 = 1
            goto L_0x005e
        L_0x0063:
            if (r7 >= r6) goto L_0x007d
            java.lang.Object[] r0 = r10.A02
            r2 = r0[r7]
            boolean r0 = r11.contains(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007b
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0078:
            int r7 = r7 + 1
            goto L_0x0063
        L_0x007b:
            r4 = 1
            goto L_0x0078
        L_0x007d:
            java.lang.Object[] r1 = r10.A02
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            java.util.Arrays.fill(r1, r3, r6, r5)
            goto L_0x0088
        L_0x0087:
            r4 = r8
        L_0x0088:
            if (r4 == 0) goto L_0x0095
            int r0 = r10.A00
            int r3 = r3 - r0
            if (r3 >= 0) goto L_0x0093
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            int r3 = r3 + r0
        L_0x0093:
            r10.A01 = r3
        L_0x0095:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73693fv.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [int] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r11) {
        /*
            r10 = this;
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            boolean r0 = r10.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x008f
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            if (r0 == 0) goto L_0x008f
            int r6 = A00(r10)
            java.lang.Object[] r0 = r10.A02
            int r9 = r0.length
            if (r6 < r9) goto L_0x001a
            int r6 = r6 - r9
        L_0x001a:
            int r7 = r10.A00
            r5 = 0
            r3 = r7
            if (r7 < r6) goto L_0x005f
            r8 = 0
        L_0x0021:
            java.lang.Object[] r0 = r10.A02
            if (r7 >= r9) goto L_0x003b
            r2 = r0[r7]
            r0[r7] = r5
            boolean r0 = r11.contains(r2)
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0036:
            int r7 = r7 + 1
            goto L_0x0021
        L_0x0039:
            r8 = 1
            goto L_0x0036
        L_0x003b:
            int r0 = r0.length
            if (r3 < r0) goto L_0x003f
            int r3 = r3 - r0
        L_0x003f:
            if (r4 >= r6) goto L_0x0081
            java.lang.Object[] r0 = r10.A02
            r1 = r0[r4]
            r0[r4] = r5
            boolean r0 = r11.contains(r1)
            if (r0 == 0) goto L_0x005d
            java.lang.Object[] r0 = r10.A02
            r0[r3] = r1
            int r0 = r0.length
            int r1 = r0 + -1
            r0 = r3
            int r3 = r3 + 1
            if (r0 != r1) goto L_0x005a
            r3 = 0
        L_0x005a:
            int r4 = r4 + 1
            goto L_0x003f
        L_0x005d:
            r8 = 1
            goto L_0x005a
        L_0x005f:
            if (r7 >= r6) goto L_0x0077
            java.lang.Object[] r0 = r10.A02
            r2 = r0[r7]
            boolean r0 = r11.contains(r2)
            if (r0 == 0) goto L_0x0075
            java.lang.Object[] r1 = r10.A02
            int r0 = r3 + 1
            r1[r3] = r2
            r3 = r0
        L_0x0072:
            int r7 = r7 + 1
            goto L_0x005f
        L_0x0075:
            r4 = 1
            goto L_0x0072
        L_0x0077:
            java.lang.Object[] r1 = r10.A02
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            java.util.Arrays.fill(r1, r3, r6, r5)
            goto L_0x0082
        L_0x0081:
            r4 = r8
        L_0x0082:
            if (r4 == 0) goto L_0x008f
            int r0 = r10.A00
            int r3 = r3 - r0
            if (r3 >= 0) goto L_0x008d
            java.lang.Object[] r0 = r10.A02
            int r0 = r0.length
            int r3 = r3 + r0
        L_0x008d:
            r10.A01 = r3
        L_0x008f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73693fv.retainAll(java.util.Collection):boolean");
    }

    public Object[] toArray(Object[] objArr) {
        C162457s7.A0J(objArr, 0);
        if (objArr.length < size()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            C162457s7.A0K(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int A002 = A00(this);
        Object[] objArr2 = this.A02;
        int length = objArr2.length;
        if (A002 >= length) {
            A002 -= length;
        }
        int i = this.A00;
        if (i < A002) {
            C18260x0.A0O(objArr2, objArr);
            System.arraycopy(objArr2, i, objArr, 0, A002 - i);
        } else if (AnonymousClass0x7.A1S(this)) {
            Object[] objArr3 = this.A02;
            int i2 = this.A00;
            int length2 = objArr3.length;
            C18260x0.A0O(objArr3, objArr);
            System.arraycopy(objArr3, i2, objArr, 0, length2 - i2);
            Object[] objArr4 = this.A02;
            C18260x0.A0O(objArr4, objArr);
            System.arraycopy(objArr4, 0, objArr, objArr4.length - this.A00, A002);
        }
        int size = size();
        C162457s7.A0J(objArr, 1);
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public static int A00(C73693fv r2) {
        return r2.A00 + r2.size();
    }

    public final void A05(int i) {
        if (i >= 0) {
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (i <= length) {
                return;
            }
            if (objArr == A03) {
                if (i < 10) {
                    i = 10;
                }
                this.A02 = new Object[i];
                return;
            }
            Object[] objArr2 = new Object[AnonymousClass347.A00(length, i)];
            int i2 = this.A00;
            System.arraycopy(objArr, i2, objArr2, 0, length - i2);
            Object[] objArr3 = this.A02;
            int length2 = objArr3.length;
            int i3 = this.A00;
            System.arraycopy(objArr3, 0, objArr2, length2 - i3, i3);
            this.A00 = 0;
            this.A02 = objArr2;
            return;
        }
        throw AnonymousClass001.A0e("Deque is too big.");
    }

    public int A01() {
        return this.A01;
    }

    public Object A02(int i) {
        AnonymousClass347.A01(i, size());
        if (i == size() - 1) {
            if (!isEmpty()) {
                int size = this.A00 + (size() - 1);
                Object[] objArr = this.A02;
                int length = objArr.length;
                if (size >= length) {
                    size -= length;
                }
                Object obj = objArr[size];
                objArr[size] = null;
                this.A01 = size() - 1;
                return obj;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i == 0) {
            return A04();
        } else {
            int i2 = this.A00 + i;
            Object[] objArr2 = this.A02;
            int length2 = objArr2.length;
            if (i2 >= length2) {
                i2 -= length2;
            }
            Object obj2 = objArr2[i2];
            int size2 = size() >> 1;
            int i3 = this.A00;
            if (i < size2) {
                if (i2 >= i3) {
                    Object[] objArr3 = this.A02;
                    C18260x0.A0O(objArr3, objArr3);
                    System.arraycopy(objArr3, i3, objArr3, i3 + 1, i2 - i3);
                } else {
                    Object[] objArr4 = this.A02;
                    C18260x0.A0O(objArr4, objArr4);
                    System.arraycopy(objArr4, 0, objArr4, 1, i2);
                    Object[] objArr5 = this.A02;
                    int length3 = objArr5.length - 1;
                    objArr5[0] = objArr5[length3];
                    int i4 = this.A00;
                    System.arraycopy(objArr5, i4, objArr5, i4 + 1, length3 - i4);
                }
                Object[] objArr6 = this.A02;
                int i5 = this.A00;
                objArr6[i5] = null;
                int length4 = objArr6.length - 1;
                int i6 = i5 + 1;
                if (i5 == length4) {
                    i6 = 0;
                }
                this.A00 = i6;
            } else {
                int size3 = i3 + (size() - 1);
                Object[] objArr7 = this.A02;
                int length5 = objArr7.length;
                if (size3 >= length5) {
                    size3 -= length5;
                }
                if (i2 <= size3) {
                    int i7 = i2 + 1;
                    System.arraycopy(objArr7, i7, objArr7, i2, (size3 + 1) - i7);
                } else {
                    int i8 = i2 + 1;
                    System.arraycopy(objArr7, i8, objArr7, i2, length5 - i8);
                    Object[] objArr8 = this.A02;
                    objArr8[objArr8.length - 1] = objArr8[0];
                    System.arraycopy(objArr8, 1, objArr8, 0, (size3 + 1) - 1);
                }
                this.A02[size3] = null;
            }
            this.A01 = AnonymousClass0x9.A03(this, 1);
            return obj2;
        }
    }

    public final Object A03() {
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.A02;
        int size = this.A00 + (size() - 1);
        int length = this.A02.length;
        if (size >= length) {
            size -= length;
        }
        return objArr[size];
    }

    public final Object A04() {
        if (!isEmpty()) {
            Object[] objArr = this.A02;
            int i = this.A00;
            Object obj = objArr[i];
            objArr[i] = null;
            int i2 = i + 1;
            if (i == objArr.length - 1) {
                i2 = 0;
            }
            this.A00 = i2;
            this.A01 = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void A06(Object obj) {
        A05(size() + 1);
        Object[] objArr = this.A02;
        int A002 = A00(this);
        int length = this.A02.length;
        if (A002 >= length) {
            A002 -= length;
        }
        objArr[A002] = obj;
        this.A01 = size() + 1;
    }

    public final void A07(Collection collection, int i) {
        Iterator it = collection.iterator();
        int length = this.A02.length;
        while (i < length && it.hasNext()) {
            this.A02[i] = it.next();
            i++;
        }
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.A02[i3] = it.next();
        }
        this.A01 = size() + collection.size();
    }

    public boolean add(Object obj) {
        A06(obj);
        return true;
    }

    public void clear() {
        int A002 = A00(this);
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (A002 >= length) {
            A002 -= length;
        }
        int i = this.A00;
        if (i < A002) {
            Arrays.fill(objArr, i, A002, (Object) null);
        } else if (AnonymousClass0x7.A1S(this)) {
            Object[] objArr2 = this.A02;
            Arrays.fill(objArr2, this.A00, objArr2.length, (Object) null);
            Object[] objArr3 = this.A02;
            C162457s7.A0J(objArr3, 0);
            Arrays.fill(objArr3, 0, A002, (Object) null);
        }
        this.A00 = 0;
        this.A01 = 0;
    }

    public boolean contains(Object obj) {
        return AnonymousClass001.A1X(indexOf(obj), -1);
    }

    public Object get(int i) {
        AnonymousClass347.A01(i, size());
        Object[] objArr = this.A02;
        int i2 = this.A00 + i;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        return objArr[i2];
    }

    public int indexOf(Object obj) {
        int A002 = A00(this);
        int length = this.A02.length;
        if (A002 >= length) {
            A002 -= length;
        }
        int i = this.A00;
        if (i < A002) {
            while (i < A002) {
                if (!C162457s7.A0P(obj, this.A02[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i < A002) {
            return -1;
        } else {
            while (true) {
                if (i < length) {
                    if (C162457s7.A0P(obj, this.A02[i])) {
                        break;
                    }
                    i++;
                } else {
                    int i2 = 0;
                    while (i2 < A002) {
                        if (C162457s7.A0P(obj, this.A02[i2])) {
                            i = i2 + this.A02.length;
                        } else {
                            i2++;
                        }
                    }
                    return -1;
                }
            }
        }
        return i - this.A00;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(size());
    }

    public int lastIndexOf(Object obj) {
        int i;
        int A002 = A00(this);
        int length = this.A02.length;
        if (A002 >= length) {
            A002 -= length;
        }
        int i2 = this.A00;
        if (i2 < A002) {
            i = A002 - 1;
            if (i2 <= i) {
                while (!C162457s7.A0P(obj, this.A02[i])) {
                    if (i != i2) {
                        i--;
                    }
                }
            }
            return -1;
        }
        if (i2 > A002) {
            while (true) {
                A002--;
                if (-1 < A002) {
                    if (C162457s7.A0P(obj, this.A02[A002])) {
                        i = A002 + this.A02.length;
                        break;
                    }
                } else {
                    Object[] objArr = this.A02;
                    C162457s7.A0J(objArr, 0);
                    int length2 = objArr.length - 1;
                    int i3 = this.A00;
                    if (i3 <= length2) {
                        while (!C162457s7.A0P(obj, this.A02[i])) {
                            if (i != i3) {
                                length2 = i - 1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
        return i - this.A00;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public Object set(int i, Object obj) {
        AnonymousClass347.A01(i, size());
        int i2 = this.A00 + i;
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public void add(int i, Object obj) {
        int i2;
        AnonymousClass347.A02(i, size());
        if (i == size()) {
            A06(obj);
            return;
        }
        int size = size();
        if (i == 0) {
            A05(size + 1);
            int i3 = this.A00;
            if (i3 == 0) {
                Object[] objArr = this.A02;
                C162457s7.A0J(objArr, 0);
                i3 = objArr.length;
            }
            int i4 = i3 - 1;
            this.A00 = i4;
            this.A02[i4] = obj;
        } else {
            A05(size + 1);
            int i5 = this.A00 + i;
            int length = this.A02.length;
            if (i5 >= length) {
                i5 -= length;
            }
            if (i < ((size() + 1) >> 1)) {
                if (i5 == 0) {
                    Object[] objArr2 = this.A02;
                    C162457s7.A0J(objArr2, 0);
                    i2 = objArr2.length - 1;
                } else {
                    i2 = i5 - 1;
                }
                int i6 = this.A00;
                if (i6 == 0) {
                    Object[] objArr3 = this.A02;
                    C162457s7.A0J(objArr3, 0);
                    i6 = objArr3.length;
                }
                int i7 = i6 - 1;
                int i8 = this.A00;
                Object[] objArr4 = this.A02;
                if (i2 >= i8) {
                    objArr4[i7] = objArr4[i8];
                    int i9 = i8 + 1;
                    System.arraycopy(objArr4, i9, objArr4, i8, (i2 + 1) - i9);
                } else {
                    System.arraycopy(objArr4, i8, objArr4, i8 - 1, objArr4.length - i8);
                    Object[] objArr5 = this.A02;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    System.arraycopy(objArr5, 1, objArr5, 0, (i2 + 1) - 1);
                }
                this.A02[i2] = obj;
                this.A00 = i7;
            } else {
                int A002 = A00(this);
                Object[] objArr6 = this.A02;
                int length2 = objArr6.length;
                if (A002 >= length2) {
                    A002 -= length2;
                }
                if (i5 < A002) {
                    System.arraycopy(objArr6, i5, objArr6, i5 + 1, A002 - i5);
                } else {
                    System.arraycopy(objArr6, 0, objArr6, 1, A002);
                    Object[] objArr7 = this.A02;
                    int length3 = objArr7.length - 1;
                    objArr7[0] = objArr7[length3];
                    System.arraycopy(objArr7, i5, objArr7, i5 + 1, length3 - i5);
                }
                this.A02[i5] = obj;
            }
        }
        this.A01 = size() + 1;
    }

    public boolean addAll(int i, Collection collection) {
        int i2;
        C162457s7.A0J(collection, 1);
        AnonymousClass347.A02(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        A05(size() + collection.size());
        int A002 = A00(this);
        int length = this.A02.length;
        if (A002 >= length) {
            A002 -= length;
        }
        int i3 = this.A00 + i;
        if (i3 >= length) {
            i3 -= length;
        }
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i4 = this.A00;
            int i5 = i4 - size;
            Object[] objArr = this.A02;
            if (i3 >= i4) {
                if (i5 >= 0) {
                    C18260x0.A0O(objArr, objArr);
                    i2 = i3 - i4;
                } else {
                    int length2 = objArr.length;
                    i5 += length2;
                    i2 = i3 - i4;
                    int i6 = length2 - i5;
                    if (i6 < i2) {
                        System.arraycopy(objArr, i4, objArr, i5, (i4 + i6) - i4);
                        Object[] objArr2 = this.A02;
                        int i7 = this.A00 + i6;
                        C18260x0.A0O(objArr2, objArr2);
                        System.arraycopy(objArr2, i7, objArr2, 0, i3 - i7);
                    }
                }
                System.arraycopy(objArr, i4, objArr, i5, i2);
            } else {
                System.arraycopy(objArr, i4, objArr, i5, objArr.length - i4);
                Object[] objArr3 = this.A02;
                int length3 = objArr3.length - size;
                if (size >= i3) {
                    System.arraycopy(objArr3, 0, objArr3, length3, i3);
                } else {
                    System.arraycopy(objArr3, 0, objArr3, length3, size);
                    Object[] objArr4 = this.A02;
                    C18260x0.A0O(objArr4, objArr4);
                    System.arraycopy(objArr4, size, objArr4, 0, i3 - size);
                }
            }
            this.A00 = i5;
            i3 -= size;
            if (i3 < 0) {
                i3 += this.A02.length;
            }
        } else {
            int i8 = i3 + size;
            if (i3 < A002) {
                int i9 = size + A002;
                Object[] objArr5 = this.A02;
                int length4 = objArr5.length;
                if (i9 > length4) {
                    if (i8 >= length4) {
                        i8 -= length4;
                    } else {
                        int i10 = A002 - (i9 - length4);
                        System.arraycopy(objArr5, i10, objArr5, 0, A002 - i10);
                        Object[] objArr6 = this.A02;
                        C18260x0.A0O(objArr6, objArr6);
                        System.arraycopy(objArr6, i3, objArr6, i8, i10 - i3);
                    }
                }
                System.arraycopy(objArr5, i3, objArr5, i8, A002 - i3);
            } else {
                Object[] objArr7 = this.A02;
                C18260x0.A0O(objArr7, objArr7);
                System.arraycopy(objArr7, 0, objArr7, size, A002);
                Object[] objArr8 = this.A02;
                int length5 = objArr8.length;
                if (i8 >= length5) {
                    System.arraycopy(objArr8, i3, objArr8, i8 - length5, length5 - i3);
                } else {
                    int i11 = length5 - size;
                    System.arraycopy(objArr8, i11, objArr8, 0, length5 - i11);
                    Object[] objArr9 = this.A02;
                    System.arraycopy(objArr9, i3, objArr9, i8, (objArr9.length - size) - i3);
                }
            }
        }
        A07(collection, i3);
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
