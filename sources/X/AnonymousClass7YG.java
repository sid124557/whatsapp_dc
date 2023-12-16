package X;

/* renamed from: X.7YG  reason: invalid class name */
public final class AnonymousClass7YG {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YG) {
                AnonymousClass7YG r5 = (AnonymousClass7YG) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public AnonymousClass7YG(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ImageDimension(mediaWidth=");
        A0o.append(this.A01);
        A0o.append(", mediaHeight=");
        return C18260x0.A09(A0o, this.A00);
    }
}
