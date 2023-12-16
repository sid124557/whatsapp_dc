package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.8OA  reason: invalid class name */
public final class AnonymousClass8OA implements Iterator, C834348j {
    public int A00;
    public final int[] A01;

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01.length);
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        int[] iArr = this.A01;
        if (i < iArr.length) {
            this.A00 = i + 1;
            return new C172498Lj(iArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    public AnonymousClass8OA(int[] iArr) {
        this.A01 = iArr;
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
