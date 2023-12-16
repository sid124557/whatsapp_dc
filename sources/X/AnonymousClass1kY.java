package X;

/* renamed from: X.1kY  reason: invalid class name */
public final class AnonymousClass1kY extends AnonymousClass28F {
    public final AnonymousClass28E A00;

    public AnonymousClass1kY(AnonymousClass28E r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1kY) && C162457s7.A0P(this.A00, ((AnonymousClass1kY) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AlertDataItem(newsletterAlert=");
        return C18260x0.A04(this.A00, A0o);
    }
}
