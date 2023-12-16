package X;

import java.util.Arrays;

/* renamed from: X.88T  reason: invalid class name */
public final class AnonymousClass88T implements C183888qp {
    public int A00;
    public int A01 = 0;
    public int A02;
    public AnonymousClass7BK[] A03 = new AnonymousClass7BK[100];
    public final int A04;
    public final AnonymousClass7BK[] A05 = new AnonymousClass7BK[1];

    public AnonymousClass88T(int i) {
        this.A04 = i;
    }

    public synchronized void A00(int i) {
        boolean A1Y = AnonymousClass001.A1Y(i, this.A02);
        this.A02 = i;
        if (A1Y) {
            Br9();
        }
    }

    public synchronized void Bin(AnonymousClass7BK[] r7) {
        int i = this.A01;
        int i2 = r5 + i;
        AnonymousClass7BK[] r4 = this.A03;
        int length = r4.length;
        if (i2 >= length) {
            r4 = (AnonymousClass7BK[]) Arrays.copyOf(r4, Math.max(length * 2, i2));
            this.A03 = r4;
        }
        for (AnonymousClass7BK r2 : r7) {
            int i3 = this.A01;
            this.A01 = i3 + 1;
            r4[i3] = r2;
        }
        this.A00 -= r5;
        notifyAll();
    }

    public synchronized void Br9() {
        int i = this.A02;
        int i2 = this.A04;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.A00);
        int i3 = this.A01;
        if (max < i3) {
            Arrays.fill(this.A03, max, i3, (Object) null);
            this.A01 = max;
        }
    }
}
