package X;

/* renamed from: X.2m8  reason: invalid class name and case insensitive filesystem */
public final class C52842m8 {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52842m8) {
                C52842m8 r5 = (C52842m8) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(((((AnonymousClass000.A07(this.A00) * 31) + C18270x1.A00(this.A01)) * 31) + AnonymousClass0x7.A07(this.A02)) * 31, this.A03);
    }

    public C52842m8(Long l, String str, String str2, boolean z) {
        this.A00 = l;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TrustSignalData(joinedDate=");
        A0o.append(this.A00);
        A0o.append(", fbFollowerCount=");
        A0o.append(this.A01);
        A0o.append(", igFollowerCount=");
        A0o.append(this.A02);
        A0o.append(", showIGPost=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
