package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.8OM  reason: invalid class name */
public final class AnonymousClass8OM implements ListIterator, C834348j {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final AnonymousClass8U9 A03;

    public final void A00() {
        if (this.A03.modCount != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A01, this.A03.length);
    }

    public boolean hasPrevious() {
        return AnonymousClass001.A1W(this.A01);
    }

    public int nextIndex() {
        return this.A01;
    }

    public int previousIndex() {
        return this.A01 - 1;
    }

    public AnonymousClass8OM(AnonymousClass8U9 r2, int i) {
        this.A03 = r2;
        this.A01 = i;
        this.A00 = r2.modCount;
    }

    public void add(Object obj) {
        A00();
        AnonymousClass8U9 r2 = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        r2.add(i, obj);
        this.A02 = -1;
        this.A00 = r2.modCount;
    }

    public Object next() {
        A00();
        int i = this.A01;
        AnonymousClass8U9 r2 = this.A03;
        if (i < r2.length) {
            this.A01 = i + 1;
            this.A02 = i;
            return r2.array[r2.offset + i];
        }
        throw AnonymousClass6CA.A0c();
    }

    public Object previous() {
        A00();
        int i = this.A01;
        if (i > 0) {
            int i2 = i - 1;
            this.A01 = i2;
            this.A02 = i2;
            AnonymousClass8U9 r0 = this.A03;
            return r0.array[r0.offset + i2];
        }
        throw AnonymousClass6CA.A0c();
    }

    public void remove() {
        A00();
        int i = this.A02;
        if (i != -1) {
            AnonymousClass8U9 r1 = this.A03;
            r1.remove(i);
            this.A01 = this.A02;
            this.A02 = -1;
            this.A00 = r1.modCount;
            return;
        }
        throw AnonymousClass001.A0e("Call next() or previous() before removing element from the iterator.");
    }

    public void set(Object obj) {
        A00();
        int i = this.A02;
        if (i != -1) {
            this.A03.set(i, obj);
            return;
        }
        throw AnonymousClass001.A0e("Call next() or previous() before replacing element from the iterator.");
    }
}
