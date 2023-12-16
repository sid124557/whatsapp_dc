package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.6Vf  reason: invalid class name and case insensitive filesystem */
public final class C128216Vf extends AnonymousClass8T2<Double> implements C188228yY<Double>, RandomAccess {
    public static final C128216Vf A02;
    public int A00;
    public double[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C128216Vf)) {
                return super.equals(obj);
            }
            C128216Vf r11 = (C128216Vf) obj;
            int i = this.A00;
            if (i == r11.A00) {
                double[] dArr = r11.A01;
                int i2 = 0;
                while (i2 < i) {
                    if (this.A01[i2] == dArr[i2]) {
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

    static {
        C128216Vf r1 = new C128216Vf();
        A02 = r1;
        r1.A00 = false;
    }

    public final /* synthetic */ C188228yY BuC(int i) {
        if (i >= this.A00) {
            return new C128216Vf(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return Double.valueOf(this.A01[i]);
        }
        throw AnonymousClass6C7.A0X(i, this.A00);
    }

    public final int size() {
        return this.A00;
    }

    public C128216Vf(double[] dArr, int i) {
        this.A01 = dArr;
        this.A00 = i;
    }

    public final void A03(int i, double d) {
        int i2;
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        double[] dArr = this.A01;
        if (i2 < dArr.length) {
            AnonymousClass6C7.A16(dArr, i, i2);
        } else {
            double[] A1W = AnonymousClass6C8.A1W(dArr, i2 * 3, i);
            System.arraycopy(this.A01, i, A1W, i + 1, this.A00 - i);
            this.A01 = A1W;
        }
        this.A01[i] = d;
        this.A00++;
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        A03(i, AnonymousClass6C9.A02(obj));
    }

    public final boolean addAll(Collection collection) {
        A02();
        collection.getClass();
        if (!(collection instanceof C128216Vf)) {
            return super.addAll(collection);
        }
        C128216Vf r7 = (C128216Vf) collection;
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

    public final boolean remove(Object obj) {
        A02();
        for (int i = 0; i < this.A00; i++) {
            if (obj.equals(Double.valueOf(this.A01[i]))) {
                double[] dArr = this.A01;
                System.arraycopy(dArr, i + 1, dArr, i, this.A00 - i);
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
            double[] dArr = this.A01;
            System.arraycopy(dArr, i2, dArr, i, this.A00 - i2);
            this.A00 -= i2 - i;
            this.modCount++;
            return;
        }
        throw AnonymousClass6C9.A0X();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double A022 = AnonymousClass6C9.A02(obj);
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        double[] dArr = this.A01;
        double d = dArr[i];
        dArr[i] = A022;
        return Double.valueOf(d);
    }

    public C128216Vf() {
        this(new double[10], 0);
    }

    public final /* synthetic */ Object remove(int i) {
        int i2;
        A02();
        if (i < 0 || i >= (i2 = this.A00)) {
            throw AnonymousClass6C7.A0X(i, this.A00);
        }
        double[] dArr = this.A01;
        double d = dArr[i];
        AnonymousClass8T2.A01(dArr, i2, i);
        this.A00--;
        this.modCount++;
        return Double.valueOf(d);
    }
}
