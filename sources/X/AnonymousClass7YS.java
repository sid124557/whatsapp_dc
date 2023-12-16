package X;

/* renamed from: X.7YS  reason: invalid class name */
public final class AnonymousClass7YS {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7YS)) {
            return false;
        }
        AnonymousClass7YS r4 = (AnonymousClass7YS) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public AnonymousClass7YS(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append("x");
        return AnonymousClass000.A0h(A0o, this.A00);
    }
}
