package X;

/* renamed from: X.2mS  reason: invalid class name and case insensitive filesystem */
public final class C53042mS {
    public final int A00;
    public final C95804uY A01;
    public final C372721p A02;
    public final String A03;

    public C53042mS(C95804uY r2, C372721p r3, String str, int i) {
        C162457s7.A0J(str, 3);
        this.A01 = r2;
        this.A00 = i;
        this.A03 = str;
        this.A02 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53042mS) {
                C53042mS r5 = (C53042mS) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00 || !C162457s7.A0P(this.A03, r5.A03) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A03, (C18300x5.A04(this.A01) + this.A00) * 31) + AnonymousClass000.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ForwardedNewsletterMessageInfo(newsletterJid=");
        A0o.append(this.A01);
        A0o.append(", serverMessageId=");
        A0o.append(this.A00);
        A0o.append(", newsletterName=");
        A0o.append(this.A03);
        A0o.append(", contentType=");
        return C18260x0.A04(this.A02, A0o);
    }
}
