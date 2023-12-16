package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.8O9  reason: invalid class name */
public final class AnonymousClass8O9 implements Iterator, C834348j {
    public int A00;
    public final byte[] A01;

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01.length);
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        byte[] bArr = this.A01;
        if (i < bArr.length) {
            this.A00 = i + 1;
            return new C172428Lb(bArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    public AnonymousClass8O9(byte[] bArr) {
        this.A01 = bArr;
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
