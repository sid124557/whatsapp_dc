package X;

/* renamed from: X.1lB  reason: invalid class name and case insensitive filesystem */
public final class C29741lB extends C376523m {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29741lB) && this.code == ((C29741lB) obj).code);
    }

    public C29741lB(int i) {
        this.code = i;
    }

    public int hashCode() {
        return this.code;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UnknownErrorCode(code=");
        return C18260x0.A09(A0o, this.code);
    }
}
