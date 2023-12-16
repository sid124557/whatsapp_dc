package X;

/* renamed from: X.4jO  reason: invalid class name and case insensitive filesystem */
public final class C91334jO extends C152087Xm {
    public final C150477Qw A00;

    public C91334jO(C150477Qw r2) {
        super(7);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91334jO) && C162457s7.A0P(this.A00, ((C91334jO) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParticipantsNotInContactsFooterViewState(text=");
        return C18260x0.A04(this.A00, A0o);
    }
}
