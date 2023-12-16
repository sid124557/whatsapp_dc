package X;

/* renamed from: X.7ZP  reason: invalid class name */
public final class AnonymousClass7ZP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZP) {
                AnonymousClass7ZP r5 = (AnonymousClass7ZP) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public AnonymousClass7ZP(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WDSActionTileDimension(paddingLeft=");
        A0o.append(this.A01);
        A0o.append(", paddingTop=");
        A0o.append(this.A03);
        A0o.append(", paddingRight=");
        A0o.append(this.A02);
        A0o.append(", paddingBottom=");
        return C18260x0.A09(A0o, this.A00);
    }
}
