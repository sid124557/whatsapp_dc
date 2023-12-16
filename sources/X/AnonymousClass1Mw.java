package X;

/* renamed from: X.1Mw  reason: invalid class name */
public final class AnonymousClass1Mw extends AnonymousClass23V {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1Mw) && this.code == ((AnonymousClass1Mw) obj).code);
    }

    public AnonymousClass1Mw(int i) {
        this.code = i;
    }

    public int hashCode() {
        return this.code;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UnknownGraphqlErrorCode(code=");
        return C18260x0.A09(A0o, this.code);
    }
}
