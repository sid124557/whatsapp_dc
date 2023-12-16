package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6V6  reason: invalid class name */
public final class AnonymousClass6V6 extends AnonymousClass8T0 implements C188218yX, C178498hd, RandomAccess {
    public static final AnonymousClass6V6 A02;
    public int A00;
    public double[] A01;

    static {
        AnonymousClass6V6 r0 = new AnonymousClass6V6(new double[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass6V6)) {
                return super.equals(obj);
            }
            AnonymousClass6V6 r11 = (AnonymousClass6V6) obj;
            int i = this.A00;
            if (i == r11.A00) {
                double[] dArr = r11.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (Double.doubleToLongBits(this.A01[i2]) == Double.doubleToLongBits(dArr[i2])) {
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
            i = AnonymousClass0x2.A00(i * 31, Double.doubleToLongBits(this.A01[i2]));
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ C188218yX Btt(int i) {
        if (i >= this.A00) {
            return new AnonymousClass6V6(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return Double.valueOf(this.A01[i]);
        }
        throw AnonymousClass8T0.A01(i, this.A00);
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double A022 = AnonymousClass6C9.A02(obj);
            int i = this.A00;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A01[i2] == A022) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final int size() {
        return this.A00;
    }

    public AnonymousClass6V6(double[] dArr, int i) {
        this.A01 = dArr;
        this.A00 = i;
    }

    public final void A03(double d) {
        A02();
        int i = this.A00;
        double[] dArr = this.A01;
        if (i == dArr.length) {
            dArr = AnonymousClass6C8.A1W(dArr, i * 3, i);
            this.A01 = dArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        dArr[i2] = d;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double A022 = AnonymousClass6C9.A02(obj);
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        double[] dArr = this.A01;
        if (i2 < dArr.length) {
            AnonymousClass6C7.A16(dArr, i, i2);
        } else {
            double[] A1W = AnonymousClass6C8.A1W(dArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1W, i + 1, this.A00 - i);
            this.A01 = A1W;
        }
        this.A01[i] = A022;
        this.A00++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof AnonymousClass6V6)) {
            return super.addAll(collection);
        }
        AnonymousClass6V6 r7 = (AnonymousClass6V6) collection;
        int i = r7.A00;
        if (i == 0) {
            return false;
        }
        int i2 = this.A00;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.A01;
            if (i3 > dArr.length) {
                dArr = Arrays.copyOf(dArr, i3);
                this.A01 = dArr;
            }
            System.arraycopy(r7.A01, 0, dArr, this.A00, r7.A00);
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
        double[] dArr = this.A01;
        double d = dArr[i];
        AnonymousClass6C7.A15(dArr, i2, i);
        this.A00--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        A02();
        if (i2 >= i) {
            double[] dArr = this.A01;
            System.arraycopy(dArr, i2, dArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double A022 = AnonymousClass6C9.A02(obj);
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        double[] dArr = this.A01;
        double d = dArr[i];
        dArr[i] = A022;
        return Double.valueOf(d);
    }

    public AnonymousClass6V6() {
        this(new double[10], 0);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        A03(AnonymousClass6C9.A02(obj));
        return true;
    }
}
