package X;

/* renamed from: X.6ls  reason: invalid class name and case insensitive filesystem */
public final class C136116ls extends C136186lz {
    public final C147137Cy A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136116ls(C147137Cy r2, String str) {
        super(49);
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C136116ls) {
            C136116ls r3 = (C136116ls) obj;
            if (this.A00 != r3.A00 || !C162457s7.A0P(this.A01, r3.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SearchContextChipViewListItemData(category=");
        A0o.append(this.A01);
        A0o.append(", searchContextChipItemClickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
