package X;

/* renamed from: X.6gp  reason: invalid class name and case insensitive filesystem */
public final class C133186gp extends AnonymousClass7DS {
    public final AnonymousClass74D A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133186gp) && C162457s7.A0P(this.A00, ((C133186gp) obj).A00));
    }

    public C133186gp(AnonymousClass74D r2) {
        super(C72023d3.A00);
        this.A00 = r2;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FailedStartSearch(failureType=");
        return C18260x0.A04(this.A00, A0o);
    }
}
