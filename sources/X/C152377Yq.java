package X;

/* renamed from: X.7Yq  reason: invalid class name and case insensitive filesystem */
public final class C152377Yq {
    public final long A00;
    public final long A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152377Yq) {
                C152377Yq r8 = (C152377Yq) obj;
                if (!(C162457s7.A0P(this.A02, r8.A02) && this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A00(C18310x6.A09(this.A02), this.A01), this.A00);
    }

    public C152377Yq(long j, String str, long j2) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InternationalActivationDetails(activationStatus=");
        A0o.append(this.A02);
        A0o.append(", startTs=");
        A0o.append(this.A01);
        A0o.append(", endTs=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
