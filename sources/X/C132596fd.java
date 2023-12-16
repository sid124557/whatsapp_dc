package X;

/* renamed from: X.6fd  reason: invalid class name and case insensitive filesystem */
public final class C132596fd extends C1450473y {
    public final AnonymousClass7QA A00;

    public C132596fd(AnonymousClass7QA r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C132596fd) && C162457s7.A0P(this.A00, ((C132596fd) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(content=");
        return C18260x0.A04(this.A00, A0o);
    }
}
