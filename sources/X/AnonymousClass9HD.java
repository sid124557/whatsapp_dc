package X;

/* renamed from: X.9HD  reason: invalid class name */
public final class AnonymousClass9HD extends C192849Lw {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9HD) && this.A00 == ((AnonymousClass9HD) obj).A00);
    }

    public AnonymousClass9HD(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(errorLayoutStatus=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }

    public int hashCode() {
        return this.A00;
    }
}
