package X;

/* renamed from: X.1eE  reason: invalid class name and case insensitive filesystem */
public final class C27621eE extends AnonymousClass27J {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27621eE) && this.A00 == ((C27621eE) obj).A00);
    }

    public C27621eE(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProtocolError(error=");
        return C18260x0.A09(A0o, this.A00);
    }
}
