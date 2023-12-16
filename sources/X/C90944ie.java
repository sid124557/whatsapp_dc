package X;

/* renamed from: X.4ie  reason: invalid class name and case insensitive filesystem */
public final class C90944ie extends C118255tF {
    public final AnonymousClass23V error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C90944ie) && C162457s7.A0P(this.error, ((C90944ie) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public C90944ie(AnonymousClass23V r1) {
        this.error = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MetadataFetchFailed(error=");
        return C18260x0.A04(this.error, A0o);
    }
}
