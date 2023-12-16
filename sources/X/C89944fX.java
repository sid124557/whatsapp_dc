package X;

/* renamed from: X.4fX  reason: invalid class name and case insensitive filesystem */
public final class C89944fX extends AnonymousClass59W {
    public final C618532n error;

    public C89944fX(C618532n r2) {
        C162457s7.A0J(r2, 1);
        this.error = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C89944fX) && C162457s7.A0P(this.error, ((C89944fX) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SingleError(error=");
        return C18260x0.A04(this.error, A0o);
    }
}
