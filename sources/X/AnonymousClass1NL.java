package X;

/* renamed from: X.1NL  reason: invalid class name */
public final class AnonymousClass1NL extends AnonymousClass2FD {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1NL) && C162457s7.A0P(this.A00, ((AnonymousClass1NL) obj).A00));
    }

    public AnonymousClass1NL(String str) {
        super(C370120p.HEADER);
        this.A00 = str;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HeaderItem(text=");
        return C18260x0.A07(this.A00, A0o);
    }
}
