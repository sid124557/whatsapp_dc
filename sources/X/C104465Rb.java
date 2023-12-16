package X;

/* renamed from: X.5Rb  reason: invalid class name and case insensitive filesystem */
public final class C104465Rb {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104465Rb) {
                C104465Rb r5 = (C104465Rb) obj;
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

    public C104465Rb(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HighlightRange(start=");
        A0o.append(this.A01);
        A0o.append(", end=");
        return C18260x0.A09(A0o, this.A00);
    }
}
