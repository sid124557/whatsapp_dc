package X;

import java.util.Iterator;

/* renamed from: X.3cx  reason: invalid class name and case insensitive filesystem */
public final class C71963cx implements Iterator, C834348j {
    public int A00;
    public final Iterator A01;

    public C71963cx(Iterator it) {
        C162457s7.A0J(it, 1);
        this.A01 = it;
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= 0) {
            return new C55232q1(i, this.A01.next());
        }
        throw C18280x3.A0X();
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
