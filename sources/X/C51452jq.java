package X;

/* renamed from: X.2jq  reason: invalid class name and case insensitive filesystem */
public final class C51452jq {
    public final Object A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51452jq) {
                C51452jq r5 = (C51452jq) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.A00) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public C51452jq(Object obj, String str) {
        this.A00 = obj;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PropertyValue(value=");
        A0o.append(this.A00);
        A0o.append(", id=");
        return C18260x0.A07(this.A01, A0o);
    }
}
