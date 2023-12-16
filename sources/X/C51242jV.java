package X;

/* renamed from: X.2jV  reason: invalid class name and case insensitive filesystem */
public final class C51242jV {
    public final int A00;
    public final C108895dj A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51242jV) {
                C51242jV r5 = (C51242jV) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, this.A00 * 31);
    }

    public C51242jV(C108895dj r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserEntityForNativeAuth(source=");
        A0o.append(this.A00);
        A0o.append(", wfsNonceResult=");
        return C18260x0.A04(this.A01, A0o);
    }
}
