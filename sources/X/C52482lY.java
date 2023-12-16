package X;

/* renamed from: X.2lY  reason: invalid class name and case insensitive filesystem */
public final class C52482lY {
    public final int A00;
    public final C624134x A01;
    public final C85424Ge A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52482lY) {
                C52482lY r5 = (C52482lY) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A02, this.A00 * 31));
    }

    public C52482lY(C624134x r1, C85424Ge r2, int i) {
        this.A00 = i;
        this.A02 = r2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParsingResult(messageType=");
        A0o.append(this.A00);
        A0o.append(", parser=");
        A0o.append(this.A02);
        A0o.append(", parsedMessage=");
        return C18260x0.A04(this.A01, A0o);
    }
}
