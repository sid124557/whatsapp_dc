package X;

/* renamed from: X.1Mu  reason: invalid class name and case insensitive filesystem */
public final class C22371Mu extends AnonymousClass23V {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C22371Mu) && C162457s7.A0P(this.throwable, ((C22371Mu) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public C22371Mu(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(throwable=");
        return C18260x0.A04(this.throwable, A0o);
    }
}
