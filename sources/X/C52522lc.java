package X;

/* renamed from: X.2lc  reason: invalid class name and case insensitive filesystem */
public final class C52522lc {
    public final int A00;
    public final int A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52522lc) {
                C52522lc r5 = (C52522lc) obj;
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

    public C52522lc(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = (long) (i * i2 * 3);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ImageUriInformation(width=");
        A0o.append(this.A01);
        A0o.append(", height=");
        return C18260x0.A09(A0o, this.A00);
    }
}
