package X;

/* renamed from: X.1rU  reason: invalid class name and case insensitive filesystem */
public final class C32711rU extends C48272ed {
    public final int A00;
    public final C50612iT A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32711rU) {
                C32711rU r5 = (C32711rU) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, C18310x6.A09(this.A02)) + this.A00;
    }

    public C32711rU(C50612iT r1, String str, int i) {
        super(r1);
        this.A02 = str;
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Downloading(packId=");
        A0o.append(this.A02);
        A0o.append(", pack=");
        A0o.append(this.A01);
        A0o.append(", progress=");
        return C18260x0.A09(A0o, this.A00);
    }
}
