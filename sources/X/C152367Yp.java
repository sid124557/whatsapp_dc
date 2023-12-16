package X;

/* renamed from: X.7Yp  reason: invalid class name and case insensitive filesystem */
public final class C152367Yp {
    public final C166557yt A00;
    public final C166557yt A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152367Yp) {
                C152367Yp r5 = (C152367Yp) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass000.A08(this.A01, C18310x6.A09(this.A02)));
    }

    public C152367Yp(C166557yt r1, C166557yt r2, String str) {
        this.A02 = str;
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InternationalActivationDateRange(credentialId=");
        A0o.append(this.A02);
        A0o.append(", startTs=");
        A0o.append(this.A01);
        A0o.append(", endTs=");
        return C18260x0.A04(this.A00, A0o);
    }
}
