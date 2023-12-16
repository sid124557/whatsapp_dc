package X;

/* renamed from: X.6lk  reason: invalid class name and case insensitive filesystem */
public final class C136036lk extends C136186lz {
    public final C147097Cu A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136036lk(C147097Cu r2) {
        super(68);
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136036lk) && C162457s7.A0P(this.A00, ((C136036lk) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProminentSearchBarListItemData(searchBarClickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
