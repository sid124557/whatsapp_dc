package X;

import java.util.Iterator;

/* renamed from: X.8OD  reason: invalid class name */
public final class AnonymousClass8OD implements Iterator, C834348j {
    public long A00;
    public boolean A01;
    public final long A02;

    public boolean hasNext() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ Object next() {
        long j = this.A00;
        if (j != this.A02) {
            this.A00 = 1 + j;
        } else if (this.A01) {
            this.A01 = false;
        } else {
            throw AnonymousClass6CA.A0c();
        }
        return new C172438Lc(j);
    }

    public AnonymousClass8OD(long j, long j2) {
        this.A02 = j2;
        boolean z = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0 ? false : true;
        this.A01 = z;
        this.A00 = !z ? j2 : j;
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
