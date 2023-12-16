package X;

/* renamed from: X.1UG  reason: invalid class name */
public final class AnonymousClass1UG extends C381926c {
    public final Exception A00;
    public final String A01;

    public AnonymousClass1UG(String str, Exception exc) {
        C162457s7.A0J(str, 2);
        this.A00 = exc;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1UG) {
                AnonymousClass1UG r5 = (AnonymousClass1UG) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, AnonymousClass000.A07(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(exception=");
        A0o.append(this.A00);
        A0o.append(", prompt=");
        return C18260x0.A07(this.A01, A0o);
    }
}
