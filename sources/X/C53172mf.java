package X;

/* renamed from: X.2mf  reason: invalid class name and case insensitive filesystem */
public final class C53172mf {
    public String A00;
    public String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C53172mf(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0x2.A1A(str4, 4, str5);
        this.A02 = str;
        this.A00 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A03 = str5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53172mf) {
                C53172mf r5 = (C53172mf) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A03, AnonymousClass0x2.A07(this.A01, AnonymousClass0x2.A07(this.A04, AnonymousClass0x2.A07(this.A00, C18310x6.A09(this.A02)))));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionReportingData(data=");
        A0o.append(this.A02);
        A0o.append(", extensionId=");
        A0o.append(this.A00);
        A0o.append(", sessionId=");
        A0o.append(this.A04);
        A0o.append(", t=");
        A0o.append(this.A01);
        A0o.append(", name=");
        return C18260x0.A07(this.A03, A0o);
    }
}
