package X;

/* renamed from: X.7ZM  reason: invalid class name */
public final class AnonymousClass7ZM {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZM) {
                AnonymousClass7ZM r5 = (AnonymousClass7ZM) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public AnonymousClass7ZM(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NavAndStatusColors(startStatusBarColor=");
        A0o.append(this.A03);
        A0o.append(", startNavBarColor=");
        A0o.append(this.A02);
        A0o.append(", returnStatusBarColor=");
        A0o.append(this.A01);
        A0o.append(", returnNavBarColor=");
        return C18260x0.A09(A0o, this.A00);
    }
}
