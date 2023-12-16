package X;

/* renamed from: X.1OI  reason: invalid class name */
public final class AnonymousClass1OI extends AnonymousClass1OB {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1OI) && this.A00 == ((AnonymousClass1OI) obj).A00);
    }

    public AnonymousClass1OI(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CancelSuccess(successCount=");
        return C18260x0.A09(A0o, this.A00);
    }
}
