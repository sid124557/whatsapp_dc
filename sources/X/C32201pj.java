package X;

/* renamed from: X.1pj  reason: invalid class name and case insensitive filesystem */
public final class C32201pj extends C47742dk {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32201pj) {
                C32201pj r5 = (C32201pj) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18310x6.A09(this.A00) + C18270x1.A00(this.A01);
    }

    public C32201pj(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GenericPushPayload(dataNotificationType=");
        A0o.append(this.A00);
        A0o.append(", dataToLid=");
        return C18260x0.A07(this.A01, A0o);
    }
}
