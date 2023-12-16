package X;

/* renamed from: X.5SG  reason: invalid class name */
public final class AnonymousClass5SG {
    public final AnonymousClass586 A00;
    public final Exception A01;
    public final Object A02;

    public AnonymousClass5SG(AnonymousClass586 r2, Exception exc, Object obj) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A02 = obj;
        this.A01 = exc;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SG) {
                AnonymousClass5SG r5 = (AnonymousClass5SG) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A00) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Resource(status=");
        A0o.append(this.A00);
        A0o.append(", data=");
        A0o.append(this.A02);
        A0o.append(", error=");
        return C18260x0.A04(this.A01, A0o);
    }
}
