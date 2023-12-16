package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8OR  reason: invalid class name */
public final class AnonymousClass8OR<K, V> implements Map<K, V>, Serializable, AnonymousClass4GZ {
    public static final AnonymousClass8OR A00;
    public AnonymousClass8UA entriesView;
    public int[] hashArray;
    public int hashShift;
    public boolean isReadOnly;
    public Object[] keysArray;
    public AnonymousClass8UC keysView;
    public int length;
    public int maxProbeDistance;
    public int modCount;
    public int[] presenceArray;
    public int size;
    public Object[] valuesArray;
    public C174108Sz valuesView;

    static {
        AnonymousClass8OR r1 = new AnonymousClass8OR(0);
        r1.isReadOnly = true;
        A00 = r1;
    }

    public final boolean A06(Map.Entry entry) {
        C162457s7.A0J(entry, 0);
        int A01 = A01(entry.getKey());
        if (A01 < 0) {
            return false;
        }
        Object[] objArr = this.valuesArray;
        C162457s7.A0H(objArr);
        return C162457s7.A0P(objArr[A01], entry.getValue());
    }

    public void putAll(Map map) {
        C162457s7.A0J(map, 0);
        A02();
        Set entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            A03(entrySet.size());
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(it);
                int A002 = A00(A0w.getKey());
                Object[] objArr = this.valuesArray;
                if (objArr == null) {
                    objArr = new Object[this.keysArray.length];
                    this.valuesArray = objArr;
                }
                if (A002 < 0) {
                    A002 = (-A002) - 1;
                    if (C162457s7.A0P(A0w.getValue(), objArr[A002])) {
                    }
                }
                objArr[A002] = A0w.getValue();
            }
        }
    }

    public AnonymousClass8OR(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.keysArray = objArr;
            this.valuesArray = null;
            this.presenceArray = iArr;
            this.hashArray = new int[highestOneBit];
            this.maxProbeDistance = 2;
            this.length = 0;
            this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw AnonymousClass001.A0c("capacity must be non-negative.");
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new C172318Kn(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final void A02() {
        if (this.isReadOnly) {
            throw C18320x8.A0m();
        }
    }

    public final void A03(int i) {
        Object[] objArr;
        Object[] objArr2 = this.keysArray;
        int length2 = objArr2.length;
        int i2 = this.length;
        int i3 = length2 - i2;
        int size2 = i2 - size();
        if (i3 >= i || i3 + size2 < i || size2 < length2 / 4) {
            int i4 = i2 + i;
            if (i4 < 0) {
                throw new OutOfMemoryError();
            } else if (i4 > length2) {
                int A002 = AnonymousClass347.A00(length2, i4);
                Object[] copyOf = Arrays.copyOf(objArr2, A002);
                C162457s7.A0D(copyOf);
                this.keysArray = copyOf;
                Object[] objArr3 = this.valuesArray;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, A002);
                    C162457s7.A0D(objArr);
                } else {
                    objArr = null;
                }
                this.valuesArray = objArr;
                int[] copyOf2 = Arrays.copyOf(this.presenceArray, A002);
                C162457s7.A0D(copyOf2);
                this.presenceArray = copyOf2;
                if (A002 < 1) {
                    A002 = 1;
                }
                int highestOneBit = Integer.highestOneBit(A002 * 3);
                if (highestOneBit > this.hashArray.length) {
                    A04(highestOneBit);
                }
            }
        } else {
            A04(this.hashArray.length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r2[r4] = r6 + 1;
        r7.presenceArray[r6] = r4;
        r6 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r8) {
        /*
            r7 = this;
            int r0 = r7.modCount
            int r0 = r0 + 1
            r7.modCount = r0
            int r5 = r7.length
            int r0 = r7.size()
            if (r5 <= r0) goto L_0x0039
            java.lang.Object[] r4 = r7.valuesArray
            r3 = 0
            r2 = 0
        L_0x0012:
            if (r3 >= r5) goto L_0x002b
            int[] r0 = r7.presenceArray
            r0 = r0[r3]
            if (r0 < 0) goto L_0x0028
            java.lang.Object[] r1 = r7.keysArray
            r0 = r1[r3]
            r1[r2] = r0
            if (r4 == 0) goto L_0x0026
            r0 = r4[r3]
            r4[r2] = r0
        L_0x0026:
            int r2 = r2 + 1
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002b:
            java.lang.Object[] r0 = r7.keysArray
            X.AnonymousClass75Z.A00(r0, r2, r5)
            if (r4 == 0) goto L_0x0037
            int r0 = r7.length
            X.AnonymousClass75Z.A00(r4, r2, r0)
        L_0x0037:
            r7.length = r2
        L_0x0039:
            int[] r1 = r7.hashArray
            int r0 = r1.length
            r6 = 0
            if (r8 == r0) goto L_0x0087
            int[] r0 = new int[r8]
            r7.hashArray = r0
            int r0 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r0 = r0 + 1
            r7.hashShift = r0
        L_0x004b:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x008b
            int r5 = r6 + 1
            java.lang.Object[] r0 = r7.keysArray
            r0 = r0[r6]
            int r4 = X.C18280x3.A04(r0)
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r0
            int r0 = r7.hashShift
            int r4 = r4 >>> r0
            int r3 = r7.maxProbeDistance
        L_0x0062:
            int[] r2 = r7.hashArray
            r0 = r2[r4]
            r1 = 1
            if (r0 != 0) goto L_0x0073
            int r0 = r6 + 1
            r2[r4] = r0
            int[] r0 = r7.presenceArray
            r0[r6] = r4
            r6 = r5
            goto L_0x004b
        L_0x0073:
            int r3 = r3 + -1
            if (r3 >= 0) goto L_0x007e
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x007e:
            int r0 = r4 + -1
            if (r4 != 0) goto L_0x0085
            int r4 = r2.length
            int r4 = r4 - r1
            goto L_0x0062
        L_0x0085:
            r4 = r0
            goto L_0x0062
        L_0x0087:
            java.util.Arrays.fill(r1, r6, r0, r6)
            goto L_0x004b
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8OR.A04(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r13) {
        /*
            r12 = this;
            java.lang.Object[] r1 = r12.keysArray
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r0 = 0
            r1[r13] = r0
            int[] r0 = r12.presenceArray
            r11 = r0[r13]
            int r0 = r12.maxProbeDistance
            int r5 = r0 * 2
            int[] r9 = r12.hashArray
            int r8 = r9.length
            int r0 = r8 / 2
            if (r5 <= r0) goto L_0x0019
            r5 = r0
        L_0x0019:
            r10 = 0
            r6 = 0
            r7 = r11
        L_0x001c:
            int r1 = r11 + -1
            r0 = r11
            r11 = r1
            if (r0 != 0) goto L_0x0024
            int r11 = r8 + -1
        L_0x0024:
            int r6 = r6 + 1
            int r0 = r12.maxProbeDistance
            if (r6 > r0) goto L_0x0070
            r4 = r9[r11]
            if (r4 == 0) goto L_0x0070
            r3 = -1
            if (r4 >= 0) goto L_0x004f
            r9[r7] = r3
        L_0x0033:
            r7 = r11
            r6 = 0
        L_0x0035:
            int r5 = r5 + -1
            if (r5 >= 0) goto L_0x001c
            r9[r7] = r3
        L_0x003b:
            int[] r1 = r12.presenceArray
            r0 = -1
            r1[r13] = r0
            int r0 = r12.size()
            int r0 = r0 + -1
            r12.size = r0
            int r0 = r12.modCount
            int r0 = r0 + 1
            r12.modCount = r0
            return
        L_0x004f:
            java.lang.Object[] r0 = r12.keysArray
            int r2 = r4 + -1
            r0 = r0[r2]
            int r1 = X.C18280x3.A04(r0)
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r1 = r1 * r0
            int r0 = r12.hashShift
            int r1 = r1 >>> r0
            int r1 = r1 - r11
            int[] r9 = r12.hashArray
            int r8 = r9.length
            int r0 = r8 + -1
            r1 = r1 & r0
            if (r1 < r6) goto L_0x0035
            r9[r7] = r4
            int[] r0 = r12.presenceArray
            r0[r2] = r7
            goto L_0x0033
        L_0x0070:
            r9[r7] = r10
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8OR.A05(int):void");
    }

    public boolean containsValue(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            if (this.presenceArray[i] >= 0) {
                Object[] objArr = this.valuesArray;
                C162457s7.A0H(objArr);
                if (C162457s7.A0P(objArr[i], obj)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8UA, java.util.Set] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.8UA, java.util.Set] */
    public final /* bridge */ Set entrySet() {
        ? r0 = this.entriesView;
        if (r0 != 0) {
            return r0;
        }
        ? r02 = new AnonymousClass8UA(this);
        this.entriesView = r02;
        return r02;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set entrySet = map.entrySet();
        C162457s7.A0J(entrySet, 0);
        for (Object next : entrySet) {
            if (next == null) {
                return false;
            }
            try {
                if (!A06((Map.Entry) next)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass8UH r5 = new AnonymousClass8UH(this);
        int i = 0;
        while (r5.hasNext()) {
            int i2 = r5.A01;
            AnonymousClass8OR r1 = r5.A03;
            if (i2 < r1.length) {
                r5.A01 = i2 + 1;
                r5.A02 = i2;
                int i3 = 0;
                int A04 = C18280x3.A04(r1.keysArray[i2]);
                Object[] objArr = r1.valuesArray;
                C162457s7.A0H(objArr);
                Object obj = objArr[r5.A02];
                if (obj != null) {
                    i3 = obj.hashCode();
                }
                r5.A01();
                i += A04 ^ i3;
            } else {
                throw AnonymousClass6CA.A0c();
            }
        }
        return i;
    }

    public final /* bridge */ Set keySet() {
        AnonymousClass8UC r0 = this.keysView;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass8UC r02 = new AnonymousClass8UC(this);
        this.keysView = r02;
        return r02;
    }

    public final /* bridge */ int size() {
        return this.size;
    }

    public final /* bridge */ Collection values() {
        C174108Sz r0 = this.valuesView;
        if (r0 != null) {
            return r0;
        }
        C174108Sz r02 = new C174108Sz(this);
        this.valuesView = r02;
        return r02;
    }

    public final int A00(Object obj) {
        A02();
        while (true) {
            int A04 = (C18280x3.A04(obj) * -1640531527) >>> this.hashShift;
            int i = this.maxProbeDistance * 2;
            int length2 = this.hashArray.length / 2;
            if (i > length2) {
                i = length2;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[A04];
                if (i3 <= 0) {
                    int i4 = this.length;
                    Object[] objArr = this.keysArray;
                    if (i4 >= objArr.length) {
                        A03(1);
                    } else {
                        int i5 = i4 + 1;
                        this.length = i5;
                        objArr[i4] = obj;
                        this.presenceArray[i4] = A04;
                        iArr[A04] = i5;
                        this.size = size() + 1;
                        this.modCount++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                } else if (C162457s7.A0P(this.keysArray[i3 - 1], obj)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        A04(this.hashArray.length * 2);
                        break;
                    }
                    int i6 = A04 - 1;
                    if (A04 == 0) {
                        A04 = this.hashArray.length - 1;
                    } else {
                        A04 = i6;
                    }
                }
            }
        }
    }

    public final int A01(Object obj) {
        int A04 = (C18280x3.A04(obj) * -1640531527) >>> this.hashShift;
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[A04];
            if (i2 != 0) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (C162457s7.A0P(this.keysArray[i3], obj)) {
                        return i3;
                    }
                }
                i--;
                if (i < 0) {
                    break;
                }
                int i4 = A04 - 1;
                if (A04 == 0) {
                    A04 = this.hashArray.length - 1;
                } else {
                    A04 = i4;
                }
            } else {
                break;
            }
        }
        return -1;
    }

    public void clear() {
        A02();
        C72013d2 A002 = new C175698Zj(0, this.length - 1).iterator();
        while (A002.hasNext()) {
            int A003 = A002.A00();
            int[] iArr = this.presenceArray;
            int i = iArr[A003];
            if (i >= 0) {
                this.hashArray[i] = 0;
                iArr[A003] = -1;
            }
        }
        AnonymousClass75Z.A00(this.keysArray, 0, this.length);
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            AnonymousClass75Z.A00(objArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    public boolean containsKey(Object obj) {
        return AnonymousClass001.A1U(A01(obj));
    }

    public Object get(Object obj) {
        int A01 = A01(obj);
        if (A01 < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        C162457s7.A0H(objArr);
        return objArr[A01];
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(size());
    }

    public Object put(Object obj, Object obj2) {
        A02();
        int A002 = A00(obj);
        Object[] objArr = this.valuesArray;
        if (objArr == null) {
            objArr = new Object[this.keysArray.length];
            this.valuesArray = objArr;
        }
        if (A002 < 0) {
            int i = (-A002) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[A002] = obj2;
        return null;
    }

    public Object remove(Object obj) {
        A02();
        int A01 = A01(obj);
        if (A01 < 0) {
            return null;
        }
        A05(A01);
        Object[] objArr = this.valuesArray;
        C162457s7.A0H(objArr);
        Object obj2 = objArr[A01];
        objArr[A01] = null;
        return obj2;
    }

    public String toString() {
        StringBuilder A0Y = AnonymousClass6CA.A0Y((size() * 3) + 2);
        A0Y.append("{");
        AnonymousClass8UH r5 = new AnonymousClass8UH(this);
        int i = 0;
        while (r5.hasNext()) {
            if (i > 0) {
                AnonymousClass001.A1M(A0Y);
            }
            int i2 = r5.A01;
            AnonymousClass8OR r3 = r5.A03;
            if (i2 < r3.length) {
                r5.A01 = i2 + 1;
                r5.A02 = i2;
                Object obj = r3.keysArray[i2];
                if (obj == r3) {
                    A0Y.append("(this Map)");
                } else {
                    A0Y.append(obj);
                }
                A0Y.append('=');
                Object[] objArr = r3.valuesArray;
                C162457s7.A0H(objArr);
                Object obj2 = objArr[r5.A02];
                if (obj2 == r3) {
                    A0Y.append("(this Map)");
                } else {
                    A0Y.append(obj2);
                }
                r5.A01();
                i++;
            } else {
                throw AnonymousClass6CA.A0c();
            }
        }
        String A0g = AnonymousClass000.A0g(A0Y);
        C162457s7.A0D(A0g);
        return A0g;
    }

    public AnonymousClass8OR() {
        this(8);
    }
}
