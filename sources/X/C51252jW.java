package X;

/* renamed from: X.2jW  reason: invalid class name and case insensitive filesystem */
public final class C51252jW {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51252jW) {
                C51252jW r5 = (C51252jW) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18310x6.A09(this.A01) + this.A00;
    }

    public C51252jW(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ARCapabilityMinVersionModel(capabilityName=");
        A0o.append(this.A01);
        A0o.append(", minVersion=");
        return C18260x0.A09(A0o, this.A00);
    }
}
