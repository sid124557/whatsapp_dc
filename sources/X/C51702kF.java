package X;

/* renamed from: X.2kF  reason: invalid class name and case insensitive filesystem */
public final class C51702kF {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51702kF) {
                C51702kF r5 = (C51702kF) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A00, C18310x6.A09(this.A01));
    }

    public C51702kF(String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SubmittedReport(responseId=");
        A0o.append(this.A01);
        A0o.append(", requestId=");
        return C18260x0.A07(this.A00, A0o);
    }
}
