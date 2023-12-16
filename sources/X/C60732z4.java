package X;

/* renamed from: X.2z4  reason: invalid class name and case insensitive filesystem */
public final class C60732z4 {
    public static final AnonymousClass2UX A03 = new AnonymousClass2UX();
    public final Long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60732z4) {
                C60732z4 r5 = (C60732z4) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A02) + C18270x1.A00(this.A01)) * 31) + C18310x6.A07(this.A00);
    }

    public C60732z4(Long l, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsAssetVerification(publicKey=");
        A0o.append(this.A02);
        A0o.append(", prevPublicKey=");
        A0o.append(this.A01);
        A0o.append(", prevPublicKeyExpiryTimeInMilli=");
        return C18260x0.A04(this.A00, A0o);
    }
}
