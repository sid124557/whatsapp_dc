package X;

/* renamed from: X.6fc  reason: invalid class name and case insensitive filesystem */
public final class C132586fc extends C1450473y {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C132586fc) && this.A00 == ((C132586fc) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C132586fc(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failure(errorCode=");
        return C18260x0.A09(A0o, this.A00);
    }
}
