package X;

/* renamed from: X.6h1  reason: invalid class name */
public final class AnonymousClass6h1 extends C149397Mh {
    public final AnonymousClass7HO A00;

    public AnonymousClass6h1(AnonymousClass7HO r2) {
        super(r2, false, false, false);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6h1) && C162457s7.A0P(this.A00, ((AnonymousClass6h1) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(errorBehaviour=");
        return C18260x0.A04(this.A00, A0o);
    }
}
