package X;

/* renamed from: X.1pk  reason: invalid class name and case insensitive filesystem */
public final class C32211pk extends C47742dk {
    public final String A00;
    public final String A01;
    public final String A02;

    public C32211pk(String str, String str2, String str3) {
        C162457s7.A0J(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32211pk) {
                C32211pk r5 = (C32211pk) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, (C18310x6.A09(this.A00) + C18270x1.A00(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfacPushPayload(dataNotificationType=");
        A0o.append(this.A00);
        A0o.append(", dataToLid=");
        A0o.append(this.A01);
        A0o.append(", decision=");
        return C18260x0.A07(this.A02, A0o);
    }
}
