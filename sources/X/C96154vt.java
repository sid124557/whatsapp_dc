package X;

/* renamed from: X.4vt  reason: invalid class name and case insensitive filesystem */
public final class C96154vt extends C1000059a {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96154vt) && C162457s7.A0P(this.throwable, ((C96154vt) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public C96154vt(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UnknownError(throwable=");
        return C18260x0.A04(this.throwable, A0o);
    }
}
