package X;

/* renamed from: X.1vM  reason: invalid class name and case insensitive filesystem */
public final class C34561vM extends C34621vS {
    public final String errorMessage = null;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C34561vM) && C162457s7.A0P(this.errorMessage, ((C34561vM) obj).errorMessage));
    }

    public int hashCode() {
        return C18270x1.A00(this.errorMessage);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostTextStatusBurningError(errorMessage=");
        return C18260x0.A07(this.errorMessage, A0o);
    }
}
