package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.0Wz  reason: invalid class name and case insensitive filesystem */
public class C06290Wz {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public int A00;
    public int[] A01;
    public Object[] A02;

    public static void A02(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (C06290Wz.class) {
                int i2 = A04;
                if (i2 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A06 = objArr;
                    A04 = i2 + 1;
                }
            }
        } else if (length == 4) {
            synchronized (C06290Wz.class) {
                int i4 = A03;
                if (i4 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i5 = (i << 1) - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    A05 = objArr;
                    A03 = i4 + 1;
                }
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0051=Splitter:B:27:0x0051, B:7:0x0015=Splitter:B:7:0x0015} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 == r7) goto L_0x007e
            boolean r0 = r7 instanceof X.C06290Wz
            r4 = 0
            if (r0 == 0) goto L_0x0040
            X.0Wz r7 = (X.C06290Wz) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 != r0) goto L_0x007c
            r3 = 0
        L_0x0015:
            int r0 = r6.A00     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r3 >= r0) goto L_0x007e
            java.lang.Object[] r1 = r6.A02     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            int r0 = r3 << 1
            r2 = r1[r0]     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            int r0 = r3 << 1
            int r0 = r0 + 1
            r1 = r1[r0]     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            java.lang.Object r0 = r7.get(r2)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r1 != 0) goto L_0x0034
            if (r0 != 0) goto L_0x007c
            boolean r0 = r7.containsKey(r2)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r0 != 0) goto L_0x003b
            goto L_0x003e
        L_0x0034:
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r0 != 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x003e:
            return r4
        L_0x003f:
            return r4
        L_0x0040:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L_0x007d
            java.util.Map r7 = (java.util.Map) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 != r0) goto L_0x007c
            r3 = 0
        L_0x0051:
            int r0 = r6.A00     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r3 >= r0) goto L_0x007e
            java.lang.Object[] r1 = r6.A02     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            int r0 = r3 << 1
            r2 = r1[r0]     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            int r0 = r3 << 1
            int r0 = r0 + 1
            r1 = r1[r0]     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            java.lang.Object r0 = r7.get(r2)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r1 != 0) goto L_0x0070
            if (r0 != 0) goto L_0x007c
            boolean r0 = r7.containsKey(r2)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r0 != 0) goto L_0x0077
            goto L_0x007a
        L_0x0070:
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r0 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x007a:
            return r4
        L_0x007b:
            return r4
        L_0x007c:
            return r4
        L_0x007d:
            return r4
        L_0x007e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06290Wz.equals(java.lang.Object):boolean");
    }

    public Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public static Object A00(C06290Wz r1, int i) {
        return r1.A02[(i << 1) + 1];
    }

    private void A01(int i) {
        if (i == 8) {
            synchronized (C06290Wz.class) {
                Object[] objArr = A06;
                if (objArr != null) {
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C06290Wz.class) {
                Object[] objArr2 = A05;
                if (objArr2 != null) {
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i];
        this.A02 = new Object[(i << 1)];
    }

    public int A03() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int[] iArr = this.A01;
        try {
            int A002 = AnonymousClass0VY.A00(iArr, i, 0);
            if (A002 >= 0) {
                Object[] objArr = this.A02;
                if (objArr[A002 << 1] != null) {
                    int i2 = A002 + 1;
                    while (i2 < i && iArr[i2] == 0) {
                        if (objArr[i2 << 1] == null) {
                            return i2;
                        }
                        i2++;
                    }
                    do {
                        A002--;
                        if (A002 < 0 || iArr[A002] != 0) {
                            return ~i2;
                        }
                    } while (objArr[A002 << 1] != null);
                    return A002;
                }
            }
            return A002;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int A04(Object obj) {
        if (obj == null) {
            return A03();
        }
        return A06(obj, obj.hashCode());
    }

    public int A05(Object obj) {
        int i = this.A00 * 2;
        Object[] objArr = this.A02;
        int i2 = 1;
        if (obj == null) {
            while (i2 < i) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
                i2 += 2;
            }
            return -1;
        }
        while (i2 < i) {
            if (obj.equals(objArr[i2])) {
                return i2 >> 1;
            }
            i2 += 2;
        }
        return -1;
    }

    public int A06(Object obj, int i) {
        int i2 = this.A00;
        if (i2 == 0) {
            return -1;
        }
        try {
            int A002 = AnonymousClass0VY.A00(this.A01, i2, i);
            if (A002 < 0 || obj.equals(this.A02[A002 << 1])) {
                return A002;
            }
            int i3 = A002 + 1;
            while (i3 < i2 && this.A01[i3] == i) {
                if (obj.equals(this.A02[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            do {
                A002--;
                if (A002 < 0 || this.A01[A002] != i) {
                    return ~i3;
                }
            } while (!obj.equals(this.A02[A002 << 1]));
            return A002;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public Object A07(int i) {
        Object[] objArr = this.A02;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.A00;
        int i4 = 0;
        if (i3 <= 1) {
            A02(this.A01, objArr, i3);
            this.A01 = AnonymousClass0VY.A00;
            this.A02 = AnonymousClass0VY.A02;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.A01;
            int length = iArr.length;
            int i6 = 8;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.A02;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.A02;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                A01(i6);
                if (i3 == this.A00) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.A01, 0, i);
                        System.arraycopy(objArr, 0, this.A02, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.A01, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.A02, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.A00) {
            this.A00 = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public void A08(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < i) {
            Object[] objArr = this.A02;
            A01(i);
            if (this.A00 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i2);
                System.arraycopy(objArr, 0, this.A02, 0, i2 << 1);
            }
            A02(iArr, objArr, i2);
        }
        if (this.A00 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void A09(C06290Wz r6) {
        int i = r6.A00;
        A08(this.A00 + i);
        if (this.A00 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr = r6.A02;
                int i3 = i2 << 1;
                put(objArr[i3], objArr[i3 + 1]);
            }
        } else if (i > 0) {
            System.arraycopy(r6.A01, 0, this.A01, 0, i);
            System.arraycopy(r6.A02, 0, this.A02, 0, i << 1);
            this.A00 = i;
        }
    }

    public void clear() {
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            this.A01 = AnonymousClass0VY.A00;
            this.A02 = AnonymousClass0VY.A02;
            this.A00 = 0;
            A02(iArr, objArr, i);
        }
        if (this.A00 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i = this.A00;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += AnonymousClass000.A07(obj) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        if (this.A00 <= 0) {
            return true;
        }
        return false;
    }

    public Object put(Object obj, Object obj2) {
        int hashCode;
        int A062;
        int i = this.A00;
        if (obj == null) {
            A062 = A03();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A062 = A06(obj, hashCode);
        }
        if (A062 >= 0) {
            int i2 = (A062 << 1) + 1;
            Object[] objArr = this.A02;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~A062;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            Object[] objArr2 = this.A02;
            A01(i4);
            if (i == this.A00) {
                int[] iArr2 = this.A01;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
                }
                A02(iArr, objArr2, i);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr3 = this.A01;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.A00 - i3) << 1);
        }
        int i6 = this.A00;
        if (i == i6) {
            int[] iArr4 = this.A01;
            if (i3 < iArr4.length) {
                iArr4[i3] = hashCode;
                Object[] objArr4 = this.A02;
                int i7 = i3 << 1;
                objArr4[i7] = obj;
                objArr4[i7 + 1] = obj2;
                this.A00 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int size() {
        return this.A00;
    }

    public C06290Wz(int i) {
        if (i == 0) {
            this.A01 = AnonymousClass0VY.A00;
            this.A02 = AnonymousClass0VY.A02;
        } else {
            A01(i);
        }
        this.A00 = 0;
    }

    public boolean containsKey(Object obj) {
        return AnonymousClass001.A1U(A04(obj));
    }

    public boolean containsValue(Object obj) {
        return AnonymousClass001.A1U(A05(obj));
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int A042 = A04(obj);
        if (A042 >= 0) {
            return A00(this, A042);
        }
        return obj2;
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public boolean remove(Object obj, Object obj2) {
        int A042 = A04(obj);
        if (A042 < 0) {
            return false;
        }
        Object A002 = A00(this, A042);
        if (obj2 != A002 && (obj2 == null || !obj2.equals(A002))) {
            return false;
        }
        A07(A042);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int A042 = A04(obj);
        if (A042 < 0) {
            return false;
        }
        int i = (A042 << 1) + 1;
        Object obj4 = this.A02[i];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        this.A02[i] = obj3;
        return true;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                AnonymousClass001.A1M(sb);
            }
            Object obj = this.A02[i << 1];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object A002 = A00(this, i);
            if (A002 != this) {
                sb.append(A002);
            } else {
                sb.append("(this Map)");
            }
        }
        return AnonymousClass000.A0d(sb);
    }

    public C06290Wz() {
        this.A01 = AnonymousClass0VY.A00;
        this.A02 = AnonymousClass0VY.A02;
        this.A00 = 0;
    }

    public Object remove(Object obj) {
        int A042 = A04(obj);
        if (A042 >= 0) {
            return A07(A042);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int A042 = A04(obj);
        if (A042 < 0) {
            return null;
        }
        int i = (A042 << 1) + 1;
        Object[] objArr = this.A02;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }
}
