package X;

/* renamed from: X.888  reason: invalid class name */
public final class AnonymousClass888 implements C186108ul {
    public final int A00;

    public C186108ul Ayx() {
        return new AnonymousClass888(0);
    }

    public int BBf(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            return i2;
        }
        return -1;
    }

    public C186108ul Ayz(int i, int i2) {
        return new AnonymousClass888(this.A00 + i2);
    }

    public C186108ul Az1(int i, int i2) {
        return new AnonymousClass888(this.A00 - i2);
    }

    public int B7g() {
        if (this.A00 > 0) {
            return 0;
        }
        return -1;
    }

    public int B91() {
        int i = this.A00;
        int i2 = i - 1;
        if (i <= 0) {
            return -1;
        }
        return i2;
    }

    public int B9z(int i) {
        int i2 = i + 1;
        if (i2 >= this.A00) {
            return -1;
        }
        return i2;
    }

    public int getLength() {
        return this.A00;
    }

    public AnonymousClass888(int i) {
        this.A00 = i;
    }
}
