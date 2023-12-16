package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3ct  reason: invalid class name and case insensitive filesystem */
public final class C71923ct implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final Object[] A02;

    public static C71923ct A00(Object[] objArr) {
        return new C71923ct(objArr, 975);
    }

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A02.length);
    }

    public C71923ct(Object[] objArr, int i) {
        this.A02 = objArr;
        this.A01 = i;
    }

    public static String[] A01(C71923ct r0) {
        return (String[]) r0.next();
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            int i = this.A00;
            int i2 = this.A01;
            Object[] objArr = this.A02;
            int length = objArr.length;
            int min = Math.min(i + i2, length);
            if (length > i2 || i != 0) {
                objArr = Arrays.copyOfRange(objArr, i, min);
            }
            this.A00 += i2;
            return objArr;
        }
        throw new NoSuchElementException("There are no more chunks to provide.");
    }
}
