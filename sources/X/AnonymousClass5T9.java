package X;

/* renamed from: X.5T9  reason: invalid class name */
public final class AnonymousClass5T9 {
    public final AnonymousClass5ZO A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5T9) {
                AnonymousClass5T9 r5 = (AnonymousClass5T9) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A05, r5.A05) || this.A07 != r5.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A08 = AnonymousClass000.A08(this.A00, AnonymousClass0x2.A07(this.A01, C18310x6.A09(this.A04)));
        return AnonymousClass0x7.A00(AnonymousClass0x2.A07(this.A05, (((AnonymousClass0x2.A07(this.A06, A08) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A02)) * 31), this.A07);
    }

    public AnonymousClass5T9(AnonymousClass5ZO r1, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = r1;
        this.A06 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A05 = str6;
        this.A07 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessSearchRequestPayload(searchQuery=");
        A0o.append(this.A04);
        A0o.append(", countryCode=");
        A0o.append(this.A01);
        A0o.append(", searchLocation=");
        A0o.append(this.A00);
        A0o.append(", useCase=");
        A0o.append(this.A06);
        A0o.append(", searchId=");
        A0o.append(this.A03);
        A0o.append(", queryId=");
        A0o.append(this.A02);
        A0o.append(", searchSessionId=");
        A0o.append(this.A05);
        A0o.append(", isTest=");
        return C18260x0.A0A(A0o, this.A07);
    }
}
