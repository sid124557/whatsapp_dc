package X;

/* renamed from: X.0PK  reason: invalid class name */
public final class AnonymousClass0PK {
    public final Long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0PK) {
                AnonymousClass0PK r5 = (AnonymousClass0PK) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + AnonymousClass000.A07(this.A00);
    }

    public AnonymousClass0PK(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Preference(key=");
        A0o.append(this.A01);
        A0o.append(", value=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
