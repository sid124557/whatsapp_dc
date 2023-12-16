package X;

/* renamed from: X.1lc  reason: invalid class name and case insensitive filesystem */
public final class C29951lc extends C44622Wu {
    public final AnonymousClass28M A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29951lc(AnonymousClass28M r2) {
        super(r2);
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29951lc) && C162457s7.A0P(this.A00, ((C29951lc) obj).A00));
    }

    public int hashCode() {
        return C18300x5.A04(this.A00) + 947962180;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NotAvailable(searchType=");
        A0o.append(this.A00);
        A0o.append(", reason=");
        return C18260x0.A07("search not available", A0o);
    }
}
