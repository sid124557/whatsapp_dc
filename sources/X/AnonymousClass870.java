package X;

/* renamed from: X.870  reason: invalid class name */
public final class AnonymousClass870 implements C184878sh {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C161467pi A04;

    public int B7i() {
        return -1;
    }

    public int BCQ() {
        return this.A03;
    }

    public int BiO() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A0C();
        }
        if (i == 16) {
            return this.A04.A0F();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int A0C = this.A04.A0C();
        this.A00 = A0C;
        return (A0C & 240) >> 4;
    }

    public AnonymousClass870(C126606Op r3) {
        C161467pi r1 = r3.A00;
        this.A04 = r1;
        this.A02 = C161467pi.A03(r1, 12) & 255;
        this.A03 = r1.A0E();
    }
}
