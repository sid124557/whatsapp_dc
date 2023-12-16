package X;

/* renamed from: X.1lG  reason: invalid class name and case insensitive filesystem */
public final class C29791lG extends C376623n {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29791lG) && C162457s7.A0P(this.throwable, ((C29791lG) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29791lG(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Exception caught ("
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.String r0 = X.C18260x0.A07(r0, r1)
            r2.<init>(r0)
            r2.throwable = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29791lG.<init>(java.lang.Throwable):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(throwable=");
        return C18260x0.A04(this.throwable, A0o);
    }
}
