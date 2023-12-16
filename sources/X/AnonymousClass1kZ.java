package X;

/* renamed from: X.1kZ  reason: invalid class name */
public final class AnonymousClass1kZ extends AnonymousClass28F {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1kZ) && this.A00 == ((AnonymousClass1kZ) obj).A00);
    }

    public AnonymousClass1kZ(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HeaderDataItem(title=");
        return C18260x0.A09(A0o, this.A00);
    }
}
