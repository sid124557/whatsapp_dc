package X;

/* renamed from: X.7Va  reason: invalid class name and case insensitive filesystem */
public final class C151497Va {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C151497Va)) {
            return false;
        }
        C151497Va r4 = (C151497Va) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return ((16337 + this.A01) * 31) + this.A00;
    }

    public C151497Va(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
