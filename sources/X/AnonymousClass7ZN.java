package X;

/* renamed from: X.7ZN  reason: invalid class name */
public final class AnonymousClass7ZN {
    public int A00;
    public C53732nZ A01;
    public AnonymousClass5T0 A02;
    public final int A03;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7ZN) && this.A03 == ((AnonymousClass7ZN) obj).A03);
    }

    public int hashCode() {
        return this.A03;
    }

    public AnonymousClass7ZN(int i) {
        this.A03 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AutoconfVerifierResult(status=");
        return C18260x0.A09(A0o, this.A03);
    }
}
