package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3d1  reason: invalid class name and case insensitive filesystem */
public final class C72003d1 implements Iterator, C834348j {
    public long A00;
    public boolean A01;
    public final long A02;
    public final long A03;

    public C72003d1(long j, long j2) {
        this.A03 = 1;
        this.A02 = j2;
        boolean z = j > j2 ? false : true;
        this.A01 = z;
        this.A00 = !z ? j2 : j;
    }

    public /* bridge */ /* synthetic */ Object next() {
        long j = this.A00;
        if (j != this.A02) {
            this.A00 = this.A03 + j;
        } else if (this.A01) {
            this.A01 = false;
        } else {
            throw new NoSuchElementException();
        }
        return Long.valueOf(j);
    }

    public boolean hasNext() {
        return this.A01;
    }

    public void remove() {
        throw C18290x4.A0x();
    }

    public C72003d1() {
    }
}
