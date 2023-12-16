package X;

/* renamed from: X.7Yn  reason: invalid class name and case insensitive filesystem */
public final class C152347Yn {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152347Yn) {
                C152347Yn r5 = (C152347Yn) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public C152347Yn(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("{videoLimitMb=");
        A0o.append(this.A00);
        A0o.append(", videoMaxEdge=");
        A0o.append(this.A02);
        A0o.append(", videoMaxBitrate=");
        A0o.append(this.A01);
        return AnonymousClass000.A0d(A0o);
    }
}
