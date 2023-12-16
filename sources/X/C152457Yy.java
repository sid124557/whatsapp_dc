package X;

/* renamed from: X.7Yy  reason: invalid class name and case insensitive filesystem */
public final class C152457Yy {
    public final float A00;
    public final float A01;
    public final AnonymousClass7YX A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152457Yy) {
                C152457Yy r5 = (C152457Yy) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6C9.A07(C18300x5.A04(this.A02), this.A01) + Float.floatToIntBits(this.A00);
    }

    public C152457Yy(AnonymousClass7YX r1, float f, float f2) {
        this.A02 = r1;
        this.A01 = f;
        this.A00 = f2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StatusSize(size=");
        A0o.append(this.A02);
        A0o.append(", strokeWidth=");
        A0o.append(this.A01);
        A0o.append(", innerStrokeWidth=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
