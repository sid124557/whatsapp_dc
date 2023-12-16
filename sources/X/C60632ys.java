package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2ys  reason: invalid class name and case insensitive filesystem */
public class C60632ys {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C60632ys.class, "_size");
    public C834648m[] A00;
    public volatile int _size;

    public static int A00(C834648m[] r0, int i, int i2) {
        C834648m r1 = r0[i];
        C162457s7.A0H(r1);
        C834648m r02 = r0[i2];
        C162457s7.A0H(r02);
        return ((Comparable) r1).compareTo(r02);
    }

    public final C834648m A01(int i) {
        C834648m[] r4 = this.A00;
        C162457s7.A0H(r4);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            A02(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0 && A00(r4, i, i2) < 0) {
                A02(i, i2);
                while (i2 > 0) {
                    C834648m[] r2 = this.A00;
                    C162457s7.A0H(r2);
                    int i3 = (i2 - 1) / 2;
                    if (A00(r2, i3, i2) <= 0) {
                        break;
                    }
                    A02(i2, i3);
                    i2 = i3;
                }
            } else {
                while (true) {
                    int i4 = (i * 2) + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    C834648m[] r22 = this.A00;
                    C162457s7.A0H(r22);
                    int i5 = i4 + 1;
                    if (i5 < atomicIntegerFieldUpdater.get(this) && A00(r22, i5, i4) < 0) {
                        i4 = i5;
                    }
                    if (A00(r22, i, i4) <= 0) {
                        break;
                    }
                    A02(i, i4);
                    i = i4;
                }
            }
        }
        C834648m r6 = r4[atomicIntegerFieldUpdater.get(this)];
        C162457s7.A0H(r6);
        C71783cf r23 = (C71783cf) r6;
        if (r23._heap != C39422Bx.A01) {
            r23._heap = null;
            r23.A00 = -1;
            r4[atomicIntegerFieldUpdater.get(this)] = null;
            return r6;
        }
        throw AnonymousClass001.A0c("Failed requirement.");
    }

    public final void A02(int i, int i2) {
        C834648m[] r2 = this.A00;
        C162457s7.A0H(r2);
        C834648m r1 = r2[i2];
        C162457s7.A0H(r1);
        C834648m r0 = r2[i];
        C162457s7.A0H(r0);
        r2[i] = r1;
        r2[i2] = r0;
        ((C71783cf) r1).A00 = i;
        ((C71783cf) r0).A00 = i2;
    }
}
