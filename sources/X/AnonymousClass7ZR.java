package X;

/* renamed from: X.7ZR  reason: invalid class name */
public final class AnonymousClass7ZR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZR) {
                AnonymousClass7ZR r5 = (AnonymousClass7ZR) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A03) * 31) + this.A02) * 31) + this.A01;
    }

    public AnonymousClass7ZR(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BadgeIconSize(extraSmall=");
        A0o.append(this.A00);
        A0o.append(", small=");
        A0o.append(this.A03);
        A0o.append(", medium=");
        A0o.append(this.A02);
        A0o.append(", large=");
        return C18260x0.A09(A0o, this.A01);
    }
}
