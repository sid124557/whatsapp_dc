package X;

/* renamed from: X.6hF  reason: invalid class name and case insensitive filesystem */
public final class C133376hF extends C147177Dc {
    public final C624134x A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133376hF) && C162457s7.A0P(this.A00, ((C133376hF) obj).A00));
    }

    public C133376hF(C624134x r2) {
        super(C142126wg.COMMENT);
        this.A00 = r2;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommentItem(comment=");
        return C18260x0.A04(this.A00, A0o);
    }
}
