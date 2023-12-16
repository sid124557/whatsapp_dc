package X;

/* renamed from: X.6zE  reason: invalid class name and case insensitive filesystem */
public final class C143636zE extends Exception {
    public final C142656xY error;

    public C143636zE(C142656xY r2) {
        C162457s7.A0J(r2, 1);
        this.error = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143636zE) && this.error == ((C143636zE) obj).error);
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CancelRequestError(error=");
        return C18260x0.A04(this.error, A0o);
    }
}
