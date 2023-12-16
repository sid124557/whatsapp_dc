package X;

import java.util.Iterator;

/* renamed from: X.6WU  reason: invalid class name */
public final class AnonymousClass6WU extends AnonymousClass6WV {
    public static final AnonymousClass6WU A05;
    public static final Object[] A06;
    public final transient int A00;
    public final transient int A01;
    public final transient int A02;
    public final transient Object[] A03;
    public final transient Object[] A04;

    public final boolean contains(Object obj) {
        Object[] objArr = this.A04;
        if (obj != null && objArr.length != 0) {
            int A062 = AnonymousClass6C8.A06(obj.hashCode());
            while (true) {
                int i = A062 & this.A01;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    A062 = i + 1;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final /* synthetic */ Iterator iterator() {
        AnonymousClass6WS r2 = this.A00;
        if (r2 == null) {
            Object[] objArr = this.A03;
            int i = this.A02;
            if (i == 0) {
                r2 = AnonymousClass6WR.A02;
            } else {
                r2 = new AnonymousClass6WR(objArr, i);
            }
            this.A00 = r2;
        }
        return r2.listIterator(0);
    }

    public final int size() {
        return this.A02;
    }

    static {
        Object[] A0U = AnonymousClass4L0.A0U();
        A06 = A0U;
        A05 = new AnonymousClass6WU(A0U, 0, A0U, 0, 0);
    }

    public AnonymousClass6WU(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.A03 = objArr;
        this.A00 = i;
        this.A04 = objArr2;
        this.A01 = i2;
        this.A02 = i3;
    }
}
