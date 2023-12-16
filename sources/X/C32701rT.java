package X;

/* renamed from: X.1rT  reason: invalid class name and case insensitive filesystem */
public final class C32701rT extends C48272ed {
    public final C50612iT A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32701rT) {
                C32701rT r5 = (C32701rT) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public C32701rT(C50612iT r1, String str) {
        super(r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Loading(packId=");
        A0o.append(this.A01);
        A0o.append(", pack=");
        return C18260x0.A04(this.A00, A0o);
    }
}
