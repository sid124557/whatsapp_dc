package X;

/* renamed from: X.2n8  reason: invalid class name and case insensitive filesystem */
public final class C53462n8 {
    public final C85034Er A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53462n8) {
                C53462n8 r5 = (C53462n8) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || this.A05 != r5.A05 || !C162457s7.A0P(this.A00, r5.A00) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((AnonymousClass0x2.A01((AnonymousClass0x2.A07(this.A02, C18310x6.A09(this.A01)) + C18270x1.A00(this.A03)) * 31, this.A05) + C18310x6.A07(this.A00)) * 31, this.A04);
    }

    public C53462n8(C85034Er r1, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = z;
        this.A00 = r1;
        this.A04 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PslDownloadData(extensionId=");
        A0o.append(this.A01);
        A0o.append(", pslCdnUrl=");
        A0o.append(this.A02);
        A0o.append(", pslSignature=");
        A0o.append(this.A03);
        A0o.append(", isDraft=");
        A0o.append(this.A05);
        A0o.append(", fetchAssetCallback=");
        A0o.append(this.A00);
        A0o.append(", endMarkerWhenDownloadComplete=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
