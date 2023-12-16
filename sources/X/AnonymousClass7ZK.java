package X;

/* renamed from: X.7ZK  reason: invalid class name */
public final class AnonymousClass7ZK {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public AnonymousClass7ZK(long j, String str, long j2, String str2) {
        C162457s7.A0J(str2, 2);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZK) {
                AnonymousClass7ZK r8 = (AnonymousClass7ZK) obj;
                if (!C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02) || this.A01 != r8.A01 || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A00(AnonymousClass0x2.A07(this.A02, C18310x6.A09(this.A03)), this.A01), this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InternationalPaymentState(credentialId=");
        A0o.append(this.A03);
        A0o.append(", activationStatus=");
        A0o.append(this.A02);
        A0o.append(", startTime=");
        A0o.append(this.A01);
        A0o.append(", endTime=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
