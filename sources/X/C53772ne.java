package X;

/* renamed from: X.2ne  reason: invalid class name and case insensitive filesystem */
public final class C53772ne {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53772ne) {
                C53772ne r5 = (C53772ne) obj;
                if (!C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A06, r5.A06) || this.A00 != r5.A00 || this.A01 != r5.A01 || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A07, AnonymousClass0x2.A07(this.A04, C18310x6.A09(this.A05)));
        return AnonymousClass0x7.A08(this.A02, AnonymousClass0x2.A07(this.A03, (((AnonymousClass0x2.A07(this.A06, A072) + this.A00) * 31) + this.A01) * 31));
    }

    public C53772ne(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        this.A05 = str;
        this.A04 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str5;
        this.A02 = str6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Mask3DAsset(identifier=");
        A0o.append(this.A05);
        A0o.append(", fileName=");
        A0o.append(this.A04);
        A0o.append(", uri=");
        A0o.append(this.A07);
        A0o.append(", md5Hash=");
        A0o.append(this.A06);
        A0o.append(", fileSizeBytes=");
        A0o.append(this.A00);
        A0o.append(", uncompressedFileSizeBytes=");
        A0o.append(this.A01);
        A0o.append(", compressionType=");
        A0o.append(this.A03);
        A0o.append(", cacheKey=");
        return C18260x0.A07(this.A02, A0o);
    }
}
