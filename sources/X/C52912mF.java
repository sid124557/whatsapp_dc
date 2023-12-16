package X;

/* renamed from: X.2mF  reason: invalid class name and case insensitive filesystem */
public final class C52912mF {
    public final C41572Kt A00;
    public final Short A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52912mF) {
                C52912mF r5 = (C52912mF) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(((((AnonymousClass000.A07(this.A00) * 31) + C18270x1.A00(this.A02)) * 31) + C18310x6.A07(this.A01)) * 31, this.A03);
    }

    public C52912mF(C41572Kt r1, Short sh, String str, boolean z) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = sh;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsMetadataGraphqlResponse(metadata=");
        A0o.append(this.A00);
        A0o.append(", errorType=");
        A0o.append(this.A02);
        A0o.append(", actionId=");
        A0o.append(this.A01);
        A0o.append(", dropQplMarker=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
