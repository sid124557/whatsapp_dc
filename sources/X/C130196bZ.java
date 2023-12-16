package X;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6bZ  reason: invalid class name and case insensitive filesystem */
public final class C130196bZ extends AnonymousClass8T6<Double> implements Internal.DoubleList, RandomAccess, C178988iQ {
    public static final C130196bZ A02;
    public int A00;
    public double[] A01;

    static {
        C130196bZ r0 = new C130196bZ(new double[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C130196bZ)) {
                return super.equals(obj);
            }
            C130196bZ r11 = (C130196bZ) obj;
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

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = AnonymousClass0x2.A00(i * 31, Double.doubleToLongBits(this.A01[i2]));
        }
        return i;
    }

    public final void A02(int i) {
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
        }
    }

    public /* bridge */ /* synthetic */ C188248ya BLN(int i) {
        if (i >= this.A00) {
            return new C130196bZ(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double A022 = AnonymousClass6C9.A02(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.A01[i] == A022) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int size() {
        return this.A00;
    }

    public C130196bZ(double[] dArr, int i) {
        this.A01 = dArr;
        this.A00 = i;
    }

    public void A01(double d) {
        A00();
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

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double A022 = AnonymousClass6C9.A02(obj);
        A00();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
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

    public boolean addAll(Collection collection) {
        A00();
        collection.getClass();
        if (!(collection instanceof C130196bZ)) {
            return super.addAll(collection);
        }
        C130196bZ r7 = (C130196bZ) collection;
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

    public boolean contains(Object obj) {
        return AnonymousClass6C7.A1Z(obj, this);
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        A02(i);
        return Double.valueOf(this.A01[i]);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        A00();
        A02(i);
        double[] dArr = this.A01;
        double d = dArr[i];
        AnonymousClass6C7.A15(dArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public void removeRange(int i, int i2) {
        A00();
        if (i2 >= i) {
            double[] dArr = this.A01;
            System.arraycopy(dArr, i2, dArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double A022 = AnonymousClass6C9.A02(obj);
        A00();
        A02(i);
        double[] dArr = this.A01;
        double d = dArr[i];
        dArr[i] = A022;
        return Double.valueOf(d);
    }

    public C130196bZ() {
        this(new double[10], 0);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        A01(AnonymousClass6C9.A02(obj));
        return true;
    }
}
