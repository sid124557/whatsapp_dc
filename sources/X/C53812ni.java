package X;

/* renamed from: X.2ni  reason: invalid class name and case insensitive filesystem */
public final class C53812ni {
    public final long A00;
    public final C372821q A01;
    public final C371521d A02;
    public final C27981fH A03;
    public final C95804uY A04;
    public final Long A05;
    public final String A06;
    public final String A07;

    public C53812ni(C372821q r2, C371521d r3, C27981fH r4, C95804uY r5, Long l, String str, String str2, long j) {
        C162457s7.A0J(r5, 1);
        C18260x0.A0U(r2, r3);
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = l;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53812ni) {
                C53812ni r8 = (C53812ni) obj;
                if (!C162457s7.A0P(this.A04, r8.A04) || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A07, r8.A07) || !C162457s7.A0P(this.A05, r8.A05) || this.A01 != r8.A01 || this.A02 != r8.A02 || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A01, (((((((C18300x5.A04(this.A04) + AnonymousClass000.A07(this.A03)) * 31) + C18270x1.A00(this.A06)) * 31) + C18270x1.A00(this.A07)) * 31) + C18310x6.A07(this.A05)) * 31)), this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterMember(newsletterJid=");
        A0o.append(this.A04);
        A0o.append(", memberJid=");
        A0o.append(this.A03);
        A0o.append(", displayName=");
        A0o.append(this.A06);
        A0o.append(", profilePictureDirectPath=");
        A0o.append(this.A07);
        A0o.append(", subscriptionTimestamp=");
        A0o.append(this.A05);
        A0o.append(", role=");
        A0o.append(this.A01);
        A0o.append(", typeOfFetch=");
        A0o.append(this.A02);
        A0o.append(", fetchedMs=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
