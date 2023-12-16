package X;

/* renamed from: X.1l9  reason: invalid class name */
public final class AnonymousClass1l9 extends C376523m {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1l9) && C162457s7.A0P(this.throwable, ((AnonymousClass1l9) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass1l9(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(throwable=");
        return C18260x0.A04(this.throwable, A0o);
    }
}
