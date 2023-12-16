package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.8OB  reason: invalid class name */
public final class AnonymousClass8OB implements Iterator, C834348j {
    public int A00;
    public final long[] A01;

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01.length);
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i < jArr.length) {
            this.A00 = i + 1;
            return new C172438Lc(jArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    public AnonymousClass8OB(long[] jArr) {
        this.A01 = jArr;
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
