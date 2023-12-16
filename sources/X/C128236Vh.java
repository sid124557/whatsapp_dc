package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6Vh  reason: invalid class name and case insensitive filesystem */
public final class C128236Vh extends AnonymousClass8T2<Integer> implements C188228yY<Integer>, RandomAccess {
    public static final C128236Vh A02;
    public int A00;
    public int[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C128236Vh)) {
                return super.equals(obj);
            }
            C128236Vh r8 = (C128236Vh) obj;
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

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    static {
        C128236Vh r1 = new C128236Vh();
        A02 = r1;
        r1.A00 = false;
    }

    public final void A03(int i) {
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
    }

    public final /* synthetic */ C188228yY BuC(int i) {
        if (i >= this.A00) {
            return new C128236Vh(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final int size() {
        return this.A00;
    }

    public C128236Vh(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public final void A04(int i, int i2) {
        int i3;
        A02();
        if (i < 0 || i > (i3 = this.A00)) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        int[] iArr = this.A01;
        if (i3 < iArr.length) {
            AnonymousClass6C7.A16(iArr, i, i3);
        } else {
            int[] A1Y = AnonymousClass6C8.A1Y(iArr, i3 * 3, i);
            System.arraycopy(this.A01, i, A1Y, i + 1, this.A00 - i);
            this.A01 = A1Y;
        }
        this.A01[i] = i2;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A04(i, AnonymousClass001.A0K(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof C128236Vh)) {
            return super.addAll(collection);
        }
        C128236Vh r7 = (C128236Vh) collection;
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

    public final /* synthetic */ Object get(int i) {
        A03(i);
        return Integer.valueOf(this.A01[i]);
    }

    public final boolean remove(Object obj) {
        A02();
        for (int i = 0; i < this.A00; i++) {
            if (obj.equals(Integer.valueOf(this.A01[i]))) {
                int[] iArr = this.A01;
                System.arraycopy(iArr, i + 1, iArr, i, this.A00 - i);
                this.A00--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        A02();
        if (i2 >= i) {
            int[] iArr = this.A01;
            System.arraycopy(iArr, i2, iArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int A0K = AnonymousClass001.A0K(obj);
        A02();
        A03(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0K;
        return Integer.valueOf(i2);
    }

    public C128236Vh() {
        this(new int[10], 0);
    }

    public final /* synthetic */ Object remove(int i) {
        A02();
        A03(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        AnonymousClass8T2.A01(iArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i2);
    }
}
