package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6V8  reason: invalid class name */
public final class AnonymousClass6V8 extends AnonymousClass8T0 implements C188218yX, C178498hd, RandomAccess {
    public static final AnonymousClass6V8 A02;
    public int A00;
    public int[] A01;

    static {
        AnonymousClass6V8 r0 = new AnonymousClass6V8(new int[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass6V8)) {
                return super.equals(obj);
            }
            AnonymousClass6V8 r8 = (AnonymousClass6V8) obj;
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

    public final /* bridge */ /* synthetic */ C188218yX Btt(int i) {
        if (i >= this.A00) {
            return new AnonymousClass6V8(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return Integer.valueOf(this.A01[i]);
        }
        throw AnonymousClass8T0.A01(i, this.A00);
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0K = AnonymousClass001.A0K(obj);
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == A0K) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final int size() {
        return this.A00;
    }

    public AnonymousClass6V8(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public final void A03(int i) {
        A02();
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

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0K = AnonymousClass001.A0K(obj);
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
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

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof AnonymousClass6V8)) {
            return super.addAll(collection);
        }
        AnonymousClass6V8 r7 = (AnonymousClass6V8) collection;
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

    public final boolean contains(Object obj) {
        return AnonymousClass6C7.A1Z(obj, this);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        A02();
        if (i < 0 || i >= (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        int[] iArr = this.A01;
        int i3 = iArr[i];
        AnonymousClass6C7.A15(iArr, i2, i);
        this.A00--;
        this.modCount++;
        return Integer.valueOf(i3);
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

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int A0K = AnonymousClass001.A0K(obj);
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = A0K;
        return Integer.valueOf(i2);
    }

    public AnonymousClass6V8() {
        this(new int[10], 0);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A03(AnonymousClass001.A0K(obj));
        return true;
    }
}
