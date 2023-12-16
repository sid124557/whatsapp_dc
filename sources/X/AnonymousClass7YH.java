package X;

/* renamed from: X.7YH  reason: invalid class name */
public final class AnonymousClass7YH {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YH) {
                AnonymousClass7YH r5 = (AnonymousClass7YH) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public AnonymousClass7YH(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OptionData(mediaQuality=");
        A0o.append(this.A00);
        A0o.append(", title=");
        return C18260x0.A09(A0o, this.A01);
    }
}
