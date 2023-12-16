package X;

/* renamed from: X.1lb  reason: invalid class name and case insensitive filesystem */
public final class C29941lb extends AnonymousClass28M {
    public final String A00;

    public C29941lb(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29941lb) && C162457s7.A0P(this.A00, ((C29941lb) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SearchQuery(query=");
        return C18260x0.A07(this.A00, A0o);
    }
}
