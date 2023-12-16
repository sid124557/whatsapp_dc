package X;

/* renamed from: X.4io  reason: invalid class name and case insensitive filesystem */
public final class C91044io extends AnonymousClass5AE {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91044io) && this.A00 == ((C91044io) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C91044io(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(errorType=");
        return C18260x0.A09(A0o, this.A00);
    }
}
