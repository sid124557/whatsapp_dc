package X;

/* renamed from: X.1l1  reason: invalid class name */
public final class AnonymousClass1l1 extends C376423l {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1l1) && C162457s7.A0P(this.throwable, ((AnonymousClass1l1) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass1l1(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(throwable=");
        return C18260x0.A04(this.throwable, A0o);
    }
}
