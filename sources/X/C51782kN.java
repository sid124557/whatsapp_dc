package X;

/* renamed from: X.2kN  reason: invalid class name and case insensitive filesystem */
public final class C51782kN {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51782kN) {
                C51782kN r5 = (C51782kN) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A00, C18310x6.A09(this.A01));
    }

    public C51782kN(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CounterAbuseData(nonce=");
        A0o.append(this.A01);
        A0o.append(", counterAbuseToken=");
        return C18260x0.A07(this.A00, A0o);
    }
}
