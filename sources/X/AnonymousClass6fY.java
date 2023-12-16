package X;

/* renamed from: X.6fY  reason: invalid class name */
public final class AnonymousClass6fY extends C150407Qp {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6fY) {
                AnonymousClass6fY r5 = (AnonymousClass6fY) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + 393671415;
    }

    public AnonymousClass6fY(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PostImages(productImageWidth=");
        A0o.append(this.A01);
        A0o.append(", productImageHeight=");
        A0o.append(this.A00);
        A0o.append(", fieldName=");
        return C18260x0.A07("post_images", A0o);
    }
}
