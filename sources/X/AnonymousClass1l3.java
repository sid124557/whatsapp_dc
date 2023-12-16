package X;

/* renamed from: X.1l3  reason: invalid class name */
public final class AnonymousClass1l3 extends C376423l {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1l3) && this.code == ((AnonymousClass1l3) obj).code);
    }

    public AnonymousClass1l3(int i) {
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
