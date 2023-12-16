package X;

/* renamed from: X.2lG  reason: invalid class name and case insensitive filesystem */
public final class C52302lG {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52302lG) {
                C52302lG r5 = (C52302lG) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C18270x1.A00(this.A00) * 31) + C18270x1.A00(this.A01)) * 31) + AnonymousClass0x7.A07(this.A02);
    }

    public C52302lG(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InitialsCacheKey(firstName=");
        A0o.append(this.A00);
        A0o.append(", lastName=");
        A0o.append(this.A01);
        A0o.append(", pushName=");
        return C18260x0.A07(this.A02, A0o);
    }
}
