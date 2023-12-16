package X;

/* renamed from: X.1TN  reason: invalid class name */
public final class AnonymousClass1TN extends AnonymousClass26S {
    public final String A00;

    public AnonymousClass1TN(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1TN) && C162457s7.A0P(this.A00, ((AnonymousClass1TN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OpenAvatarEditor(origin=");
        return C18260x0.A07(this.A00, A0o);
    }

    public AnonymousClass1TN() {
        this("expressions_sheet");
    }
}
