package X;

/* renamed from: X.8H1  reason: invalid class name */
public final class AnonymousClass8H1 implements C179368j2 {
    public final AnonymousClass59I A00;

    public AnonymousClass8H1(AnonymousClass59I r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8H1) && this.A00 == ((AnonymousClass8H1) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndividualError(error=");
        return C18260x0.A04(this.A00, A0o);
    }
}
