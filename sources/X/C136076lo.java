package X;

/* renamed from: X.6lo  reason: invalid class name and case insensitive filesystem */
public final class C136076lo extends C136186lz {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136076lo) && this.A00 == ((C136076lo) obj).A00);
    }

    public C136076lo(boolean z) {
        super(44);
        this.A00 = z;
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NearbyBusinessWidgetShimmerListItemData(showHeaderShimmer=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
