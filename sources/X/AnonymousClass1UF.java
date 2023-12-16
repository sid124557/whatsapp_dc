package X;

/* renamed from: X.1UF  reason: invalid class name */
public final class AnonymousClass1UF extends C381926c {
    public final String A00;

    public AnonymousClass1UF(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1UF) && C162457s7.A0P(this.A00, ((AnonymousClass1UF) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Loading(prompt=");
        return C18260x0.A07(this.A00, A0o);
    }
}
