package X;

/* renamed from: X.81d  reason: invalid class name and case insensitive filesystem */
public final class C1674581d implements C186088uj {
    public final int A00;

    public C186088uj Ayw() {
        return new C1674581d(0);
    }

    public int BBf(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            return i2;
        }
        return -1;
    }

    public C186088uj Ayy(int i, int i2) {
        return new C1674581d(this.A00 + i2);
    }

    public C186088uj Az0(int i, int i2) {
        return new C1674581d((this.A00 - i2) + i);
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

    public C1674581d(int i) {
        this.A00 = i;
    }
}
