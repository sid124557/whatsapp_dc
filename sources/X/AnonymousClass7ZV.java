package X;

import java.util.Arrays;

/* renamed from: X.7ZV  reason: invalid class name */
public final class AnonymousClass7ZV {
    public int A00;
    public int A01 = 0;
    public int A02;
    public AnonymousClass7A6[] A03 = new AnonymousClass7A6[100];
    public final int A04;

    public AnonymousClass7ZV(int i) {
        C159197lM.A01(AnonymousClass001.A1W(i));
        this.A04 = i;
    }

    public synchronized int A00() {
        return this.A00 * this.A04;
    }

    public synchronized void A01() {
        int i = this.A02;
        int i2 = this.A04;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.A00);
        int i3 = this.A01;
        if (max < i3) {
            Arrays.fill(this.A03, max, i3, (Object) null);
            this.A01 = max;
        }
    }

    public synchronized void A02(int i) {
        boolean A1Y = AnonymousClass001.A1Y(i, this.A02);
        this.A02 = i;
        if (A1Y) {
            A01();
        }
    }
}
