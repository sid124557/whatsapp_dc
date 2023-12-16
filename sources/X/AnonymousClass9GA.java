package X;

/* renamed from: X.9GA  reason: invalid class name */
public final class AnonymousClass9GA extends C192829Lu {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9GA) && C162457s7.A0P(this.A00, ((AnonymousClass9GA) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass9GA(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(handle=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
