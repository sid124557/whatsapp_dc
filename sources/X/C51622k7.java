package X;

/* renamed from: X.2k7  reason: invalid class name and case insensitive filesystem */
public final class C51622k7 {
    public Integer A00 = null;
    public Integer A01 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51622k7) {
                C51622k7 r5 = (C51622k7) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.A00) * 31) + C18310x6.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MultiDestinationStateInfo(fbState=");
        A0o.append(this.A00);
        A0o.append(", igState=");
        return C18260x0.A04(this.A01, A0o);
    }
}
