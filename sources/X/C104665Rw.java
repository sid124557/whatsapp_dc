package X;

/* renamed from: X.5Rw  reason: invalid class name and case insensitive filesystem */
public final class C104665Rw {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104665Rw) {
                C104665Rw r5 = (C104665Rw) obj;
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

    public C104665Rw(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LoggableErrorReason(className=");
        A0o.append(this.A00);
        A0o.append(", message=");
        return C18260x0.A07(this.A01, A0o);
    }
}
