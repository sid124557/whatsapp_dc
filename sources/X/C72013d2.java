package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3d2  reason: invalid class name and case insensitive filesystem */
public final class C72013d2 implements Iterator, C834348j {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public int A00() {
        int i = this.A00;
        if (i != this.A02) {
            this.A00 = this.A03 + i;
            return i;
        } else if (this.A01) {
            this.A01 = false;
            return i;
        } else {
            throw new NoSuchElementException();
        }
    }

    public C72013d2(int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.A01 = z;
        this.A00 = !z ? i2 : i;
    }

    public boolean hasNext() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(A00());
    }

    public void remove() {
        throw C18290x4.A0x();
    }

    public C72013d2() {
    }
}
