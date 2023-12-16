package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.8OC  reason: invalid class name */
public final class AnonymousClass8OC implements Iterator, C834348j {
    public int A00;
    public final short[] A01;

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01.length);
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        short[] sArr = this.A01;
        if (i < sArr.length) {
            this.A00 = i + 1;
            return new C172448Ld(sArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    public AnonymousClass8OC(short[] sArr) {
        this.A01 = sArr;
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
