package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.8Np  reason: invalid class name and case insensitive filesystem */
public class C172948Np implements Iterator {
    public int A00 = 0;
    public final Object[] A01;

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01.length);
    }

    public Object next() {
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i != objArr.length) {
            this.A00 = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException(AnonymousClass000.A0Y("Out of elements: ", AnonymousClass001.A0o(), i));
    }

    public void remove() {
        throw AnonymousClass002.A0G("Cannot remove element from an Array.");
    }

    public C172948Np(Object[] objArr) {
        this.A01 = objArr;
    }
}
