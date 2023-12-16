package X;

/* renamed from: X.24M  reason: invalid class name */
public final class AnonymousClass24M extends Exception {
    public final int errorCode;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass24M) && this.errorCode == ((AnonymousClass24M) obj).errorCode);
    }

    public AnonymousClass24M(int i) {
        this.errorCode = i;
    }

    public int hashCode() {
        return this.errorCode;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ErrorCodeException(errorCode=");
        return C18260x0.A09(A0o, this.errorCode);
    }
}
