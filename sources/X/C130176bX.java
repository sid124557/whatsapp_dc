package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6bX  reason: invalid class name and case insensitive filesystem */
public final class C130176bX extends AnonymousClass8T6<Integer> implements C85224Fk, RandomAccess, C178988iQ {
    public static final C130176bX A02;
    public int A00;
    public int[] A01;

    static {
        C130176bX r0 = new C130176bX(new int[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C130176bX)) {
                return super.equals(obj);
            }
            C130176bX r8 = (C130176bX) obj;
            int i = this.A00;
            if (i == r8.A00) {
                int[] iArr = r8.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (this.A01[i2] == iArr[i2]) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public final void A01(int i) {
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
        }
    }

    public /* bridge */ /* synthetic */ C188248ya BLN(int i) {
        if (i >= this.A00) {
            return new C130176bX(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0K = AnonymousClass001.A0K(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A0K) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int size() {
        return this.A00;
    }

    public C130176bX(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public void AwT(int i) {
        A00();
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (i2 == iArr.length) {
            iArr = AnonymousClass6C8.A1Y(iArr, i2 * 3, i2);
            this.A01 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0K = AnonymousClass001.A0K(obj);
        A00();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
        }
        int[] iArr = this.A01;
        if (i2 < iArr.length) {
            AnonymousClass6C7.A16(iArr, i, i2);
        } else {
            int[] A1Y = AnonymousClass6C8.A1Y(iArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1Y, i + 1, this.A00 - i);
            this.A01 = A1Y;
        }
        this.A01[i] = A0K;
        this.A00++;
        this.modCount++;
    }

    public boolean addAll(Collection collection) {
        A00();
        collection.getClass();
        if (!(collection instanceof C130176bX)) {
            return super.addAll(collection);
        }
        C130176bX r7 = (C130176bX) collection;
        int i = r7.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.A01;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.A01 = iArr;
            }
            System.arraycopy(r7.A01, 0, iArr, this.A00, r7.A00);
            this.A00 = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return AnonymousClass6C7.A1Z(obj, this);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        A01(i);
        return Integer.valueOf(this.A01[i]);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A00();
        A01(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        AnonymousClass6C7.A15(iArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public void removeRange(int i, int i2) {
        A00();
        if (i2 >= i) {
            int[] iArr = this.A01;
            System.arraycopy(iArr, i2, iArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int A0K = AnonymousClass001.A0K(obj);
        A00();
        A01(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0K;
        return Integer.valueOf(i2);
    }

    public C130176bX() {
        this(new int[10], 0);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        AwT(AnonymousClass001.A0K(obj));
        return true;
    }
}
