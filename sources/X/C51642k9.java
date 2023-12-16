package X;

/* renamed from: X.2k9  reason: invalid class name and case insensitive filesystem */
public final class C51642k9 {
    public final double A00;
    public final double A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51642k9) {
                C51642k9 r7 = (C51642k9) obj;
                if (!(Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass0x2.A02(Double.doubleToLongBits(this.A00)), Double.doubleToLongBits(this.A01));
    }

    public C51642k9(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LocationPoint(latitude=");
        A0o.append(this.A00);
        A0o.append(", longitude=");
        A0o.append(this.A01);
        return AnonymousClass000.A0c(A0o);
    }
}
