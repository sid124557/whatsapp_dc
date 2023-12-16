package X;

/* renamed from: X.7Z2  reason: invalid class name */
public final class AnonymousClass7Z2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass7Z2.class != obj.getClass()) {
                return false;
            }
            AnonymousClass7Z2 r7 = (AnonymousClass7Z2) obj;
            if (!(this.A02 == r7.A02 && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A03 == r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass7Z2 A00(int i) {
        int i2 = i;
        if (this.A02 == i) {
            return this;
        }
        return new AnonymousClass7Z2(i2, this.A00, this.A03, this.A01);
    }

    public int hashCode() {
        return ((((((527 + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03);
    }

    public AnonymousClass7Z2(int i, int i2, long j, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }
}
