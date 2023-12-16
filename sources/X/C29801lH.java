package X;

/* renamed from: X.1lH  reason: invalid class name and case insensitive filesystem */
public final class C29801lH extends C376623n {
    public final String newRevision;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29801lH(String str) {
        super("Revision outdated");
        C162457s7.A0J(str, 1);
        this.newRevision = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29801lH) && C162457s7.A0P(this.newRevision, ((C29801lH) obj).newRevision));
    }

    public int hashCode() {
        return this.newRevision.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RevisionOutdated(newRevision=");
        return C18260x0.A07(this.newRevision, A0o);
    }
}
