package X;

/* renamed from: X.7Y8  reason: invalid class name */
public final class AnonymousClass7Y8 {
    public final C150477Qw A00;
    public final C150477Qw A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y8) {
                AnonymousClass7Y8 r5 = (AnonymousClass7Y8) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18300x5.A04(this.A01));
    }

    public AnonymousClass7Y8(C150477Qw r1, C150477Qw r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallHeaderViewState(title=");
        A0o.append(this.A01);
        A0o.append(", status=");
        return C18260x0.A04(this.A00, A0o);
    }
}
