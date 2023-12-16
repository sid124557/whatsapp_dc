package X;

/* renamed from: X.2q1  reason: invalid class name and case insensitive filesystem */
public final class C55232q1 {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C55232q1) {
                C55232q1 r5 = (C55232q1) obj;
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

    public C55232q1(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final int A00() {
        return this.A00;
    }

    public final Object A01() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndexedValue(index=");
        A0o.append(this.A00);
        A0o.append(", value=");
        return C18260x0.A04(this.A01, A0o);
    }
}
