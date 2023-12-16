package X;

/* renamed from: X.6zF  reason: invalid class name and case insensitive filesystem */
public final class C143646zF extends Exception {
    public final C142526xL error;

    public C143646zF(C142526xL r2) {
        C162457s7.A0J(r2, 1);
        this.error = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C143646zF) && this.error == ((C143646zF) obj).error);
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CancelRequestParticipantError(error=");
        return C18260x0.A04(this.error, A0o);
    }
}
