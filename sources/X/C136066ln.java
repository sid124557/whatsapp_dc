package X;

/* renamed from: X.6ln  reason: invalid class name and case insensitive filesystem */
public final class C136066ln extends C136186lz {
    public final AnonymousClass4GP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136066ln(AnonymousClass4GP r2) {
        super(45);
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136066ln) && C162457s7.A0P(this.A00, ((C136066ln) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NearbyBusinessWidgetEmptyListItemData(onLocationClickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
