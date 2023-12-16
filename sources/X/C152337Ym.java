package X;

/* renamed from: X.7Ym  reason: invalid class name and case insensitive filesystem */
public final class C152337Ym {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152337Ym) {
                C152337Ym r5 = (C152337Ym) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public C152337Ym(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PhysicalScreenDimensions(width=");
        A0o.append(this.A02);
        A0o.append(", height=");
        A0o.append(this.A01);
        A0o.append(", diagonal=");
        return C18260x0.A09(A0o, this.A00);
    }
}
