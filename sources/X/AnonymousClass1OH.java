package X;

/* renamed from: X.1OH  reason: invalid class name */
public final class AnonymousClass1OH extends AnonymousClass1OB {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1OH) && this.A00 == ((AnonymousClass1OH) obj).A00);
    }

    public AnonymousClass1OH(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ApproveSuccess(successCount=");
        return C18260x0.A09(A0o, this.A00);
    }
}
