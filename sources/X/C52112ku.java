package X;

/* renamed from: X.2ku  reason: invalid class name and case insensitive filesystem */
public final class C52112ku {
    public final String A00;
    public final C175698Zj A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52112ku) {
                C52112ku r5 = (C52112ku) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18310x6.A09(this.A00));
    }

    public C52112ku(String str, C175698Zj r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MatchGroup(value=");
        A0o.append(this.A00);
        A0o.append(", range=");
        return C18260x0.A04(this.A01, A0o);
    }
}
