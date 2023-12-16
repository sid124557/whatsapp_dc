package X;

/* renamed from: X.81A  reason: invalid class name */
public final class AnonymousClass81A implements C184728sQ {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C161457ph A04;

    public int B7i() {
        return -1;
    }

    public int BCQ() {
        return this.A03;
    }

    public int BiO() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A04();
        }
        if (i == 16) {
            return this.A04.A06();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int A042 = this.A04.A04();
        this.A00 = A042;
        return (A042 & 240) >> 4;
    }

    public AnonymousClass81A(C125806Jo r3) {
        C161457ph r1 = r3.A00;
        this.A04 = r1;
        r1.A0H(12);
        this.A02 = r1.A05() & 255;
        this.A03 = r1.A05();
    }
}
