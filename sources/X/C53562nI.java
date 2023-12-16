package X;

/* renamed from: X.2nI  reason: invalid class name and case insensitive filesystem */
public final class C53562nI {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C53562nI(Long l, String str, String str2, String str3, String str4, String str5) {
        C162457s7.A0J(str3, 3);
        this.A05 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A01 = str5;
        this.A00 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53562nI) {
                C53562nI r5 = (C53562nI) obj;
                if (!C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A07(this.A02, C18310x6.A09(this.A05))) + C18270x1.A00(this.A04)) * 31) + C18270x1.A00(this.A01)) * 31) + C18310x6.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestPayload(uniqueId=");
        A0o.append(this.A05);
        A0o.append(", mediaEverstoreDirectPath=");
        A0o.append(this.A02);
        A0o.append(", mediaType=");
        A0o.append(this.A03);
        A0o.append(", message=");
        A0o.append(this.A04);
        A0o.append(", linkUrl=");
        A0o.append(this.A01);
        A0o.append(", dispatchTimestamp=");
        return C18260x0.A04(this.A00, A0o);
    }
}
