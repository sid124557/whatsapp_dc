package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.6bd  reason: invalid class name and case insensitive filesystem */
public final class C130236bd<E> extends AnonymousClass8T6<E> implements RandomAccess {
    public static final C130236bd A02;
    public int A00;
    public Object[] A01;

    static {
        C130236bd r0 = new C130236bd(new Object[0], 0);
        A02 = r0;
        r0.A00 = false;
    }

    public final void A01(int i) {
        if (i < 0 || i >= this.A00) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
        }
    }

    public /* bridge */ /* synthetic */ C188248ya BLN(int i) {
        if (i >= this.A00) {
            return new C130236bd(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw AnonymousClass6CA.A0N();
    }

    public int size() {
        return this.A00;
    }

    public C130236bd(Object[] objArr, int i) {
        this.A01 = objArr;
        this.A00 = i;
    }

    public void add(int i, Object obj) {
        int i2;
        A00();
        if (i < 0 || i > (i2 = this.A00)) {
            throw AnonymousClass6C7.A0Y(AnonymousClass6C7.A0n(i), this.A00);
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

    public Object get(int i) {
        A01(i);
        return this.A01[i];
    }

    public Object remove(int i) {
        A00();
        A01(i);
        Object[] objArr = this.A01;
        Object obj = objArr[i];
        AnonymousClass6C7.A15(objArr, this.A00, i);
        this.A00--;
        this.modCount++;
        return obj;
    }

    public Object set(int i, Object obj) {
        A00();
        A01(i);
        Object[] objArr = this.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public C130236bd() {
        this(new Object[10], 0);
    }

    public boolean add(Object obj) {
        A00();
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
