package X;

/* renamed from: X.0F6  reason: invalid class name */
public final class AnonymousClass0F6 extends AnonymousClass0JP {
    public final Exception A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0F6) && C162457s7.A0P(this.A00, ((AnonymousClass0F6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass0F6(Exception exc) {
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UnknownError(error=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
