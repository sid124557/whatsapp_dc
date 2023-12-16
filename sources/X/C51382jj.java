package X;

/* renamed from: X.2jj  reason: invalid class name and case insensitive filesystem */
public final class C51382jj {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51382jj) {
                C51382jj r5 = (C51382jj) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A07(this.A01);
    }

    public C51382jj(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Item(type=");
        A0o.append(this.A00);
        A0o.append(", data=");
        return C18260x0.A04(this.A01, A0o);
    }
}
