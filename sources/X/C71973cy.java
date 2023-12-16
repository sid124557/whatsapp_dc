package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3cy  reason: invalid class name and case insensitive filesystem */
public final class C71973cy implements Iterator, C834348j {
    public int A00;
    public final Object[] A01;

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01.length);
    }

    public Object next() {
        try {
            Object[] objArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public C71973cy(Object[] objArr) {
        this.A01 = objArr;
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
