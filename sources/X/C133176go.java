package X;

/* renamed from: X.6go  reason: invalid class name and case insensitive filesystem */
public final class C133176go extends AnonymousClass7DS {
    public final AnonymousClass74D A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133176go) && C162457s7.A0P(this.A00, ((C133176go) obj).A00));
    }

    public C133176go(AnonymousClass74D r2) {
        super(C72023d3.A00);
        this.A00 = r2;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FailedContinueSearch(failureType=");
        return C18260x0.A04(this.A00, A0o);
    }
}
