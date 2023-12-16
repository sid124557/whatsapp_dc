package X;

/* renamed from: X.7Y6  reason: invalid class name */
public final class AnonymousClass7Y6 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y6) {
                AnonymousClass7Y6 r5 = (AnonymousClass7Y6) obj;
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

    public AnonymousClass7Y6(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BannerMargin(baseMarginRes=");
        A0o.append(this.A00);
        A0o.append(", externalMarginPx=");
        return C18260x0.A09(A0o, this.A01);
    }
}
