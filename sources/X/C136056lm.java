package X;

/* renamed from: X.6lm  reason: invalid class name and case insensitive filesystem */
public final class C136056lm extends C136186lz {
    public final C147117Cw A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136056lm(C147117Cw r2) {
        super(48);
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136056lm) && C162457s7.A0P(this.A00, ((C136056lm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NearbyBusinessLocationRequestListItemData(nearbyLocationRequestClickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
