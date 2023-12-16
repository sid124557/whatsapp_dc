package X;

/* renamed from: X.2kV  reason: invalid class name and case insensitive filesystem */
public final class C51862kV {
    public String A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51862kV) {
                C51862kV r5 = (C51862kV) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C18270x1.A00(this.A00) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public C51862kV(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SendJobKey(jid=");
        A0o.append(this.A00);
        A0o.append(", keyId=");
        return C18260x0.A07(this.A01, A0o);
    }
}
