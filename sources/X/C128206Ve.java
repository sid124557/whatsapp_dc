package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6Ve  reason: invalid class name and case insensitive filesystem */
public final class C128206Ve extends AnonymousClass8T2<Boolean> implements C188228yY<Boolean>, RandomAccess {
    public static final C128206Ve A02;
    public int A00;
    public boolean[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C128206Ve)) {
                return super.equals(obj);
            }
            C128206Ve r8 = (C128206Ve) obj;
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

    static {
        C128206Ve r1 = new C128206Ve();
        A02 = r1;
        r1.A00 = false;
    }

    public final /* synthetic */ C188228yY BuC(int i) {
        if (i >= this.A00) {
            return new C128206Ve(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return Boolean.valueOf(this.A01[i]);
        }
        throw AnonymousClass6C7.A0X(i, this.A00);
    }

    public final int size() {
        return this.A00;
    }

    public C128206Ve(boolean[] zArr, int i) {
        this.A01 = zArr;
        this.A00 = i;
    }

    public final void A03(int i, boolean z) {
        int i2;
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        boolean[] zArr = this.A01;
        if (i2 < zArr.length) {
            AnonymousClass6C7.A16(zArr, i, i2);
        } else {
            boolean[] A1b = AnonymousClass6C8.A1b(zArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1b, i + 1, this.A00 - i);
            this.A01 = A1b;
        }
        this.A01[i] = z;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A03(i, AnonymousClass001.A1Z(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof C128206Ve)) {
            return super.addAll(collection);
        }
        C128206Ve r7 = (C128206Ve) collection;
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

    public final boolean remove(Object obj) {
        A02();
        for (int i = 0; i < this.A00; i++) {
            if (C18320x8.A1W(obj, this.A01[i])) {
                boolean[] zArr = this.A01;
                System.arraycopy(zArr, i + 1, zArr, i, this.A00 - i);
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
            boolean[] zArr = this.A01;
            System.arraycopy(zArr, i2, zArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        boolean[] zArr = this.A01;
        boolean z = zArr[i];
        zArr[i] = A1Z;
        return Boolean.valueOf(z);
    }

    public C128206Ve() {
        this(new boolean[10], 0);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2;
        A02();
        if (i < 0 || i >= (i2 = this.A00)) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        boolean[] zArr = this.A01;
        boolean z = zArr[i];
        AnonymousClass8T2.A01(zArr, i2, i);
        this.A00--;
        this.modCount++;
        return Boolean.valueOf(z);
    }
}
