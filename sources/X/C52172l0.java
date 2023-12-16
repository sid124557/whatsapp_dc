package X;

/* renamed from: X.2l0  reason: invalid class name and case insensitive filesystem */
public final class C52172l0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52172l0) {
                C52172l0 r5 = (C52172l0) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(this.A00 * 31, this.A02), this.A01);
    }

    public C52172l0(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Spec(resId=");
        A0o.append(this.A00);
        A0o.append(", start=");
        A0o.append(this.A02);
        A0o.append(", repeat=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
