package X;

/* renamed from: X.7YX  reason: invalid class name */
public final class AnonymousClass7YX {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YX) {
                AnonymousClass7YX r5 = (AnonymousClass7YX) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public AnonymousClass7YX(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Size(width=");
        A0o.append(this.A01);
        A0o.append(", height=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
