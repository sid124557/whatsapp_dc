package X;

/* renamed from: X.2my  reason: invalid class name and case insensitive filesystem */
public final class C53362my {
    public final C108895dj A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53362my) {
                C53362my r5 = (C53362my) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, AnonymousClass0x2.A07(this.A03, (((C18300x5.A04(this.A00) + C18270x1.A00(this.A04)) * 31) + AnonymousClass0x7.A07(this.A01)) * 31));
    }

    public C53362my(C108895dj r1, String str, String str2, String str3, String str4) {
        this.A00 = r1;
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostRequestPayload(enforcedEncryptedUniqueId=");
        A0o.append(this.A00);
        A0o.append(", message=");
        A0o.append(this.A04);
        A0o.append(", linkUrl=");
        A0o.append(this.A01);
        A0o.append(", mediaType=");
        A0o.append(this.A03);
        A0o.append(", mediaEverstoreDirectPath=");
        return C18260x0.A07(this.A02, A0o);
    }
}
