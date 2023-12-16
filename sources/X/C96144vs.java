package X;

/* renamed from: X.4vs  reason: invalid class name and case insensitive filesystem */
public final class C96144vs extends C1000059a {
    public final String reason;

    public C96144vs(String str) {
        C162457s7.A0J(str, 1);
        this.reason = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96144vs) && C162457s7.A0P(this.reason, ((C96144vs) obj).reason));
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ModelNotFound(reason=");
        return C18260x0.A07(this.reason, A0o);
    }
}
