package X;

/* renamed from: X.2lS  reason: invalid class name and case insensitive filesystem */
public final class C52422lS {
    public final C51642k9 A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52422lS) {
                C52422lS r5 = (C52422lS) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C18270x1.A00(this.A02) * 31) + C18270x1.A00(this.A01)) * 31) + C18310x6.A07(this.A00);
    }

    public C52422lS(C51642k9 r1, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EventLocation(name=");
        A0o.append(this.A02);
        A0o.append(", address=");
        A0o.append(this.A01);
        A0o.append(", locationPoint=");
        return C18260x0.A04(this.A00, A0o);
    }
}
