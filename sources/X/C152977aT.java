package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.7aT  reason: invalid class name and case insensitive filesystem */
public class C152977aT {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final AnonymousClass8OR A03;

    public final void A00() {
        if (this.A03.modCount != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A01() {
        while (true) {
            int i = this.A01;
            AnonymousClass8OR r1 = this.A03;
            if (i < r1.length && r1.presenceArray[i] < 0) {
                this.A01 = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        return AnonymousClass001.A1Y(this.A01, this.A03.length);
    }

    public C152977aT(AnonymousClass8OR r2) {
        this.A03 = r2;
        this.A00 = r2.modCount;
        A01();
    }

    public final void remove() {
        A00();
        if (this.A02 != -1) {
            AnonymousClass8OR r1 = this.A03;
            r1.A02();
            r1.A05(this.A02);
            this.A02 = -1;
            this.A00 = r1.modCount;
            return;
        }
        throw AnonymousClass001.A0e("Call next() before removing element from the iterator.");
    }
}
