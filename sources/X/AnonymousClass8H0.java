package X;

/* renamed from: X.8H0  reason: invalid class name */
public final class AnonymousClass8H0 implements C179368j2 {
    public final C142586xR A00;

    public AnonymousClass8H0(C142586xR r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8H0) && this.A00 == ((AnonymousClass8H0) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupError(groupLevelError=");
        return C18260x0.A04(this.A00, A0o);
    }
}
