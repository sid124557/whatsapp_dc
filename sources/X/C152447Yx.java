package X;

/* renamed from: X.7Yx  reason: invalid class name and case insensitive filesystem */
public final class C152447Yx {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152447Yx) {
                C152447Yx r5 = (C152447Yx) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A02) * 31) + this.A00;
    }

    public C152447Yx(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WDSButtonState(normal=");
        A0o.append(this.A01);
        A0o.append(", pressed=");
        A0o.append(this.A02);
        A0o.append(", disabled=");
        return C18260x0.A09(A0o, this.A00);
    }
}
