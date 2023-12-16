package X;

/* renamed from: X.1T4  reason: invalid class name */
public final class AnonymousClass1T4 extends AnonymousClass2GH {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1T4) && C162457s7.A0P(this.A00, ((AnonymousClass1T4) obj).A00));
    }

    public AnonymousClass1T4(String str) {
        super(C370620u.HEADER);
        this.A00 = str;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HeaderItem(string=");
        return C18260x0.A07(this.A00, A0o);
    }
}
