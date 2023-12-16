package X;

/* renamed from: X.2j7  reason: invalid class name and case insensitive filesystem */
public final class C51002j7 {
    public final String A00;

    public C51002j7(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51002j7) && C162457s7.A0P(this.A00, ((C51002j7) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterGeosuspendedCountry(isoCode=");
        return C18260x0.A07(this.A00, A0o);
    }
}
