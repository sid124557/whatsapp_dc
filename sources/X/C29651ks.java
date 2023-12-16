package X;

/* renamed from: X.1ks  reason: invalid class name and case insensitive filesystem */
public final class C29651ks extends AnonymousClass28J {
    public final Throwable A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29651ks) && C162457s7.A0P(this.A00, ((C29651ks) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C29651ks(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UnknownError(throwable=");
        return C18260x0.A04(this.A00, A0o);
    }
}
