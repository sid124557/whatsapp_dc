package X;

/* renamed from: X.7k4  reason: invalid class name and case insensitive filesystem */
public final class C158497k4 {
    public static final C103075Ll A03 = new C103075Ll();
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158497k4) {
                C158497k4 r5 = (C158497k4) obj;
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

    public C158497k4(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScreenShareInfo(width=");
        A0o.append(this.A02);
        A0o.append(", height=");
        A0o.append(this.A01);
        A0o.append(", dpi=");
        return C18260x0.A09(A0o, this.A00);
    }
}
