package X;

/* renamed from: X.2in  reason: invalid class name and case insensitive filesystem */
public final class C50802in {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50802in) && C162457s7.A0P(this.A00, ((C50802in) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C50802in(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PageInfo(endCursor=");
        return C18260x0.A07(this.A00, A0o);
    }
}
