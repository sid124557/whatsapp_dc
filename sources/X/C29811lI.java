package X;

/* renamed from: X.1lI  reason: invalid class name and case insensitive filesystem */
public final class C29811lI extends C376623n {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29811lI) && this.code == ((C29811lI) obj).code);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29811lI(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown error code ("
            r1.append(r0)
            java.lang.String r0 = X.C18260x0.A09(r1, r3)
            r2.<init>(r0)
            r2.code = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29811lI.<init>(int):void");
    }

    public int hashCode() {
        return this.code;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UnknownErrorCode(code=");
        return C18260x0.A09(A0o, this.code);
    }
}
