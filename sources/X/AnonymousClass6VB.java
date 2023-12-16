package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.6VB  reason: invalid class name */
public final class AnonymousClass6VB extends AnonymousClass8T0 implements RandomAccess {
    public static final AnonymousClass6VB A02;
    public int A00;
    public Object[] A01;

    static {
        AnonymousClass6VB r0 = new AnonymousClass6VB(new Object[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final /* bridge */ /* synthetic */ C188218yX Btt(int i) {
        if (i >= this.A00) {
            return new AnonymousClass6VB(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public final Object get(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A01[i];
        }
        throw AnonymousClass8T0.A01(i, this.A00);
    }

    public final int size() {
        return this.A00;
    }

    public AnonymousClass6VB(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        A02();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        Object[] objArr = this.A01;
        if (i2 < objArr.length) {
            AnonymousClass6C7.A16(objArr, i, i2);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.A01, i, objArr2, i + 1, this.A00 - i);
            this.A01 = objArr2;
        }
        this.A01[i] = obj;
        this.A00++;
        this.modCount++;
    }

    public final Object remove(int i) {
        int i2;
        A02();
        if (i < 0 || i >= (i2 = this.A00)) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        AnonymousClass6C7.A15(objArr, i2, i);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        A02();
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass8T0.A01(i, this.A00);
        }
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public AnonymousClass6VB() {
        this(new Object[10], 0);
    }

    public final boolean add(Object obj) {
        A02();
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.A01 = objArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
