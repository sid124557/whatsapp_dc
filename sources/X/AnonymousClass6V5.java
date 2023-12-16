package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6V5  reason: invalid class name */
public final class AnonymousClass6V5 extends AnonymousClass8T0 implements C188218yX, C178498hd, RandomAccess {
    public static final AnonymousClass6V5 A02;
    public int A00;
    public boolean[] A01;

    static {
        AnonymousClass6V5 r0 = new AnonymousClass6V5(new boolean[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass6V5)) {
                return super.equals(obj);
            }
            AnonymousClass6V5 r8 = (AnonymousClass6V5) obj;
            int i = this.A00;
            if (i == r8.A00) {
                boolean[] zArr = r8.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (this.A01[i2] == zArr[i2]) {
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
            i = (i * 31) + AnonymousClass6C9.A05(this.A01[i2] ? 1 : 0);
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ C188218yX Btt(int i) {
        if (i >= this.A00) {
            return new AnonymousClass6V5(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return Boolean.valueOf(this.A01[i]);
        }
        throw AnonymousClass8T0.A01(i, this.A00);
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean A1Z = AnonymousClass001.A1Z(obj);
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == A1Z) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final int size() {
        return this.A00;
    }

    public AnonymousClass6V5(boolean[] zArr, int i) {
        this.A01 = zArr;
        this.A00 = i;
    }

    public final void A03(boolean z) {
        A02();
        int i = this.A00;
        boolean[] zArr = this.A01;
        if (i == zArr.length) {
            zArr = AnonymousClass6C8.A1b(zArr, i * 3, i);
            this.A01 = zArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        zArr[i2] = z;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean A1Z = AnonymousClass001.A1Z(obj);
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        boolean[] zArr = this.A01;
        if (i2 < zArr.length) {
            AnonymousClass6C7.A16(zArr, i, i2);
        } else {
            boolean[] A1b = AnonymousClass6C8.A1b(zArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1b, i + 1, this.A00 - i);
            this.A01 = A1b;
        }
        this.A01[i] = A1Z;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof AnonymousClass6V5)) {
            return super.addAll(collection);
        }
        AnonymousClass6V5 r7 = (AnonymousClass6V5) collection;
        int i = r7.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.A01;
            if (i3 > zArr.length) {
                zArr = Arrays.copyOf(zArr, i3);
                this.A01 = zArr;
            }
            System.arraycopy(r7.A01, 0, zArr, this.A00, r7.A00);
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
        boolean[] zArr = this.A01;
        boolean z = zArr[i];
        AnonymousClass6C7.A15(zArr, i2, i);
        this.A00--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        A02();
        if (i2 >= i) {
            boolean[] zArr = this.A01;
            System.arraycopy(zArr, i2, zArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        boolean[] zArr = this.A01;
        boolean z = zArr[i];
        zArr[i] = A1Z;
        return Boolean.valueOf(z);
    }

    public AnonymousClass6V5() {
        this(new boolean[10], 0);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A03(AnonymousClass001.A1Z(obj));
        return true;
    }
}
